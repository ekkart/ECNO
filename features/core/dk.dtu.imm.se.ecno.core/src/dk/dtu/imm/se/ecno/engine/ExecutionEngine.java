package dk.dtu.imm.se.ecno.engine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventKind;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.Parameter;
import dk.dtu.imm.se.ecno.runtime.internal.InheritingBehaviour;
import dk.dtu.imm.se.ecno.runtime.internal.ParallelChoice;
import dk.dtu.imm.se.ecno.runtime.transactions.LockManager;
import dk.dtu.imm.se.ecno.runtime.transactions.TransactionManager;
import dk.dtu.imm.se.ecno.utils.SeriesStats;

public class ExecutionEngine {
		
	private Set<IController> controllers;
	
	private List<IInteractionCommandWrapperFactory> commandWrapperFactories; 

	// TODO this is a very brute force way of maintaining
	//      adapters; this needs to be done more efficiently!
	private List<IPackageAdapter> adapters;
	private Map<String,IPackageAdapter> uri2adapter;
	
	private Map<Object,IPackageAdapter> object2adapter;
	private Map<IEventType,IPackageAdapter> eventType2adapter;
	private Map<IEventTypeExtension,IPackageAdapter> eventTypeExtension2adapter;
	
	private Map<IElementType,Set<IEventType>> elementType2eventTypes;
	private Map<IElementType,Set<IEventType>> elementType2topLevelEventTypes;
	private Map<IElementType,IPackageAdapter> elementType2adapter;
	private Map<IElementType,Set<ICoordinationSet>> elementType2coordinationSets;
	
	private Map<Object,IElementBehaviour> object2behaviour;
	
	private TransactionManager transactionManager;
	
	private Set<Thread> sharedLocks;
	private Thread exclusiveLock;
	private List<Thread> waitingForExclusiveLock;
	
	private Comparator<Object> elementOrder;
	
	private boolean exiting = false;
	
	/** 
	 * Constructor of the execution dk.dtu.imm.se.ecno.core.engine. Since the
	 * execution dk.dtu.imm.se.ecno.core.engine is a singleton, the constructor
	 * is private. 
	 */
	private ExecutionEngine() {
		controllers = new HashSet<IController>();
		this.commandWrapperFactories = new ArrayList<IInteractionCommandWrapperFactory>();
        adapters = new ArrayList<IPackageAdapter>();
        uri2adapter = new HashMap<String,IPackageAdapter>();
        object2adapter = new WeakHashMap<Object,IPackageAdapter>();
        eventType2adapter = new HashMap<IEventType,IPackageAdapter>();
        eventTypeExtension2adapter = new HashMap<IEventTypeExtension,IPackageAdapter>();
        elementType2adapter = new HashMap<IElementType,IPackageAdapter>();
        elementType2eventTypes = new HashMap<IElementType,Set<IEventType>>();
        elementType2topLevelEventTypes = new HashMap<IElementType,Set<IEventType>>();
        elementType2coordinationSets = new HashMap<IElementType,Set<ICoordinationSet>>();

        object2behaviour = new WeakHashMap<Object,IElementBehaviour>();
        
       	transactionManager = new TransactionManager(new LockManager());
       			
        sharedLocks = new HashSet<Thread>();
        exclusiveLock = null;
    	waitingForExclusiveLock = new ArrayList<Thread>();
	}
	
	/**
	 * Explicitly adds an element to the engine. This call is delegated to the
	 * controllers of the engine.
	 * 
	 * @param object
	 */
	public synchronized void addElement(Object element) {
		// XXX ekki: this method should be synchronized (but this needs to be carefully analyzed)
		if (controllers != null) {
			for (IController controller: controllers) {
				controller.addElement(element);
			}
		}
	}
	
	/**
	 * Explicitly removes an element from the engine. This call is delegated to the
	 * controllers of the engine. Note that the engine will keep the behaviour of
	 * the element; the information, is relevant for the controllers only (e.g.
	 * for removing them from the GUI).
	 * 
	 * @param object
	 */
	public synchronized void removeElement(Object element) {
		// XXX ekki: this method should be synchronized (but this needs to be carefully analyzed)
		if (controllers != null) {
			for (IController controller: controllers) {
				controller.removeElement(element);
			}
		}
	}
	
