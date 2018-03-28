/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ActivityAspect#getTask <em>Task</em>}</li>
 *   <li>{@link workflow.ActivityAspect#getCore <em>Core</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getActivityAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ActivityAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(TaskAspect)
	 * @see workflow.WorkflowPackage#getActivityAspect_Task()
	 * @model required="true"
	 * @generated
	 */
	TaskAspect getTask();

	/**
	 * Sets the value of the '{@link workflow.ActivityAspect#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(TaskAspect value);

	/**
	 * Returns the value of the '<em><b>Core</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link workflow.Activity#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core</em>' container reference.
	 * @see #setCore(Activity)
	 * @see workflow.WorkflowPackage#getActivityAspect_Core()
	 * @see workflow.Activity#getAspects
	 * @model opposite="aspects" required="true" transient="false"
	 * @generated
	 */
	Activity getCore();

	/**
	 * Sets the value of the '{@link workflow.ActivityAspect#getCore <em>Core</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core</em>' container reference.
	 * @see #getCore()
	 * @generated
	 */
	void setCore(Activity value);

} // ActivityAspect
