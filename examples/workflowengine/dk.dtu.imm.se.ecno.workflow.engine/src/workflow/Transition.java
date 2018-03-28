/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Transition#getOut <em>Out</em>}</li>
 *   <li>{@link workflow.Transition#getIn <em>In</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends TaskC {
	/**
	 * Returns the value of the '<em><b>Out</b></em>' reference list.
	 * The list contents are of type {@link workflow.Arc}.
	 * It is bidirectional and its opposite is '{@link workflow.Arc#getSourceTransition <em>Source Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' reference list.
	 * @see workflow.WorkflowPackage#getTransition_Out()
	 * @see workflow.Arc#getSourceTransition
	 * @model opposite="sourceTransition"
	 * @generated
	 */
	EList<Arc> getOut();

	/**
	 * Returns the value of the '<em><b>In</b></em>' reference list.
	 * The list contents are of type {@link workflow.Arc}.
	 * It is bidirectional and its opposite is '{@link workflow.Arc#getTargetTransition <em>Target Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' reference list.
	 * @see workflow.WorkflowPackage#getTransition_In()
	 * @see workflow.Arc#getTargetTransition
	 * @model opposite="targetTransition"
	 * @generated
	 */
	EList<Arc> getIn();

} // Transition
