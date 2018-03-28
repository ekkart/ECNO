/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordination Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl#getSynchronisations <em>Synchronisations</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl#getTriggerEvent <em>Trigger Event</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl#getPriority <em>Priority</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationSetImpl extends EObjectImpl implements CoordinationSet {
	/**
	 * The cached value of the '{@link #getSynchronisations() <em>Synchronisations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronisations()
	 * @generated
	 * @ordered
	 */
	protected EList<Synchronisation> synchronisations;

	/**
	 * The cached value of the '{@link #getTriggerEvent() <em>Trigger Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggerEvent()
	 * @generated
	 * @ordered
	 */
	protected EventType triggerEvent;

	/**
	 * The default value of the '{@link #getTrigger() <em>Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String TRIGGER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnoPackage.Literals.COORDINATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Synchronisation> getSynchronisations() {
		if (synchronisations == null) {
			synchronisations = new EObjectWithInverseResolvingEList<Synchronisation>(Synchronisation.class, this, EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS, EcnoPackage.SYNCHRONISATION__COORDINATION_SET);
		}
		return synchronisations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType getTriggerEvent() {
		if (triggerEvent != null && triggerEvent.eIsProxy()) {
			InternalEObject oldTriggerEvent = (InternalEObject)triggerEvent;
			triggerEvent = (EventType)eResolveProxy(oldTriggerEvent);
			if (triggerEvent != oldTriggerEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcnoPackage.COORDINATION_SET__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
			}
		}
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType basicGetTriggerEvent() {
		return triggerEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTriggerEventGen(EventType newTriggerEvent) {
		EventType oldTriggerEvent = triggerEvent;
		triggerEvent = newTriggerEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.COORDINATION_SET__TRIGGER_EVENT, oldTriggerEvent, triggerEvent));
	}
	
	/**
	 * @generated NOT (Notify derived attribute change: trigger)
	 * @author eki
	 */
	public void setTriggerEvent(EventType newTriggerEvent) {
		if (eNotificationRequired()) {
			String oldTrigger = getTrigger();
			setTriggerEventGen(newTriggerEvent);
			String newTrigger = getTrigger();
			if ((newTrigger != null && newTrigger.equals(oldTrigger)) || newTrigger == null & oldTrigger != null) {
				eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.COORDINATION_SET__TRIGGER, oldTrigger, newTrigger));
			}
		} else {
			setTriggerEventGen(newTriggerEvent);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT (implemented derived attribute)
	 * @author eki
	 */
	public String getTrigger() {
		EventType trigger = this.getTriggerEvent();


		if (trigger != null) {
			String name = trigger.getName();

			EObject container = this.eContainer();
			if (container != null && container instanceof ElementType) {
				if (((ElementType) container).isParallelTriggerEvent(trigger)) {
					name = "+" + name + "+";
				}
			}
			
			int priority = this.getPriority();
			if (priority != 0) {
				name = priority + ":" + name;
				
			}
			return name;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(String newTrigger) {
		// TODO: implement this method to set the 'Trigger' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnoPackage.COORDINATION_SET__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSynchronisations()).basicAdd(otherEnd, msgs);
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
			case EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS:
				return ((InternalEList<?>)getSynchronisations()).basicRemove(otherEnd, msgs);
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
			case EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS:
				return getSynchronisations();
			case EcnoPackage.COORDINATION_SET__TRIGGER_EVENT:
				if (resolve) return getTriggerEvent();
				return basicGetTriggerEvent();
			case EcnoPackage.COORDINATION_SET__TRIGGER:
				return getTrigger();
			case EcnoPackage.COORDINATION_SET__PRIORITY:
				return getPriority();
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
			case EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS:
				getSynchronisations().clear();
				getSynchronisations().addAll((Collection<? extends Synchronisation>)newValue);
				return;
			case EcnoPackage.COORDINATION_SET__TRIGGER_EVENT:
				setTriggerEvent((EventType)newValue);
				return;
			case EcnoPackage.COORDINATION_SET__TRIGGER:
				setTrigger((String)newValue);
				return;
			case EcnoPackage.COORDINATION_SET__PRIORITY:
				setPriority((Integer)newValue);
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
			case EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS:
				getSynchronisations().clear();
				return;
			case EcnoPackage.COORDINATION_SET__TRIGGER_EVENT:
				setTriggerEvent((EventType)null);
				return;
			case EcnoPackage.COORDINATION_SET__TRIGGER:
				setTrigger(TRIGGER_EDEFAULT);
				return;
			case EcnoPackage.COORDINATION_SET__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
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
			case EcnoPackage.COORDINATION_SET__SYNCHRONISATIONS:
				return synchronisations != null && !synchronisations.isEmpty();
			case EcnoPackage.COORDINATION_SET__TRIGGER_EVENT:
				return triggerEvent != null;
			case EcnoPackage.COORDINATION_SET__TRIGGER:
				return TRIGGER_EDEFAULT == null ? getTrigger() != null : !TRIGGER_EDEFAULT.equals(getTrigger());
			case EcnoPackage.COORDINATION_SET__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
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
		result.append(" (priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

	@Override
	public List<ISynchronisation> getSynchonisationsList() {
		return new ArrayList<ISynchronisation>(getSynchronisations());
	}

	// @generated NOT
	IEventType resolvedTriggerEventType = null;
	
	// @generated NOT
	@Override
	public IEventType getTriggerEventType() {
		if (resolvedTriggerEventType != null) {
			return resolvedTriggerEventType;
		} else {
			return getTriggerEvent();
		}
	}

} //CoordinationSetImpl
