package dk.dtu.imm.se.ecno.core;

import java.util.List;

import dk.dtu.imm.se.ecno.runtime.IChoice;

public interface IParallelElementBehaviour extends IElementBehaviour {
		
	/**
	 * Returns a list of possible choices for this event type that can be
	 * executed in parallel to the already made choices. Note that this 
	 * method must find all choices, even for sub- or super- event types,
	 * when they are compatible with the given eventType.
	 * 
	 * @param
	 * @param eventType
	 * @return the list of possible choices
	 */
	public List<IChoice> getChoices(List<IChoice> parallelChoices, IEventType eventType);
	
}
