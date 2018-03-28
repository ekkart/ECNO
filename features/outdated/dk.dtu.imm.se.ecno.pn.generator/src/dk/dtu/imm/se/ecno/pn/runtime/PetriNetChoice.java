package dk.dtu.imm.se.ecno.pn.runtime;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.pn.model.EventType;
import dk.dtu.imm.se.ecno.runtime.Choice;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Event_Values;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class PetriNetChoice extends Choice {

	private int transition;
	private AbstractPetrinetBehaviour owner;

	private Map<String,Event_Values> tmpEventName2EventValues;
	private boolean[][] tmpNotAssigned;

	public PetriNetChoice(ExecutionEngine engine, AbstractPetrinetBehaviour owner, List<IEventType> events, int transition) {
		super(engine, owner, events);
		this.owner = owner;
		this.transition = transition;
	}

	private PetriNetChoice(PetriNetChoice choice) {
		this(choice.engine, (AbstractPetrinetBehaviour) choice.getOwner(), choice.getEventTypes(), choice.transition);
		// TODO: We do not copy the temporary attributes tmpEventName2EventValues and
		//       tmpNotAssigned for now since these are used only in the end of the
		//       AssignmentPhase. Once, the assignments are tried on the fly, these
		//       attributes need also to be copied here.
	}

	public boolean dropParentChoice() {
		return owner.dropParentChoice(transition);
	}

	public int getTransition() {
		return transition;
	}

	public Event_Values getEventValues(String eventType) {
		if (this.tmpEventName2EventValues != null) {
			return this.tmpEventName2EventValues.get(eventType);
		}
		return null;
	}

	@Override
	public boolean areAssignmentsComplete() {
		initTMPNotAssigned();
		for (int i=0; i<tmpNotAssigned.length; i++) {
			for (int j=0; j<tmpNotAssigned[i].length; j++) {
				if (tmpNotAssigned[i][j]) {
					return false;
				}
			}
		} 
		return true;
	}

	private void calculateTMPEventValues() {
		this.tmpEventName2EventValues = new HashMap<String,Event_Values>();
		for (IEventType eventType: this.getEventTypes()) {
			// eki 18. 4. 2012
			// Event event = interaction.getEvent(owner, eventType);
			Event event = this.getEvent(eventType);
			if (event != null) {
				Event_Values eventValues = event.getEventValues();
				if (eventValues != null) {
					this.tmpEventName2EventValues.put(event.getType().getName(), eventValues);
				}
			}
		}
	}

	private void initTMPNotAssigned() {
		if (tmpNotAssigned == null) {
			List<IEventType> eventTypes = this.getEventTypes();
			tmpNotAssigned = new boolean[eventTypes.size()][];
			for (int i=0; i< tmpNotAssigned.length; i++) {
				List<IFormalParameter> formalParameters = eventTypes.get(i).getFormalParametersList();
				tmpNotAssigned[i] = new boolean[formalParameters.size()];
				for (int j=0; j < formalParameters.size(); j++) {
					tmpNotAssigned[i][j] = this.owner.doesAssignParam(transition, i, j);
				}
			}
			
		}
	}

	@Override
	public boolean doAssignments(Set<Parameter> parameters) {
		initTMPNotAssigned();
        calculateTMPEventValues();
		int i = 0;
		for (IEventType eventType: this.getEventTypes()) {
			// eki 18. 4. 2012
			// Event event = interaction.getEvent(owner, eventType);
			Event event = this.getEvent(eventType);
			if (event == null && eventType instanceof EventType) {
				// TODO: actually all the events should have been created up to this point
				//       it would be an error if we needed to add them here!
				event = ((EventType) eventType).createInstance(engine);
				if (event == null) {
					return false;
				}
				// eki 18. 4. 2012
				// interaction.add(owner, event);
				this.addEvent(event);
			}
			List<IFormalParameter> formalParameters = eventType.getFormalParametersList();
			for (int j=0; j<formalParameters.size(); j++) {
				if (tmpNotAssigned[i][j]) {
					Parameter param = event.getParameter(formalParameters.get(j));
					if (param != null) {
						Object value = null;
						try {
							value = owner.getParamAssignment(this,i,j);
						} catch (Throwable e) {}
						if (value != null) {
							if (param.setValue(value)) {
								parameters.add(param);
								tmpNotAssigned[i][j] = false;
							} else {
								return false;
							}	
						}
					} else {
						return false;
					}
				}
			}
			i++;
		}
		return true;
	}

	@Override
	public boolean evaluateCondition() {
        calculateTMPEventValues();
		boolean result = false;
		try {
			result = owner.evaluateCondition(this);
		} catch (Throwable e) {}
		return result;
	}

	@Override
	public void execute() {
        calculateTMPEventValues();
		try {
			owner.executeAction(this);
		} catch (Throwable e) {}
	}

	@Override
	public Choice copy(CopyMappings mappings) {
		return new PetriNetChoice(this);
	}	
	
}

