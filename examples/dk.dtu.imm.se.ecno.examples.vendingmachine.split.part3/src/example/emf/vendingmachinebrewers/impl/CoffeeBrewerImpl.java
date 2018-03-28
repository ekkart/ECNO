/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers.impl;

import example.emf.vendingmachine.impl.BrewerImpl;

import example.emf.vendingmachinebrewers.CoffeeBrewer;
import example.emf.vendingmachinebrewers.VendingmachinebrewersPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coffee Brewer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CoffeeBrewerImpl extends BrewerImpl implements CoffeeBrewer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoffeeBrewerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingmachinebrewersPackage.Literals.COFFEE_BREWER;
	}

} //CoffeeBrewerImpl
