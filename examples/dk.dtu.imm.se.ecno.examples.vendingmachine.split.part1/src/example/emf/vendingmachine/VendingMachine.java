/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachine;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vending Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.VendingMachine#getComponents <em>Components</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachine.VendingmachinePackage#getVendingMachine()
 * @model
 * @generated
 */
public interface VendingMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link example.emf.vendingmachine.VendingMachineComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see example.emf.vendingmachine.VendingmachinePackage#getVendingMachine_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<VendingMachineComponent> getComponents();

} // VendingMachine
