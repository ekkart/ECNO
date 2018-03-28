/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StatespacePackage;
import dk.dtu.compute.se.ecno.statespace.Value;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.ValueImpl#getStateValues <em>State Values</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.ValueImpl#getIntValues <em>Int Values</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.impl.ValueImpl#getStringValues <em>String Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueImpl extends EObjectImpl implements Value {
	/**
	 * The cached value of the '{@link #getStateValues() <em>State Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateValues()
	 * @generated
	 * @ordered
	 */
	protected EList<StateObject> stateValues;

	/**
	 * The cached value of the '{@link #getIntValues() <em>Int Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> intValues;

	/**
	 * The cached value of the '{@link #getStringValues() <em>String Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stringValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatespacePackage.Literals.VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StateObject> getStateValues() {
		if (stateValues == null) {
			stateValues = new EObjectResolvingEList<StateObject>(StateObject.class, this, StatespacePackage.VALUE__STATE_VALUES);
		}
		return stateValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIntValues() {
		if (intValues == null) {
			intValues = new EDataTypeUniqueEList<Integer>(Integer.class, this, StatespacePackage.VALUE__INT_VALUES);
		}
		return intValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStringValues() {
		if (stringValues == null) {
			stringValues = new EDataTypeUniqueEList<String>(String.class, this, StatespacePackage.VALUE__STRING_VALUES);
		}
		return stringValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatespacePackage.VALUE__STATE_VALUES:
				return getStateValues();
			case StatespacePackage.VALUE__INT_VALUES:
				return getIntValues();
			case StatespacePackage.VALUE__STRING_VALUES:
				return getStringValues();
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
			case StatespacePackage.VALUE__STATE_VALUES:
				getStateValues().clear();
				getStateValues().addAll((Collection<? extends StateObject>)newValue);
				return;
			case StatespacePackage.VALUE__INT_VALUES:
				getIntValues().clear();
				getIntValues().addAll((Collection<? extends Integer>)newValue);
				return;
			case StatespacePackage.VALUE__STRING_VALUES:
				getStringValues().clear();
				getStringValues().addAll((Collection<? extends String>)newValue);
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
			case StatespacePackage.VALUE__STATE_VALUES:
				getStateValues().clear();
				return;
			case StatespacePackage.VALUE__INT_VALUES:
				getIntValues().clear();
				return;
			case StatespacePackage.VALUE__STRING_VALUES:
				getStringValues().clear();
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
			case StatespacePackage.VALUE__STATE_VALUES:
				return stateValues != null && !stateValues.isEmpty();
			case StatespacePackage.VALUE__INT_VALUES:
				return intValues != null && !intValues.isEmpty();
			case StatespacePackage.VALUE__STRING_VALUES:
				return stringValues != null && !stringValues.isEmpty();
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
		result.append(" (intValues: ");
		result.append(intValues);
		result.append(", stringValues: ");
		result.append(stringValues);
		result.append(')');
		return result.toString();
	}

} //ValueImpl
