/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.GlobalAspect#getModelRegistry <em>Model Registry</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getGlobalAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GlobalAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Registry</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.ModelRegistry#getGlobalAspects <em>Global Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Registry</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Registry</em>' reference.
	 * @see #setModelRegistry(ModelRegistry)
	 * @see workflow.WorkflowPackage#getGlobalAspect_ModelRegistry()
	 * @see workflow.ModelRegistry#getGlobalAspects
	 * @model opposite="globalAspects" required="true"
	 * @generated
	 */
	ModelRegistry getModelRegistry();

	/**
	 * Sets the value of the '{@link workflow.GlobalAspect#getModelRegistry <em>Model Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Registry</em>' reference.
	 * @see #getModelRegistry()
	 * @generated
	 */
	void setModelRegistry(ModelRegistry value);

} // GlobalAspect
