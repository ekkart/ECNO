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
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.Account#getCards <em>Cards</em>}</li>
 *   <li>{@link emf.bankingsystem.Account#getHolder <em>Holder</em>}</li>
 *   <li>{@link emf.bankingsystem.Account#getBalance <em>Balance</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends Component {
	/**
	 * Returns the value of the '<em><b>Cards</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.BankCard}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.BankCard#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getAccount_Cards()
	 * @see emf.bankingsystem.BankCard#getAccount
	 * @model opposite="account" containment="true"
	 * @generated
	 */
	EList<BankCard> getCards();

	/**
	 * Returns the value of the '<em><b>Holder</b></em>' reference list.
	 * The list contents are of type {@link emf.bankingsystem.Customer}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.Customer#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holder</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holder</em>' reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getAccount_Holder()
	 * @see emf.bankingsystem.Customer#getAccounts
	 * @model opposite="accounts"
	 * @generated
	 */
	EList<Customer> getHolder();

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Balance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(int)
	 * @see emf.bankingsystem.BankingsystemPackage#getAccount_Balance()
	 * @model required="true"
	 * @generated
	 */
	int getBalance();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.Account#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(int value);

} // Account
