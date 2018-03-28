/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATM Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link emf.bankingsystem.ATMController#getHw <em>Hw</em>}</li>
 *   <li>{@link emf.bankingsystem.ATMController#getGateway <em>Gateway</em>}</li>
 *   <li>{@link emf.bankingsystem.ATMController#getSession <em>Session</em>}</li>
 * </ul>
 * </p>
 *
 * @see emf.bankingsystem.BankingsystemPackage#getATMController()
 * @model
 * @generated
 */
public interface ATMController extends Component {
	/**
	 * Returns the value of the '<em><b>Hw</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.HW#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hw</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hw</em>' reference.
	 * @see #setHw(HW)
	 * @see emf.bankingsystem.BankingsystemPackage#getATMController_Hw()
	 * @see emf.bankingsystem.HW#getController
	 * @model opposite="controller" required="true"
	 * @generated
	 */
	HW getHw();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.ATMController#getHw <em>Hw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hw</em>' reference.
	 * @see #getHw()
	 * @generated
	 */
	void setHw(HW value);

	/**
	 * Returns the value of the '<em><b>Gateway</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link emf.bankingsystem.BankGateway#getATMs <em>AT Ms</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gateway</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gateway</em>' reference.
	 * @see #setGateway(BankGateway)
	 * @see emf.bankingsystem.BankingsystemPackage#getATMController_Gateway()
	 * @see emf.bankingsystem.BankGateway#getATMs
	 * @model opposite="ATMs" required="true"
	 * @generated
	 */
	BankGateway getGateway();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.ATMController#getGateway <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gateway</em>' reference.
	 * @see #getGateway()
	 * @generated
	 */
	void setGateway(BankGateway value);

	/**
	 * Returns the value of the '<em><b>Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Session</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Session</em>' reference.
	 * @see #setSession(Session)
	 * @see emf.bankingsystem.BankingsystemPackage#getATMController_Session()
	 * @model
	 * @generated
	 */
	Session getSession();

	/**
	 * Sets the value of the '{@link emf.bankingsystem.ATMController#getSession <em>Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session</em>' reference.
	 * @see #getSession()
	 * @generated
	 */
	void setSession(Session value);

} // ATMController