	/**
	 * Adds a controller to the execution engine. Controllers are notified about
	 * explicitly added and removed elements, and when new elements are encountered.
	 * 
	 * @param controller
	 */
	public synchronized void addController(IController controller) {
		if (!exiting) {
			if (controllers != null) {
				controllers.add(controller);
			}
		} else {
			new EngineTerminatedException("Engine Terminated");
		}
	}
	
	/**
	 * Removes a controller from the execution engine.
	 * 
	 * @param controller
	 * @throws EngineTerminatedException 
	 */
	public synchronized void removeController(IController controller) throws EngineTerminatedException {
		// eki: Note that this method does not throw an EngineTerminatedException,
		//      in order to allow allow controllers to remove themselves while
		//      the engine is exciting
		if (controllers != null && !exiting) {
			controllers.remove(controller);
			if (controllers.isEmpty() && !exiting) {
				this.exit();
			}
		}
	}
	
	/**
	 * Adds a IInteractionCommandWrapperFactory
	 * @param factory the InteractionCommandWrapperFactory
	 */
	public synchronized void addInteractionCommandWrapperFactory(IInteractionCommandWrapperFactory factory) {
		if (factory != null) {
			this.commandWrapperFactories.add(factory);
		}
	}

	/**
	 * Sets the Comparator on elements, which the ExecutionEngine used to determine the
	 * execution order of the elements' choices in an interaction and the order of elements
     * in collective parameters of events (if the order is provided).
	 * 
	 * @param a comparator for elements
	 */
	public void setElementOrder(Comparator<Object> order) {
		this.elementOrder = order;
	}
	
	/**
	 * Returns the Comparator of elements currently used by the ExecutionEngine.
	 * 
	 * @return the currently used comparator for elements
	 */
	public Comparator<Object> getElementOrder() {
		return this.elementOrder;
	}
	
	/**
	 * Get the registered IInteractionCommandWrapperFactories.
	 * @return the registered
	 */
	public List<IInteractionCommandWrapperFactory> getInteractionCommandWrapperFactories() {
		return Collections.unmodifiableList(this.commandWrapperFactories);
	}

	// XXX ekki: some of the methods below should not return anything after the engine exit
	
	/** 
	 * Returns and iterator for all the currently possible interactions for the element and 
	 * the event type.
	 *  
	 * @param element
	 * @param eventType
	 * @return the iterator for calculating all possible interactions
	 */
	public InteractionIterator getInteractions(Object element, IEventType eventType) {
		return new InteractionIterator(this, element, eventType);
	}

	/** 
	 * Returns and iterator for all the currently possible interactions for the element and 
	 * the given event.
	 *  
	 * @param element
	 * @param event
	 * @return the iterator for calculating all possible interactions
	 */
	public InteractionIterator getInteractions(Object element, Event event) {
		return new InteractionIterator(this, element, event);
	}
	
	private synchronized IPackageAdapter computePackageAdapter(Object element) {
		IPackageAdapter result = object2adapter.get(element);
		if (result != null) {
			return result;
		} else {
			computeElementBehaviour(element);
			return object2adapter.get(element);
		}
	}

	public IPackageAdapter getPackageAdapter(Object element) {
		return computePackageAdapter(element);
	}

	public IPackageAdapter getPackageAdapter(IEventKind eventKind) {
		if (eventKind instanceof IEventType) {
			IEventType eventType = (IEventType) eventKind;
			IPackageAdapter adapter1 = eventType2adapter.get(eventType);
			if (adapter1 != null) {
				return adapter1;
			} else {
				for (IPackageAdapter adapter2: adapters) {
					if (adapter2.supportsEventType(eventType)) {
						System.err.println("ECNO Engine: added event adapter mapping on demand (should not happen)!");
						eventType2adapter.put(eventType, adapter2);
						return adapter2;
					}
				}
			}
		} else if (eventKind instanceof IEventTypeExtension) {
			IEventTypeExtension eventTypeExtension = (IEventTypeExtension) eventKind;
			IPackageAdapter adapter1 = eventTypeExtension2adapter.get(eventTypeExtension);
			if (adapter1 != null) {
				return adapter1;
			} else {
				for (IPackageAdapter adapter2: adapters) {
					if (adapter2.supportsEventTypeExtension(eventTypeExtension)) {
						System.err.println("ECNO Engine: added event adapter mapping on demand (should not happen)!");
						eventTypeExtension2adapter.put(eventTypeExtension, adapter2);
						return adapter2;
					}
				}
			}
			
		}
		return null;
	}

