/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swift Network</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.SwiftNetwork#getGateways <em>Gateways</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getSwiftNetwork()
 * @model
 * @generated
 */
public interface SwiftNetwork extends Component {
	/**
	 * Returns the value of the '<em><b>Gateways</b></em>' reference list.
	 * The list contents are of type {@link emf.bankingsystem.BankGateway}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.BankGateway#getSwift <em>Swift</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateways</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateways</em>' reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getSwiftNetwork_Gateways()
	 * @see emf.bankingsystem.BankGateway#getSwift
	 * @model opposite="swift"
	 * @generated
	 */
	EList<BankGateway> getGateways();

} // SwiftNetwork
