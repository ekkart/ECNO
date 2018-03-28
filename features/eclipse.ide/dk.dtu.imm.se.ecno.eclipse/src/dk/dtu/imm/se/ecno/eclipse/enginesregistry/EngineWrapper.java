package dk.dtu.imm.se.ecno.eclipse.enginesregistry;

import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.eclipse.recordingcommand.RecordingInteractionExecutionCommandWrapper;
import dk.dtu.imm.se.ecno.eclipse.save.behaviour.ISavableElementBehaviour;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesFactory;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.DefaultContainer;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.InheritedBehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourStatesImpl;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ElementBehaviourStateImpl;
import dk.dtu.imm.se.ecno.engine.EngineTerminatedException;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.runtime.ISimpleBehaviour;
import dk.dtu.imm.se.ecno.runtime.internal.InheritingBehaviour;

public class EngineWrapper implements IController {
	
	public final ExecutionEngine engine;
	
	private BehaviourStates container;
	private Resource resource;
	private String name;
	
	private TransactionalEditingDomain domain;
	private boolean domainExisted;
	
	private List<WeakReference<Object>> addedElements;
	private WeakHashMap<EObject, ElementBehaviourState> element2elementBehaviourState;
	
	private Adapter addedElementsListener;
	
	public EngineWrapper(ExecutionEngine engine) {
		this.engine = engine;
		this.engine.addController(this);
		this.resource = null;
		this.name = null;
		this.domain = null;
		this.domainExisted = false;
		this.addedElements = new ArrayList<WeakReference<Object>>();
		this.element2elementBehaviourState = new WeakHashMap<EObject,ElementBehaviourState>();
		this.addedElementsListener = null;
	}
	
	public EngineWrapper(ExecutionEngine engine, BehaviourStates container) {
		this(engine);
		this.initialize(container);

	}
	
	private void initialize(BehaviourStates container) {
		this.container = container;
		this.resource = container.eResource();
		
		boolean success = true;
		for (ElementBehaviourState elementState: container.getStates()) {
			EObject element = elementState.getElement();
			BehaviourState state = elementState.getState();
			if (element != null && state != null) {
				IElementBehaviour behaviour = engine.getElementBehaviour(element);
				if (behaviour instanceof ISavableElementBehaviour) {
					ISavableElementBehaviour savableBehaviour =
							(ISavableElementBehaviour) behaviour;
					savableBehaviour.initializeFromBehaviourState(state);
					elementState.setState(savableBehaviour.getBehaviourState());
					this.element2elementBehaviourState.put(element, elementState);
				} else if (behaviour instanceof InheritingBehaviour) {
					if (state instanceof InheritedBehaviourState) {
						this.element2elementBehaviourState.put(element, elementState);
						List<BehaviourState> states = ((InheritedBehaviourState) state).getStates();
						List<IElementBehaviour> list = ((InheritingBehaviour) behaviour).getBehaviours();
						if (list.size() == states.size()) {
							for (int i=0; i < states.size(); i++) {
								IElementBehaviour behaviouri = list.get(i);
								if (behaviouri instanceof ISavableElementBehaviour) {
									((ISavableElementBehaviour) behaviouri).initializeFromBehaviourState(states.get(i));
								} else if (!(behaviouri instanceof ISimpleBehaviour)) {
									success = false;
								}
							}
						}
					}
				}
			} else {
				success = false;
			}
		}
		
		ResourceSet resourceSet = resource.getResourceSet();
		EditingDomain dom = AdapterFactoryEditingDomain.getEditingDomainFor(container);
		if (dom instanceof TransactionalEditingDomain) {
			domain = (TransactionalEditingDomain) dom;
			// We need to remember that the EngineWrapper did not create the Editing domain,
			// since it is not its responsibility then to dispose of it
			domainExisted = true;
		} else if (dom == null) {
			domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(resourceSet);
			domainExisted = false;
		} else {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					MessageDialog.openInformation(
							null,
							"ECNO: Engine cannot be started",
							"The resource maintaining the engine state is open in an editor or application " +
							"that is not compatible with the ECNO Engine. " +
							"Close this editor or application " +
							"and start the ECNO application directly from the behaviour state file in the " +
							"resource browser.");
				}
			};
			if (Display.getDefault().getThread().equals(Thread.currentThread())) {
				runnable.run();
			} else {
				Display.getDefault().syncExec(runnable);
			}