	public IPackageAdapter getPackageAdapter(IElementType type) {
		IPackageAdapter adapter1 = elementType2adapter.get(type);
		if (adapter1 != null) {
			return adapter1;
		} else {
			for (IPackageAdapter adapter2: adapters) {
				if (adapter2.supportsElementType(type)) {
					elementType2adapter.put(type, adapter2);
					System.err.println("ECNO Engine: added element type to adapter mapping on demand (should not happen)!");
					return adapter2;
				}
			}
			return null;
		}
	}

	public Event createInstance(IEventType type) {
		Event result = new Event(this, type);
		return result;
	}
	
	public Parameter createParameter(IFormalParameter formalParameter) {
		return new Parameter(formalParameter, this);
	}
	
	private void elementEncounteredNotifyControllers(Object element) {
		if (controllers != null && !exiting) {
			for (IController controller: controllers) {
				controller.elementEncountered(element);
			}
		}
	}
	
	/* TODO eki: the way this is done here is not scalable. It is needed to make the
	             engine thread safe. But this needs to be done more efficiently. There
	             are different ways to make it more efficient.
	             
	             1. The methods using elements should store a reference to behaviour
	                wherever possible, so that they do not need to access it via the
	                engine (e.g. in the computation of the interactions). Keeping local
	                copies is no problem, since the behaviour object will never change
	                during the complete livespan of an element. The behaviour ceases
	                to exist only after the element is garbage collected.
	                
	             2. A technique similar to concurrentHashMaps could be implemented,
	                so that access to one element behaviour does not necessary block others.
	*/
	private synchronized IElementBehaviour computeElementBehaviour(Object element) {
		IElementBehaviour result = object2behaviour.get(element);
		if (result != null) {
			return result;
		} else if (object2behaviour.containsKey(element)) {
			return null;
		} else {
			// there is no registered behaviour yet
			for (IPackageAdapter adapter: adapters) {
				IElementType type = adapter.getElementType(element);
				if (type != null) {
					if (!elementType2adapter.containsKey(type)) {
						elementType2adapter.put(type, adapter);
						System.err.println("ECNO Engine: element adapter mapping information added on demand (should not happen)!");
					}
					object2adapter.put(element, adapter);
					result = createElementBehaviour(element,type,adapter);
					// Note that we register this behaviour even if it is null
					// in order to remember that this element does not have a
					// behaviour
				    object2behaviour.put(element, result);
				    if (result != null) {
				    	elementEncounteredNotifyControllers(element);
				    }
                    return result;
				}
			}
			return null;
		}	
	}
	
	public IElementType getElementType(Object element) {
		IElementBehaviour behaviour = computeElementBehaviour(element);
		if (behaviour != null) {
			return behaviour.getElementType();
		} else {
			return null;
		}
	}
	
	private IElementBehaviour createElementBehaviour(Object element, IElementType type, IPackageAdapter adapter) {
		// return adapter.createElementBehaviour(element, type);
		// eki: 26. 3. 2012: Switched to new version (package tmp) of algorithm for
		//                   computing inherited behaviour
		return InheritingBehaviour.createElementBehaviour(this, element, type, adapter);
	}
	
	public List<IChoice> getChoices(Object element, IEventType eventType) {
		IElementBehaviour behaviour = computeElementBehaviour(element);
		if (behaviour != null) {
			List<IChoice> result = behaviour.getChoices(eventType);
			/*
			if (result != null) {
				for (IChoice choice: result) {
					choice.addEvent(event);
					// TODO eki 18. 4. 2012: For parallely triggerd events this needs to
					//                       be done differently
				}
			}
			*/
			return result;
		}
		return new ArrayList<IChoice>();
	}
	
