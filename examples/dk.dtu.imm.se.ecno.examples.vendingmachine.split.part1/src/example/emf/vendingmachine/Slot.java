/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachine;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.Slot#getCoin <em>Coin</em>}</li>
 *   <li>{@link example.emf.vendingmachine.Slot#getSafe <em>Safe</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachine.VendingmachinePackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends VendingMachineComponent {
	/**
	 * Returns the value of the '<em><b>Coin</b></em>' reference list.
	 * The list contents are of type {@link example.emf.vendingmachine.Coin}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coin</em>' reference list.
	 * @see example.emf.vendingmachine.VendingmachinePackage#getSlot_Coin()
	 * @model
	 * @generated
	 */
	EList<Coin> getCoin();

	/**
	 * Returns the value of the '<em><b>Safe</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Safe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Safe</em>' reference.
	 * @see #setSafe(Safe)
	 * @see example.emf.vendingmachine.VendingmachinePackage#getSlot_Safe()
	 * @model required="true"
	 * @generated
	 */
	Safe getSafe();

	/**
	 * Sets the value of the '{@link example.emf.vendingmachine.Slot#getSafe <em>Safe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Safe</em>' reference.
	 * @see #getSafe()
	 * @generated
	 */
	void setSafe(Safe value);

} // Slot
