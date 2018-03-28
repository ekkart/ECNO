/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ModelAspect#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getModelAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ModelAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(ProcessAspect)
	 * @see workflow.WorkflowPackage#getModelAspect_Process()
	 * @model containment="true"
	 * @generated
	 */
	ProcessAspect getProcess();

	/**
	 * Sets the value of the '{@link workflow.ModelAspect#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(ProcessAspect value);

} // ModelAspect
