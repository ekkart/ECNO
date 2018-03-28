/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.RuntimeInformation#getCaseIdCount <em>Case Id Count</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getRuntimeInformation()
 * @model
 * @generated
 */
public interface RuntimeInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Case Id Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Id Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Id Count</em>' attribute.
	 * @see #setCaseIdCount(long)
	 * @see workflow.WorkflowPackage#getRuntimeInformation_CaseIdCount()
	 * @model
	 * @generated
	 */
	long getCaseIdCount();

	/**
	 * Sets the value of the '{@link workflow.RuntimeInformation#getCaseIdCount <em>Case Id Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Id Count</em>' attribute.
	 * @see #getCaseIdCount()
	 * @generated
	 */
	void setCaseIdCount(long value);

} // RuntimeInformation
