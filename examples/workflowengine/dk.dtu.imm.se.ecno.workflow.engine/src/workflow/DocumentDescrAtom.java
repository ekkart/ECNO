/**
 */
package workflow;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Descr Atom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.DocumentDescrAtom#getDescriptor <em>Descriptor</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getDocumentDescrAtom()
 * @model
 * @generated
 */
public interface DocumentDescrAtom extends Atom {
	/**
	 * Returns the value of the '<em><b>Descriptor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descriptor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descriptor</em>' reference.
	 * @see #setDescriptor(DocumentDescriptor)
	 * @see workflow.WorkflowPackage#getDocumentDescrAtom_Descriptor()
	 * @model required="true"
	 * @generated
	 */
	DocumentDescriptor getDescriptor();

	/**
	 * Sets the value of the '{@link workflow.DocumentDescrAtom#getDescriptor <em>Descriptor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descriptor</em>' reference.
	 * @see #getDescriptor()
	 * @generated
	 */
	void setDescriptor(DocumentDescriptor value);

} // DocumentDescrAtom
