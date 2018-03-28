/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.DocumentType;
import workflow.DocumentTypeContainer;
import workflow.ModelRegistry;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Type Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.DocumentTypeContainerImpl#getModelRegistry <em>Model Registry</em>}</li>
 *   <li>{@link workflow.impl.DocumentTypeContainerImpl#getDocumentTypes <em>Document Types</em>}</li>
 *   <li>{@link workflow.impl.DocumentTypeContainerImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentTypeContainerImpl extends EObjectImpl implements DocumentTypeContainer {
	/**
	 * The cached value of the '{@link #getModelRegistry() <em>Model Registry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRegistry()
	 * @generated
	 * @ordered
	 */
	protected ModelRegistry modelRegistry;

	/**
	 * The cached value of the '{@link #getDocumentTypes() <em>Document Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentType> documentTypes;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentTypeContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DOCUMENT_TYPE_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRegistry getModelRegistry() {
		if (modelRegistry != null && modelRegistry.eIsProxy()) {
			InternalEObject oldModelRegistry = (InternalEObject)modelRegistry;
			modelRegistry = (ModelRegistry)eResolveProxy(oldModelRegistry);
			if (modelRegistry != oldModelRegistry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY, oldModelRegistry, modelRegistry));
			}
		}
		return modelRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRegistry basicGetModelRegistry() {
		return modelRegistry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelRegistry(ModelRegistry newModelRegistry, NotificationChain msgs) {
		ModelRegistry oldModelRegistry = modelRegistry;
		modelRegistry = newModelRegistry;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY, oldModelRegistry, newModelRegistry);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelRegistry(ModelRegistry newModelRegistry) {
		if (newModelRegistry != modelRegistry) {
			NotificationChain msgs = null;
			if (modelRegistry != null)
				msgs = ((InternalEObject)modelRegistry).eInverseRemove(this, WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS, ModelRegistry.class, msgs);
			if (newModelRegistry != null)
				msgs = ((InternalEObject)newModelRegistry).eInverseAdd(this, WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS, ModelRegistry.class, msgs);
			msgs = basicSetModelRegistry(newModelRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY, newModelRegistry, newModelRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentType> getDocumentTypes() {
		if (documentTypes == null) {
			documentTypes = new EObjectContainmentEList<DocumentType>(DocumentType.class, this, WorkflowPackage.DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES);
		}
		return documentTypes;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DOCUMENT_TYPE_CONTAINER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY:
				if (modelRegistry != null)
					msgs = ((InternalEObject)modelRegistry).eInverseRemove(this, WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS, ModelRegistry.class, msgs);
				return basicSetModelRegistry((ModelRegistry)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY:
				return basicSetModelRegistry(null, msgs);
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES:
				return ((InternalEList<?>)getDocumentTypes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY:
				if (resolve) return getModelRegistry();
				return basicGetModelRegistry();
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES:
				return getDocumentTypes();
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY:
				setModelRegistry((ModelRegistry)newValue);
				return;
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES:
				getDocumentTypes().clear();
				getDocumentTypes().addAll((Collection<? extends DocumentType>)newValue);
				return;
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__NAME:
				setName((String)newValue);
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
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY:
				setModelRegistry((ModelRegistry)null);
				return;
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES:
				getDocumentTypes().clear();
				return;
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
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
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__MODEL_REGISTRY:
				return modelRegistry != null;
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__DOCUMENT_TYPES:
				return documentTypes != null && !documentTypes.isEmpty();
			case WorkflowPackage.DOCUMENT_TYPE_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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

} //DocumentTypeContainerImpl
