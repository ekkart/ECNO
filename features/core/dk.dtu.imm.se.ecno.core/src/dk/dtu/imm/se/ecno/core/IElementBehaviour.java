package dk.dtu.imm.se.ecno.core;

import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.runtime.IChoice;

public interface IElementBehaviour extends IChangeNotifier {
		
	/**
	 * Returns a list of possible choices for this event type. Note that
	 * this method must find all choices, even for sub- or super- event types,
	 * when they are compatible with the given eventType.
	 *  
	 * @param eventType
	 * @return the list of possible choices
	 */
	// (Should probably take an event as parameter, so that
	//  parameters could be taken into account).
	public List<IChoice> getChoices(IEventType eventType);
	
	/**
	 * Returns the element for this behaviour.
	 *
	 * @return the element 
	 */
	public Object getElement();
	
	/**
	 * Returns the elements type.
	 *
	 * @return the element 
	 */
	public IElementType getElementType();
	
	/**
	 * Returns the top level event types for which this behaviour contributes
	 * choices. Other event types are ignored by this behaviour.
	 */
	public Set<IEventType> getTopLevelEventTypes();
	
}
