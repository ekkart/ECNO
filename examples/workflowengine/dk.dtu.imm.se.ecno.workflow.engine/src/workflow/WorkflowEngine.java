/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.WorkflowEngine#getModelRegistry <em>Model Registry</em>}</li>
 *   <li>{@link workflow.WorkflowEngine#getRuntimeCoreModels <em>Runtime Core Models</em>}</li>
 *   <li>{@link workflow.WorkflowEngine#getRuntimeGlobalAspects <em>Runtime Global Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getWorkflowEngine()
 * @model
 * @generated
 */
public interface WorkflowEngine extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Registry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.ModelRegistry#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Registry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Registry</em>' reference.
	 * @see #setModelRegistry(ModelRegistry)
	 * @see workflow.WorkflowPackage#getWorkflowEngine_ModelRegistry()
	 * @see workflow.ModelRegistry#getEngine
	 * @model opposite="engine" required="true"
	 * @generated
	 */
	ModelRegistry getModelRegistry();

	/**
	 * Sets the value of the '{@link workflow.WorkflowEngine#getModelRegistry <em>Model Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Registry</em>' reference.
	 * @see #getModelRegistry()
	 * @generated
	 */
	void setModelRegistry(ModelRegistry value);

	/**
	 * Returns the value of the '<em><b>Runtime Core Models</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.RuntimeCoreModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Core Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Core Models</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getWorkflowEngine_RuntimeCoreModels()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeCoreModel> getRuntimeCoreModels();

	/**
	 * Returns the value of the '<em><b>Runtime Global Aspects</b></em>' reference list.
	 * The list contents are of type {@link workflow.RuntimeGlobalAspect}.
	 * It is bidirectional and its opposite is '{@link workflow.RuntimeGlobalAspect#getEngine <em>Engine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Global Aspects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Global Aspects</em>' reference list.
	 * @see workflow.WorkflowPackage#getWorkflowEngine_RuntimeGlobalAspects()
	 * @see workflow.RuntimeGlobalAspect#getEngine
	 * @model opposite="engine"
	 * @generated
	 */
	EList<RuntimeGlobalAspect> getRuntimeGlobalAspects();

} // WorkflowEngine
