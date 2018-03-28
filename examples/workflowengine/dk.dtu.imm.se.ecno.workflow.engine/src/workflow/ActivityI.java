/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity I</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ActivityI#getIn <em>In</em>}</li>
 *   <li>{@link workflow.ActivityI#getOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getActivityI()
 * @model
 * @generated
 */
public interface ActivityI extends ActivityAspect {
	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link workflow.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see workflow.WorkflowPackage#getActivityI_In()
	 * @model
	 * @generated
	 */
	EList<Document> getIn();

	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link workflow.Document}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see workflow.WorkflowPackage#getActivityI_Out()
	 * @model
	 * @generated
	 */
	EList<Document> getOut();

} // ActivityI
