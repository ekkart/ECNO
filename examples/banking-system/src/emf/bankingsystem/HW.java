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
 * A representation of the model object '<em><b>HW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.HW#getInserted <em>Inserted</em>}</li>
 *   <li>{@link emf.bankingsystem.HW#getHeld <em>Held</em>}</li>
 *   <li>{@link emf.bankingsystem.HW#getNotes <em>Notes</em>}</li>
 *   <li>{@link emf.bankingsystem.HW#getReady <em>Ready</em>}</li>
 *   <li>{@link emf.bankingsystem.HW#getController <em>Controller</em>}</li>
 *   <li>{@link emf.bankingsystem.HW#getShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getHW()
 * @model
 * @generated
 */
public interface HW extends Component {
	/**
	 * Returns the value of the '<em><b>Inserted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserted</em>' containment reference.
	 * @see #setInserted(PhysicalBankCard)
	 * @see emf.bankingsystem.BankingsystemPackage#getHW_Inserted()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalBankCard getInserted();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.HW#getInserted <em>Inserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserted</em>' containment reference.
	 * @see #getInserted()
	 * @generated
	 */
	void setInserted(PhysicalBankCard value);

	/**
	 * Returns the value of the '<em><b>Held</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.PhysicalBankCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getHW_Held()
	 * @model containment="true"
	 * @generated
	 */
	EList<PhysicalBankCard> getHeld();

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.BankNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getHW_Notes()
	 * @model containment="true"
	 * @generated
	 */
	EList<BankNote> getNotes();

	/**
	 * Returns the value of the '<em><b>Ready</b></em>' containment reference list.
	 * The list contents are of type {@link emf.bankingsystem.BankNote}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ready</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ready</em>' containment reference list.
	 * @see emf.bankingsystem.BankingsystemPackage#getHW_Ready()
	 * @model containment="true"
	 * @generated
	 */
	EList<BankNote> getReady();

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.ATMController#getHw <em>Hw</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' reference.
	 * @see #setController(ATMController)
	 * @see emf.bankingsystem.BankingsystemPackage#getHW_Controller()
	 * @see emf.bankingsystem.ATMController#getHw
	 * @model opposite="hw" required="true"
	 * @generated
	 */
	ATMController getController();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.HW#getController <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(ATMController value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' containment reference.
	 * @see #setShow(PhysicalBankCard)
	 * @see emf.bankingsystem.BankingsystemPackage#getHW_Show()
	 * @model containment="true"
	 * @generated
	 */
	PhysicalBankCard getShow();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.HW#getShow <em>Show</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' containment reference.
	 * @see #getShow()
	 * @generated
	 */
	void setShow(PhysicalBankCard value);

} // HW
