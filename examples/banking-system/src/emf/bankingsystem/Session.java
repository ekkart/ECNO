/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.Session#getCard <em>Card</em>}</li>
 *   <li>{@link emf.bankingsystem.Session#getATM <em>ATM</em>}</li>
 *   <li>{@link emf.bankingsystem.Session#getOwner <em>Owner</em>}</li>
 *   <li>{@link emf.bankingsystem.Session#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getSession()
 * @model
 * @generated
 */
public interface Session extends Component {
	/**
	 * Returns the value of the '<em><b>Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' reference.
	 * @see #setCard(BankCard)
	 * @see emf.bankingsystem.BankingsystemPackage#getSession_Card()
	 * @model
	 * @generated
	 */
	BankCard getCard();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.Session#getCard <em>Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card</em>' reference.
	 * @see #getCard()
	 * @generated
	 */
	void setCard(BankCard value);

	/**
	 * Returns the value of the '<em><b>ATM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATM</em>' reference.
	 * @see #setATM(ATMController)
	 * @see emf.bankingsystem.BankingsystemPackage#getSession_ATM()
	 * @model required="true"
	 * @generated
	 */
	ATMController getATM();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.Session#getATM <em>ATM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATM</em>' reference.
	 * @see #getATM()
	 * @generated
	 */
	void setATM(ATMController value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.AccountMngr#getSessions <em>Sessions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(AccountMngr)
	 * @see emf.bankingsystem.BankingsystemPackage#getSession_Owner()
	 * @see emf.bankingsystem.AccountMngr#getSessions
	 * @model opposite="sessions" transient="false"
	 * @generated
	 */
	AccountMngr getOwner();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.Session#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(AccountMngr value);

	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference.
	 * @see #setAccount(Account)
	 * @see emf.bankingsystem.BankingsystemPackage#getSession_Account()
	 * @model
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.Session#getAccount <em>Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

} // Session
