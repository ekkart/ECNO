/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator.impl;

import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StateSpace;

import dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage;
import dk.dtu.compute.se.ecno.statespace.generator.GeneratorState;
import dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl#getStatespace <em>Statespace</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl#getUnhandledStateObjectEvents <em>Unhandled State Object Events</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl#getUnhandledStates <em>Unhandled States</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorStateImpl#getUnhandledStateObjects <em>Unhandled State Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorStateImpl extends EObjectImpl implements GeneratorState {
	/**
	 * The cached value of the '{@link #getStatespace() <em>Statespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatespace()
	 * @generated
	 * @ordered
	 */
	protected StateSpace statespace;

	/**
	 * The cached value of the '{@link #getUnhandledStateObjectEvents() <em>Unhandled State Object Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhandledStateObjectEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<StateObjectEvent> unhandledStateObjectEvents;

	/**
	 * The cached value of the '{@link #getUnhandledStates() <em>Unhandled States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhandledStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> unhandledStates;

	/**
	 * The cached value of the '{@link #getUnhandledStateObjects() <em>Unhandled State Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnhandledStateObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<StateObject> unhandledStateObjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GENERATOR_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpace getStatespace() {
		if (statespace != null && statespace.eIsProxy()) {
			InternalEObject oldStatespace = (InternalEObject)statespace;
			statespace = (StateSpace)eResolveProxy(oldStatespace);
			if (statespace != oldStatespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GeneratorPackage.GENERATOR_STATE__STATESPACE, oldStatespace, statespace));
			}
		}
		return statespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateSpace basicGetStatespace() {
		return statespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatespace(StateSpace newStatespace) {
		StateSpace oldStatespace = statespace;
		statespace = newStatespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR_STATE__STATESPACE, oldStatespace, statespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateObjectEvent> getUnhandledStateObjectEvents() {
		if (unhandledStateObjectEvents == null) {
			unhandledStateObjectEvents = new EObjectContainmentEList<StateObjectEvent>(StateObjectEvent.class, this, GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS);
		}
		return unhandledStateObjectEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getUnhandledStates() {
		if (unhandledStates == null) {
			unhandledStates = new EObjectResolvingEList<State>(State.class, this, GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATES);
		}
		return unhandledStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateObject> getUnhandledStateObjects() {
		if (unhandledStateObjects == null) {
			unhandledStateObjects = new EObjectResolvingEList<StateObject>(StateObject.class, this, GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECTS);
		}
		return unhandledStateObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS:
				return ((InternalEList<?>)getUnhandledStateObjectEvents()).basicRemove(otherEnd, msgs);
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
			case GeneratorPackage.GENERATOR_STATE__STATESPACE:
				if (resolve) return getStatespace();
				return basicGetStatespace();
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS:
				return getUnhandledStateObjectEvents();
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATES:
				return getUnhandledStates();
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECTS:
				return getUnhandledStateObjects();
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
			case GeneratorPackage.GENERATOR_STATE__STATESPACE:
				setStatespace((StateSpace)newValue);
				return;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS:
				getUnhandledStateObjectEvents().clear();
				getUnhandledStateObjectEvents().addAll((Collection<? extends StateObjectEvent>)newValue);
				return;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATES:
				getUnhandledStates().clear();
				getUnhandledStates().addAll((Collection<? extends State>)newValue);
				return;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECTS:
				getUnhandledStateObjects().clear();
				getUnhandledStateObjects().addAll((Collection<? extends StateObject>)newValue);
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
			case GeneratorPackage.GENERATOR_STATE__STATESPACE:
				setStatespace((StateSpace)null);
				return;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS:
				getUnhandledStateObjectEvents().clear();
				return;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATES:
				getUnhandledStates().clear();
				return;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECTS:
				getUnhandledStateObjects().clear();
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
			case GeneratorPackage.GENERATOR_STATE__STATESPACE:
				return statespace != null;
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECT_EVENTS:
				return unhandledStateObjectEvents != null && !unhandledStateObjectEvents.isEmpty();
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATES:
				return unhandledStates != null && !unhandledStates.isEmpty();
			case GeneratorPackage.GENERATOR_STATE__UNHANDLED_STATE_OBJECTS:
				return unhandledStateObjects != null && !unhandledStateObjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GeneratorStateImpl
