/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator;

import dk.dtu.compute.se.ecno.statespace.StateObject;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Object Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getEventName <em>Event Name</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getStateObject <em>State Object</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getStateObjectEvent()
 * @model
 * @generated
 */
public interface StateObjectEvent extends EObject {
	/**
	 * Returns the value of the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Name</em>' attribute.
	 * @see #setEventName(String)
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getStateObjectEvent_EventName()
	 * @model
	 * @generated
	 */
	String getEventName();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getEventName <em>Event Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Name</em>' attribute.
	 * @see #getEventName()
	 * @generated
	 */
	void setEventName(String value);

	/**
	 * Returns the value of the '<em><b>State Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Object</em>' reference.
	 * @see #setStateObject(StateObject)
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getStateObjectEvent_StateObject()
	 * @model
	 * @generated
	 */
	StateObject getStateObject();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent#getStateObject <em>State Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Object</em>' reference.
	 * @see #getStateObject()
	 * @generated
	 */
	void setStateObject(StateObject value);

} // StateObjectEvent
