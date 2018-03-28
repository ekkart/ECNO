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
 * A representation of the model object '<em><b>Account Mngr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.AccountMngr#getCustomers <em>Customers</em>}</li>
 *   <li>{@link emf.bankingsystem.AccountMngr#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link emf.bankingsystem.AccountMngr#getGateway <em>Gateway</em>}</li>
 *   <li>{@link emf.bankingsystem.AccountMngr#getSessions <em>Sessions</em>}</li>
 *   <li>{@link emf.bankingsystem.AccountMngr#getIdleSessions <em>Idle Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getAccountMngr()
 * @model
 * @generated
 */
public interface AccountMngr extends Component {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.Customer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getAccountMngr_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accounts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getAccountMngr_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.BankGateway#getAccountMngrs <em>Account Mngrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' reference.
	 * @see #setGateway(BankGateway)
	 * @see emf.bankingsystem.BankingsystemPackage#getAccountMngr_Gateway()
	 * @see emf.bankingsystem.BankGateway#getAccountMngrs
	 * @model opposite="accountMngrs" required="true"
	 * @generated
	 */
	BankGateway getGateway();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.AccountMngr#getGateway <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(BankGateway value);

	/**
	 * Returns the value of the '<em><b>Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.Session}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.Session#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getAccountMngr_Sessions()
	 * @see emf.bankingsystem.Session#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<Session> getSessions();

	/**
	 * Returns the value of the '<em><b>Idle Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.Session}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idle Sessions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idle Sessions</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getAccountMngr_IdleSessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Session> getIdleSessions();

} // AccountMngr
