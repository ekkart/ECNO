/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Information#getProcessDocuments <em>Process Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getInformation()
 * @model
 * @generated
 */
public interface Information extends ProcessAspect {
	/**
	 * Returns the value of the '<em><b>Process Documents</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.ProcessDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Documents</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getInformation_ProcessDocuments()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProcessDocument> getProcessDocuments();

} // Information
