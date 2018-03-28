/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.DefaultDocument#getFieldValues <em>Field Values</em>}</li>
 *   <li>{@link workflow.DefaultDocument#getEnumFieldValues <em>Enum Field Values</em>}</li>
 *   <li>{@link workflow.DefaultDocument#isPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getDefaultDocument()
 * @model
 * @generated
 */
public interface DefaultDocument extends Document {
	/**
	 * Returns the value of the '<em><b>Field Values</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.FieldValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field Values</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getDefaultDocument_FieldValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<FieldValue> getFieldValues();

	/**
	 * Returns the value of the '<em><b>Enum Field Values</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.EnumFieldValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Field Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Field Values</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getDefaultDocument_EnumFieldValues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumFieldValue> getEnumFieldValues();

	/**
	 * Returns the value of the '<em><b>Placeholder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Placeholder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Placeholder</em>' attribute.
	 * @see #setPlaceholder(boolean)
	 * @see workflow.WorkflowPackage#getDefaultDocument_Placeholder()
	 * @model
	 * @generated
	 */
	boolean isPlaceholder();

	/**
	 * Sets the value of the '{@link workflow.DefaultDocument#isPlaceholder <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Placeholder</em>' attribute.
	 * @see #isPlaceholder()
	 * @generated
	 */
	void setPlaceholder(boolean value);

} // DefaultDocument
