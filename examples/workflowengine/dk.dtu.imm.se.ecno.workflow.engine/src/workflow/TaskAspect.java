/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.TaskAspect#getCore <em>Core</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getTaskAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TaskAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Core</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.Task#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' reference.
	 * @see #setCore(Task)
	 * @see workflow.WorkflowPackage#getTaskAspect_Core()
	 * @see workflow.Task#getAspects
	 * @model opposite="aspects" required="true"
	 * @generated
	 */
	Task getCore();

	/**
	 * Sets the value of the '{@link workflow.TaskAspect#getCore <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Task value);

} // TaskAspect
