package dk.dtu.imm.se.ecno.pn.example.vendingmachine.behaviours;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.pn.example.vendingmachine.Slot;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class Eventreturn__Values extends Event_Values  {

	final public Slot slot;
	
	public Eventreturn__Values(IEventType type, Event event) {
		super(type,event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();
		this.slot = (Slot) event.getParameter(formalParameters.get(0)).getValue();
	}
}
