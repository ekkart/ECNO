/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;
import dk.dtu.compute.se.emf.processalgebra.SequenceInst;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Inst</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.SequenceInstImpl#getRemainder <em>Remainder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceInstImpl extends ProcessInstanceImpl implements SequenceInst {
	/**
	 * The cached value of the '{@link #getRemainder() <em>Remainder</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainder()
	 * @generated
	 * @ordered
	 */
	protected EList<dk.dtu.compute.se.emf.processalgebra.Process> remainder;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceInstImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.SEQUENCE_INST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<dk.dtu.compute.se.emf.processalgebra.Process> getRemainder() {
		if (remainder == null) {
			remainder = new EObjectResolvingEList<dk.dtu.compute.se.emf.processalgebra.Process>(dk.dtu.compute.se.emf.processalgebra.Process.class, this, ProcessalgebraPackage.SEQUENCE_INST__REMAINDER);
		}
		return remainder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProcessalgebraPackage.SEQUENCE_INST__REMAINDER:
				return getRemainder();
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
			case ProcessalgebraPackage.SEQUENCE_INST__REMAINDER:
				getRemainder().clear();
				getRemainder().addAll((Collection<? extends dk.dtu.compute.se.emf.processalgebra.Process>)newValue);
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
			case ProcessalgebraPackage.SEQUENCE_INST__REMAINDER:
				getRemainder().clear();
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
			case ProcessalgebraPackage.SEQUENCE_INST__REMAINDER:
				return remainder != null && !remainder.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SequenceInstImpl
