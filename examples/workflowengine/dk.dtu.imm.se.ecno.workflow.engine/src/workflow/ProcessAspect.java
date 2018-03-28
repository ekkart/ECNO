/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ProcessAspect#getTasks <em>Tasks</em>}</li>
 *   <li>{@link workflow.ProcessAspect#getCore <em>Core</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getProcessAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProcessAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.TaskAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getProcessAspect_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskAspect> getTasks();

	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Process#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(workflow.Process)
	 * @see workflow.WorkflowPackage#getProcessAspect_Core()
	 * @see workflow.Process#getAspects
	 * @model opposite="aspects" required="true"
	 * @generated
	 */
	workflow.Process getCore();

	/**
	 * Sets the value of the '{@link workflow.ProcessAspect#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(workflow.Process value);

} // ProcessAspect
