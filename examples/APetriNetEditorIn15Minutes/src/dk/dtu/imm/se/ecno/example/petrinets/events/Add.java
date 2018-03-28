/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. It defines an Event_Value class.
 */
package dk.dtu.imm.se.ecno.example.petrinets.events;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.runtime.Event; 
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class Add extends Event_Values  {

	final public Collection<PetriNets.Place> places;

	@SuppressWarnings("unchecked")
	public Add(IEventType type, Event event) {
		super(type.getDirectSuperType(), event);
		List<IFormalParameter> formalParameters = type.getFormalParametersList();           	
	    places = Collections.unmodifiableCollection((Collection<PetriNets.Place>) event.getParameter(formalParameters.get(0)).getValue());
	}
}
