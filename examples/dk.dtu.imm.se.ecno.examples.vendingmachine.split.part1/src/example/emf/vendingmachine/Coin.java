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
 * A representation of the model object '<em><b>Coin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.Coin#getSlot <em>Slot</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachine.VendingmachinePackage#getCoin()
 * @model
 * @generated
 */
public interface Coin extends VendingMachineComponent {
	/**
	 * Returns the value of the '<em><b>Slot</b></em>' reference list.
	 * The list contents are of type {@link example.emf.vendingmachine.Slot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slot</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot</em>' reference list.
	 * @see example.emf.vendingmachine.VendingmachinePackage#getCoin_Slot()
	 * @model
	 * @generated
	 */
	EList<Slot> getSlot();

} // Coin
