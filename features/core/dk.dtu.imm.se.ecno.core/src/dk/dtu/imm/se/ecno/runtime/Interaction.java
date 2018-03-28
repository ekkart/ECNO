package dk.dtu.imm.se.ecno.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IChangeListener;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.engine.EngineTerminatedException;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IInteractionCommandWrapperFactory;
import dk.dtu.imm.se.ecno.runtime.internal.ParallelChoice;
import dk.dtu.imm.se.ecno.runtime.transactions.LockingTransaction;
import dk.dtu.imm.se.ecno.runtime.transactions.Transaction;
import dk.dtu.imm.se.ecno.runtime.transactions.TransactionManager;

public class Interaction extends InvalidationNotifier implements IChangeListener {
	
	// private Map<ElementEventTypePair,Event> events;
	
	private Map<Object,IChoice> choices;
	private String label;
	
	// Ekkart Kindler: June 5, 2015 added information on how links are associated with events
	// (and adjusted some places below to properly update and copy this information).
	private Map<Link,List<Event>> link2events;
	private Object triggerElement;
	private Event triggerEvent;
	
	public Interaction(ExecutionEngine engine) {
		super(engine);
		// this.events = new HashMap<ElementEventTypePair,Event>();
		this.choices = new HashMap<Object,IChoice>();
		this.label = "Interaction";
		
		// Ekkart Kindler: June 5, 2015 added
		this.link2events = new HashMap<Link,List<Event>>();
		triggerElement = null;
		triggerEvent = null;
	}
	
	/*
	public boolean containsEventType(Object element, IEventType eventType) {	
		IEventType type = eventType.getTopSuper();
		return events.containsKey(new ElementEventTypePair(element,type));
	}
	*/
	
	/*
	   TODO this can be deleted
	public Event getEvent(Object element, IEventType eventType) {
		// Note that this will only return element events but not parallel trigger
		// choice events

		IChoice choice = this.getElementsChoice(element);
		if (choice != null) {
			return choice.getEvent(eventType);
		}
		return null;

		// eki: replaced for parallel trigger event implementation
		// IEventType type = eventType.getTopSuper();
		// return events.get(new ElementEventTypePair(element,type));
	}
	*/
	
	public String getLabel() {
		return label;
	}
	
	void setLabel(String label) {
		this.label = label;
	}
	
	public boolean containsElement(Object element) {
		return choices.containsKey(element);
	}
	
	public IChoice getElementsChoice(Object element) {
		return choices.get(element);
	}
	
	public Collection<Object> getElements() {
		return Collections.unmodifiableCollection(choices.keySet());
	}
	
	/*
	   TODO this can be completely deleted
	public void add(Object element, Event event) {
		// XXX 9.1.2012: Test event inheritance
		IEventType type = event.getType().getTopSuper();
		if (element != null && event != null && !this.containsEventType(element, type)) {
			events.put(new ElementEventTypePair(element,type),event);
		}
	}
	*/
	
	// @author Ekkart Kindler, June 5, 2015: added this access events associated with links
	public Collection<Link> getLinks() {
		return Collections.unmodifiableCollection(link2events.keySet());
	}
	
	// @author Ekkart Kindler, June 5, 2015: added this access events associated with links
	public Collection<Event> getEvents(Link link) {
		if (link != null) {
			List<Event> result = link2events.get(link);
			if (result != null) {
				return Collections.unmodifiableCollection(result);
			}
		}
		return Collections.emptyList();
	}
	
	// @author Ekkart Kindler, June 5, 2015: added this access events associated with links
	public Object getTriggerElement() {
		return this.triggerElement;
	}
	
	// @author Ekkart Kindler, June 5, 2015: added this access events associated with links
	public Event getTriggerEvent() {
		return this.triggerEvent;
	}
	
	public void add(IChoice choice) {
		Object element = choice.getOwner().getElement();
		if (element != null /* && !this.containsElement(element) */) {
			// eki, 8. 4. 2012: it is now possible to update the choice of
			// an interaction; this is very dangerous and should be done
			// with great care. Maybe, there should eventually be a check
			// whether the update is okay.
			choices.put(element, choice);
		}
	}
	