	public List<IChoice> getChoices(ParallelChoice parallelChoice, Object element, IEventType eventType) {
		IElementBehaviour behaviour = computeElementBehaviour(element);
		if (behaviour != null && behaviour instanceof InheritingBehaviour) {
			return ((InheritingBehaviour) behaviour).getChoices(parallelChoice, eventType);
		}
		return new ArrayList<IChoice>();
	}
	
	public IElementBehaviour getElementBehaviour(Object element) {
		return computeElementBehaviour(element);
	}
	
	private void computeEventTypes(IElementType type) {
		if (type != null) {
			Set<IEventType> result = elementType2eventTypes.get(type);
			if (result == null) {
				// TODO: eki: the super element types should be calculated once and for all
				//            for making this more efficient
				Set<IElementType> superTypes = new HashSet<IElementType>();
				IElementType iteratorType = type;
				while (iteratorType != null && !superTypes.contains(iteratorType)) {
					superTypes.add(iteratorType);
					iteratorType = iteratorType.getSuperElementType();
				}
				
				Set<IEventType> eventTypes = new HashSet<IEventType>();
				Set<IEventType> topLevelEventTypes = new HashSet<IEventType>();
				for (IElementType elementType: superTypes) {
					for (ICoordinationSet coordSet: elementType.getCoordinationSetsList()) {
						IEventType triggerEvent = coordSet.getTriggerEventType();
						if (triggerEvent != null) {
							topLevelEventTypes.add(triggerEvent.getTopSuper());
							eventTypes.add(triggerEvent);
						}
					}
				}
				
				// TODO Here, we could delete eventTypes that are subtypes of others.

				result = Collections.unmodifiableSet(eventTypes);
				elementType2eventTypes.put(type, result);
				elementType2topLevelEventTypes.put(type, Collections.unmodifiableSet(topLevelEventTypes));
			}
		}		
	}
	
    public Set<IEventType> getEventTypes(IElementType type) {
		if (type != null) {
			Set<IEventType> result = elementType2eventTypes.get(type);
			if (result != null) {
				return result;
			} else {
				computeEventTypes(type);
				System.err.println("ECNO Engine: added event type information on demand (should not happen)!");
				return  elementType2eventTypes.get(type);
			}
		}
		return null;
    }
    
    private void computeCoordinationSets(IElementType elementType) {
    	Set<ICoordinationSet> coordSets = elementType2coordinationSets.get(elementType); 	
    	if (coordSets == null) {
    		coordSets = new HashSet<ICoordinationSet>();

    		IElementType iteratorType = elementType;
    		while (iteratorType != null) {
    			coordSets.addAll(iteratorType.getCoordinationSetsList());
    			iteratorType = iteratorType.getSuperElementType();
    		}
    		coordSets = Collections.unmodifiableSet(coordSets);
    		elementType2coordinationSets.put(elementType, coordSets);
    	}
    }
    
    public Set<ICoordinationSet> getCoordinationSets(IElementType elementType) {
    	Set<ICoordinationSet> coordSets = elementType2coordinationSets.get(elementType);
    	if (coordSets != null) {
    		return coordSets;
    	} else {
    		computeCoordinationSets(elementType);
    		System.err.println("ECNO Engine: added coordination set information on demand (should not happen)!");    		
    		return elementType2coordinationSets.get(elementType);
    	}
    }
    
    public Set<IEventType> getTopLevelEventTypes(IElementType type) {
		if (type != null) {
			Set<IEventType> result = elementType2topLevelEventTypes.get(type);
			if (result != null) {
				return result;
			} else {
				computeEventTypes(type);
				System.err.println("ECNO Engine: added top level event information on demand (should not happen)!");
				result = elementType2topLevelEventTypes.get(type);
			}
		}
		return null;
    }
	
	public Set<IEventType> getEventTypes(Object element) {
		IElementType type = this.getElementType(element);
		if (type != null) {
			return getEventTypes(type);
		}
		return null;
	}
	
