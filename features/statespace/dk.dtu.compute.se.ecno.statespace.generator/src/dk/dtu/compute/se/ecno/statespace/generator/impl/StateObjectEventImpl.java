/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator.impl;

import dk.dtu.compute.se.ecno.statespace.StateObject;

import dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage;
import dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Object Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.StateObjectEventImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.StateObjectEventImpl#getStateObject <em>State Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateObjectEventImpl extends EObjectImpl implements StateObjectEvent {
	/**
	 * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventName()
	 * @generated
	 * @ordered
	 */
	protected String eventName = EVENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStateObject() <em>State Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateObject()
	 * @generated
	 * @ordered
	 */
	protected StateObject stateObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateObjectEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.STATE_OBJECT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventName() {
		return eventName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventName(String newEventName) {
		String oldEventName = eventName;
		eventName = newEventName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATE_OBJECT_EVENT__EVENT_NAME, oldEventName, eventName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject getStateObject() {
		if (stateObject != null && stateObject.eIsProxy()) {
			InternalEObject oldStateObject = (InternalEObject)stateObject;
			stateObject = (StateObject)eResolveProxy(oldStateObject);
			if (stateObject != oldStateObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.STATE_OBJECT_EVENT__STATE_OBJECT, oldStateObject, stateObject));
			}
		}
		return stateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject basicGetStateObject() {
		return stateObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateObject(StateObject newStateObject) {
		StateObject oldStateObject = stateObject;
		stateObject = newStateObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.STATE_OBJECT_EVENT__STATE_OBJECT, oldStateObject, stateObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorPackage.STATE_OBJECT_EVENT__EVENT_NAME:
				return getEventName();
			case GeneratorPackage.STATE_OBJECT_EVENT__STATE_OBJECT:
				if (resolve) return getStateObject();
				return basicGetStateObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GeneratorPackage.STATE_OBJECT_EVENT__EVENT_NAME:
				setEventName((String)newValue);
				return;
			case GeneratorPackage.STATE_OBJECT_EVENT__STATE_OBJECT:
				setStateObject((StateObject)newValue);
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
			case GeneratorPackage.STATE_OBJECT_EVENT__EVENT_NAME:
				setEventName(EVENT_NAME_EDEFAULT);
				return;
			case GeneratorPackage.STATE_OBJECT_EVENT__STATE_OBJECT:
				setStateObject((StateObject)null);
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
			case GeneratorPackage.STATE_OBJECT_EVENT__EVENT_NAME:
				return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
			case GeneratorPackage.STATE_OBJECT_EVENT__STATE_OBJECT:
				return stateObject != null;
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
		result.append(" (eventName: ");
		result.append(eventName);
		result.append(')');
		return result.toString();
	}

} //StateObjectEventImpl
