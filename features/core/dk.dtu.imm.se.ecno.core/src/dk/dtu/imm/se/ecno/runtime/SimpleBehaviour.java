package dk.dtu.imm.se.ecno.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

/**
 * Implementation of  a simple behaviour, which just uses events and
 * event types. The SimpleBehaviour itself accepts all EventTypes
 * for which the element type has an event. By overwriting the methods
 * isEnabled() and execute(), subclasses can easily change this
 * behaviour. 
 * 
 * @author eki
 *
 */
public class SimpleBehaviour extends AbstractElementBehaviour implements ISimpleBehaviour {
	
	final private Set<IEventType> topLevelEventTypes;

	public SimpleBehaviour(ExecutionEngine engine, IElementType type, Object element) {
		super(engine, type, element);
		topLevelEventTypes = Collections.unmodifiableSet(engine.getTopLevelEventTypes(type));
	}

	public boolean isEnabled(IEventType eventType) {
		return topLevelEventTypes.contains(eventType.getTopSuper());
	}

	public boolean isEnabled(Event event) {
		return isEnabled(event.getType());
	}

	public void execute(Event event) {
	}

	final public List<IChoice> getChoices(IEventType eventType) {
		if (isEnabled(eventType)) {
			List<IChoice> result = new ArrayList<IChoice>();
			if (this.isEnabled(eventType)) {
				result.add(new SimpleChoice(engine, this, eventType));
			}
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
