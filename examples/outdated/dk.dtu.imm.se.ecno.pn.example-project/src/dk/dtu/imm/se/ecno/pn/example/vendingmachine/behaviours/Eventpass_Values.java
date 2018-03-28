package dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.Coin;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class Eventpass_Values extends Event_Values  {

	final public Coin coin;
	final public Slot slot;

	
	public Eventpass_Values(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    coin = (Coin) event.getParameter(formalParameters.get(0)).getValue();
	    slot = (Slot) event.getParameter(formalParameters.get(1)).getValue();
	}
}
