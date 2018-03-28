/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Type Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.DocumentTypeContainer#getDocumentTypes <em>Document Types</em>}</li>
 *   <li>{@link workflow.DocumentTypeContainer#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getDocumentTypeContainer()
 * @model
 * @generated
 */
public interface DocumentTypeContainer extends GlobalAspect {
	/**
	 * Returns the value of the '<em><b>Document Types</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Types</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getDocumentTypeContainer_DocumentTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<DocumentType> getDocumentTypes();

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
	 * @see workflow.WorkflowPackage#getDocumentTypeContainer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link workflow.DocumentTypeContainer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // DocumentTypeContainer
