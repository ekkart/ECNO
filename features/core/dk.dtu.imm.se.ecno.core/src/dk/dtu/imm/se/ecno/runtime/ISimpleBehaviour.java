package dk.dtu.imm.se.ecno.runtime;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;

/**
 * Interface for  a simple behaviour, which just uses events and
 * event types. The SimpleBehaviour itself accepts all EventTypes
 * for which the element has a coordination set 
 * and does not have any behaviour. By overwriting the methods
 * isEnabled() and execute(), subclasses can easily change this
 * behaviour. 
 * 
 * @author eki
 *
 */
public interface ISimpleBehaviour extends IElementBehaviour {

	boolean isEnabled(IEventType eventType);

	boolean isEnabled(Event event);

	void execute(Event event); 

}
