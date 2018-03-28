/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Descriptor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.DocumentDescriptor#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link workflow.DocumentDescriptor#getName <em>Name</em>}</li>
 *   <li>{@link workflow.DocumentDescriptor#getProcessDocument <em>Process Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getDocumentDescriptor()
 * @model abstract="true"
 * @generated
 */
public interface DocumentDescriptor extends EObject {
	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' reference.
	 * @see #setDocumentType(DocumentType)
	 * @see workflow.WorkflowPackage#getDocumentDescriptor_DocumentType()
	 * @model required="true"
	 * @generated
	 */
	DocumentType getDocumentType();

	/**
	 * Sets the value of the '{@link workflow.DocumentDescriptor#getDocumentType <em>Document Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' reference.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(DocumentType value);

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
	 * @see workflow.WorkflowPackage#getDocumentDescriptor_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.DocumentDescriptor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Process Document</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Document</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Document</em>' reference.
	 * @see #setProcessDocument(ProcessDocument)
	 * @see workflow.WorkflowPackage#getDocumentDescriptor_ProcessDocument()
	 * @model required="true"
	 * @generated
	 */
	ProcessDocument getProcessDocument();

	/**
	 * Sets the value of the '{@link workflow.DocumentDescriptor#getProcessDocument <em>Process Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Document</em>' reference.
	 * @see #getProcessDocument()
	 * @generated
	 */
	void setProcessDocument(ProcessDocument value);

} // DocumentDescriptor
