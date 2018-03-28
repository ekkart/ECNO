package dk.dtu.imm.se.ecno.model.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.ISimpleBehaviour;
import dk.dtu.imm.se.ecno.runtime.SimpleChoice;

public class SimpleEMFBehaviour extends AbstractEMFElementBehaviour implements ISimpleBehaviour {
	
	final private Set<IEventType> topLevelEventTypes;
	
	public SimpleEMFBehaviour(ExecutionEngine engine, IElementType type, EObject element) {
		super(engine, type, element);
		topLevelEventTypes = Collections.unmodifiableSet(engine.getTopLevelEventTypes(type));
	}
	
	public boolean isEnabled(IEventType eventType) {
		return getElementType().getCoordinationSets(eventType) != null;
	}

	public boolean isEnabled(Event event) {
		return isEnabled(event.getType());
	}

	public void execute(Event event) {
	}

	final public List<IChoice> getChoices(IEventType eventType) {
		if (isEnabled(eventType)) {
			List<IChoice> result = new ArrayList<IChoice>();
		    result.add(new SimpleChoice(engine, this, eventType));
			return result;			
		}
		return null;
	}
	
	/**
	 * Returns the top level event types for which this behaviour contributes
	 * choices. Other event types are ignored by this behaviour.
	 */
	public Set<IEventType> getTopLevelEventTypes() {
		return this.topLevelEventTypes;
	}

}
