/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package ecno.bankingsystem.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class UserCardAction extends Event_Values  {

	final public emf.bankingsystem.PhysicalBankCard card;

	public UserCardAction(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    card = (emf.bankingsystem.PhysicalBankCard) event.getParameter(formalParameters.get(0)).getValue();
	}
}