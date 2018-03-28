/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task I</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.TaskI#getIn <em>In</em>}</li>
 *   <li>{@link workflow.TaskI#getOut <em>Out</em>}</li>
 *   <li>{@link workflow.TaskI#getStart <em>Start</em>}</li>
 *   <li>{@link workflow.TaskI#getFinish <em>Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getTaskI()
 * @model
 * @generated
 */
public interface TaskI extends TaskAspect {
	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.DocumentDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getTaskI_In()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentDescriptor> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.DocumentDescriptor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getTaskI_Out()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentDescriptor> getOut();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.DocumentCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getTaskI_Start()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentCondition> getStart();

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.DocumentCondition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finish</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getTaskI_Finish()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentCondition> getFinish();

} // TaskI
