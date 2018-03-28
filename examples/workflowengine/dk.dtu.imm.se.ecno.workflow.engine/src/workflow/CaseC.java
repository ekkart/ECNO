/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.CaseC#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getCaseC()
 * @model
 * @generated
 */
public interface CaseC extends CaseAspect {
	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(State)
	 * @see workflow.WorkflowPackage#getCaseC_State()
	 * @model containment="true" required="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link workflow.CaseC#getState <em>State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

} // CaseC
