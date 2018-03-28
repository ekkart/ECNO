/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case O</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.CaseO#getInvolved <em>Involved</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getCaseO()
 * @model
 * @generated
 */
public interface CaseO extends CaseAspect {
	/**
	 * Returns the value of the '<em><b>Involved</b></em>' reference list.
	 * The list contents are of type {@link workflow.Agent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved</em>' reference list.
	 * @see workflow.WorkflowPackage#getCaseO_Involved()
	 * @model
	 * @generated
	 */
	EList<Agent> getInvolved();

} // CaseO
