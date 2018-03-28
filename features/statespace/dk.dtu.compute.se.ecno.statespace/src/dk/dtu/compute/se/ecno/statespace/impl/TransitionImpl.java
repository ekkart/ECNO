/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.impl;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.ecno.statespace.Event;
import dk.dtu.compute.se.ecno.statespace.Link;
import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.TransitionImpl#getTriggerElement <em>Trigger Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected State source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected State target;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected Event trigger;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggerElement() <em>Trigger Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerElement()
	 * @generated
	 * @ordered
	 */
	protected StateObject triggerElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (State)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(State newSource, NotificationChain msgs) {
		State oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(State newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, StatespacePackage.STATE__OUT, State.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, StatespacePackage.STATE__OUT, State.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (State)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(State newTarget, NotificationChain msgs) {
		State oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetGen(State newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, StatespacePackage.STATE__IN, State.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, StatespacePackage.STATE__IN, State.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__TARGET, newTarget, newTarget));
	}
	
	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	public void setTarget(State newTarget) {
		setTargetGen(newTarget);
		// invalidate hashCode
		this.hashCode = 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, StatespacePackage.TRANSITION__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getTrigger() {
		if (trigger != null && trigger.eIsProxy()) {
			InternalEObject oldTrigger = (InternalEObject)trigger;
			trigger = (Event)eResolveProxy(oldTrigger);
			if (trigger != oldTrigger) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.TRANSITION__TRIGGER, oldTrigger, trigger));
			}
		}
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(Event newTrigger) {
		Event oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__TRIGGER, oldTrigger, trigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, StatespacePackage.TRANSITION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject getTriggerElement() {
		if (triggerElement != null && triggerElement.eIsProxy()) {
			InternalEObject oldTriggerElement = (InternalEObject)triggerElement;
			triggerElement = (StateObject)eResolveProxy(oldTriggerElement);
			if (triggerElement != oldTriggerElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.TRANSITION__TRIGGER_ELEMENT, oldTriggerElement, triggerElement));
			}
		}
		return triggerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject basicGetTriggerElement() {
		return triggerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerElement(StateObject newTriggerElement) {
		StateObject oldTriggerElement = triggerElement;
		triggerElement = newTriggerElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.TRANSITION__TRIGGER_ELEMENT, oldTriggerElement, triggerElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatespacePackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, StatespacePackage.STATE__OUT, State.class, msgs);
				return basicSetSource((State)otherEnd, msgs);
			case StatespacePackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, StatespacePackage.STATE__IN, State.class, msgs);
				return basicSetTarget((State)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatespacePackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case StatespacePackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case StatespacePackage.TRANSITION__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case StatespacePackage.TRANSITION__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatespacePackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case StatespacePackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case StatespacePackage.TRANSITION__EVENTS:
				return getEvents();
			case StatespacePackage.TRANSITION__TRIGGER:
				if (resolve) return getTrigger();
				return basicGetTrigger();
			case StatespacePackage.TRANSITION__LINKS:
				return getLinks();
			case StatespacePackage.TRANSITION__NUMBER:
				return getNumber();
			case StatespacePackage.TRANSITION__TRIGGER_ELEMENT:
				if (resolve) return getTriggerElement();
				return basicGetTriggerElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatespacePackage.TRANSITION__SOURCE:
				setSource((State)newValue);
				return;
			case StatespacePackage.TRANSITION__TARGET:
				setTarget((State)newValue);
				return;
			case StatespacePackage.TRANSITION__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case StatespacePackage.TRANSITION__TRIGGER:
				setTrigger((Event)newValue);
				return;
			case StatespacePackage.TRANSITION__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case StatespacePackage.TRANSITION__NUMBER:
				setNumber((Integer)newValue);
				return;
			case StatespacePackage.TRANSITION__TRIGGER_ELEMENT:
				setTriggerElement((StateObject)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatespacePackage.TRANSITION__SOURCE:
				setSource((State)null);
				return;
			case StatespacePackage.TRANSITION__TARGET:
				setTarget((State)null);
				return;
			case StatespacePackage.TRANSITION__EVENTS:
				getEvents().clear();
				return;
			case StatespacePackage.TRANSITION__TRIGGER:
				setTrigger((Event)null);
				return;
			case StatespacePackage.TRANSITION__LINKS:
				getLinks().clear();
				return;
			case StatespacePackage.TRANSITION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case StatespacePackage.TRANSITION__TRIGGER_ELEMENT:
				setTriggerElement((StateObject)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatespacePackage.TRANSITION__SOURCE:
				return source != null;
			case StatespacePackage.TRANSITION__TARGET:
				return target != null;
			case StatespacePackage.TRANSITION__EVENTS:
				return events != null && !events.isEmpty();
			case StatespacePackage.TRANSITION__TRIGGER:
				return trigger != null;
			case StatespacePackage.TRANSITION__LINKS:
				return links != null && !links.isEmpty();
			case StatespacePackage.TRANSITION__NUMBER:
				return number != NUMBER_EDEFAULT;
			case StatespacePackage.TRANSITION__TRIGGER_ELEMENT:
				return triggerElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	private int hashCode = 0;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	@Override
	public int hashCode() {
		if (hashCode == 0) {
			if (this.getSource() != null) {
				hashCode ^= this.getSource().hashCode();
			}
			if (this.getTarget() != null) {
				hashCode ^= this.getTarget().hashCode();
			}
			if (this.getTrigger() != null) {
				hashCode ^= this.getTrigger().hashCode() << 2;
			}
			if (this.getTriggerElement() != null) {
				hashCode ^= this.getTriggerElement().hashCode();
			}
			

			for (Link link: this.getLinks()) {
				hashCode ^= link.hashCode();
				for (Event event: link.getEvents()) {
					hashCode ^= event.hashCode() << 1;
				}
			}
			
			for (Event event: this.getEvents()) {
				hashCode ^= event.hashCode();
			}
			this.getTrigger();
			
		}
		return hashCode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	// @generated NOT
	// @author Ekkart Kindler, ekki@dtu.dk
	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		
		if (!(object instanceof TransitionImpl)) {
			return false;
		}
		
		TransitionImpl other = (TransitionImpl) object;
		
		if (this.hashCode() != other.hashCode()) {
			return false;
		}
		
		if (this.getSource() != other.getSource()) {
			return false;
		}
		if (this.getTarget() != other.getTarget()) {
			return false;
		}
		if (this.getTrigger() == null) {
			if (other.getTrigger() != null) {
				return false;
			}
		} else {
			if (!this.getTrigger().equals(other.getTrigger())) {
				return false;
			}
		}
		if (this.getTriggerElement() != other.getTriggerElement()) {
			if (this.getTriggerElement().getUid() == other.getTriggerElement().getUid()) {
				System.err.println("Inconsistency between state objects and UIDs");
			}
			return false;
		}
		
		if (this.getLinks().size() != other.getLinks().size() ||
				!new HashSet<Link>(this.getLinks()).equals(new HashSet<Link>(other.getLinks()))) {
			return false;
		}
		if (this.getEvents().size() != other.getEvents().size() ||
				!new HashSet<Event>(this.getEvents()).equals(new HashSet<Event>(other.getEvents()))) {
			return false;
		}
		
		for (Link thisLink: this.getLinks()) {
			for (Link otherLink: other.getLinks()) {
				if (thisLink.equals(otherLink)) {
					HashSet<Event> thisLinkEvents = new HashSet<Event>(thisLink.getEvents());
					HashSet<Event> otherLinkEvents = new HashSet<Event>(otherLink.getEvents());
					if (thisLink.getEvents().size() != otherLink.getEvents().size() ||
							!thisLinkEvents.equals(otherLinkEvents)) {
						return false;
					}
					if (thisLink.getEvents().size() != thisLinkEvents.size()) {
						// this is to take into account the right multiplicity of the same events (which can occur
						// in case of trigger events or parallel behavior
						for (Event thisEvent: thisLinkEvents) {
							int thisCount = 0;
							int otherCount = 0;
							for (Event count: thisLink.getEvents()) {
								if (thisEvent.equals(count)) {
									thisCount++;
								}
							}
							for (Event count: otherLink.getEvents()) {
								if (thisEvent.equals(count)) {
									otherCount++;
								}
							}
							if (thisCount != otherCount) {
								return false;
							}
						}
					}
				}
			}
		}
		
		/*  TODO this should be moved up again (see above comment); doing this here
		 *       decreases performance
		if (this.hashCode() != other.hashCode()) {
			System.err.println("Hash codes of transitions are different for equal transitions");
			return false;
		}
		*/
		
		return true;

	}

} //TransitionImpl