	// @author Ekkart Kindler, June 5, 2015: added this to maintain events associated with links	
	public void add(Object element, Event event) {
		this.triggerElement = element;
		this.triggerEvent = event;
	}
	
	// @author Ekkart Kindler, June 5, 2015: added this to maintain events associated with links
	public void add(Link link, Event event) {
		List<Event> events = link2events.get(link);
		if (events == null) {
			events = new ArrayList<Event>();
			link2events.put(link, events);
		}
		events.add(event);
	}
	
	/*
	public Set<IElementBehaviour> getElementBehaviours() {
		return choices.keySet();
	}
	*/
	
	public int size() {
	    int result = 0;
		for (IChoice choice: this.choices.values()) {
			if (choice instanceof ParallelChoice) {
				result = result + ((ParallelChoice) choice).size();
			} else {
				result++;
			}
		}
		return result;
	}
	
	private LockingTransaction lockingTransaction;
	
	public void execute() throws InvalidStateException {
		engine.noExecuted++;
		
		try {
			engine.lockShared();
		} catch (EngineTerminatedException e2) {
			throw new InvalidStateException();
		}
		
		TransactionManager manager = engine.getTransactionManager();
		Transaction transaction = null;
		try {
			transaction = manager.startTransaction();
		} catch (InvalidStateException e1) {}
		
		boolean success = true;
		if (isValid()) {
			if (transaction instanceof LockingTransaction) {
				Set<Object> elements = new HashSet<Object>(choices.keySet());
				lockingTransaction = ((LockingTransaction) transaction);
				success = lockingTransaction.lock(elements);
				lockingTransaction = null;
			}
		}
		
		if (!isValid() || !success) {
			if (transaction != null) {
				try {
					manager.stopTransaction(transaction);
				} catch (InvalidStateException e) {}
			}
			try {
				engine.unlock();
			} catch (EngineTerminatedException e) {}
			throw new InvalidStateException();
		}
		
		InvalidStateException exception = null;
		Error error = null;
		
		List<IInteractionCommandWrapperFactory> wrapperFactories = engine.getInteractionCommandWrapperFactories();
		if (wrapperFactories == null || wrapperFactories.isEmpty()) {
			for(IChoice choice: choices.values()) {
				try {
					choice.execute();
				} catch (Exception e) {
					// ignore exceptions
				} catch (Error e) {
					// in case of an error keep it try to clean up and
					// re-throw the error in the end
					error = e;
				} catch (Throwable e) {
					// ditto
					error = new Error(e);
				}
			}

			if (error != null) {
				engine.noExecutedSuccess++;
			}

			dispose();
		} else {
			IInteractionExecutionCommand command = new InteractionExecutionCommand(this);
			for (IInteractionCommandWrapperFactory factory: wrapperFactories) {
				command = factory.wrapInteractionCommand(command);
			}
			try {
				command.doExecute();
			} catch (InvalidStateException e) {
				exception = e;
			} catch (Exception e) {
				// other exceptions are ignored
			} catch (Error e) {
				// in case of an error keep it try to clean up and
				// re-throw the error in the end
				error = e;
			} catch (Throwable e) {
				// ditto
				error = new Error(e);
			}
		}
		
		if (transaction != null) {
			try {
				manager.stopTransaction(transaction);
			} catch (InvalidStateException e) {
				if (exception == null) {
					exception = e;
				}
			} catch (Exception e) {
				// ignore other exceptions
			} catch (Error e) {
				// in case of an error keep it try to clean up and
				// re-throw the error in the end
				if (error == null) {
					error = e;
				}
			} catch (Throwable e) {
				// ditto
				if (error == null) {
					error = new Error(e);
				}
			}
		}
		
		try {
			engine.unlock();
		} catch (EngineTerminatedException e) {
			// throw the most serious error, earlier exception or
			// InvalidStateException
			if (error != null) {
				throw error;
			} else if (exception != null) {
				throw exception;
			} else {
				throw new InvalidStateException();
			}
		}
		
		// re-throw an error or and exception, if it was thrown earlier
		if (error != null) {
			throw error;
		} else if (exception != null) {
			throw exception;
		}
	}
	
