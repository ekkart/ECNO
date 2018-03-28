/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl#getUid <em>Uid</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.StateObjectImpl#getBehaviourStates <em>Behaviour States</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateObjectImpl extends EObjectImpl implements StateObject {
	/**
	 * The default value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected static final int UID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getUid() <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUid()
	 * @generated
	 * @ordered
	 */
	protected int uid = UID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<ObjectFeatureValues> features;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EClass type;

	/**
	 * The cached value of the '{@link #getBehaviourStates() <em>Behaviour States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviourStates()
	 * @generated
	 * @ordered
	 */
	protected EList<PTNetState> behaviourStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.STATE_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUid(int newUid) {
		int oldUid = uid;
		uid = newUid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_OBJECT__UID, oldUid, uid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectFeatureValues> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentWithInverseEList<ObjectFeatureValues>(ObjectFeatureValues.class, this, StatespacePackage.STATE_OBJECT__FEATURES, StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (EClass)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.STATE_OBJECT__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(EClass newType) {
		EClass oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.STATE_OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PTNetState> getBehaviourStates() {
		if (behaviourStates == null) {
			behaviourStates = new EObjectContainmentEList<PTNetState>(PTNetState.class, this, StatespacePackage.STATE_OBJECT__BEHAVIOUR_STATES);
		}
		return behaviourStates;
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
			case StatespacePackage.STATE_OBJECT__FEATURES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatures()).basicAdd(otherEnd, msgs);
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
			case StatespacePackage.STATE_OBJECT__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
			case StatespacePackage.STATE_OBJECT__BEHAVIOUR_STATES:
				return ((InternalEList<?>)getBehaviourStates()).basicRemove(otherEnd, msgs);
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
			case StatespacePackage.STATE_OBJECT__UID:
				return getUid();
			case StatespacePackage.STATE_OBJECT__FEATURES:
				return getFeatures();
			case StatespacePackage.STATE_OBJECT__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case StatespacePackage.STATE_OBJECT__BEHAVIOUR_STATES:
				return getBehaviourStates();
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
			case StatespacePackage.STATE_OBJECT__UID:
				setUid((Integer)newValue);
				return;
			case StatespacePackage.STATE_OBJECT__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends ObjectFeatureValues>)newValue);
				return;
			case StatespacePackage.STATE_OBJECT__TYPE:
				setType((EClass)newValue);
				return;
			case StatespacePackage.STATE_OBJECT__BEHAVIOUR_STATES:
				getBehaviourStates().clear();
				getBehaviourStates().addAll((Collection<? extends PTNetState>)newValue);
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
			case StatespacePackage.STATE_OBJECT__UID:
				setUid(UID_EDEFAULT);
				return;
			case StatespacePackage.STATE_OBJECT__FEATURES:
				getFeatures().clear();
				return;
			case StatespacePackage.STATE_OBJECT__TYPE:
				setType((EClass)null);
				return;
			case StatespacePackage.STATE_OBJECT__BEHAVIOUR_STATES:
				getBehaviourStates().clear();
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
			case StatespacePackage.STATE_OBJECT__UID:
				return uid != UID_EDEFAULT;
			case StatespacePackage.STATE_OBJECT__FEATURES:
				return features != null && !features.isEmpty();
			case StatespacePackage.STATE_OBJECT__TYPE:
				return type != null;
			case StatespacePackage.STATE_OBJECT__BEHAVIOUR_STATES:
				return behaviourStates != null && !behaviourStates.isEmpty();
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
		result.append(" (uid: ");
		result.append(uid);
		result.append(')');
		return result.toString();
	}

} //StateObjectImpl
