/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getEventbinding <em>Eventbinding</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends org.pnml.tools.epnk.pnmlcoremodel.Transition {
	/**
	 * Returns the value of the '<em><b>Eventbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eventbinding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eventbinding</em>' containment reference.
	 * @see #setEventbinding(EventBinding)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getTransition_Eventbinding()
	 * @model containment="true"
	 * @generated
	 */
	EventBinding getEventbinding();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getEventbinding <em>Eventbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eventbinding</em>' containment reference.
	 * @see #getEventbinding()
	 * @generated
	 */
	void setEventbinding(EventBinding value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getTransition_Condition()
	 * @model containment="true"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

} // Transition