			throw new IllegalStateException("Behaviour state resource is associated with incompatible editing domain");
		}
		engine.addInteractionCommandWrapperFactory(new RecordingInteractionExecutionCommandWrapper(this));
		
		// eki: the editing domain is added before the elements are replayed
		for (EObject element: container.getAdded()) {
			engine.addElement(element);
		}
		
		final Set<ElementBehaviourState> defaultContainerStates = new HashSet<ElementBehaviourState>();
		for (ElementBehaviourState elementState: container.getStates()) {
			EObject element = elementState.getElement();
			BehaviourState state = elementState.getState();
			if (element != null && state instanceof DefaultContainer) {
				defaultContainerStates.add(elementState);
				TreeIterator<EObject> iterator = element.eAllContents();
				while (iterator.hasNext()) {
					EObject object = iterator.next();
					engine.addElement(object);
				}
			}
		}

		if (!defaultContainerStates.isEmpty()) {
			domain.getCommandStack().execute(new RecordingCommand(domain, "Remove default containers") {

				@Override
				protected void doExecute() {
					EngineWrapper.this.container.getStates().removeAll(defaultContainerStates);

				}

			});
		}
		
		
		if (container instanceof BehaviourStatesImpl) {
			((BehaviourStatesImpl) container).makeWeak();
		}
		
		// This listener notifies the engine, when elements are added/removed from the list of
		// added and removed elements by the Undo/Redo mechanism (so that the controllers and
		// in particular the GUI are updated accordingly.
		this.addedElementsListener = new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification notification) {
				if (! EngineWrapper.this.inAddRemoveElementMethod() &&
						notification instanceof ENotificationImpl && 
						notification.getNotifier() == EngineWrapper.this.container) {
					ENotificationImpl eNotification = (ENotificationImpl) notification;
					if (eNotification.getFeature().equals(BehaviourstatesPackage.eINSTANCE.getBehaviourStates_Added())) {
						if (eNotification.getEventType() == Notification.ADD) {
							Object element = eNotification.getNewValue();
							EngineWrapper.this.engine.addElement(element);
						} else if (eNotification.getEventType() == Notification.REMOVE) {
							Object element = eNotification.getOldValue();
							EngineWrapper.this.engine.removeElement(element);
						}
					}
				}
			}
			
		};
		this.container.eAdapters().add(addedElementsListener);
		
		domain.getCommandStack().flush();
		
		if (!success) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					MessageDialog.openInformation(
							null,
							"ECNO: Load engine state",
							"The state of the ECNO engine could not be loaded properly.");
				}
			};
			if (Display.getDefault().getThread().equals(Thread.currentThread())) {
				runnable.run();
			} else {
				Display.getDefault().syncExec(runnable);
			}
		}
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public synchronized String getResourceFileName() {
		if (resource != null) {
			return resource.getURI().toString();
		}
		
		return "<none>";
	}
	
	public String getEngineStats() {
		String result = "Engine terminated!";
		try {
			engine.lockExclusive();
			
			if (container instanceof BehaviourStatesImpl) {
				((BehaviourStatesImpl) container).makeWeak();
			}
			
			System.gc();
			Collection<IElementBehaviour> behaviours = engine.getBehaviours();
			Map<IElementType,Integer> typeStatistics = new HashMap<IElementType,Integer>();
			for (IElementBehaviour behaviour: behaviours) {
				IElementType type = behaviour.getElementType();
				if (type != null) {
					Integer no = typeStatistics.get(type);
					if (no != null) {
						typeStatistics.put(type, no+1);
					} else {
						typeStatistics.put(type, 1);
					}
				}
			}

			result = behaviours.size() + " elements of the following types are active:" + System.lineSeparator();
			for (IElementType type: typeStatistics.keySet()) {
				result = result + "  " + type.getName() + ":	" + typeStatistics.get(type) + System.lineSeparator();
			}
			result = result + System.lineSeparator();
			
			result = result + "Successfully executed interactions:	" + engine.noExecutedSuccess + System.lineSeparator();
			result = result + "Failed (aborted) executed interactions:	" + (engine.noExecuted - engine.noExecutedSuccess) + System.lineSeparator() + System.lineSeparator();
			
			DecimalFormat format = (DecimalFormat) DecimalFormat.getInstance();
			format.setDecimalSeparatorAlwaysShown(true);
			format.setMaximumFractionDigits(4);
			result = result + "Number of computed interactions:	" + 
			         (engine.compTimeFirst.numberOfValues() + engine.compTimeFollow.numberOfValues()) +
			         System.lineSeparator();
			result = result + "First interaction computation time:	" +
					format.format(engine.compTimeFirst.mean()) + "ms	" +
					"(" + format.format(engine.compTimeFirst.standardDeviation()) + "ms)" +
					System.lineSeparator();
			result = result + "Followup interaction computation time:	" + 
					format.format(engine.compTimeFollow.mean()) + "ms	" + 
					"(" + format.format(engine.compTimeFollow.standardDeviation()) + "ms)" +
					System.lineSeparator();
			result = result + "Failed on first computation time:	" + 
					format.format(engine.compTimeFailFirst.mean()) + "ms	" +
					"(" + format.format(engine.compTimeFailFirst.standardDeviation()) + "ms)" +
					System.lineSeparator();
			result = result + "Fail on followup computation time:	" +
					format.format(engine.compTimeFailFollow.mean()) + "ms	" +
					"(" + format.format(engine.compTimeFailFollow.standardDeviation()) +"ms)" +
					System.lineSeparator();
		} catch (EngineTerminatedException e) {
		} finally {
			try {
				engine.unlock();
			} catch (EngineTerminatedException e) {}
		}
		return result;
	}
	
	public boolean isSavable() {
		return resource != null;
	}
	
	public synchronized  void save() throws EngineTerminatedException {
		if (engine != null && resource != null) {
			engine.lockExclusive();
			// eki: collect garbage so that elements that are no longer connected are
			//      removed together with their behaviours.
			System.gc();
			
			boolean okay = true;

			
			if (domain == null) {
				okay = prepareContainerForSave();
			} else {
				RecordingSavePreparation savePreparation =  new RecordingSavePreparation(this);
				domain.getCommandStack().execute(savePreparation);
			}
			
			try {
				// Make sure to save all resources in the resource set
				ResourceSet resourceSet = resource.getResourceSet();
				for (Resource res: resourceSet.getResources()) {
					res.save(null);
				}
			} catch (Exception e) {
				okay = false;
			}
			
			engine.unlock();
			
			if (!okay) {
				// TODO a more detailed error report would be nice here.
				MessageDialog.openInformation(
						null,
						"ECNO: Save engine state",
						"The state of the ECNO engine " + this.getName() + " could not be saved properly.");
			}
		}
	}
	
	private boolean prepareContainerForSave() {
		if (container instanceof BehaviourStatesImpl) {
			((BehaviourStatesImpl) container).cleanPhantomElementsAndPhantomBehaviours();
		}
		
		Collection<IElementBehaviour> behaviours = engine.getBehaviours();
		boolean okay = true;
		
		for (IElementBehaviour behaviour: behaviours) {
			Object object = behaviour.getElement();
			if (object instanceof EObject) {
				EObject element = (EObject) object;
				// implicitly adds elementBehaviour state to container
				if (getElementBehaviourState(element) == null) {
					okay = false;
				}
				if (element.eResource() == null) {
					addOrphan(element);
				}
			}
		}		
		return okay;
	}
	
	public void addOrphan(EObject object) {
		if (object.eResource() == null) {
			EObject parent = null;
			// For being defensive, we check by the set touched whether we are running in
			// circles. Normally, this should not happen; in case of concurrent changes of
			// the underlying object structure, this might however happen.
			Set<EObject> touched = new HashSet<EObject>();
			while ((parent = object.eContainer()) != null && !(parent instanceof ChangeDescription) && !touched.contains(parent)) {
				object = parent;
				touched.add(parent);
			}
			if (!touched.contains(parent)) {
				container.getOrphans().add(object);
			} else {
				System.err.println("Cycle in containement structure detected (very bad).");
			}
		}
	}
	
	private boolean disposing = false;
	
	private synchronized boolean isDisposing() {
		if (disposing) {
			return true;
		} else {
			disposing = true;
			return false;
		}
	}
	
	public void dispose() {
		if (!isDisposing()) {
			ECNOEngineRegistry.getInstance().remove(this);
			if (container != null) {
				try {
					if (addedElementsListener != null) {
						container.eAdapters().remove(addedElementsListener);
						addedElementsListener = null;
					}
					if (container instanceof BehaviourStatesImpl) {
						// Avoid problems with concurrent garbage collection (in the
						// weak list of orphans) during the disposal of domain or with
						// null entries resulting from that (some iterators used in the
						// EMF framework seem to have problems with null pointers in
						// containments lists or with concurrent changes by the GC -> NPE).
						//
						// It might be a good idea to implement an own iterator
						// in the WeakEList/WeakList that is robust against concurrent
						// garbage collection and null pointers. For now make lists strong
						// and clean out phantoms before disposing the editing domain.
						((BehaviourStatesImpl) container).makeStrong();
						((BehaviourStatesImpl) container).cleanPhantomElements();
					}
					container = null;
				} catch (Exception e) {
					// Catch all exceptions in order to make sure that the engine
					// (and possible some threads running on it) properly exists,
					// even if some of the cleanups fail.
				}

				// In principle, the engine could live on without the wrapper
				// In our setting we make sure that the engine exits, when
				// the wrapper is removed as a controller from the engine.
				try {
					engine.exit();
				} catch (Exception e) {}
			}
			if (domain != null && !domainExisted) {
				// ekki: Dispose of the domain only, if it was created by the EngineWrapper itself.
				//       If the editing domain was not created by the EngineWrapper, it is the
				//       responsibility of the creator (possibly a IControllerConfigurator which
				//       uses this for some GUI purposes) to dispose of it! 
				try {
					domain.dispose();
				} catch (Exception e) {
					// TODO: This can be eventually removed. This is here for keeping track
					//       of unexpected problems with concurrency and garbage collection
					//       during the disposal of the domain
					e.printStackTrace();
				}
			}
			domain = null;
			resource = null;
		}
	}
	
	public synchronized void exit() {
		try {
			engine.exit();
		} catch (EngineTerminatedException e) {}
	}

	boolean inAddRemoveElement = false;
	
	private synchronized boolean inAddRemoveElementMethod() {
		return inAddRemoveElement;
	}
	
	@Override
	public synchronized void addElement(Object element) {
		inAddRemoveElement = true;
		if (container != null && element instanceof EObject) {
			List<EObject> added = container.getAdded();
			if (!added.contains(element)) {
				try {
					added.add((EObject) element);
				} catch (Exception e) { }
			}
		} else if (addedElements != null) {
			this.addedElements.add(new WeakReference<Object>(element));
		}
		inAddRemoveElement = false;
	}

	@Override
	public synchronized void removeElement(Object element) {
		inAddRemoveElement = true;
		if (container != null && element instanceof EObject) {
			List<EObject> added = container.getAdded();
			if (added.contains(element)) {
				try {
					added.remove((EObject) element);
				} catch (Exception e) { }
			}			
		} else if (addedElements != null) {
			List<WeakReference<Object>> remove = new ArrayList<WeakReference<Object>>(); 

			for (WeakReference<Object> weakRef: this.addedElements) {
				Object object = weakRef.get();
				if (object == null || object.equals(element)) {
					remove.add(weakRef);
				}
			}
			this.addedElements.removeAll(remove);
		}
		inAddRemoveElement = false;
	}

	@Override
	public void elementEncountered(Object element) {
		// Do nothing
	}


	/**
	 * Returns the ElementBehaviourState in the behaviours container for the given element. If
	 * the ElementStateBehaviour does not yet exists, it is created and added to the container here.
	 * 
	 * @param element
	 * @return the elements ElementBehaviourState
	 */
	public synchronized ElementBehaviourState getElementBehaviourState(EObject element) {
		ElementBehaviourState elementState = null;
		if (this.element2elementBehaviourState.containsKey(element)) {
			elementState = this.element2elementBehaviourState.get(element);
			if (elementState != null) {
				List<ElementBehaviourState> behaviourStates = container.getStates();
				if (!behaviourStates.contains(elementState)) {
					behaviourStates.add(elementState);
				}
			}
		} else {
			IElementBehaviour behaviour = engine.getElementBehaviour(element);
			if (behaviour instanceof ISavableElementBehaviour) {
				ISavableElementBehaviour savableBehaviour = (ISavableElementBehaviour) behaviour;
				BehaviourState state = savableBehaviour.getBehaviourState();
				if (state != null) {
					elementState = BehaviourstatesFactory.eINSTANCE.createElementBehaviourState();
					if (elementState instanceof ElementBehaviourStateImpl) {
						((ElementBehaviourStateImpl) elementState).makeWeak();
					}
					elementState.setElement(element);
					elementState.setState(state);
					container.getStates().add(elementState);
					this.element2elementBehaviourState.put(element, elementState);
				}
			} else if (behaviour instanceof InheritingBehaviour) {
				List<IElementBehaviour> list = ((InheritingBehaviour) behaviour).getBehaviours();
				InheritedBehaviourState state = BehaviourstatesFactory.eINSTANCE.createInheritedBehaviourState();
				elementState = BehaviourstatesFactory.eINSTANCE.createElementBehaviourState();
				if (elementState instanceof ElementBehaviourStateImpl) {
					((ElementBehaviourStateImpl) elementState).makeWeak();
				}
				elementState.setElement(element);
				elementState.setState(state);
				for (IElementBehaviour behaviouri: list) {
					BehaviourState statei = null;
					if (behaviouri instanceof ISavableElementBehaviour) {
						statei =  ((ISavableElementBehaviour) behaviouri).getBehaviourState();
					} else if (!(behaviouri instanceof ISimpleBehaviour)) {
						// Non-savable behaviour won't be tracked
						this.element2elementBehaviourState.put(element, null);
						System.err.println("Non-savable behaviour encountered");
						return null;
					}
					if (statei == null) {
						statei = BehaviourstatesFactory.eINSTANCE.createDefaultState();
					}
					state.getStates().add(statei);
				}
				container.getStates().add(elementState);
				this.element2elementBehaviourState.put(element, elementState);
			}
		}
		return elementState;
	}
	
	public TransactionalEditingDomain getDomain() {
		return domain;
	}
	
	private class RecordingSavePreparation extends RecordingCommand {

		private EngineWrapper engineWrapper;

		public RecordingSavePreparation(EngineWrapper engineWrapper) {
			super(engineWrapper.getDomain(), "Prepare save", "Registration of elements and orphans (for save)");
			this.engineWrapper = engineWrapper;
		}

		@Override
		protected void doExecute() {
			if (!engineWrapper.prepareContainerForSave()) {
				System.err.println("Probelm while preparing save");
			}
			
		}

	}

}
