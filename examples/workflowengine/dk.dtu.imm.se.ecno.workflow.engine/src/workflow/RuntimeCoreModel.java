/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Core Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.RuntimeCoreModel#getAspects <em>Aspects</em>}</li>
 *   <li>{@link workflow.RuntimeCoreModel#getCases <em>Cases</em>}</li>
 *   <li>{@link workflow.RuntimeCoreModel#getCoreModel <em>Core Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getRuntimeCoreModel()
 * @model
 * @generated
 */
public interface RuntimeCoreModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Aspects</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.RuntimeModelAspect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aspects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aspects</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getRuntimeCoreModel_Aspects()
	 * @model containment="true"
	 * @generated
	 */
	EList<RuntimeModelAspect> getAspects();

	/**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Case}.
	 * It is bidirectional and its opposite is '{@link workflow.Case#getRuntimeCoreModel <em>Runtime Core Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getRuntimeCoreModel_Cases()
	 * @see workflow.Case#getRuntimeCoreModel
	 * @model opposite="runtimeCoreModel" containment="true"
	 * @generated
	 */
	EList<Case> getCases();

	/**
	 * Returns the value of the '<em><b>Core Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Model</em>' reference.
	 * @see #setCoreModel(CoreModel)
	 * @see workflow.WorkflowPackage#getRuntimeCoreModel_CoreModel()
	 * @model required="true"
	 * @generated
	 */
	CoreModel getCoreModel();

	/**
	 * Sets the value of the '{@link workflow.RuntimeCoreModel#getCoreModel <em>Core Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Model</em>' reference.
	 * @see #getCoreModel()
	 * @generated
	 */
	void setCoreModel(CoreModel value);

} // RuntimeCoreModel
