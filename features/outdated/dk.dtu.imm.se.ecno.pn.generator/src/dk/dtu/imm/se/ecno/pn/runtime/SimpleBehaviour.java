package dk.dtu.imm.se.ecno.pn.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.pn.model.ElementType;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.ISimpleBehaviour;
import dk.dtu.imm.se.ecno.runtime.SimpleChoice;


/**
 * Simple implementation of the behaviour of an element, which just
 * uses events and event types. The SimpleBehaviour itself accepts all
 * EventTypes and does not have any behaviour. By overwriting the methods
 * isEnabled() and execute(), subclasses can easily change this
 * behaviour. Note that SimpleBehaviour and subclasses should not
 * be used for complex local behaviour, which requires the joint
 * execution of events.
 * 
 * @author eki
 *
 */
public class SimpleBehaviour extends AbstractBehaviour implements ISimpleBehaviour {
	
	final private Set<IEventType> topLevelEventTypes;
	
	public SimpleBehaviour(ExecutionEngine engine, ElementType type, Element element) {
		super(engine, type, element);
		topLevelEventTypes = Collections.unmodifiableSet(engine.getTopLevelEventTypes(type));
	}
	
	/**
	 * Checks whether an event of the given type is enabled locally.
	 * 
	 * @param eventType
	 * @return
	 */
	public boolean isEnabled(IEventType eventType) {
		if (eventType != null) {
			ElementType elementType = this.getElementType();
			if (elementType != null) {
				return elementType.supportsEventType(eventType);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * Checks whether an event is enabled locally. Sub-classes can overwrite
	 * this method. Note that in contrast to isEnbaled(EventType eventType),
	 * this methods can consider the parameters of the event.
	 * 
	 * @param event
	 * @return
	 */
	public boolean isEnabled(Event event) {
		if (event != null) {
			return isEnabled(event.getType());
		} else {
			return false;
		}
	}
	
	/**
	 * Execute the action attached to an event. Implementations should overwrite
	 * this to add some behaviour -- the standard implementation does not does
	 * anything. Note that it is expected the call of execute(Event event) is supposed to
	 * execute without failure, when the isEnable(Event event) was returning true.
	 * 
	 * @param event
	 * 
	 */
	public void execute(Event event) {
	}
	
	/**
	 * Returns a list of possible choices for this event type. If the element
	 * is enabled for the event, there is exactly one choice which consists of
	 * exactly this event type; otherwise the list of choices is empty.
	 * 
	 * @param eventType
	 * @return
	 */
	final public List<IChoice> getChoices(IEventType eventType) {
		if (eventType != null && 
				this.getElementType().getCoordinationSets(eventType) != null) {
			List<IChoice> result = new ArrayList<IChoice>();
			if (this.isEnabled(eventType)) {
				result.add(new SimpleChoice(engine, this, eventType));
			}
			return result;
		} else {
			return null;
		}
	}
	
	final public ElementType getElementType() {
		return (ElementType) super.getElementType();
	}

	/**
	 * Returns the top level event types for which this behaviour contributes
	 * choices. Other event types are ignored by this behaviour.
	 */
	public Set<IEventType> getTopLevelEventTypes() {
		return this.topLevelEventTypes;
	}

}