	/**
	 * Adds a package adapter to the engine. Note that this should be
	 * done only initially from a single thread. Adding package adapters
	 * is not thread safe. Normally, the package adapters should be
	 * added before any controllers (including the GUI) are installed. 
	 * 
	 * @param adapter the package adapter to be added
	 */
	public void addPackageAdapter(IPackageAdapter adapter) {
		if (!adapters.contains(adapter)) {
			INamespace namespace = adapter.getNamespace();
			if (namespace != null) {
				String uri = namespace.getURI();
				if (!uri2adapter.containsKey(uri)) {
					adapters.add(adapter);
					uri2adapter.put(uri, adapter);
					for (INamedElement type: namespace.getElements()) {
						if (type instanceof IElementType) {
							elementType2adapter.put((IElementType) type, adapter);
							// computeEventTypes((IElementType) type);
							// computeCoordinationSets((IElementType) type);
						} else if (type instanceof IEventType) {
							eventType2adapter.put((IEventType) type, adapter);
						} else if (type instanceof IEventTypeExtension) {
							eventTypeExtension2adapter.put((IEventTypeExtension) type, adapter);
						}
					}
				} else {
					// TODO we could raise an exception here; for each URI, only one
					//      namespace can be registered
					System.err.println("Namespace " + uri + " not unique!");
				}
			}
		}
	}
	
	/**
	 * Returns the list of all IPackageAdapters that are registered with the engine.
	 * Note that this method might change in a future version.
	 * 
	 * @deprecated
	 * @return
	 */
	public List<IPackageAdapter> getPackageAdapters() {
		return Collections.unmodifiableList(this.adapters);
	}
	
	/**
	 * Returns the namespace that is register for the given URI with the engine.
	 * 
	 * @param uri
	 * @return
	 */
	public INamespace getNamespace(String uri) {
		IPackageAdapter adapter = uri2adapter.get(uri);
		if (adapter != null) {
			return adapter.getNamespace();
		} else {
			return null;
		}
	}
	
	/**
	 * Resolves the imports among all registered namespaces. If the imports
	 * are successful, the method returns true; otherwise, it returns false.
	 * This method should be called, after all namespaces were registered with
	 * the engine.
	 * 
	 * @return success of the resolution of the imported elements.
	 */
	public boolean resolveNamespaceImports() {
		boolean success = true;
		for (IPackageAdapter adapter: uri2adapter.values()) {
			INamespace namespace = adapter.getNamespace();
			if (namespace != null) {
				if (!namespace.resolveImportedElements(this)) {
					success = false;
				}
			}
		}
		
		for (IPackageAdapter adapter: uri2adapter.values()) {
			INamespace namespace = adapter.getNamespace();
			if (namespace != null) {
				for (INamedElement type: namespace.getElements()) {
					if (type instanceof IElementType) {
						computeEventTypes((IElementType) type);
						computeCoordinationSets((IElementType) type);
					}
				}
			}
		}
		return success;
	}
	
	/**
	 * Returns all the element behaviours of this engine. This method should be
	 * used with great care, and should never be called from inside ECNO models.
	 * Using it is very inefficient (it is manly used for saving the state of
	 * an ECNO engine).
	 * 
	 * @return
	 */
	public synchronized Collection<IElementBehaviour> getBehaviours() {
		return new ArrayList<IElementBehaviour>(this.object2behaviour.values());
	}
	
	/**
	 * Retunrs the transaction manager associated with this engine.
	 * @return
	 */
	public TransactionManager getTransactionManager() {
		return transactionManager;
	}
	
	/**
	 * Acquire a shared lock on the engine for the running thread.
	 * @throws EngineTerminatedException 
	 */
    public synchronized void lockShared() throws EngineTerminatedException {
    	if (!exiting) {
    		Thread thread = Thread.currentThread();
    		if (sharedLocks.contains(thread) || thread.equals(exclusiveLock)) {
    			return;
    		} else {
    			while (!exiting && (exclusiveLock != null || !waitingForExclusiveLock.isEmpty())) {
    				try {
						wait();
					} catch (InterruptedException e) {
						// We cannot deal with the InterruptExcption here and
						// do not want to pass it through. Therefore, the
						// interrupt status is set here again (it was cleared
						// by the wait method when throwing the exception).
						thread.interrupt();
					}
    			}
    			if (exiting) {
    				throw new EngineTerminatedException("Engine Terminated");
    			} else {
    				sharedLocks.add(thread);
    			}
    		}
    	} else {
    		throw new EngineTerminatedException("Engine Terminated");
    	}
    }

