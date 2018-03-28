/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.compute.se.ecno.statespace;

import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Space Controller State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState#getConfig <em>Config</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpaceControllerState()
 * @model
 * @generated
 */
public interface StateSpaceControllerState extends ObjectReference {

	/**
	 * Returns the value of the '<em><b>Config</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' attribute.
	 * @see #setConfig(String)
	 * @see dk.dtu.compute.se.ecno.statespace.StatespacePackage#getStateSpaceControllerState_Config()
	 * @model
	 * @generated
	 */
	String getConfig();

	/**
	 * Sets the value of the '{@link dk.dtu.compute.se.ecno.statespace.StateSpaceControllerState#getConfig <em>Config</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' attribute.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(String value);
} // StateSpaceControllerState
