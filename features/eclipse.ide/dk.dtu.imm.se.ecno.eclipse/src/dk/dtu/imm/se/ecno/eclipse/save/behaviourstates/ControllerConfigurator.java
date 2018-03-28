/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Configurator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getUri <em>Uri</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getControllerConfigurator()
 * @model
 * @generated
 */
public interface ControllerConfigurator extends EObject {
	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getControllerConfigurator_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(ControllerState)
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getControllerConfigurator_State()
	 * @model containment="true"
	 * @generated
	 */
	ControllerState getState();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerConfigurator#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(ControllerState value);

} // ControllerConfigurator
