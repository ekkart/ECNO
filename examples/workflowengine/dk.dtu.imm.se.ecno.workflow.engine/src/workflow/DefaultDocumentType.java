/**
 */
package workflow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link workflow.DefaultDocumentType#getFields <em>Fields</em>}</li>
 *   <li>{@link workflow.DefaultDocumentType#getEnumFields <em>Enum Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see workflow.WorkflowPackage#getDefaultDocumentType()
 * @model
 * @generated
 */
public interface DefaultDocumentType extends DocumentType {
	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getDefaultDocumentType_Fields()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getFields();

	/**
	 * Returns the value of the '<em><b>Enum Fields</b></em>' containment reference list.
	 * The list contents are of type {@link workflow.EnumField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum Fields</em>' containment reference list.
	 * @see workflow.WorkflowPackage#getDefaultDocumentType_EnumFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumField> getEnumFields();

} // DefaultDocumentType
