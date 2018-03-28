package dk.dtu.imm.se.ecno.model.runtime.ecnonets;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IEventKind;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Choice;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Event_Values;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class PetriNetChoice extends Choice {

	final private int transition;
	final private AbstractPetrinetBehaviour<?> ownerBehaviour;
	
	private Map<String,Event_Values> tmpEventName2EventValues;
	private boolean[][] tmpAssignedParameters;

	public PetriNetChoice(ExecutionEngine engine, AbstractPetrinetBehaviour<?> ownerBehaviour, List<IEventType> events, int transition) {
		super(engine, ownerBehaviour, events);
		this.ownerBehaviour = ownerBehaviour;
		this.transition = transition;
	}
	
	private PetriNetChoice(PetriNetChoice choice) {
		this(choice.engine, choice.ownerBehaviour, choice.getEventTypes(), choice.transition);
		// TODO: We do not copy the temporary attributes tmpEventName2EventValues and
		//       tmpNotAssigned for now since these are used only in the end of the
		//       AssignmentPhase. Once, the assignments are tried on the fly, these
		//       attributes need also to be copied here.
	}
	
	@Override
	public boolean dropParentChoice() {
		return ownerBehaviour.dropParentChoice(transition);
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
		// extension for override checking for assignment completeness
		IElementBehaviour behaviour = this.getOwner();
		AbstractPetrinetBehaviour<?> pnBehaviour = null;
		if (behaviour instanceof AbstractPetrinetBehaviour) {
			pnBehaviour = (AbstractPetrinetBehaviour<?>) behaviour;
			/*
			if (!((AbstractPetrinetBehaviour<?>) behaviour).checkAssignmentCompleteness(0, 0, 0)) {
				return true;
			}
			*/
			
		}
		// end of extension part 1
		initTMPNotAssigned();
		for (int i=0; i<tmpAssignedParameters.length; i++) {
			for (int j=0; j<tmpAssignedParameters[i].length; j++) {
				if (// extension part 2: added next line added
					(pnBehaviour == null || pnBehaviour.checkAssignmentCompleteness(transition,i,j)) && 
					!tmpAssignedParameters[i][j]) {
					return false;
				}
			}
		} 
		return true;
	}
	
	private void calculateTMPEventValues() {
		this.tmpEventName2EventValues = new HashMap<String,Event_Values>();
		for (IEventKind eventKind: ownerBehaviour.getTransitionEventKinds(transition)) {
			// eki 18. 4. 2012
			// Event event = interaction.getEvent(ownerBehaviour.element, eventType);
			Event event = null;
			if (eventKind instanceof IEventType) {
				event = this.getEvent((IEventType) eventKind);
			} else if (eventKind instanceof IEventTypeExtension) {
				event = this.getEvent(((IEventTypeExtension) eventKind).getBaseEventType());
			}
			if (event != null) {
				Event_Values eventValues = null;
				if (eventKind instanceof IEventType) {
					eventValues = event.getEventValues();
				} else if (eventKind instanceof IEventTypeExtension) {
					eventValues = event.getEventExtensionValues((IEventTypeExtension) eventKind);
				}
				if (eventValues != null) {
					// eki 8. 2. 2012: Fix for properly dealing with event inheritance
					// this.tmpEventName2EventValues.put(event.getType().getName(), eventValues);
					this.tmpEventName2EventValues.put(eventKind.getName(), eventValues);
				}
			}
		}
	}
	
	private void initTMPNotAssigned() {
		if (tmpAssignedParameters == null) {
			tmpAssignedParameters = new boolean[this.getEventTypes().size()][];
			for (int i=0; i< tmpAssignedParameters.length; i++) {
				List<IFormalParameter> formalParameters = ownerBehaviour.getParameters(transition, i);
				tmpAssignedParameters[i] = new boolean[formalParameters.size()];
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
			// Event event = interaction.getEvent(ownerBehaviour.element, eventType);
			Event event = this.getEvent(eventType);
			if (event == null) {
				event = new Event(engine, eventType);
				// eki 18. 4. 2012
				// interaction.add(ownerBehaviour.element, event);
				this.addEvent(event);
			}
			List<IFormalParameter> formalParameters = ownerBehaviour.getParameters(transition, i);
			for (int j=0; j<formalParameters.size(); j++) {
				if (!tmpAssignedParameters[i][j]) {
					Parameter param = event.getParameter(formalParameters.get(j));
					if (param != null) {
						Object value = null;
						try {
							value = ownerBehaviour.getParamAssignment(this,i,j);
						} catch (Throwable e) {}
						if (value != null) {
							if (param.setValue(value)) {
								parameters.add(param);
								tmpAssignedParameters[i][j] = true;
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
			result = ownerBehaviour.evaluateCondition(this);
		} catch (Throwable e) {}
		return result;
	}
	
	@Override
	public void execute() {
        calculateTMPEventValues();
		try {
			ownerBehaviour.executeAction(this);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	@Override
	public Choice copy(CopyMappings mappings) {
		return new PetriNetChoice(this);
	}	
	
}

