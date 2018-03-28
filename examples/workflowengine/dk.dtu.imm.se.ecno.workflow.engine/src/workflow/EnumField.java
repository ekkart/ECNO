/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.EnumField#getName <em>Name</em>}</li>
 *   <li>{@link workflow.EnumField#getEnumLiterals <em>Enum Literals</em>}</li>
 *   <li>{@link workflow.EnumField#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getEnumField()
 * @model
 * @generated
 */
public interface EnumField extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see workflow.WorkflowPackage#getEnumField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.EnumField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Enum Literals</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.EnumLiteral}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Literals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literals</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getEnumField_EnumLiterals()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumLiteral> getEnumLiterals();

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(EnumLiteral)
	 * @see workflow.WorkflowPackage#getEnumField_DefaultValue()
	 * @model required="true"
	 * @generated
	 */
	EnumLiteral getDefaultValue();

	/**
	 * Sets the value of the '{@link workflow.EnumField#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(EnumLiteral value);

} // EnumField
