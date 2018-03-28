package dk.dtu.compute.se.ecno.statespace.controller.configurator;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.compute.se.ecno.statespace.Event;
import dk.dtu.compute.se.ecno.statespace.Link;
import dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues;
import dk.dtu.compute.se.ecno.statespace.Parameter;
import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.StatespaceFactory;
import dk.dtu.compute.se.ecno.statespace.Transition;
import dk.dtu.compute.se.ecno.statespace.Value;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.runtime.IInteractionExecutionCommand;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;

public class StateSpaceRecorderInteractionCommandWrapper implements
		IInteractionExecutionCommand {

	private ExecutionEngine engine;
	private IInteractionExecutionCommand command;
	private StateSpace statespace;
	private EObject container;
	
	StateSpaceRecorderInteractionCommandWrapper(
			ExecutionEngine engine,
			IInteractionExecutionCommand command,
			StateSpace statespace,
			EObject container) {
		this.engine = engine;
		this.command = command;
		this.statespace = statespace;
		this.container = container;
	}
		
	@Override
	public Interaction getInteraction() {
		if (command != null) {
			return command.getInteraction();
		} else {
			return null;
		}
	}
	
	private Event createEvent(dk.dtu.imm.se.ecno.runtime.Event event, State state) {
		Event result = StatespaceFactory.eINSTANCE.createEvent();
		result.setName(event.getType().getName());
		for (IFormalParameter formParam : event.getType().getFormalParametersList()) {
			// TODO note that we do not properly deal with inheriting events yet
			// (could have identical parameter names.
			dk.dtu.imm.se.ecno.runtime.Parameter param = event.getParameter(formParam);
			Object value = param.getValue();
			Parameter resultParam = StatespaceFactory.eINSTANCE.createParameter();
			resultParam.setName(formParam.getName());
			resultParam.setCollection(formParam.isCollective());
			Value resultValue = StatespaceFactory.eINSTANCE.createValue();
			if (resultParam.isCollection() && value instanceof Collection) {
				boolean success = false;
				try {
					@SuppressWarnings("unchecked")
					Collection<? extends Element> add = (Collection<? extends Element>) value;
					for (Element element: add) {
						StateObject stateObjectValue = state.getState(element.getUid());
						if (stateObjectValue != null) {
							resultValue.getStateValues().add(stateObjectValue);
						}
					}
					success = true;
				} catch (Exception e) {}
				if (! success) {
					try {
						@SuppressWarnings("unchecked")
						Collection<String> add = (Collection<String>) value;
						resultValue.getStringValues().addAll(add);
						success = true;
					} catch (Exception e) {}
				}
				if (! success) {
					try {
						@SuppressWarnings("unchecked")
						Collection<Integer> add = (Collection<Integer>) value;
						resultValue.getIntValues().addAll(add);
					} catch (Exception e) {}
				}

			} else {
				if (value instanceof Element) {
					StateObject stateObjectValue = state.getState(((Element) value).getUid());
					if (stateObjectValue != null) {
						resultValue.getStateValues().add(stateObjectValue);
					}	
				} else if (value instanceof String) {
					resultValue.getStringValues().add((String) value);
				}  else if (value instanceof Integer) {
					resultValue.getIntValues().add((Integer) value);
				}
			}
			resultParam.setValue(resultValue);
			result.getParameters().add(resultParam);
		}
		
		return result;
	}

	@Override
	public void doExecute() throws InvalidStateException {
		
		State startState = StatespaceFactory.eINSTANCE.createState();
		startState.init(container,engine);
		State existingState = statespace.add(startState);
		if (existingState != startState) {
			startState = existingState;
		}
		
		Interaction interaction = getInteraction();
		
		// TODO it might be necessary to clone the interaction first in order to unify all
		// events (while computing an interaction, different events representing the same
		// event might occur.
		
		Collection<dk.dtu.imm.se.ecno.runtime.Link> links =  interaction.getLinks();
		Transition transition = StatespaceFactory.eINSTANCE.createTransition();
		transition.setSource(startState);
		
		Map<dk.dtu.imm.se.ecno.runtime.Event, Event> event2event = new HashMap<dk.dtu.imm.se.ecno.runtime.Event, Event>();
		
		dk.dtu.imm.se.ecno.runtime.Event triggerEvent = interaction.getTriggerEvent();
		if (triggerEvent != null) {
			Event resultTriggerEvent = createEvent(triggerEvent, startState);
			event2event.put(triggerEvent, resultTriggerEvent);
		    transition.getEvents().add(resultTriggerEvent);
			transition.setTrigger(resultTriggerEvent);
		}
		
		Object triggerElement = interaction.getTriggerElement();
		if (triggerElement instanceof Element) {
			StateObject triggerStateObject = startState.getState(((Element) triggerElement).getUid());
			if (triggerStateObject != null) {
				transition.setTriggerElement(triggerStateObject);
			}
		}

		for (dk.dtu.imm.se.ecno.runtime.Link link: links) {
			if (link.source instanceof Element && 
					link.target instanceof Element &&
					link.reference instanceof Reference) {
				StateObject sourceStateObject = startState.getState(((Element) (link.source)).getUid());
				StateObject targetStateObject = startState.getState(((Element) (link.target)).getUid());
				if (sourceStateObject != null && targetStateObject != null) {
					for (ObjectFeatureValues ofv: sourceStateObject.getFeatures()) {
						if (ofv.getFeature().equals(((Reference) link.reference).getEReference())) {
							if (!ofv.getValues().isEmpty()) {
								Value value = ofv.getValues().get(0);
								if  (link.index < value.getStateValues().size() &&
										targetStateObject == value.getStateValues().get(link.index)) {
									Link transitionLink = StatespaceFactory.eINSTANCE.createLink();
									transitionLink.setFeature(ofv);
									transitionLink.setNo(link.index);
									transition.getLinks().add(transitionLink);
									Collection<dk.dtu.imm.se.ecno.runtime.Event> events = 
											interaction.getEvents(link);
									for (dk.dtu.imm.se.ecno.runtime.Event event: events) {
										Event transitionEvent = event2event.get(event);
										if (transitionEvent == null) {
											transitionEvent = this.createEvent(event, startState);
											event2event.put(event, transitionEvent);
											transition.getEvents().add(transitionEvent);
										}
										transitionEvent.getLinks().add(transitionLink);
									}
									break;
								}
							}
						}
					}
				}
			}
		}
		

		
		if (interaction != null && interaction.isValid()) {
			
			command.doExecute();
			
			State nextState = StatespaceFactory.eINSTANCE.createState();
			nextState.init(container,engine);
			
			existingState = statespace.add(nextState);
			if (existingState != nextState) {
				nextState = existingState;
			}
			
			transition.setTarget(nextState);
			
			// TODO this is done in a very ad hoc way; it should be done similar to the
			// way we do it for states (checking it when insertin it to the state space)
			boolean found = false;
			for (Transition t: statespace.getTransitions()) {
				if (t.equals(transition)) {
					found = true;
				}
			}
			if (!found) {
				transition.setNumber(statespace.getTransitions().size() + 1);
				statespace.getTransitions().add(transition);
			}
		}

	}

}
