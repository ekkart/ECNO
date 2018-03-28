/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Literal Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.EnumLiteralAtom#getEnumLiteral <em>Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getEnumLiteralAtom()
 * @model
 * @generated
 */
public interface EnumLiteralAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Enum Literal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Literal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Literal</em>' reference.
	 * @see #setEnumLiteral(EnumLiteral)
	 * @see workflow.WorkflowPackage#getEnumLiteralAtom_EnumLiteral()
	 * @model required="true"
	 * @generated
	 */
	EnumLiteral getEnumLiteral();

	/**
	 * Sets the value of the '{@link workflow.EnumLiteralAtom#getEnumLiteral <em>Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enum Literal</em>' reference.
	 * @see #getEnumLiteral()
	 * @generated
	 */
	void setEnumLiteral(EnumLiteral value);

} // EnumLiteralAtom
