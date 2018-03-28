/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Process#getName <em>Name</em>}</li>
 *   <li>{@link workflow.Process#getTasks <em>Tasks</em>}</li>
 *   <li>{@link workflow.Process#getCoreModel <em>Core Model</em>}</li>
 *   <li>{@link workflow.Process#getAspects <em>Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getProcess()
 * @model
 * @generated
 */
public interface Process extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getProcess_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.Process#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getProcess_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Core Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link workflow.CoreModel#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Model</em>' container reference.
	 * @see #setCoreModel(CoreModel)
	 * @see workflow.WorkflowPackage#getProcess_CoreModel()
	 * @see workflow.CoreModel#getProcess
	 * @model opposite="process" required="true" transient="false"
	 * @generated
	 */
	CoreModel getCoreModel();

	/**
	 * Sets the value of the '{@link workflow.Process#getCoreModel <em>Core Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Model</em>' container reference.
	 * @see #getCoreModel()
	 * @generated
	 */
	void setCoreModel(CoreModel value);

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' reference list.
	 * The list contents are of type {@link workflow.ProcessAspect}.
	 * It is bidirectional and its opposite is '{@link workflow.ProcessAspect#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' reference list.
	 * @see workflow.WorkflowPackage#getProcess_Aspects()
	 * @see workflow.ProcessAspect#getCore
	 * @model opposite="core"
	 * @generated
	 */
	EList<ProcessAspect> getAspects();

} // Process
