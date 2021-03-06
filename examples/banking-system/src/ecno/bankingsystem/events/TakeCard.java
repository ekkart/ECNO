/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package ecno.bankingsystem.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 

public class TakeCard extends dk.dtu.imm.se.ecno.runtime.Event_Values  {

	final public emf.bankingsystem.PhysicalBankCard card;

	public TakeCard(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    card = (emf.bankingsystem.PhysicalBankCard) event.getParameter(formalParameters.get(0)).getValue();
	}

	@Override
	public dk.dtu.imm.se.ecno.runtime.Event_Values super_() {
		return this;
	}

}
