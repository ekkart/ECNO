/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Core Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.CoreModel#getName <em>Name</em>}</li>
 *   <li>{@link workflow.CoreModel#getAspects <em>Aspects</em>}</li>
 *   <li>{@link workflow.CoreModel#getProcess <em>Process</em>}</li>
 *   <li>{@link workflow.CoreModel#getModelRegistry <em>Model Registry</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getCoreModel()
 * @model
 * @generated
 */
public interface CoreModel extends EObject {
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
	 * @see workflow.WorkflowPackage#getCoreModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.CoreModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.ModelAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getCoreModel_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelAspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link workflow.Process#getCoreModel <em>Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(workflow.Process)
	 * @see workflow.WorkflowPackage#getCoreModel_Process()
	 * @see workflow.Process#getCoreModel
	 * @model opposite="coreModel" containment="true"
	 * @generated
	 */
	workflow.Process getProcess();

	/**
	 * Sets the value of the '{@link workflow.CoreModel#getProcess <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(workflow.Process value);

	/**
	 * Returns the value of the '<em><b>Model Registry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.ModelRegistry#getCoreModels <em>Core Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Registry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Registry</em>' reference.
	 * @see #setModelRegistry(ModelRegistry)
	 * @see workflow.WorkflowPackage#getCoreModel_ModelRegistry()
	 * @see workflow.ModelRegistry#getCoreModels
	 * @model opposite="coreModels" required="true"
	 * @generated
	 */
	ModelRegistry getModelRegistry();

	/**
	 * Sets the value of the '{@link workflow.CoreModel#getModelRegistry <em>Model Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Registry</em>' reference.
	 * @see #getModelRegistry()
	 * @generated
	 */
	void setModelRegistry(ModelRegistry value);

} // CoreModel
