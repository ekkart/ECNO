/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.Operator#getOperands <em>Operands</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getOperator()
 * @model
 * @generated
 */
public interface Operator extends Expression {
	/**
	 * Returns the value of the '<em><b>Operands</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operands</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getOperator_Operands()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Expression> getOperands();

} // Operator
