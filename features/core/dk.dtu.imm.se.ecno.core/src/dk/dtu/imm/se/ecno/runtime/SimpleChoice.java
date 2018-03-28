package dk.dtu.imm.se.ecno.runtime;

import java.util.Collections;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class SimpleChoice extends Choice {

	public SimpleChoice(ExecutionEngine engine, ISimpleBehaviour owner, IEventType eventType) {
		super(engine, owner, Collections.singletonList(eventType));
	}

	@Override
	public boolean evaluateCondition() {
		ISimpleBehaviour owner = (ISimpleBehaviour) getOwner();
		List<IEventType> eventTypes = this.getEventTypes();
		if (eventTypes != null && eventTypes.size() == 1) {
			// Event event = interaction.getEvent(owner.getElement(), eventTypes[0]);
			Event event = this.getEvent(eventTypes.get(0));
			if (owner != null && event != null) {
				return owner.isEnabled(event);
			}
		}
		return false;
	}

	@Override
	public void execute() {
		ISimpleBehaviour owner = (ISimpleBehaviour) getOwner();
		List<IEventType> eventTypes = this.getEventTypes();
		if (eventTypes != null && eventTypes.size() == 1) {
			// Event event = interaction.getEvent(owner.getElement(), eventTypes[0]);
			Event event = this.getEvent(eventTypes.get(0));
			if (event != null) {
				((SimpleBehaviour) owner).execute(event);
			}
		}
	}

}
