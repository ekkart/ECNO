/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.EnumField;
import workflow.EnumFieldAtom;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Field Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.EnumFieldAtomImpl#getEnumField <em>Enum Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumFieldAtomImpl extends AtomImpl implements EnumFieldAtom {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumFieldAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ENUM_FIELD_ATOM;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ENUM_FIELD_ATOM__ENUM_FIELD, oldEnumField, enumField));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ENUM_FIELD_ATOM__ENUM_FIELD, oldEnumField, enumField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.ENUM_FIELD_ATOM__ENUM_FIELD:
				if (resolve) return getEnumField();
				return basicGetEnumField();
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
			case WorkflowPackage.ENUM_FIELD_ATOM__ENUM_FIELD:
				setEnumField((EnumField)newValue);
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
			case WorkflowPackage.ENUM_FIELD_ATOM__ENUM_FIELD:
				setEnumField((EnumField)null);
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
			case WorkflowPackage.ENUM_FIELD_ATOM__ENUM_FIELD:
				return enumField != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumFieldAtomImpl
