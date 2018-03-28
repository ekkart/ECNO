package dk.dtu.imm.se.ecno.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.internal.InheritingChoice;

public class Choice implements IChoice {

	final protected ExecutionEngine engine;
	
	final private IElementBehaviour owner;
	final private List<IEventType> eventTypes;

	private IChoice container;

	// final private int id;
	// final private int hashCode;

	/**
	 * Constructs an instance of a choice. The identity is defined by the
	 * owner of the choice and the event types (where the order matters).
	 * 
	 * @param adapter
	 * @param owner
	 * @param events
	 */
	// Probably EventTypes[] should be made a list (also in getEventTypes()
	public Choice(ExecutionEngine engine, IElementBehaviour owner, List<IEventType> events) {
		super();
		this.engine = engine;
		this.owner = owner;
	    this.eventTypes = new ArrayList<IEventType>(events);
	    this.container = null;
	}

	/*
	 * Constructs an instance of a choice. The identity is defined by the
	 * owner of the choice, the event types (where the order matters) and
	 * the additional id information. Note that this information can only
	 * be used to make choices "more different", not to make them "more equal";
	 * if a sub class wants to be sure that two choices are different a different
	 * id needs to be passed to this constructor.
	 * 
	 * @param adapter
	 * @param owner
	 * @param events
	 * @param id further information of identity of choices, the assumption is  that
	 *           if id, owner and events are equal, the choice is equal.
	 *
	 *
	protected Choice(IElementBehaviour owner, IEventType[] events, int id) {
		this(owner, events);
		// TODO eki: the id attribute is out-dated and has no use anymore
		//           this can be removed (which would imply some follow changes)
	}
	*/

	/**
	 * Returns the behaviour of the element to which this choice belongs. Note that
	 * the owner is not (in all cases) the element itself, but the behaviour of the
	 * element.
	 * 
	 * @return the behaviour owning this choice
	 */
	public IElementBehaviour getOwner() {
		return owner;
	}
	
	
	final public IChoice getChoiceContainer() {
		return this.container;
	}
	
	final public void setChoiceContainer(IChoice container) {
		this.container = container;
	}
	
	public boolean dropParentChoice() {
		return false;
	}

	public List<IEventType> getEventTypes() {
		return Collections.unmodifiableList(eventTypes);
	}

	@Override
	public void addEvent(Event event) {
		if (container != null) {
			container.addEvent(event);
		}
	}
	
	@Override
	public Event getEvent(IEventType eventType) {
		if (container != null) {
			return container.getEvent(eventType);
		}
		return null;
	}
	
	/**
	 * Does the assignments of this choice. Returns true, if the assignments
	 * (that were possible) were successful. Returns false if there were
	 * conflicts with existing values. The parameters that were changed are
	 * added to the set parameters (if parameters are not null).
	 * 
	 * @return success 
	 */
	public boolean doAssignments(Set<Parameter> parameters) {
		return true;
	}

	/**
	 * Returns true, if all the assignments that this Choice wants to make could be made.
	 * @return
	 */
	public boolean areAssignmentsComplete() {
		return true;
	}

	/**
	 * Evaluates the Condition (after all possible parameters are assigned).
	 * The interaction gives access to the events and their parameters.
	 * 
	 * @return
	 */
	public boolean evaluateCondition() {
		return true;
	}

	/**
	 * The execution that is associated with this choice (and its element).
	 * The standard implementation is doing nothing.
	 */
	public void execute() {
		// do nothing
	}
	
	/**
	 * This method can be called during the execution of a choice in order
	 * to start executing the parent behaviour (in the inheritance hierarchy).
	 * After the parent was executed, the execution is continued normally. The
	 * parent won't be called again after the execute. This method should
	 * only be called from within the execute method.  
	 */
	final public void executeParent() {
		if (container != null && container instanceof InheritingChoice) {
			((InheritingChoice) container).executeParent();
		}
	}
	
	/**
	 * This method can be called during the execution of a choice in order
	 * to drop the execution of the parent's behaviour (if it was not yet
	 * executed).  
	 */
	final public void dropExecuteParent() {
		if (container != null && container instanceof InheritingChoice) {
			((InheritingChoice) container).dropExecuteParent();
		}
	}
	
    /**
     * In the course of calculating possible interactions, choices must be copied.
     * To this end, this method is used. The mappings would help if the Choice 
     * references Events and Choices that were mapped already. Then the copy
     * should refer to these copies.
     * 
     * @param mappings
     * @return
     */
	public Choice copy(CopyMappings mappings) {
		return new Choice(engine, owner, this.eventTypes);
	}

}
