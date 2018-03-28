package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class NoOpChoice implements IChoice {

	private static NoOpChoice instance;
	
	private NoOpChoice() {
		instance = this;
	}

	@Override
	public IElementBehaviour getOwner() {
		return null;
	}

	@Override
	public IChoice getChoiceContainer() {
		return null;
	}

	@Override
	public void setChoiceContainer(IChoice container) {
	}

	@Override
	public boolean dropParentChoice() {
		return false;
	}

	@Override
	public List<IEventType> getEventTypes() {
		return Collections.emptyList();
	}

	@Override
	public void addEvent(Event event) {	
	}

	@Override
	public Event getEvent(IEventType eventType) {
		return null;
	}
	
	@Override
	public boolean doAssignments(Set<Parameter> parameters) {
		return true;
	}

	@Override
	public boolean areAssignmentsComplete() {
		return true;
	}

	@Override
	public boolean evaluateCondition() {
		return false;
	}

	@Override
	public void execute() {
	}

	@Override
	public IChoice copy(CopyMappings mappings) {
		if (instance != null) {
			return instance;
		} else  {
			return new NoOpChoice();
		}
	}

	public static NoOpChoice getInstance() {
		if (instance != null) {
			return instance;
		} else {
			return new NoOpChoice();
		}
	}


}
