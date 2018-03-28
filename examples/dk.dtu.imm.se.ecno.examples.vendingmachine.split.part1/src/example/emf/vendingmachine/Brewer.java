/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachine;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Brewer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.Brewer#getControl <em>Control</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachine.VendingmachinePackage#getBrewer()
 * @model
 * @generated
 */
public interface Brewer extends VendingMachineComponent {
	/**
	 * Returns the value of the '<em><b>Control</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link example.emf.vendingmachine.Control#getBrewer <em>Brewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control</em>' reference.
	 * @see #setControl(Control)
	 * @see example.emf.vendingmachine.VendingmachinePackage#getBrewer_Control()
	 * @see example.emf.vendingmachine.Control#getBrewer
	 * @model opposite="brewer"
	 * @generated
	 */
	Control getControl();

	/**
	 * Sets the value of the '{@link example.emf.vendingmachine.Brewer#getControl <em>Control</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control</em>' reference.
	 * @see #getControl()
	 * @generated
	 */
	void setControl(Control value);

} // Brewer
