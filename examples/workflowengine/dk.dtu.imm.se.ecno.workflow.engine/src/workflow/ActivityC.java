/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ActivityC#getCase <em>Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getActivityC()
 * @model
 * @generated
 */
public interface ActivityC extends ActivityAspect {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' reference.
	 * @see #setCase(CaseC)
	 * @see workflow.WorkflowPackage#getActivityC_Case()
	 * @model required="true"
	 * @generated
	 */
	CaseC getCase();

	/**
	 * Sets the value of the '{@link workflow.ActivityC#getCase <em>Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case</em>' reference.
	 * @see #getCase()
	 * @generated
	 */
	void setCase(CaseC value);

} // ActivityC
