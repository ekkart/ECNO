/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachinebrewers;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see example.emf.vendingmachinebrewers.VendingmachinebrewersPackage
 * @generated
 */
public interface VendingmachinebrewersFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingmachinebrewersFactory eINSTANCE = example.emf.vendingmachinebrewers.impl.VendingmachinebrewersFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Coffee Brewer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coffee Brewer</em>'.
	 * @generated
	 */
	CoffeeBrewer createCoffeeBrewer();

	/**
	 * Returns a new object of class '<em>Tea Brewer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tea Brewer</em>'.
	 * @generated
	 */
	TeaBrewer createTeaBrewer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VendingmachinebrewersPackage getVendingmachinebrewersPackage();

} //VendingmachinebrewersFactory
