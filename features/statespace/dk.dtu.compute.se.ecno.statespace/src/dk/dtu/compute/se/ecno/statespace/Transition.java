/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getEvents <em>Events</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getLinks <em>Links</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getNumber <em>Number</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.Transition#getTriggerElement <em>Trigger Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.State#getOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_Source()
	 * @see dk.dtu.compute.se.ecno.statespace.State#getOut
	 * @model opposite="out" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.State#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_Target()
	 * @see dk.dtu.compute.se.ecno.statespace.State#getIn
	 * @model opposite="in"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' reference.
	 * @see #setTrigger(Event)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_Trigger()
	 * @model
	 * @generated
	 */
	Event getTrigger();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTrigger <em>Trigger</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(Event value);

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Link}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<Link> getLinks();

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
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Transition#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Trigger Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger Element</em>' reference.
	 * @see #setTriggerElement(StateObject)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getTransition_TriggerElement()
	 * @model
	 * @generated
	 */
	StateObject getTriggerElement();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTriggerElement <em>Trigger Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger Element</em>' reference.
	 * @see #getTriggerElement()
	 * @generated
	 */
	void setTriggerElement(StateObject value);

} // Transition
