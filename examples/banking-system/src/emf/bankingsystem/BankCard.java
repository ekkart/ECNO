/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.BankCard#getAccount <em>Account</em>}</li>
 *   <li>{@link emf.bankingsystem.BankCard#getOwner <em>Owner</em>}</li>
 *   <li>{@link emf.bankingsystem.BankCard#getNumer <em>Numer</em>}</li>
 *   <li>{@link emf.bankingsystem.BankCard#getPhysical <em>Physical</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getBankCard()
 * @model
 * @generated
 */
public interface BankCard extends Component {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.Account#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' container reference.
	 * @see #setAccount(Account)
	 * @see emf.bankingsystem.BankingsystemPackage#getBankCard_Account()
	 * @see emf.bankingsystem.Account#getCards
	 * @model opposite="cards" transient="false"
	 * @generated
	 */
	Account getAccount();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.BankCard#getAccount <em>Account</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account</em>' container reference.
	 * @see #getAccount()
	 * @generated
	 */
	void setAccount(Account value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Customer)
	 * @see emf.bankingsystem.BankingsystemPackage#getBankCard_Owner()
	 * @model
	 * @generated
	 */
	Customer getOwner();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.BankCard#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Customer value);

	/**
	 * Returns the value of the '<em><b>Numer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numer</em>' attribute.
	 * @see #setNumer(int)
	 * @see emf.bankingsystem.BankingsystemPackage#getBankCard_Numer()
	 * @model
	 * @generated
	 */
	int getNumer();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.BankCard#getNumer <em>Numer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numer</em>' attribute.
	 * @see #getNumer()
	 * @generated
	 */
	void setNumer(int value);

	/**
	 * Returns the value of the '<em><b>Physical</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Physical</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Physical</em>' reference.
	 * @see #setPhysical(PhysicalBankCard)
	 * @see emf.bankingsystem.BankingsystemPackage#getBankCard_Physical()
	 * @model
	 * @generated
	 */
	PhysicalBankCard getPhysical();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.BankCard#getPhysical <em>Physical</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Physical</em>' reference.
	 * @see #getPhysical()
	 * @generated
	 */
	void setPhysical(PhysicalBankCard value);

} // BankCard