    public Interaction copy(CopyMappings mappings) {
    	Interaction result = new Interaction(engine);
    	result.setLabel(getLabel());
    	
    	/*
    	for (ElementEventTypePair pair : this.events.keySet()) {
    		// eki: 9.11.2011 (added getCopy!)
    		result.events.put(pair, mappings.getCopy(this.events.get(pair)));
    	}
    	*/
    	
    	for (Object element : this.choices.keySet()) {
    		// eki: 9.11.2011 (added getCopy!)
    		result.choices.put(element, mappings.getCopy(this.choices.get(element)));
    	}
    	
		// Ekkart Kindler, June 6, 2015: added copying of evens and links
		result.triggerElement = this.triggerElement;
		result.triggerEvent = mappings.getCopy(this.triggerEvent);
		for (Link link: this.link2events.keySet()) {
			List<Event> resultList = result.link2events.get(link);
			if (resultList == null) {
				resultList = new ArrayList<Event>();
				result.link2events.put(link, resultList);
			}
			for (Event event: this.link2events.get(link)) {
				Event resultEvent = mappings.getCopy(event);
				resultList.add(resultEvent);
			}
		}
        
    	return result;
    }
    
    private static int size(Set<Parameter> parameters) {
    	int result  = 0;
    	for (Parameter param: parameters) {
    		if (param.getType().isCollective()) {
    			Object value = param.getValue();
    			if (value instanceof Collection) {
    				result = result + ((Collection<?>) value).size();
    			} else {
    				result++;
    			}
    		} else {
    			result++;
    		}
    	}
    	return result;
    }
    
    public boolean checkConditions() {    	
    	Set<Parameter> changes = new HashSet<Parameter>();
		int size = 0;
    	do {
    		size = size(changes);
    		for (IChoice choice: choices.values()) {
    			if (!choice.doAssignments(changes)) {
    				return false;
    			}
    		}
    	} while (size(changes) != size);
    	
		for (IChoice choice: choices.values()) {
			if (!choice.areAssignmentsComplete()) {
				return false;
			}
		}
		
		for (IChoice choice: choices.values()) {
			if (!choice.evaluateCondition()) {
				return false;
			}
		}
		
		return true;
    
    }

    // TODO: The control of the interactions and their computation is made in
    //       such a way that it copes with concurrent controllers, which calculate
    //       the interactions in different threads. But, the actual execution of
    //       an interaction is not yet done transactionally. This would need some
    //       locking mechanisms, which still need to be implemented.

    private List<IElementBehaviour> elementBehaviours;

    public void registerWithElements() throws InvalidStateException {
    	elementBehaviours = new ArrayList<IElementBehaviour>();
		for (Object element: this.choices.keySet()) {		
			IElementBehaviour behaviour = engine.getElementBehaviour(element);
			if (!isValid()) break;
			elementBehaviours.add(behaviour);
			behaviour.registerListener(this);
		}
		
		if (!isValid()) {
			// in case the interaction is invalidated before or during the registration
			// throw an exception, so that the calling controller would be informed
			// about that; but, we need to make sure that registrations to elements 
			// that where added here already, concurrently to the invalidation, are 
			// properly removed before throwing the exception.
            unregisterElements();
			throw new InvalidStateException();
		}
    } 
    
    synchronized private void unregisterElements() {
		for (IElementBehaviour behaviour: elementBehaviours) {
			behaviour.unregisterListener(this);
		} 	
		elementBehaviours.clear();
    }
	
	@Override
	public void notifyChange(IElementBehaviour elementBehaviour) {
		// In case a locking transaction for executing the interaction
		// is acquiring the locks already, abort the locking and the
		// execution of the interaction (since this could happen
		// in concurrent threads, we need assign the lockingTransaction
		// to the transaction)
		LockingTransaction transaction = this.lockingTransaction;
		if (transaction != null) {
			transaction.abortLocking();
		}
		
		if (notifyInvalidationListeners()) {
			for (IElementBehaviour behaviour: elementBehaviours) {
				behaviour.unregisterListener(this);
			}
			elementBehaviours.clear();
		}
	}
	
	public void dispose() {
		super.dispose();
		unregisterElements();
	}

}
