/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Global Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.RuntimeGlobalAspect#getEngine <em>Engine</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getRuntimeGlobalAspect()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RuntimeGlobalAspect extends EObject {
	/**
	 * Returns the value of the '<em><b>Engine</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link workflow.WorkflowEngine#getRuntimeGlobalAspects <em>Runtime Global Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Engine</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Engine</em>' reference.
	 * @see #setEngine(WorkflowEngine)
	 * @see workflow.WorkflowPackage#getRuntimeGlobalAspect_Engine()
	 * @see workflow.WorkflowEngine#getRuntimeGlobalAspects
	 * @model opposite="runtimeGlobalAspects" required="true"
	 * @generated
	 */
	WorkflowEngine getEngine();

	/**
	 * Sets the value of the '{@link workflow.RuntimeGlobalAspect#getEngine <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Engine</em>' reference.
	 * @see #getEngine()
	 * @generated
	 */
	void setEngine(WorkflowEngine value);

} // RuntimeGlobalAspect
