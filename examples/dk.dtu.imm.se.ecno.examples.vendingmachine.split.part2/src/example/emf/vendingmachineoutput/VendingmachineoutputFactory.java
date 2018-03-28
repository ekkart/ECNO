/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachineoutput;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see example.emf.vendingmachineoutput.VendingmachineoutputPackage
 * @generated
 */
public interface VendingmachineoutputFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VendingmachineoutputFactory eINSTANCE = example.emf.vendingmachineoutput.impl.VendingmachineoutputFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output</em>'.
	 * @generated
	 */
	Output createOutput();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VendingmachineoutputPackage getVendingmachineoutputPackage();

} //VendingmachineoutputFactory
