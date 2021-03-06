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
 * A representation of the model object '<em><b>Panel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.Panel#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachine.VendingmachinePackage#getPanel()
 * @model
 * @generated
 */
public interface Panel extends VendingMachineComponent {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference list.
	 * The list contents are of type {@link example.emf.vendingmachine.Control}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference list.
	 * @see example.emf.vendingmachine.VendingmachinePackage#getPanel_Control()
	 * @model
	 * @generated
	 */
	EList<Control> getControl();

} // Panel
