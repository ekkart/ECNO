package dk.dtu.compute.se.ecno.statespace.generator.simulator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import dk.dtu.compute.se.ecno.statespace.Element;
import dk.dtu.compute.se.ecno.statespace.Event;
import dk.dtu.compute.se.ecno.statespace.Link;
import dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues;
import dk.dtu.compute.se.ecno.statespace.Parameter;
import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StateSpace;
import dk.dtu.compute.se.ecno.statespace.StatespaceFactory;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Transition;
import dk.dtu.compute.se.ecno.statespace.Value;
import dk.dtu.compute.se.ecno.statespace.generator.GeneratorFactory;
import dk.dtu.compute.se.ecno.statespace.generator.GeneratorState;
import dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent;
import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.runtime.ecnonets.AbstractPetrinetBehaviour;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;
import dk.dtu.imm.se.ecno.runtime.internal.InheritingBehaviour;

@SuppressWarnings("restriction")
public class StateSpaceGenerator {
	
	final public GeneratorState generatorState;
	
	private ExecutionEngine engine;
	private EObject container;
	private Collection<Element> elementList;
	
	private List<Element> allElements;

	private List<Element> triggerElements;
	private List<IEventType> triggerEvents;

	private StateSpace stateSpace;
	private Map<String, IEventType> name2eventType;
	private Map<Integer, Element> uid2element;
	
	private Set<Transition> existingTransitions;
	private Map<Integer, List<Transition>> hash2Transition;
	
	private boolean aborted = false;
	private long startTime = 0;
	private long finishTime = 0;
	
	private ElmentByUIDComparator order;

	@SuppressWarnings("unchecked")
	public StateSpaceGenerator(ExecutionEngine engine, EObject container,
			EReference containmentFeature,
			GeneratorState generatorState, List<Element> triggerElements,
			List<IEventType> triggerEvents) {
		super();
		this.engine = engine;
		this.order = new ElmentByUIDComparator();
		// engine.setElementOrder(new ElementByUIDComparator());
		this.container = container;
		Object containment = container.eGet(containmentFeature);
		if (!(containment instanceof Collection)) {
			System.err.println("Containment feature is not a collection.");
			throw new RuntimeException("Containment feature is not a collection.");
		}
		try {
			this.elementList = (Collection<Element>) containment;
		} catch (ClassCastException e) {
			System.err.println("Containment feature is not of type Element.");
			throw new RuntimeException("Containment feature is not of type Element.");
		}
		this.generatorState = generatorState;
		this.triggerElements = triggerElements;
		this.triggerEvents = triggerEvents;
		this.stateSpace = generatorState.getStatespace();
		
		this.allElements = new ArrayList<Element>();
		Iterator<EObject> iterator = container.eAllContents();
		while (iterator.hasNext()) {
			EObject next = iterator.next();
			if (next instanceof Element) {
				this.allElements.add((Element) next);
			} else {
				System.err.println("Container contains objects that are not elememts.");
				throw new RuntimeException("Container contains objects that are not elememts.");
			}
		}
		
		this.name2eventType = new HashMap<String, IEventType>();
		for (IEventType event: triggerEvents) {
			this.name2eventType.put(event.getName(), event);
		}
		
		this.uid2element = new HashMap<Integer,Element>();
		for (Element element: triggerElements) {
			this.uid2element.put(element.getUid(), element);
		}
		
		this.existingTransitions = new HashSet<Transition>();
		this.hash2Transition = new HashMap<Integer,List<Transition>>();
		for (Transition transition: stateSpace.getTransitions()) {
			this.existingTransitions.add(transition);
			int hashCode = transition.hashCode();
			if (transition.getTarget() != null) {
				hashCode ^=  transition.getTarget().hashCode();
			}
			List<Transition> transitions = this.hash2Transition.get(hashCode);
			if (transitions == null) {
				transitions = new ArrayList<Transition>();
				this.hash2Transition.put(hashCode, transitions);
			}
			transitions.add(transition);
		}
		
	}
	
	private void init() {
		if (stateSpace.getInit() == null) {
			State init = StatespaceFactory.eINSTANCE.createState();
			init.init(container, engine);
			init = stateSpace.add(init);
			stateSpace.setInit(init);
			generatorState.getUnhandledStates().add(init);
		}
		startTime = System.currentTimeMillis();
	}
	
