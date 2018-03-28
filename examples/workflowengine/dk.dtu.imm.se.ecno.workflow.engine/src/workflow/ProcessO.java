/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process O</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ProcessO#getInvolved <em>Involved</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getProcessO()
 * @model
 * @generated
 */
public interface ProcessO extends ProcessAspect {
	/**
	 * Returns the value of the '<em><b>Involved</b></em>' reference list.
	 * The list contents are of type {@link workflow.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Involved</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Involved</em>' reference list.
	 * @see workflow.WorkflowPackage#getProcessO_Involved()
	 * @model
	 * @generated
	 */
	EList<Role> getInvolved();

} // ProcessO
