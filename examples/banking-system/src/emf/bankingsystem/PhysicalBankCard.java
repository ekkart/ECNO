/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical Bank Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.PhysicalBankCard#getNumber <em>Number</em>}</li>
 *   <li>{@link emf.bankingsystem.PhysicalBankCard#getPin <em>Pin</em>}</li>
 *   <li>{@link emf.bankingsystem.PhysicalBankCard#getIssuer <em>Issuer</em>}</li>
 *   <li>{@link emf.bankingsystem.PhysicalBankCard#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getPhysicalBankCard()
 * @model
 * @generated
 */
public interface PhysicalBankCard extends Component {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see emf.bankingsystem.BankingsystemPackage#getPhysicalBankCard_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.PhysicalBankCard#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Pin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pin</em>' attribute.
	 * @see #setPin(int)
	 * @see emf.bankingsystem.BankingsystemPackage#getPhysicalBankCard_Pin()
	 * @model required="true"
	 * @generated
	 */
	int getPin();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.PhysicalBankCard#getPin <em>Pin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pin</em>' attribute.
	 * @see #getPin()
	 * @generated
	 */
	void setPin(int value);

	/**
	 * Returns the value of the '<em><b>Issuer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issuer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issuer</em>' reference.
	 * @see #setIssuer(AccountMngr)
	 * @see emf.bankingsystem.BankingsystemPackage#getPhysicalBankCard_Issuer()
	 * @model
	 * @generated
	 */
	AccountMngr getIssuer();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.PhysicalBankCard#getIssuer <em>Issuer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issuer</em>' reference.
	 * @see #getIssuer()
	 * @generated
	 */
	void setIssuer(AccountMngr value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.NaturalPerson#getAvailableCards <em>Available Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' container reference.
	 * @see #setOwner(NaturalPerson)
	 * @see emf.bankingsystem.BankingsystemPackage#getPhysicalBankCard_Owner()
	 * @see emf.bankingsystem.NaturalPerson#getAvailableCards
	 * @model opposite="availableCards" transient="false"
	 * @generated
	 */
	NaturalPerson getOwner();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.PhysicalBankCard#getOwner <em>Owner</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' container reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(NaturalPerson value);

} // PhysicalBankCard
