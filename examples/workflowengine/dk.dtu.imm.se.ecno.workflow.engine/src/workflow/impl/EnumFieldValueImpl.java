/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workflow.EnumField;
import workflow.EnumFieldValue;
import workflow.EnumLiteral;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Field Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.EnumFieldValueImpl#getEnumField <em>Enum Field</em>}</li>
 *   <li>{@link workflow.impl.EnumFieldValueImpl#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumFieldValueImpl extends EObjectImpl implements EnumFieldValue {
	/**
	 * The cached value of the '{@link #getEnumField() <em>Enum Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumField()
	 * @generated
	 * @ordered
	 */
	protected EnumField enumField;

	/**
	 * The cached value of the '{@link #getEnumValue() <em>Enum Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumValue()
	 * @generated
	 * @ordered
	 */
	protected EnumLiteral enumValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumFieldValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ENUM_FIELD_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField getEnumField() {
		if (enumField != null && enumField.eIsProxy()) {
			InternalEObject oldEnumField = (InternalEObject)enumField;
			enumField = (EnumField)eResolveProxy(oldEnumField);
			if (enumField != oldEnumField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ENUM_FIELD_VALUE__ENUM_FIELD, oldEnumField, enumField));
			}
		}
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumField basicGetEnumField() {
		return enumField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumField(EnumField newEnumField) {
		EnumField oldEnumField = enumField;
		enumField = newEnumField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ENUM_FIELD_VALUE__ENUM_FIELD, oldEnumField, enumField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral getEnumValue() {
		if (enumValue != null && enumValue.eIsProxy()) {
			InternalEObject oldEnumValue = (InternalEObject)enumValue;
			enumValue = (EnumLiteral)eResolveProxy(oldEnumValue);
			if (enumValue != oldEnumValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ENUM_FIELD_VALUE__ENUM_VALUE, oldEnumValue, enumValue));
			}
		}
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral basicGetEnumValue() {
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumValue(EnumLiteral newEnumValue) {
		EnumLiteral oldEnumValue = enumValue;
		enumValue = newEnumValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ENUM_FIELD_VALUE__ENUM_VALUE, oldEnumValue, enumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_FIELD:
				if (resolve) return getEnumField();
				return basicGetEnumField();
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_VALUE:
				if (resolve) return getEnumValue();
				return basicGetEnumValue();
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
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_FIELD:
				setEnumField((EnumField)newValue);
				return;
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_VALUE:
				setEnumValue((EnumLiteral)newValue);
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
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_FIELD:
				setEnumField((EnumField)null);
				return;
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_VALUE:
				setEnumValue((EnumLiteral)null);
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
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_FIELD:
				return enumField != null;
			case WorkflowPackage.ENUM_FIELD_VALUE__ENUM_VALUE:
				return enumValue != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumFieldValueImpl
