package dk.dtu.imm.se.ecno.model.runtime.pn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.core.IParallelElementBehaviour;
import dk.dtu.imm.se.ecno.eclipse.save.behaviour.ISavableElementBehaviour;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesFactory;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.runtime.AbstractEMFElementBehaviour;
import dk.dtu.imm.se.ecno.runtime.IChoice;

/**
 * @author kindler
 *
 */
public abstract class AbstractPetrinetBehaviour<ELEMENTCLASS extends EObject> extends AbstractEMFElementBehaviour implements IParallelElementBehaviour, ISavableElementBehaviour {
	
	protected String[] tnames;
	private Map<Integer,List<IEventType>> transition2EventTypes;
	private Map<IEventType,List<Integer>> eventType2Transitions;
	
	private Map<IEventType,List<IEventType>> topEventType2EventTypes;
	
	final private Set<IEventType> topLevelEventTypes;
	
	private PTNetState pnState;
	protected List<Integer> marking;
	private int noPlaces;
	
	private Adapter markingChangedListener;
		
	public AbstractPetrinetBehaviour(ExecutionEngine engine, ELEMENTCLASS element, int[] marking, String[] tnames, IElementType type) {
		super(engine, type, element);
		
		this.tnames = tnames.clone();
		this.noPlaces = marking.length;
		
		this.transition2EventTypes = new HashMap<Integer,List<IEventType>>();
		this.eventType2Transitions = new HashMap<IEventType,List<Integer>>();
		
		this.topEventType2EventTypes = new HashMap<IEventType,List<IEventType>>();
		
		INamespace namespace = type.getNamespace();
		Package ecnoPackage = null;
		if (namespace != null && namespace instanceof Package) {
			ecnoPackage = (Package) namespace;
			
		}
		
		for (int t=0; t < tnames.length; t++) {
			String[] eventNames = this.getTransitionEvents(t);
			List<IEventType> eventTypes = new ArrayList<IEventType>();
			transition2EventTypes.put(t, eventTypes);
			for (int i=0; i < eventNames.length; i++) {
				IEventType eventType = null;
				if (ecnoPackage != null) {
					// TODO: Implement a mechanism to look up events from other packages
					//       via Coordination sets AND explicitly
					INamedElement namedElement =  ecnoPackage.getElement(eventNames[i]);
					if (namedElement != null && namedElement instanceof IEventType) {
						eventType = (IEventType) namedElement;
					}
				}
				if (eventType != null) {
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
		
		this.pnState = BehaviourstatesFactory.eINSTANCE.createPTNetState();
		this.marking = this.pnState.getMarking();
		for (int i = 0; i < marking.length; i++) {
			this.marking.add(marking[i]);
		}
		
		this.markingChangedListener = new MarkingChangedListener(this);
		this.pnState.eAdapters().add(markingChangedListener);
	}

	/**
	 * Returns the element to which this behaviour refers. In contrast to
	 * getELement(), the method self() returns an object of the specific type
	 * of the element.
	 * 
	 * @see dk.dtu.imm.se.ecno.runtime.AbstractElementBehaviour#getElement()
	 */
	@SuppressWarnings("unchecked")
	final public ELEMENTCLASS self() {
		return (ELEMENTCLASS) super.getElement();
	}

	/**
	 * Checks whether transition with number t is enabled.
	 * The transition t must be between 0 and tnames.length
	 * 
	 * @param t
	 */
	abstract public boolean enabled(int t);
	

	/**
	 * Removes the tokens that would be consumed by transition t from the marking m when
	 * it is fired.
	 * 
	 * @param t
	 * @param m
	 */
	abstract public void consumeTokens(int t, int[] m);
	
	
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
		// this.notifyChangeListeners();
		// This notification is now done by the MarkingChangedListener;
		// Notifications are now issued only if the marking actually changes.
		
		// TODO Due o this change, we actually do not need this indirect call of
		// the method fireImpl from fire anymore (for the sake of a notification).
		// The fire method could be generated directly -- and fireImpl removed
		// completely.
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
	
	@Override
	final public List<IChoice> getChoices(List<IChoice> parallelChoices, IEventType eventType) {
		// TODO eki: the way to compute the enabledness of parallel transitions is not very
		//           efficient. For small Petri nets this should not be too bad; but, this
		//           should eventually be improved.
		List<IChoice> result = new ArrayList<IChoice>();
		int[] remaining = new int[marking.size()];
		for (int i=0; i < remaining.length; i++) {
			remaining[i] = marking.get(i);
		}
		for (IChoice choice: parallelChoices) {
			if (choice instanceof PetriNetChoice) {
				consumeTokens(((PetriNetChoice) choice).getTransition(), remaining);
			}
		}
				
		IEventType topEventType = eventType.getTopSuper();
		List<IEventType> eventList = topEventType2EventTypes.get(topEventType);
		if (eventList != null) {
			for (IEventType eventType2: eventList) {
				if (eventType.isCompatibleWith(eventType2)) {
					List<Integer> list = eventType2Transitions.get(eventType2);
					if (list != null) {
						for (Integer transition: list) {
							int[] m = remaining.clone();
							this.consumeTokens(transition, m);
							boolean enabled = true;
							for (int i=0; i < m.length; i++) {
								if (m[i] < 0) {
									enabled = false;
									break;
								}
							}
							// if (this.enabled(transition)) {
							if (enabled) {
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
	
	

	@Override
	public void initializeFromBehaviourState(BehaviourState state) {
		if (state instanceof PTNetState) {
			if (pnState != null && this.markingChangedListener != null) {
				pnState.eAdapters().remove(markingChangedListener);
			}
			pnState = (PTNetState) state;
			marking = pnState.getMarking();
			// If the marking has less entries than the Petri net has places,
			// fill the marking up with 0 markings (being defensive).
			while (marking.size() < noPlaces) {
				marking.add(0);
			}
			
			this.markingChangedListener = new MarkingChangedListener(this);
			pnState.eAdapters().add(markingChangedListener);
			this.notifyChangeListeners();
		}
	}

	@Override
	public BehaviourState getBehaviourState() {
		return this.pnState;
		/*
		PTNetState pnstate = BehaviourstatesFactory.eINSTANCE.createPTNetState();
		List<Integer> stateMarking = pnstate.getMarking();
		for (int i = 0; i < marking.length; i++) {
			stateMarking.add(marking[i]);
		}
		return pnstate;
		*/
	}

	class MarkingChangedListener implements Adapter {
		
		private AbstractPetrinetBehaviour<ELEMENTCLASS> behaviour;
		
		MarkingChangedListener (AbstractPetrinetBehaviour<ELEMENTCLASS> behaviour) {
			this.behaviour = behaviour;
		}
		
		@Override
		public Notifier getTarget() {
			return null;
		}

		@Override
		public boolean isAdapterForType(Object arg0) {
			return false;
		}

		@Override
		public void notifyChanged(Notification notification) {
			int type = notification.getEventType();
			if (type >= Notification.SET && type <= Notification.MOVE) {
				// i.e type is one of the following;
				//       Notification.SET,      Notification.UNSET,
				//       Notification.ADD,      Notification.REMOVE, 
				//       Notification.ADD_MANY, Notification.REMOVE_MANY,
				//       Notification.MOVE 
				behaviour.notifyChangeListeners();
			}
		}

		@Override
		public void setTarget(Notifier arg0) {
		}
		
	}
}
