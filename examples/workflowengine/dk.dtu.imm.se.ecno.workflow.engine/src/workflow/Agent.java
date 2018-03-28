/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Agent#getTakenRoles <em>Taken Roles</em>}</li>
 *   <li>{@link workflow.Agent#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Agent#getUsername <em>Username</em>}</li>
 *   <li>{@link workflow.Agent#getPassword <em>Password</em>}</li>
 *   <li>{@link workflow.Agent#getActive <em>Active</em>}</li>
 *   <li>{@link workflow.Agent#getMayTakeRoles <em>May Take Roles</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject {
	/**
	 * Returns the value of the '<em><b>Taken Roles</b></em>' reference list.
	 * The list contents are of type {@link workflow.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taken Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taken Roles</em>' reference list.
	 * @see workflow.WorkflowPackage#getAgent_TakenRoles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getTakenRoles();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getAgent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Agent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see workflow.WorkflowPackage#getAgent_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link workflow.Agent#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see workflow.WorkflowPackage#getAgent_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link workflow.Agent#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' reference list.
	 * The list contents are of type {@link workflow.ActivityO}.
	 * It is bidirectional and its opposite is '{@link workflow.ActivityO#getAssignedTo <em>Assigned To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' reference list.
	 * @see workflow.WorkflowPackage#getAgent_Active()
	 * @see workflow.ActivityO#getAssignedTo
	 * @model opposite="assignedTo"
	 * @generated
	 */
	EList<ActivityO> getActive();

	/**
	 * Returns the value of the '<em><b>May Take Roles</b></em>' reference list.
	 * The list contents are of type {@link workflow.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>May Take Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>May Take Roles</em>' reference list.
	 * @see workflow.WorkflowPackage#getAgent_MayTakeRoles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getMayTakeRoles();

} // Agent
