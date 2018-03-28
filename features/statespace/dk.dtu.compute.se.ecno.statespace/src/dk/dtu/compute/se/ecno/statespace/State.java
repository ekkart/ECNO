/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
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
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.State#getOut <em>Out</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.State#getIn <em>In</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.State#getObjects <em>Objects</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.State#getStatespace <em>Statespace</em>}</li>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.State#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Transition}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getState_Out()
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.Transition}.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getState_In()
	 * @see dk.dtu.compute.se.ecno.statespace.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIn();

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.compute.se.ecno.statespace.StateObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getState_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<StateObject> getObjects();

	/**
	 * Returns the value of the '<em><b>Statespace</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link dk.dtu.compute.se.ecno.statespace.StateSpace#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statespace</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statespace</em>' container reference.
	 * @see #setStatespace(StateSpace)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getState_Statespace()
	 * @see dk.dtu.compute.se.ecno.statespace.StateSpace#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	StateSpace getStatespace();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.State#getStatespace <em>Statespace</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statespace</em>' container reference.
	 * @see #getStatespace()
	 * @generated
	 */
	void setStatespace(StateSpace value);

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
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getState_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.State#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model engineDataType="dk.dtu.compute.se.ecno.statespace.ExecutionEngine"
	 * @generated
	 */
	void init(EObject container, ExecutionEngine engine);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	StateObject getState(int uid);

} // State
