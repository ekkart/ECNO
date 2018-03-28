/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour States</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getStates <em>States</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getOrphans <em>Orphans</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getAdded <em>Added</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getControllerConfig <em>Controller Config</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getPackages <em>Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getBehaviourStates()
 * @model
 * @generated
 */
public interface BehaviourStates extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ElementBehaviourState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getBehaviourStates_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElementBehaviourState> getStates();

	/**
	 * Returns the value of the '<em><b>Orphans</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orphans</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orphans</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getBehaviourStates_Orphans()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getOrphans();

	/**
	 * Returns the value of the '<em><b>Added</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added</em>' reference list.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getBehaviourStates_Added()
	 * @model
	 * @generated
	 */
	EList<EObject> getAdded();

	/**
	 * Returns the value of the '<em><b>Controller Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Config</em>' containment reference.
	 * @see #setControllerConfig(ControllerConfigurator)
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getBehaviourStates_ControllerConfig()
	 * @model containment="true"
	 * @generated
	 */
	ControllerConfigurator getControllerConfig();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourStates#getControllerConfig <em>Controller Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller Config</em>' containment reference.
	 * @see #getControllerConfig()
	 * @generated
	 */
	void setControllerConfig(ControllerConfigurator value);

	/**
	 * Returns the value of the '<em><b>Packages</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' attribute list.
	 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage#getBehaviourStates_Packages()
	 * @model
	 * @generated
	 */
	EList<String> getPackages();

} // BehaviourStates
