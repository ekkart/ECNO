/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator.impl;

import dk.dtu.compute.se.ecno.statespace.generator.GeneratorControllerState;
import dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.ObjectReferenceImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.impl.GeneratorControllerStateImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneratorControllerStateImpl extends ObjectReferenceImpl implements GeneratorControllerState {
	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> elements;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> events;

	/**
	 * The default value of the '{@link #getContainmentFeature() <em>Containment Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentFeature()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINMENT_FEATURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContainmentFeature() <em>Containment Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainmentFeature()
	 * @generated
	 * @ordered
	 */
	protected String containmentFeature = CONTAINMENT_FEATURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneratorControllerStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GeneratorPackage.Literals.GENERATOR_CONTROLLER_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR_CONTROLLER_STATE__FILENAME, oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getElements() {
		if (elements == null) {
			elements = new EDataTypeUniqueEList<Integer>(Integer.class, this, GeneratorPackage.GENERATOR_CONTROLLER_STATE__ELEMENTS);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEvents() {
		if (events == null) {
			events = new EDataTypeUniqueEList<String>(String.class, this, GeneratorPackage.GENERATOR_CONTROLLER_STATE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContainmentFeature() {
		return containmentFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentFeature(String newContainmentFeature) {
		String oldContainmentFeature = containmentFeature;
		containmentFeature = newContainmentFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GeneratorPackage.GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE, oldContainmentFeature, containmentFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__FILENAME:
				return getFilename();
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__ELEMENTS:
				return getElements();
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__EVENTS:
				return getEvents();
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE:
				return getContainmentFeature();
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
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__FILENAME:
				setFilename((String)newValue);
				return;
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends Integer>)newValue);
				return;
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends String>)newValue);
				return;
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE:
				setContainmentFeature((String)newValue);
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
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__FILENAME:
				setFilename(FILENAME_EDEFAULT);
				return;
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__ELEMENTS:
				getElements().clear();
				return;
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__EVENTS:
				getEvents().clear();
				return;
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE:
				setContainmentFeature(CONTAINMENT_FEATURE_EDEFAULT);
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
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__FILENAME:
				return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__EVENTS:
				return events != null && !events.isEmpty();
			case GeneratorPackage.GENERATOR_CONTROLLER_STATE__CONTAINMENT_FEATURE:
				return CONTAINMENT_FEATURE_EDEFAULT == null ? containmentFeature != null : !CONTAINMENT_FEATURE_EDEFAULT.equals(containmentFeature);
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
		result.append(" (filename: ");
		result.append(filename);
		result.append(", elements: ");
		result.append(elements);
		result.append(", events: ");
		result.append(events);
		result.append(", containmentFeature: ");
		result.append(containmentFeature);
		result.append(')');
		return result.toString();
	}

} //GeneratorControllerStateImpl