	private Event createEvent(dk.dtu.imm.se.ecno.runtime.Event event, State state) {
		Event result = StatespaceFactory.eINSTANCE.createEvent();
		result.setName(event.getType().getName());
		for (IFormalParameter formParam : event.getType().getFormalParametersList()) {
			// TODO note that we do not properly deal with inheriting events yet
			// (could have identical parameter names).
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
						} else {
							System.err.println("StateObject for Element does not exists");
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
					} else {
						System.err.println("StateObject for Element does not exists");
					}
				} else if (value instanceof String) {
					resultValue.getStringValues().add((String) value);
				} else if (value instanceof Integer) {
					resultValue.getIntValues().add((Integer) value);
				}
			}
			resultParam.setValue(resultValue);
			result.getParameters().add(resultParam);
		}
		
		return result;
	}
	
	private Transition createTransition(State startState, Interaction interaction) {
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
			} else {
				System.err.println("StateObject for tigger element does not exists");
			}
		}

		for (dk.dtu.imm.se.ecno.runtime.Link link: links) {
			if (link.source instanceof Element && 
					link.target instanceof Element &&
					link.reference instanceof Reference) {
				StateObject sourceStateObject = startState.getState(((Element) (link.source)).getUid());
				StateObject targetStateObject = startState.getState(((Element) (link.target)).getUid());
				if (sourceStateObject != null && targetStateObject != null) {
					// TODO the variable found can be deleted eventually (only needed for testing)
					boolean found = false;
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
									found = true;
									break;
								} else {
									System.err.println("Index does not have target in ObjectFeatureValues");
								}
							} else {
								System.err.println("ObjectFeatureValues for link feature empty");
							}
						}
					}
					// TODO this can be deleted eventually (only needed for testing)
					if (! found) {
						System.err.println("No ObjectFeatureValues object for representing feature for the link in the source found.");
					}
				} else {
					System.err.println("No source or target objecs exists in element for the link");
				}
			} else {
				System.err.println("Source or target of link are not elements or reference is no ECNO EMF model reference");
			}
		}
		
		return transition;
	}
	
	private void handle(StateObjectEvent stateObjectEvent) {
		StateObject stateObject = stateObjectEvent.getStateObject();
		Element element = this.uid2element.get(stateObject.getUid());
		if (element == null) {
			System.err.println("Element " + stateObject.getUid() + " does not exist.");
		}
		IEventType eventType = this.name2eventType.get(stateObjectEvent.getEventName());
		EObject object = stateObject.eContainer();
		State state = null;
		if (object instanceof State) {
			state = (State) object;	
		} 

		if (state == null || eventType == null) {
			this.generatorState.getUnhandledStateObjectEvents().remove(stateObjectEvent);
			return;
		}
		engine.lockExclusive();
		this.resetStateCommand(state);
		InteractionIterator iterator = engine.getInteractions(element, eventType);
		boolean success = true;
		do {
			success = true;
			try {
				while (iterator.hasNext() && !aborted) {
					Interaction interaction = iterator.next();
					Transition transition = this.createTransition(state, interaction);
					List<Transition> transitions = this.hash2Transition.get(transition.hashCode());
					boolean exists = false;
					if (transitions != null) {
						for (Transition t: transitions) {
							transition.setTarget(t.getTarget());
							if (transition.equals(t)) {
								exists = true;
								transition.setTarget(null);
								transition.setSource(null);
								break;
							} 
							// TODO This case can be deleted (just a consistency check)
							/*
							else if (t.getTriggerElement().getUid() == transition.getTriggerElement().getUid() &&
								t.getTrigger().getName().equals(transition.getTrigger().getName()) && 
								t.getTrigger().equals(transition.getTrigger())) {
								System.err.println("Transition with same tigger are different!");
							}
							*/
						}
					}
					if (!exists) {
						try {
							// use the element order while executing the interaction (to make
							// execution deterministic
							engine.setElementOrder(order);
							interaction.execute();
							// don't use the order for computing interactions (which would make
							// the computation very inefficient)
							engine.setElementOrder(null);
							State newState = StatespaceFactory.eINSTANCE.createState();
							newState.init(container, engine);
							/* TODO can eventually deleted: This is just to check some things while testing
							for (Element e: this.allElements) {
								if (newState.getState(e.getUid()) == null) {
									System.err.println("Element not in state: " + e.getUid());
								}
							}
							*/
							State nextState = stateSpace.add(newState);
							if (newState == nextState) {
								this.generatorState.getUnhandledStates().add(newState);
							}
							transition.setTarget(nextState);
							this.resetStateCommand(state);
							iterator = engine.getInteractions(element, eventType);
						} catch (InvalidStateException e) {
						} finally {
							// even if the interaction was not successful add the transition with
							// target state null in order to mark that this interaction
							// is not successful (and not try it again later)
							if (!this.existingTransitions.contains(transition)) {
								transition.setNumber(this.existingTransitions.size()+1);
								stateSpace.getTransitions().add(transition);
								this.existingTransitions.add(transition);
								int hashCode =  transition.hashCode();
								if (transition.getTarget() != null) {
									hashCode ^= transition.getTarget().hashCode();
								}
								// List<Transition> existing = this.hash2Transition.get(transition.hashCode());
								List<Transition> existing = this.hash2Transition.get(hashCode);
								if (existing == null) {
									existing = new ArrayList<Transition>();
									this.hash2Transition.put(hashCode, existing);
									/*
									if (transition.getTarget() != null) {
										this.hash2Transition.put(transition.hashCode()^transition.getTarget().hashCode(),existing);
									} else {
										this.hash2Transition.put(transition.hashCode(),existing);
									}
									*/
								}
								existing.add(transition);
							} else {
								/*
								// TODO can be deleted just a consistency check for testing
								if (stateSpace.getTransitions().contains(transition)) {
									System.err.println("Contained transition not properly detected");
								}
								*/
								
							}
						}
					}
				}
			} catch (InvalidStateException e) {
				success = false;
				iterator = engine.getInteractions(element, eventType);
			}
		} while (!success && !aborted);
		engine.unlock();
		if (!aborted) {
			this.generatorState.getUnhandledStateObjectEvents().remove(stateObjectEvent);
		}
	}
	
	private void handle(StateObject stateObject) {
		Element element = this.uid2element.get(stateObject.getUid());
		if (element != null) {
			IElementType elementType = engine.getElementType(element);
			for (ICoordinationSet coordSet: elementType.getCoordinationSetsList()) {
				IEventType trigger = coordSet.getTriggerEventType();
				for (IEventType eventType: this.triggerEvents) {
					if (trigger.isCompatibleWith(eventType)){
						StateObjectEvent stateObjectEvent = GeneratorFactory.eINSTANCE.createStateObjectEvent();
						stateObjectEvent.setEventName(eventType.getName());
						stateObjectEvent.setStateObject(stateObject);
						this.generatorState.getUnhandledStateObjectEvents().add(stateObjectEvent);
					}
				}
			}
		}
		this.generatorState.getUnhandledStateObjects().remove(stateObject);
	}
	
	private void handle(State state) {
		for (Element element: this.triggerElements) {
			StateObject stateObject = state.getState(element.getUid());
			if (stateObject != null) {
				this.generatorState.getUnhandledStateObjects().add(stateObject);
			} else {
				// System.err.println("This should not happen");
			}
		}
		this.generatorState.getUnhandledStates().remove(state);
	}
	
	final static public int WORK = 600;
	final static public int WORK_STEP = 100;
	final static int LIMITINCREMENT = WORK*WORK_STEP;
	
	public void generate(IProgressMonitor monitor) {
		init();
		monitor.worked(1);
		int limit = 
				LIMITINCREMENT * (1 + (this.generatorState.getStatespace().getStates().size() + 
						      this.generatorState.getStatespace().getTransitions().size()) / LIMITINCREMENT);
		
		int nextReport = WORK_STEP;
		while (!aborted && (!this.generatorState.getUnhandledStates().isEmpty() ||
				!this.generatorState.getUnhandledStateObjects().isEmpty() ||
				!this.generatorState.getUnhandledStateObjectEvents().isEmpty())) {
			
			int noStates = this.generatorState.getStatespace().getStates().size();
			int noTransitions = this.generatorState.getStatespace().getTransitions().size();
			if (noStates + noTransitions >= nextReport) {
				monitor.setTaskName("Generated " + noStates + " states and " + noTransitions +" transitions.");
				int worked = 1 + ((noStates + noTransitions) - nextReport) / WORK_STEP;
				nextReport = nextReport + WORK_STEP * worked;
				monitor.worked(worked);
			}
			
			if (noStates + noTransitions >= limit) {
				aborted = true;
			}
			
			while (!aborted && !this.generatorState.getUnhandledStates().isEmpty()) {
				handle(this.generatorState.getUnhandledStates().get(0));
			}
			
			while (!aborted && !this.generatorState.getUnhandledStateObjects().isEmpty()) {
				handle(this.generatorState.getUnhandledStateObjects().get(0));
			}
			
			while (!aborted && !this.generatorState.getUnhandledStateObjectEvents().isEmpty()) {
				handle(this.generatorState.getUnhandledStateObjectEvents().get(0));
			}
		}
		
		finishTime = System.currentTimeMillis();
		this.stateSpace.setDescription(
				this.stateSpace.getDescription() + " " + 
						(finishTime - startTime) / 1000.0 + "sec" +
						(aborted ? " (aborted)" : ""));	
		}
	
	private void cleanContainer() {
		/*
		EStructuralFeature containerFeature = container.eClass().getEStructuralFeature("objects");
		if (!(containerFeature instanceof EReference) || 
				containerFeature.getUpperBound() == 1 ||
				!((EReference) containerFeature).isContainment()) {
			return null;
		}
		*/
		
		/*
		Object containment = container.eGet(this.containmentFeature);
		if (!(containment instanceof Collection)) {
			return null;
		}
		Collection<Element> elementList = null;
		try {
			elementList = (Collection<Element>) containment;
		} catch (ClassCastException e) {
			return null;
		}
		*/
		elementList.clear();
		// return elementList;
	}
	
	private boolean cleanObject(Element element) {			
		for (EStructuralFeature feature: element.eClass().getEAllStructuralFeatures()) {
			if (feature != StatespacePackage.eINSTANCE.getElement_Uid()) {
				if (feature.getUpperBound() == 1) {
					// element.eSet(feature, null);
					element.eUnset(feature);
				} else {
					Object value = element.eGet(feature);
					if (value instanceof Collection) {
						((Collection<?>) value).clear();
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	@SuppressWarnings("unchecked")
	private boolean createObjectState(State state, Element element, Map<StateObject,Element> stateObject2Element) {
		StateObject stateObject = state.getState(element.getUid());
		if (stateObject != null) {
			for (ObjectFeatureValues ofv: stateObject.getFeatures()) {
				EStructuralFeature feature = ofv.getFeature();
				EList<Value> values = ofv.getValues();
				if (feature == null || values == null || values.size() != 1) {
					return false;
				}
				Value value = values.get(0);
				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					if (reference.isContainment() || reference.getEOpposite() == null ||
							(reference.getUpperBound() != 1 && reference.getEOpposite().getUpperBound() == 1) ||
							(reference.hashCode() < reference.getEOpposite().hashCode())) {
						// in case of opposite assignments, we need to be a bit careful; the
						// opposite does not need to be assigned (they need, however, be brought in
						// the right order (which we do in a separate last step)
						if (feature.getUpperBound() == 1) {
							if (value.getStateValues().size() == 1) {
								Element targetElement = stateObject2Element.get(value.getStateValues().get(0));
								if (targetElement != null) {
									try {
										element.eSet(feature, targetElement);
									} catch (Throwable e) {
										System.err.println("Illegal feature encountered in element " + 
												element.getUid() + ": " + feature.getName());
										return false;
									}
								} else {
									System.err.println("Illegal feature encountered in element " + 
											element.getUid() + ": " + feature.getName());
									return false;
								}
							}
						} else {
							Object targetObject = element.eGet(feature);
							if (!(targetObject instanceof Collection)) {
								System.err.println("Illegal feature encountered in element " + 
										element.getUid() + ": " + feature.getName());
								return false;
							}
							Collection<Element> targetCollection = null;
							try {
								targetCollection = (Collection<Element>) targetObject;
							} catch (ClassCastException r) {
								System.err.println("Illegal feature encountered in element " + 
										element.getUid() + ": " + feature.getName());
								return false;
							}
							for (StateObject targetStateObject: value.getStateValues()) {
								Element targetElement = stateObject2Element.get(targetStateObject);
								if (targetElement != null) {
									try {
										targetCollection.add(targetElement);
									} catch (Throwable e) {
										System.err.println("Illegal feature encountered in element " + 
												element.getUid() + ": " + feature.getName());
										return false;
									}
								} else {
									System.err.println("Illegal feature encountered in element " + 
											element.getUid() + ": " + feature.getName());
									return false;
								}
								
							}
						}
					}
				} else {
					if (feature.getUpperBound() == 1) {
						if (value.getIntValues().size() == 1) {
							try {
							element.eSet(feature, value.getIntValues().get(0));
							} catch (Throwable e) {
								System.err.println("Illegal feature encountered in element " + 
										element.getUid() + ": " + feature.getName());
								return false;
							}
						} else if (value.getStringValues().size() == 1) {
							try {
								element.eSet(feature, value.getStringValues().get(0));
							} catch (Throwable e) {
								System.err.println("Illegal feature encountered in element " + 
										element.getUid() + ": " + feature.getName());
								return false;
							}
						}
					} else {
						Object targetObject = element.eGet(feature);
						if (targetObject instanceof Collection) {
							if (value.getIntValues().size() >= 1) {
								try {
									Collection<Integer> targetCollection = (Collection<Integer>) targetObject;
									targetCollection.addAll(value.getIntValues());
								} catch (Throwable e) {
									System.err.println("Illegal feature encountered in element " + 
											element.getUid() + ": " + feature.getName());
									return false;
								}
							} else if (value.getStringValues().size() == 1) {
								try {
									Collection<String> targetCollection = (Collection<String>) targetObject;
									targetCollection.addAll(value.getStringValues());
								} catch (Throwable e) {
									System.err.println("Illegal feature encountered in element " + 
											element.getUid() + ": " + feature.getName());
									return false;
								}
							}
						} else {
							System.err.println("Illegal feature encountered in element " + 
									element.getUid() + ": " + feature.getName());
							return false;
						}
					}
				}
			}
		}
		
		return true;
	}
	
	@SuppressWarnings("unchecked")
	private boolean alignOppositeReferences(State state, Element element, Map<StateObject,Element> stateObject2Element) {
		StateObject stateObject = state.getState(element.getUid());
		if (stateObject != null) {
			for (ObjectFeatureValues ofv: stateObject.getFeatures()) {
				EStructuralFeature feature = ofv.getFeature();
				EList<Value> values = ofv.getValues();
				if (feature == null || values == null || values.size() != 1) {
					System.err.println("Illegal feature encountered in element " + 
							element.getUid() + ": " + feature.getName());
					return false;
				}
				if (values.size() <= 0 || values.size() > 1) {
					System.err.println("not exactly one value");
				}
				Value value = values.get(0);

				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					if (!reference.isContainment() && reference.getEOpposite() != null &&
							(reference.getUpperBound() != 1 && reference.getEOpposite().getUpperBound() != 1) &&
							(reference.hashCode() >= reference.getEOpposite().hashCode())) {
						// align the non dominating opposite
						Object targetObject = element.eGet(feature);
						if (!(targetObject instanceof Collection)) {
							System.err.println("Illegal feature encountered in element " + 
									element.getUid() + ": " + feature.getName());
							return false;
						}
						EList<Element> targetCollection = null;
						try {
							targetCollection = (EList<Element>) targetObject;
						} catch (ClassCastException r) {
							System.err.println("Illegal feature encountered in element " + 
									element.getUid() + ": " + feature.getName());
							return false;
						}
						int i = 0;
						for (StateObject targetStateObject: value.getStateValues()) {
							Element targetElement = stateObject2Element.get(targetStateObject);
							boolean found = true;
							for (int j=i; j < targetCollection.size(); j++) {
								if (targetCollection.get(j) == targetElement) {
									found = true;
									if (i != j) {
										targetCollection.move(i, j);
									}
									break;
								}

							}
							if (!found) {
								System.err.println("Illegal feature encountered in element " + 
										element.getUid() + ": " + feature.getName());
								return false;
							}
							i++;
						}
					}
				}
			}
		}
		
		return true;
	}

	private boolean setBehaviourState(StateObject stateObject, Element element) {
		IElementBehaviour behaviour = engine.getElementBehaviour(element);
		if (behaviour == null && stateObject.getBehaviourStates().isEmpty()) {
			return true;
		}
		if (behaviour instanceof InheritingBehaviour) {
			InheritingBehaviour inheritingBehaviour = (InheritingBehaviour) behaviour;
			List<PTNetState> stateObjectBehaviours = stateObject.getBehaviourStates();
			if (stateObjectBehaviours.size() != inheritingBehaviour.getBehaviours().size()) {
				return false;
			}
			int i = 0;
			for (IElementBehaviour b: inheritingBehaviour.getBehaviours()) {
				if (b instanceof AbstractPetrinetBehaviour) {
					AbstractPetrinetBehaviour<?> pnBehaviour = (AbstractPetrinetBehaviour<?>) b;
					BehaviourState state = pnBehaviour.getBehaviourState();
					if (state instanceof PTNetState) {
						PTNetState ptNetState = (PTNetState) state;
						PTNetState ptNetStateCopy = stateObjectBehaviours.get(i);
						if (ptNetState.getMarking().size() != ptNetStateCopy.getMarking().size()) {
							return false;
						}
						ptNetState.getMarking().clear();
						for (int j =0; j < ptNetStateCopy.getMarking().size(); j++) {
							ptNetState.getMarking().add(ptNetStateCopy.getMarking().get(j));
						}
						i++;
					} else {
						return false;
					}
				} else {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	} 
	
	private boolean establishState(State state) {
		// List<Element> elements = new ArrayList<Element>();
		Map<StateObject,Element> stateObject2Element = new HashMap<StateObject,Element>();
		/*
		Iterator<EObject> iterator = container.eAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			if (!(object instanceof Element)) {
				return false;
			}
			Element element = (Element) object;
			elements.add(element);
			StateObject stateObject = state.getState(element.getUid());
			if (stateObject == null) {
				return false;
			}
			stateObject2Element.put(stateObject, element);
		}
		*/
		
		/*
		Collection<Element> containment = cleanContainer();
		if (containment == null) {
			return false;
		}
		*/
		cleanContainer();
		
		List<Element> stateElements = new ArrayList<Element>();
		// clean all objects and add them to the container
		for (Element element: this.allElements) {
			if (!cleanObject(element)) {
				return false;
			}
			StateObject stateObject = state.getState(element.getUid());
			if (stateObject != null) {
				elementList.add(element);
				stateElements.add(element);
				stateObject2Element.put(stateObject, element);
			} else {
				System.err.println("Element not contained in current state: " + element.getUid());
			}
		}
		
		// now recreate the state of all elements from the states objects.
		for (Element element: stateElements) {
			if (!createObjectState(state, element, stateObject2Element)) {
				System.out.println("false");
				return false;
			}
		}
		
		// now recreate the state of all elements from the states objects.
		for (Element element: stateElements) {
			StateObject stateObject = state.getState(element.getUid());
			if (stateObject == null) {
				return false;
			}
			if (!alignOppositeReferences(state, element, stateObject2Element)) {
				return false;
			}
			if (!setBehaviourState(stateObject, element)) {
				return false;
			}
		}		
		
		/* Just for testing 
		State newState = StatespaceFactory.eINSTANCE.createState();
		newState.init(container, engine);
		if (!newState.equals(state)) {
			System.err.println("Lost state equality!");
		}
		*/
		
		return true;
	}
	
	private void resetStateCommand(final State state) {
		EditingDomain dom = AdapterFactoryEditingDomain.getEditingDomainFor(container);
		if (dom instanceof TransactionalEditingDomain) {
			TransactionalEditingDomain domain = (TransactionalEditingDomain) dom;
			RecordingCommand command = new RecordingCommand(domain,"reset to state") {

				/* (non-Javadoc)
				 * @see org.eclipse.emf.transaction.RecordingCommand#doExecute()
				 */
				@Override
				protected void doExecute() {
					if (!StateSpaceGenerator.this.establishState(state)) {
						System.err.println("State could not be re-established");
						throw new RuntimeException("State could not be re-established");
					}
				}
			};
			domain.getCommandStack().execute(command);
			
			/* TODO: can be deleted: this is just a consistency check (for testing)
			State newState = StatespaceFactory.eINSTANCE.createState();
			newState.init(container,engine);
			if (!newState.equals(state)) {
				System.err.println("States are not equal!");
			}
			*/
		} else {
			if (!StateSpaceGenerator.this.establishState(state)) {
				System.err.println("State could not be re-established");
				throw new RuntimeException("State could not be re-established");
			}
			
			/* TODO: can be deleted: this is just a consistency check (for testing)
			State newState = StatespaceFactory.eINSTANCE.createState();
			newState.init(container,engine);
			if (!newState.equals(state)) {
				System.err.println("States are not equal!");
			}
			*/
		}
	}
	
	public void abort() {
		aborted = true;
	}
}
