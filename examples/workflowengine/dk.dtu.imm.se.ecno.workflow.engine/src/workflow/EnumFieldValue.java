/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.EnumFieldValue#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link workflow.EnumFieldValue#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getEnumFieldValue()
 * @model
 * @generated
 */
public interface EnumFieldValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Enum Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Field</em>' reference.
	 * @see #setEnumField(EnumField)
	 * @see workflow.WorkflowPackage#getEnumFieldValue_EnumField()
	 * @model required="true"
	 * @generated
	 */
	EnumField getEnumField();

	/**
	 * Sets the value of the '{@link workflow.EnumFieldValue#getEnumField <em>Enum Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Field</em>' reference.
	 * @see #getEnumField()
	 * @generated
	 */
	void setEnumField(EnumField value);

	/**
	 * Returns the value of the '<em><b>Enum Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Value</em>' reference.
	 * @see #setEnumValue(EnumLiteral)
	 * @see workflow.WorkflowPackage#getEnumFieldValue_EnumValue()
	 * @model required="true"
	 * @generated
	 */
	EnumLiteral getEnumValue();

	/**
	 * Sets the value of the '{@link workflow.EnumFieldValue#getEnumValue <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Value</em>' reference.
	 * @see #getEnumValue()
	 * @generated
	 */
	void setEnumValue(EnumLiteral value);

} // EnumFieldValue
