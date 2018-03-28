/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.PTNetState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PT Net State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.PTNetStateImpl#getMarking <em>Marking</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTNetStateImpl extends BehaviourStateImpl implements PTNetState {
	/**
	 * The cached value of the '{@link #getMarking() <em>Marking</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarking()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> marking;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTNetStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviourstatesPackage.Literals.PT_NET_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getMarking() {
		if (marking == null) {
			marking = new EDataTypeEList<Integer>(Integer.class, this, BehaviourstatesPackage.PT_NET_STATE__MARKING);
		}
		return marking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviourstatesPackage.PT_NET_STATE__MARKING:
				return getMarking();
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
			case BehaviourstatesPackage.PT_NET_STATE__MARKING:
				getMarking().clear();
				getMarking().addAll((Collection<? extends Integer>)newValue);
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
			case BehaviourstatesPackage.PT_NET_STATE__MARKING:
				getMarking().clear();
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
			case BehaviourstatesPackage.PT_NET_STATE__MARKING:
				return marking != null && !marking.isEmpty();
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
		result.append(" (marking: ");
		result.append(marking);
		result.append(')');
		return result.toString();
	}

} //PTNetStateImpl
