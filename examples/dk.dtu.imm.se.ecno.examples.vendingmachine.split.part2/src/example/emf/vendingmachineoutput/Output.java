/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachineoutput;

import example.emf.vendingmachine.Brewer;
import example.emf.vendingmachine.VendingMachineComponent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.emf.vendingmachineoutput.Output#getBrewer <em>Brewer</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.emf.vendingmachineoutput.VendingmachineoutputPackage#getOutput()
 * @model
 * @generated
 */
public interface Output extends VendingMachineComponent {
	/**
	 * Returns the value of the '<em><b>Brewer</b></em>' reference list.
	 * The list contents are of type {@link example.emf.vendingmachine.Brewer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Brewer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Brewer</em>' reference list.
	 * @see example.emf.vendingmachineoutput.VendingmachineoutputPackage#getOutput_Brewer()
	 * @model
	 * @generated
	 */
	EList<Brewer> getBrewer();

} // Output
