/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachineoutput.impl;

import example.emf.vendingmachine.Brewer;

import example.emf.vendingmachine.impl.VendingMachineComponentImpl;

import example.emf.vendingmachineoutput.Output;
import example.emf.vendingmachineoutput.VendingmachineoutputPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link example.emf.vendingmachineoutput.impl.OutputImpl#getBrewer <em>Brewer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutputImpl extends VendingMachineComponentImpl implements Output {
	/**
	 * The cached value of the '{@link #getBrewer() <em>Brewer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewer()
	 * @generated
	 * @ordered
	 */
	protected EList<Brewer> brewer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingmachineoutputPackage.Literals.OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brewer> getBrewer() {
		if (brewer == null) {
			brewer = new EObjectResolvingEList<Brewer>(Brewer.class, this, VendingmachineoutputPackage.OUTPUT__BREWER);
		}
		return brewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VendingmachineoutputPackage.OUTPUT__BREWER:
				return getBrewer();
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
			case VendingmachineoutputPackage.OUTPUT__BREWER:
				getBrewer().clear();
				getBrewer().addAll((Collection<? extends Brewer>)newValue);
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
			case VendingmachineoutputPackage.OUTPUT__BREWER:
				getBrewer().clear();
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
			case VendingmachineoutputPackage.OUTPUT__BREWER:
				return brewer != null && !brewer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputImpl
