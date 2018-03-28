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
 * A representation of the model object '<em><b>Bank Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.BankGateway#getATMs <em>AT Ms</em>}</li>
 *   <li>{@link emf.bankingsystem.BankGateway#getAccountMngrs <em>Account Mngrs</em>}</li>
 *   <li>{@link emf.bankingsystem.BankGateway#getSwift <em>Swift</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getBankGateway()
 * @model
 * @generated
 */
public interface BankGateway extends Component {
	/**
	 * Returns the value of the '<em><b>AT Ms</b></em>' reference list.
	 * The list contents are of type {@link emf.bankingsystem.ATMController}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.ATMController#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AT Ms</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AT Ms</em>' reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getBankGateway_ATMs()
	 * @see emf.bankingsystem.ATMController#getGateway
	 * @model opposite="gateway"
	 * @generated
	 */
	EList<ATMController> getATMs();

	/**
	 * Returns the value of the '<em><b>Account Mngrs</b></em>' reference list.
	 * The list contents are of type {@link emf.bankingsystem.AccountMngr}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.AccountMngr#getGateway <em>Gateway</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Mngrs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Mngrs</em>' reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getBankGateway_AccountMngrs()
	 * @see emf.bankingsystem.AccountMngr#getGateway
	 * @model opposite="gateway"
	 * @generated
	 */
	EList<AccountMngr> getAccountMngrs();

	/**
	 * Returns the value of the '<em><b>Swift</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.SwiftNetwork#getGateways <em>Gateways</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swift</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swift</em>' reference.
	 * @see #setSwift(SwiftNetwork)
	 * @see emf.bankingsystem.BankingsystemPackage#getBankGateway_Swift()
	 * @see emf.bankingsystem.SwiftNetwork#getGateways
	 * @model opposite="gateways"
	 * @generated
	 */
	SwiftNetwork getSwift();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.BankGateway#getSwift <em>Swift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swift</em>' reference.
	 * @see #getSwift()
	 * @generated
	 */
	void setSwift(SwiftNetwork value);

} // BankGateway
