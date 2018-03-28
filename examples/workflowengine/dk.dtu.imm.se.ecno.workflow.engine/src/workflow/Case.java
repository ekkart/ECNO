/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Case#getId <em>Id</em>}</li>
 *   <li>{@link workflow.Case#getClient <em>Client</em>}</li>
 *   <li>{@link workflow.Case#isStarted <em>Started</em>}</li>
 *   <li>{@link workflow.Case#isFinished <em>Finished</em>}</li>
 *   <li>{@link workflow.Case#getAspects <em>Aspects</em>}</li>
 *   <li>{@link workflow.Case#getActivities <em>Activities</em>}</li>
 *   <li>{@link workflow.Case#getProcess <em>Process</em>}</li>
 *   <li>{@link workflow.Case#getRuntimeCoreModel <em>Runtime Core Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getCase()
 * @model
 * @generated
 */
public interface Case extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(long)
	 * @see workflow.WorkflowPackage#getCase_Id()
	 * @model
	 * @generated
	 */
	long getId();

	/**
	 * Sets the value of the '{@link workflow.Case#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(long value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' attribute.
	 * @see #setClient(String)
	 * @see workflow.WorkflowPackage#getCase_Client()
	 * @model
	 * @generated
	 */
	String getClient();

	/**
	 * Sets the value of the '{@link workflow.Case#getClient <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' attribute.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(String value);

	/**
	 * Returns the value of the '<em><b>Started</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Started</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Started</em>' attribute.
	 * @see #setStarted(boolean)
	 * @see workflow.WorkflowPackage#getCase_Started()
	 * @model
	 * @generated
	 */
	boolean isStarted();

	/**
	 * Sets the value of the '{@link workflow.Case#isStarted <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Started</em>' attribute.
	 * @see #isStarted()
	 * @generated
	 */
	void setStarted(boolean value);

	/**
	 * Returns the value of the '<em><b>Finished</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finished</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finished</em>' attribute.
	 * @see #setFinished(boolean)
	 * @see workflow.WorkflowPackage#getCase_Finished()
	 * @model
	 * @generated
	 */
	boolean isFinished();

	/**
	 * Sets the value of the '{@link workflow.Case#isFinished <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finished</em>' attribute.
	 * @see #isFinished()
	 * @generated
	 */
	void setFinished(boolean value);

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.CaseAspect}.
	 * It is bidirectional and its opposite is '{@link workflow.CaseAspect#getCore <em>Core</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getCase_Aspects()
	 * @see workflow.CaseAspect#getCore
	 * @model opposite="core" containment="true"
	 * @generated
	 */
	EList<CaseAspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Activities</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Activity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activities</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getCase_Activities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Activity> getActivities();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(workflow.Process)
	 * @see workflow.WorkflowPackage#getCase_Process()
	 * @model required="true"
	 * @generated
	 */
	workflow.Process getProcess();

	/**
	 * Sets the value of the '{@link workflow.Case#getProcess <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(workflow.Process value);

	/**
	 * Returns the value of the '<em><b>Runtime Core Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link workflow.RuntimeCoreModel#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Core Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Core Model</em>' container reference.
	 * @see #setRuntimeCoreModel(RuntimeCoreModel)
	 * @see workflow.WorkflowPackage#getCase_RuntimeCoreModel()
	 * @see workflow.RuntimeCoreModel#getCases
	 * @model opposite="cases" required="true" transient="false"
	 * @generated
	 */
	RuntimeCoreModel getRuntimeCoreModel();

	/**
	 * Sets the value of the '{@link workflow.Case#getRuntimeCoreModel <em>Runtime Core Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Core Model</em>' container reference.
	 * @see #getRuntimeCoreModel()
	 * @generated
	 */
	void setRuntimeCoreModel(RuntimeCoreModel value);

} // Case
