/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package dk.dtu.imm.se.ecno.example.petrinets.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class RemoveToken extends Event_Values  {

	final public PetriNets.Token token;

	public RemoveToken(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    token = (PetriNets.Token) event.getParameter(formalParameters.get(0)).getValue();
	}
}