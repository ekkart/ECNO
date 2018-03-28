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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.ecno.statespace.ObjectFeatureValues;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Feature Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl#getObject <em>Object</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.ObjectFeatureValuesImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectFeatureValuesImpl extends EObjectImpl implements ObjectFeatureValues {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Value> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectFeatureValuesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.OBJECT_FEATURE_VALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateObject getObject() {
		if (eContainerFeatureID() != StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT) return null;
		return (StateObject)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObject(StateObject newObject, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newObject, StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(StateObject newObject) {
		if (newObject != eInternalContainer() || (eContainerFeatureID() != StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT && newObject != null)) {
			if (EcoreUtil.isAncestor(this, newObject))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newObject != null)
				msgs = ((InternalEObject)newObject).eInverseAdd(this, StatespacePackage.STATE_OBJECT__FEATURES, StateObject.class, msgs);
			msgs = basicSetObject(newObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT, newObject, newObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatespacePackage.OBJECT_FEATURE_VALUES__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatespacePackage.OBJECT_FEATURE_VALUES__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Value> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<Value>(Value.class, this, StatespacePackage.OBJECT_FEATURE_VALUES__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetObject((StateObject)otherEnd, msgs);
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
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				return basicSetObject(null, msgs);
			case StatespacePackage.OBJECT_FEATURE_VALUES__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				return eInternalContainer().eInverseRemove(this, StatespacePackage.STATE_OBJECT__FEATURES, StateObject.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				return getObject();
			case StatespacePackage.OBJECT_FEATURE_VALUES__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case StatespacePackage.OBJECT_FEATURE_VALUES__VALUES:
				return getValues();
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
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				setObject((StateObject)newValue);
				return;
			case StatespacePackage.OBJECT_FEATURE_VALUES__FEATURE:
				setFeature((EStructuralFeature)newValue);
				return;
			case StatespacePackage.OBJECT_FEATURE_VALUES__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				setObject((StateObject)null);
				return;
			case StatespacePackage.OBJECT_FEATURE_VALUES__FEATURE:
				setFeature((EStructuralFeature)null);
				return;
			case StatespacePackage.OBJECT_FEATURE_VALUES__VALUES:
				getValues().clear();
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
			case StatespacePackage.OBJECT_FEATURE_VALUES__OBJECT:
				return getObject() != null;
			case StatespacePackage.OBJECT_FEATURE_VALUES__FEATURE:
				return feature != null;
			case StatespacePackage.OBJECT_FEATURE_VALUES__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ObjectFeatureValuesImpl
