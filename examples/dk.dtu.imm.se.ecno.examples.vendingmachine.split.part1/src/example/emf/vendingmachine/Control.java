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
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.Control#getSlot <em>Slot</em>}</li>
 *   <li>{@link example.emf.vendingmachine.Control#getBrewer <em>Brewer</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachine.VendingmachinePackage#getControl()
 * @model
 * @generated
 */
public interface Control extends VendingMachineComponent {
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
	 * @see example.emf.vendingmachine.VendingmachinePackage#getControl_Slot()
	 * @model
	 * @generated
	 */
	EList<Slot> getSlot();

	/**
	 * Returns the value of the '<em><b>Brewer</b></em>' reference list.
	 * The list contents are of type {@link example.emf.vendingmachine.Brewer}.
	 * It is bidirectional and its opposite is '{@link example.emf.vendingmachine.Brewer#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brewer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brewer</em>' reference list.
	 * @see example.emf.vendingmachine.VendingmachinePackage#getControl_Brewer()
	 * @see example.emf.vendingmachine.Brewer#getControl
	 * @model opposite="control"
	 * @generated
	 */
	EList<Brewer> getBrewer();

} // Control
