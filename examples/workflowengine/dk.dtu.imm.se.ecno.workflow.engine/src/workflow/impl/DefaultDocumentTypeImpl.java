/**
 */
package workflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.DefaultDocumentType;
import workflow.EnumField;
import workflow.Field;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Document Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.DefaultDocumentTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link workflow.impl.DefaultDocumentTypeImpl#getEnumFields <em>Enum Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultDocumentTypeImpl extends DocumentTypeImpl implements DefaultDocumentType {
	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fields;

	/**
	 * The cached value of the '{@link #getEnumFields() <em>Enum Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumFields()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumField> enumFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultDocumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DEFAULT_DOCUMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<Field>(Field.class, this, WorkflowPackage.DEFAULT_DOCUMENT_TYPE__FIELDS);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumField> getEnumFields() {
		if (enumFields == null) {
			enumFields = new EObjectContainmentEList<EnumField>(EnumField.class, this, WorkflowPackage.DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS);
		}
		return enumFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS:
				return ((InternalEList<?>)getEnumFields()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__FIELDS:
				return getFields();
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS:
				return getEnumFields();
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
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends Field>)newValue);
				return;
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS:
				getEnumFields().clear();
				getEnumFields().addAll((Collection<? extends EnumField>)newValue);
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
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__FIELDS:
				getFields().clear();
				return;
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS:
				getEnumFields().clear();
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
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case WorkflowPackage.DEFAULT_DOCUMENT_TYPE__ENUM_FIELDS:
				return enumFields != null && !enumFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefaultDocumentTypeImpl
