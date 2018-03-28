/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getPackageURI <em>Package URI</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#isImported <em>Imported</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getImportedType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ImportedType extends EObject {
	/**
	 * Returns the value of the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package URI</em>' attribute.
	 * @see #setPackageURI(String)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getImportedType_PackageURI()
	 * @model
	 * @generated
	 */
	String getPackageURI();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getPackageURI <em>Package URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package URI</em>' attribute.
	 * @see #getPackageURI()
	 * @generated
	 */
	void setPackageURI(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getImportedType_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported</em>' attribute.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getImportedType_Imported()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	boolean isImported();

	/**
	 * Returns the value of the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import</em>' reference.
	 * @see #setImport(ImportedType)
	 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage#getImportedType_Import()
	 * @model
	 * @generated
	 */
	ImportedType getImport();

	/**
	 * Sets the value of the '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getImport <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import</em>' reference.
	 * @see #getImport()
	 * @generated
	 */
	void setImport(ImportedType value);

} // ImportedType
