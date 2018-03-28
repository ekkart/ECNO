/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task O</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.TaskO#getRequiredRoles <em>Required Roles</em>}</li>
 *   <li>{@link workflow.TaskO#getFollowsUpOn <em>Follows Up On</em>}</li>
 *   <li>{@link workflow.TaskO#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getTaskO()
 * @model
 * @generated
 */
public interface TaskO extends TaskAspect {
	/**
	 * Returns the value of the '<em><b>Required Roles</b></em>' reference list.
	 * The list contents are of type {@link workflow.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Roles</em>' reference list.
	 * @see workflow.WorkflowPackage#getTaskO_RequiredRoles()
	 * @model required="true"
	 * @generated
	 */
	EList<Role> getRequiredRoles();

	/**
	 * Returns the value of the '<em><b>Follows Up On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follows Up On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows Up On</em>' reference.
	 * @see #setFollowsUpOn(TaskO)
	 * @see workflow.WorkflowPackage#getTaskO_FollowsUpOn()
	 * @model required="true"
	 * @generated
	 */
	TaskO getFollowsUpOn();

	/**
	 * Sets the value of the '{@link workflow.TaskO#getFollowsUpOn <em>Follows Up On</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follows Up On</em>' reference.
	 * @see #getFollowsUpOn()
	 * @generated
	 */
	void setFollowsUpOn(TaskO value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getTaskO_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.TaskO#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // TaskO
