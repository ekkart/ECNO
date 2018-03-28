package dk.dtu.imm.se.ecno.runtime;

import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;

public interface IChoice {

	/**
	 * Returns the behaviour of the element to which this choice belongs. Note that
	 * in cases that the element and its behaviour are not the same object, the
	 * owner is the behaviour and not the element itself!
	 * 
	 * @return the behaviour owning this choice
	 */
	public IElementBehaviour getOwner();

	public IChoice getChoiceContainer();

	public void setChoiceContainer(IChoice container); 
	
	public boolean dropParentChoice();

	public List<IEventType> getEventTypes();
	
	public void addEvent(Event event);
	
	public Event getEvent(IEventType eventType);

	/**
	 * Does the assignments of this choice. Returns true, if the assignments
	 * (that were possible) were successful. Returns false if there were
	 * conflicts with existing values. The parameters that were changed are
	 * added to the set parameters (if parameters are not null).
	 * 
	 * @param parameters
	 * @return success 
	 */
	public boolean doAssignments(Set<Parameter> parameters); 

	/**
	 * Returns true, if all the assignments that this Choice wants to make could be made.
	 * @return
	 */
	public boolean areAssignmentsComplete();

	/**
	 * Evaluates the Condition (after all possible parameters are assigned).
	 * The interaction gives access to the events and their parameters.
	 * 
	 * @return
	 */
	public boolean evaluateCondition();

	/** 
	 * The execution that is associated with this choice (and its element).
	 * The standard implementation is calling the execute with this Choice
	 * on the element (owner).
	 * 
	 * @param interaction
	 */
	public void execute();

    /**
     * In the course of calculating possible interactions, choices must be copied.
     * To this end, this method is used. The mappings would help if the Choice 
     * references Events and Choices that were mapped already. Then the copy
     * should refer to these copies.
     * 
     * @param mappings
     * @return
     */
	public IChoice copy(CopyMappings mappings);

}
