/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Field Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.EnumFieldAtom#getEnumField <em>Enum Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getEnumFieldAtom()
 * @model
 * @generated
 */
public interface EnumFieldAtom extends Atom {
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
	 * @see workflow.WorkflowPackage#getEnumFieldAtom_EnumField()
	 * @model required="true"
	 * @generated
	 */
	EnumField getEnumField();

	/**
	 * Sets the value of the '{@link workflow.EnumFieldAtom#getEnumField <em>Enum Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Field</em>' reference.
	 * @see #getEnumField()
	 * @generated
	 */
	void setEnumField(EnumField value);

} // EnumFieldAtom
