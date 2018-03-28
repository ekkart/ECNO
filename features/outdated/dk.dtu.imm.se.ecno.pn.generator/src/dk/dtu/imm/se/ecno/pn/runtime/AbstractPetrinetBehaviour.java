package dk.dtu.imm.se.ecno.pn.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.pn.model.ElementType;
import dk.dtu.imm.se.ecno.pn.model.EventType;
import dk.dtu.imm.se.ecno.runtime.IChoice;


/**
 * @author kindler
 *
 */
public abstract class AbstractPetrinetBehaviour extends AbstractBehaviour {
	
	protected int[] init;
	protected String[] tnames;
	private Map<Integer,List<IEventType>> transition2EventTypes;
	private Map<IEventType,List<Integer>> eventType2Transitions;
	
	private Map<IEventType,List<IEventType>> topEventType2EventTypes;

	final private Set<IEventType> topLevelEventTypes;
	
	protected int[] marking;

	public AbstractPetrinetBehaviour(ExecutionEngine engine, int[] marking, String[] tnames, ElementType type, Element element) {
		super(engine, type, element);
		this.init = marking.clone();
		this.tnames = tnames.clone();
		
		this.transition2EventTypes = new HashMap<Integer,List<IEventType>>();
		this.eventType2Transitions = new HashMap<IEventType,List<Integer>>();
		this.topEventType2EventTypes = new HashMap<IEventType,List<IEventType>>();
		for (int t=0; t < tnames.length; t++) {
			String[] eventNames = this.getTransitionEvents(t);
			List<IEventType> eventTypes = new ArrayList<IEventType>();
			transition2EventTypes.put(t, eventTypes);
			for (int i=0; i < eventNames.length; i++) {
				INamedElement namedElement  = type.getNamespace().getElement(eventNames[i]);
				if (namedElement != null && namedElement instanceof EventType) {
					EventType eventType = (EventType) namedElement;
					eventTypes.add(eventType);
					List<Integer> list = eventType2Transitions.get(eventType);
					if (list == null) {
						list = new ArrayList<Integer>();
						eventType2Transitions.put(eventType, list);
					}
					list.add(t);
					IEventType topEventType = eventType.getTopSuper();
					List<IEventType> eventList = topEventType2EventTypes.get(topEventType);
					if (eventList == null) {
						eventList = new ArrayList<IEventType>();
						eventList.add(eventType);
						topEventType2EventTypes.put(topEventType,eventList);
					} else if (!eventList.contains(eventType)) {
						eventList.add(eventType);
					}
				}
			}
		}
		
		this.topLevelEventTypes = Collections.unmodifiableSet(topEventType2EventTypes.keySet());
		
		this.marking = marking.clone();	
	}

	final public String[] getTransitions() {
		return tnames.clone();
	}

	/**
	 * Checks whether transition with number t is enabled.
	 * The transition t must be between 0 and tnames.length
	 * 
	 * @param t
	 */
	abstract public boolean enabled(int t);
	
	abstract public boolean dropParentChoice(int t);

	/**
	 * Fires transition with number t (if it is enabled).
	 * The transition t must be between 0 and tnames.length.
	 * The actual behaviour will be defined by the subclasses
	 * by implementing fireImpl(). This way, we make sure
	 * that the change listeners are notified.
	 * 
	 * @param t
	 */
	final public void fire(int t) {
		fireImpl(t);
		this.notifyChangeListeners();
	}

	abstract public void fireImpl(int t);

	abstract public String[] getTransitionEvents(int transition);

	abstract public boolean doesAssignParam(int transition, int event, int param);

	abstract public Object getParamAssignment(PetriNetChoice choice, int event, int param);

	abstract public boolean evaluateCondition(PetriNetChoice choice);

	abstract public void executeAction(PetriNetChoice choice);

	@Override
	final public List<IChoice> getChoices(IEventType eventType) {
		List<IChoice> result = new ArrayList<IChoice>();

		IEventType topEventType = eventType.getTopSuper();
		List<IEventType> eventList = topEventType2EventTypes.get(topEventType);
		if (eventList != null) {
			for (IEventType eventType2: eventList) {
				if (eventType.isCompatibleWith(eventType2)) {
					List<Integer> list = eventType2Transitions.get(eventType2);
					if (list != null) {
						for (Integer transition: list) {
							if (this.enabled(transition)) {
								result.add(new PetriNetChoice(engine, this,
										this.transition2EventTypes.get(transition), transition));
							}
						}
					}				
				}
			}		
		}		
		return result;
	}

	/**
	 * Returns the top level event types for which this behaviour contributes
	 * choices. Other event types are ignored by this behaviour.
	 */
	public Set<IEventType> getTopLevelEventTypes() {
		return this.topLevelEventTypes;
	}


}
