/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers.impl;

import example.emf.vendingmachine.impl.BrewerImpl;

import example.emf.vendingmachinebrewers.TeaBrewer;
import example.emf.vendingmachinebrewers.VendingmachinebrewersPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tea Brewer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TeaBrewerImpl extends BrewerImpl implements TeaBrewer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeaBrewerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingmachinebrewersPackage.Literals.TEA_BREWER;
	}

} //TeaBrewerImpl
