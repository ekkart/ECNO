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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.DefaultDocument;
import workflow.EnumFieldValue;
import workflow.FieldValue;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.DefaultDocumentImpl#getFieldValues <em>Field Values</em>}</li>
 *   <li>{@link workflow.impl.DefaultDocumentImpl#getEnumFieldValues <em>Enum Field Values</em>}</li>
 *   <li>{@link workflow.impl.DefaultDocumentImpl#isPlaceholder <em>Placeholder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultDocumentImpl extends DocumentImpl implements DefaultDocument {
	/**
	 * The cached value of the '{@link #getFieldValues() <em>Field Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldValues()
	 * @generated
	 * @ordered
	 */
	protected EList<FieldValue> fieldValues;

	/**
	 * The cached value of the '{@link #getEnumFieldValues() <em>Enum Field Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumFieldValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumFieldValue> enumFieldValues;

	/**
	 * The default value of the '{@link #isPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PLACEHOLDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPlaceholder() <em>Placeholder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPlaceholder()
	 * @generated
	 * @ordered
	 */
	protected boolean placeholder = PLACEHOLDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.DEFAULT_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldValue> getFieldValues() {
		if (fieldValues == null) {
			fieldValues = new EObjectContainmentEList<FieldValue>(FieldValue.class, this, WorkflowPackage.DEFAULT_DOCUMENT__FIELD_VALUES);
		}
		return fieldValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumFieldValue> getEnumFieldValues() {
		if (enumFieldValues == null) {
			enumFieldValues = new EObjectContainmentEList<EnumFieldValue>(EnumFieldValue.class, this, WorkflowPackage.DEFAULT_DOCUMENT__ENUM_FIELD_VALUES);
		}
		return enumFieldValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPlaceholder() {
		return placeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlaceholder(boolean newPlaceholder) {
		boolean oldPlaceholder = placeholder;
		placeholder = newPlaceholder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.DEFAULT_DOCUMENT__PLACEHOLDER, oldPlaceholder, placeholder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.DEFAULT_DOCUMENT__FIELD_VALUES:
				return ((InternalEList<?>)getFieldValues()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.DEFAULT_DOCUMENT__ENUM_FIELD_VALUES:
				return ((InternalEList<?>)getEnumFieldValues()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.DEFAULT_DOCUMENT__FIELD_VALUES:
				return getFieldValues();
			case WorkflowPackage.DEFAULT_DOCUMENT__ENUM_FIELD_VALUES:
				return getEnumFieldValues();
			case WorkflowPackage.DEFAULT_DOCUMENT__PLACEHOLDER:
				return isPlaceholder();
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
			case WorkflowPackage.DEFAULT_DOCUMENT__FIELD_VALUES:
				getFieldValues().clear();
				getFieldValues().addAll((Collection<? extends FieldValue>)newValue);
				return;
			case WorkflowPackage.DEFAULT_DOCUMENT__ENUM_FIELD_VALUES:
				getEnumFieldValues().clear();
				getEnumFieldValues().addAll((Collection<? extends EnumFieldValue>)newValue);
				return;
			case WorkflowPackage.DEFAULT_DOCUMENT__PLACEHOLDER:
				setPlaceholder((Boolean)newValue);
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
			case WorkflowPackage.DEFAULT_DOCUMENT__FIELD_VALUES:
				getFieldValues().clear();
				return;
			case WorkflowPackage.DEFAULT_DOCUMENT__ENUM_FIELD_VALUES:
				getEnumFieldValues().clear();
				return;
			case WorkflowPackage.DEFAULT_DOCUMENT__PLACEHOLDER:
				setPlaceholder(PLACEHOLDER_EDEFAULT);
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
			case WorkflowPackage.DEFAULT_DOCUMENT__FIELD_VALUES:
				return fieldValues != null && !fieldValues.isEmpty();
			case WorkflowPackage.DEFAULT_DOCUMENT__ENUM_FIELD_VALUES:
				return enumFieldValues != null && !enumFieldValues.isEmpty();
			case WorkflowPackage.DEFAULT_DOCUMENT__PLACEHOLDER:
				return placeholder != PLACEHOLDER_EDEFAULT;
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
		result.append(" (placeholder: ");
		result.append(placeholder);
		result.append(')');
		return result.toString();
	}

} //DefaultDocumentImpl
