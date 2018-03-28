/**
 */
package workflow;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Process Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.ProcessDocument#getName <em>Name</em>}</li>
 *   <li>{@link workflow.ProcessDocument#getDocumentType <em>Document Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getProcessDocument()
 * @model
 * @generated
 */
public interface ProcessDocument extends EObject {
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
	 * @see workflow.WorkflowPackage#getProcessDocument_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.ProcessDocument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see workflow.WorkflowPackage#getProcessDocument_DocumentType()
	 * @model required="true"
	 * @generated
	 */
	DocumentType getDocumentType();

	/**
	 * Sets the value of the '{@link workflow.ProcessDocument#getDocumentType <em>Document Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' reference.
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(DocumentType value);

} // ProcessDocument
