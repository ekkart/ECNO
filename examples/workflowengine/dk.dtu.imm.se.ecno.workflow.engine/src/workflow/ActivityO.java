/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity O</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ActivityO#getAssignedTo <em>Assigned To</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getActivityO()
 * @model
 * @generated
 */
public interface ActivityO extends ActivityAspect {
	/**
	 * Returns the value of the '<em><b>Assigned To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Agent#getActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned To</em>' reference.
	 * @see #setAssignedTo(Agent)
	 * @see workflow.WorkflowPackage#getActivityO_AssignedTo()
	 * @see workflow.Agent#getActive
	 * @model opposite="active"
	 * @generated
	 */
	Agent getAssignedTo();

	/**
	 * Sets the value of the '{@link workflow.ActivityO#getAssignedTo <em>Assigned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned To</em>' reference.
	 * @see #getAssignedTo()
	 * @generated
	 */
	void setAssignedTo(Agent value);

} // ActivityO
