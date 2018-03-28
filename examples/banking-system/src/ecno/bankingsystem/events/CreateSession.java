/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package ecno.bankingsystem.events;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 

public class CreateSession extends ecno.bankingsystem.events.SystemAction  {

	final public emf.bankingsystem.PhysicalBankCard card;
	final public emf.bankingsystem.AccountMngr issuer;
	final public emf.bankingsystem.Account account;
	final public emf.bankingsystem.BankCard bcard;

	public CreateSession(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    card = (emf.bankingsystem.PhysicalBankCard) event.getParameter(formalParameters.get(0)).getValue();
	    issuer = (emf.bankingsystem.AccountMngr) event.getParameter(formalParameters.get(1)).getValue();
	    account = (emf.bankingsystem.Account) event.getParameter(formalParameters.get(2)).getValue();
	    bcard = (emf.bankingsystem.BankCard) event.getParameter(formalParameters.get(3)).getValue();
	}

	@Override
	public ecno.bankingsystem.events.SystemAction super_() {
		return this;
	}

}
