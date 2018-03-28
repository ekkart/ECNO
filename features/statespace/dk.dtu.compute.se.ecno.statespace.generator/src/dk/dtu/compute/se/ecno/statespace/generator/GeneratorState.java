/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace.generator;

import dk.dtu.compute.se.ecno.statespace.State;
import dk.dtu.compute.se.ecno.statespace.StateObject;
import dk.dtu.compute.se.ecno.statespace.StateSpace;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getStatespace <em>Statespace</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStateObjectEvents <em>Unhandled State Object Events</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStates <em>Unhandled States</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getUnhandledStateObjects <em>Unhandled State Objects</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorState()
 * @model
 * @generated
 */
public interface GeneratorState extends EObject {
	/**
	 * Returns the value of the '<em><b>Statespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statespace</em>' reference.
	 * @see #setStatespace(StateSpace)
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorState_Statespace()
	 * @model required="true"
	 * @generated
	 */
	StateSpace getStatespace();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.generator.GeneratorState#getStatespace <em>Statespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statespace</em>' reference.
	 * @see #getStatespace()
	 * @generated
	 */
	void setStatespace(StateSpace value);

	/**
	 * Returns the value of the '<em><b>Unhandled State Object Events</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.generator.StateObjectEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unhandled State Object Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unhandled State Object Events</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorState_UnhandledStateObjectEvents()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateObjectEvent> getUnhandledStateObjectEvents();

	/**
	 * Returns the value of the '<em><b>Unhandled States</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unhandled States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unhandled States</em>' reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorState_UnhandledStates()
	 * @model
	 * @generated
	 */
	EList<State> getUnhandledStates();

	/**
	 * Returns the value of the '<em><b>Unhandled State Objects</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.StateObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unhandled State Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unhandled State Objects</em>' reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.generator.GeneratorPackage#getGeneratorState_UnhandledStateObjects()
	 * @model
	 * @generated
	 */
	EList<StateObject> getUnhandledStateObjects();

} // GeneratorState
