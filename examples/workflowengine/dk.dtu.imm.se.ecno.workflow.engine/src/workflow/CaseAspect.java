/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.CaseAspect#getProcess <em>Process</em>}</li>
 *   <li>{@link workflow.CaseAspect#getCore <em>Core</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getCaseAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface CaseAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(ProcessAspect)
	 * @see workflow.WorkflowPackage#getCaseAspect_Process()
	 * @model
	 * @generated
	 */
	ProcessAspect getProcess();

	/**
	 * Sets the value of the '{@link workflow.CaseAspect#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ProcessAspect value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link workflow.Case#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' container reference.
	 * @see #setCore(Case)
	 * @see workflow.WorkflowPackage#getCaseAspect_Core()
	 * @see workflow.Case#getAspects
	 * @model opposite="aspects" required="true" transient="false"
	 * @generated
	 */
	Case getCore();

	/**
	 * Sets the value of the '{@link workflow.CaseAspect#getCore <em>Core</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' container reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Case value);

} // CaseAspect
