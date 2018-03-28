/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ModelRegistry#getEngine <em>Engine</em>}</li>
 *   <li>{@link workflow.ModelRegistry#getCoreModels <em>Core Models</em>}</li>
 *   <li>{@link workflow.ModelRegistry#getGlobalAspects <em>Global Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getModelRegistry()
 * @model
 * @generated
 */
public interface ModelRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.WorkflowEngine#getModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference.
	 * @see #setEngine(WorkflowEngine)
	 * @see workflow.WorkflowPackage#getModelRegistry_Engine()
	 * @see workflow.WorkflowEngine#getModelRegistry
	 * @model opposite="modelRegistry" required="true"
	 * @generated
	 */
	WorkflowEngine getEngine();

	/**
	 * Sets the value of the '{@link workflow.ModelRegistry#getEngine <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(WorkflowEngine value);

	/**
	 * Returns the value of the '<em><b>Core Models</b></em>' reference list.
	 * The list contents are of type {@link workflow.CoreModel}.
	 * It is bidirectional and its opposite is '{@link workflow.CoreModel#getModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Models</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Models</em>' reference list.
	 * @see workflow.WorkflowPackage#getModelRegistry_CoreModels()
	 * @see workflow.CoreModel#getModelRegistry
	 * @model opposite="modelRegistry"
	 * @generated
	 */
	EList<CoreModel> getCoreModels();

	/**
	 * Returns the value of the '<em><b>Global Aspects</b></em>' reference list.
	 * The list contents are of type {@link workflow.GlobalAspect}.
	 * It is bidirectional and its opposite is '{@link workflow.GlobalAspect#getModelRegistry <em>Model Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Aspects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Aspects</em>' reference list.
	 * @see workflow.WorkflowPackage#getModelRegistry_GlobalAspects()
	 * @see workflow.GlobalAspect#getModelRegistry
	 * @model opposite="modelRegistry"
	 * @generated
	 */
	EList<GlobalAspect> getGlobalAspects();

} // ModelRegistry
