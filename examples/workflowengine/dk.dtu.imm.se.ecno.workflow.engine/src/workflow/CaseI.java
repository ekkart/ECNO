/**
 */
package workflow;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case I</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.CaseI#getCaseDocuments <em>Case Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getCaseI()
 * @model
 * @generated
 */
public interface CaseI extends CaseAspect {
	/**
	 * Returns the value of the '<em><b>Case Documents</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link workflow.Document},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Documents</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Documents</em>' map.
	 * @see workflow.WorkflowPackage#getCaseI_CaseDocuments()
	 * @model mapType="workflow.String2DocumentMap<org.eclipse.emf.ecore.EString, workflow.Document>"
	 * @generated
	 */
	EMap<String, Document> getCaseDocuments();

} // CaseI
