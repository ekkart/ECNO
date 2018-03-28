/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workflow.DocumentDescriptor;
import workflow.DocumentType;
import workflow.ProcessDocument;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Descriptor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.DocumentDescriptorImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link workflow.impl.DocumentDescriptorImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.DocumentDescriptorImpl#getProcessDocument <em>Process Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DocumentDescriptorImpl extends EObjectImpl implements DocumentDescriptor {
	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected DocumentType documentType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProcessDocument() <em>Process Document</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDocument()
	 * @generated
	 * @ordered
	 */
	protected ProcessDocument processDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentDescriptorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DOCUMENT_DESCRIPTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType getDocumentType() {
		if (documentType != null && documentType.eIsProxy()) {
			InternalEObject oldDocumentType = (InternalEObject)documentType;
			documentType = (DocumentType)eResolveProxy(oldDocumentType);
			if (documentType != oldDocumentType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE, oldDocumentType, documentType));
			}
		}
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType basicGetDocumentType() {
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentType(DocumentType newDocumentType) {
		DocumentType oldDocumentType = documentType;
		documentType = newDocumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE, oldDocumentType, documentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DOCUMENT_DESCRIPTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDocument getProcessDocument() {
		if (processDocument != null && processDocument.eIsProxy()) {
			InternalEObject oldProcessDocument = (InternalEObject)processDocument;
			processDocument = (ProcessDocument)eResolveProxy(oldProcessDocument);
			if (processDocument != oldProcessDocument) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT, oldProcessDocument, processDocument));
			}
		}
		return processDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessDocument basicGetProcessDocument() {
		return processDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessDocument(ProcessDocument newProcessDocument) {
		ProcessDocument oldProcessDocument = processDocument;
		processDocument = newProcessDocument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT, oldProcessDocument, processDocument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE:
				if (resolve) return getDocumentType();
				return basicGetDocumentType();
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__NAME:
				return getName();
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT:
				if (resolve) return getProcessDocument();
				return basicGetProcessDocument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE:
				setDocumentType((DocumentType)newValue);
				return;
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT:
				setProcessDocument((ProcessDocument)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE:
				setDocumentType((DocumentType)null);
				return;
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT:
				setProcessDocument((ProcessDocument)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__DOCUMENT_TYPE:
				return documentType != null;
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.DOCUMENT_DESCRIPTOR__PROCESS_DOCUMENT:
				return processDocument != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DocumentDescriptorImpl
