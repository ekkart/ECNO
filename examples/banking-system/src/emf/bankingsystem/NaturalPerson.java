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
 * A representation of the model object '<em><b>Natural Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.NaturalPerson#getAvailableCards <em>Available Cards</em>}</li>
 *   <li>{@link emf.bankingsystem.NaturalPerson#getUses <em>Uses</em>}</li>
 *   <li>{@link emf.bankingsystem.NaturalPerson#getOwns <em>Owns</em>}</li>
 *   <li>{@link emf.bankingsystem.NaturalPerson#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getNaturalPerson()
 * @model
 * @generated
 */
public interface NaturalPerson extends Component {
	/**
	 * Returns the value of the '<em><b>Available Cards</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.PhysicalBankCard}.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.PhysicalBankCard#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Cards</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Available Cards</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getNaturalPerson_AvailableCards()
	 * @see emf.bankingsystem.PhysicalBankCard#getOwner
	 * @model opposite="owner" containment="true"
	 * @generated
	 */
	EList<PhysicalBankCard> getAvailableCards();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference list.
	 * The list contents are of type {@link emf.bankingsystem.HW}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getNaturalPerson_Uses()
	 * @model
	 * @generated
	 */
	EList<HW> getUses();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.BankNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getNaturalPerson_Owns()
	 * @model containment="true"
	 * @generated
	 */
	EList<BankNote> getOwns();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see emf.bankingsystem.BankingsystemPackage#getNaturalPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.NaturalPerson#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NaturalPerson