    /**
     * Acquire an exclusive lock on the engine for the running thread. Note that,
     * if a thread had acquired a shared lock before, this shared lock is released,
     * and other threads might get the exclusive lock before the calling thread.
     */
    public synchronized void lockExclusive() throws EngineTerminatedException {
    	if (!exiting) {
    		Thread thread = Thread.currentThread();
    		if (thread.equals(exclusiveLock)) {
    			return;
    		} else {
    			if (sharedLocks.remove(thread) && sharedLocks.isEmpty()) {
    				notifyAll();
    			}
    			waitingForExclusiveLock.add(thread);
    			while (!exiting && (!sharedLocks.isEmpty() || 
    					exclusiveLock != null ||
    					!waitingForExclusiveLock.get(0).equals(thread))) {
    				try {
						wait();
					} catch (InterruptedException e) {
						// We cannot deal with the InterruptExcption here and
						// do not want to pass it through. Therefore, the
						// interrupt status is set here again (it was cleared
						// by the wait method when throwing the exception).
						thread.interrupt();
					}
    			}
    			if (exiting) {
    				throw new EngineTerminatedException("Engine Terminated");
    			} else {
    				waitingForExclusiveLock.remove(thread);
    				exclusiveLock = thread;
    			}
    		}
    	} else {
    		throw new EngineTerminatedException("Engine Terminated");
    	}
    }
    
    /**
     * Releases the lock of the running thread on the engine.
     */
    public synchronized void unlock() throws EngineTerminatedException {
    	if (!exiting) {
    		Thread thread = Thread.currentThread();

    		if (thread.equals(exclusiveLock)) {
    			exclusiveLock = null;
    			notifyAll();
    		} else if (sharedLocks.remove(thread) && sharedLocks.isEmpty()) {
    			notifyAll();
    		}
    	} else {
    		throw new EngineTerminatedException("Engine Terminated");
    	}
    }
	
	public void exit() throws EngineTerminatedException {
		if (!this.isExiting()) {

			// TODO: It needs to be checked whether acquiring this exclusive lock here,
			//       might result in some deadlocks. The exclusive lock is acquired here
			//       to make sure that the shut down is done in a more controlled way
			//       and without interfering with a ongoing save operation, for example.
			
			// ekki@dtu.dk, 17.12.2015: removed synchronized from exit
			//   in order to avoid dealock situations when shutting down the
			//   enigne (which might otherwise occur now due to asynchronous GUI threads)

			this.lockExclusive();
			if (!this.isExitingAndSetExit()) {

				for (IController controller: controllers) {
					controller.dispose();
				}

				controllers.clear();


				/*
				in order to avoid too many null pointer exceptions
				after shut down, the following attributes are
				not set to null; this, however, means that non
				cooperating clients can keep using the engine even
				after an exit. We need to analyze what the best
				options are:

				controllers = null;
				adapters = null;
				object2adapter = null;;
				eventType2adapter = null;
				elementType2eventTypes = null;
				elementType2topLevelEventTypes = null;
				elementType2adapter = null;
				elementType2coordinationSets = null;
				object2behaviour = null;
				 */

				sharedLocks = null;
				exclusiveLock = null;
				waitingForExclusiveLock = null;

				// release all threads that are still waiting for locks (they
				// will throw an  EngineTerminatedException though.
				synchronized (this) {
					this.notifyAll();
				}
			} else {
				// should actually not happen, but for being defensive
				this.unlock();
			}
		}
	}
	
	public synchronized boolean isExitingAndSetExit() {
		if (exiting) {
			return true;
		} else {
			exiting = true;
			return false;
		}
	}
	
	public synchronized boolean isExiting() {
		return exiting;
	}
	
	
	final public SeriesStats compTimeFirst = new SeriesStats();
	final public SeriesStats compTimeFollow = new SeriesStats();
	final public SeriesStats compTimeFailFirst = new SeriesStats();
	final public SeriesStats compTimeFailFollow = new SeriesStats();
	
	public int noExecutedSuccess = 0;
	public int noExecuted = 0;
	
	
	/**
	 * Return a new instance of the ECNO execution engine.
	 * 
	 * @return a new instance of the ECNO execution engine
	 */
	public synchronized static ExecutionEngine createNewInstance() {
	    return new ExecutionEngine();
	}

}
