/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import workflow.EnumLiteral;
import workflow.EnumLiteralAtom;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Literal Atom</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.EnumLiteralAtomImpl#getEnumLiteral <em>Enum Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumLiteralAtomImpl extends AtomImpl implements EnumLiteralAtom {
	/**
	 * The cached value of the '{@link #getEnumLiteral() <em>Enum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumLiteral()
	 * @generated
	 * @ordered
	 */
	protected EnumLiteral enumLiteral;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumLiteralAtomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ENUM_LITERAL_ATOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral getEnumLiteral() {
		if (enumLiteral != null && enumLiteral.eIsProxy()) {
			InternalEObject oldEnumLiteral = (InternalEObject)enumLiteral;
			enumLiteral = (EnumLiteral)eResolveProxy(oldEnumLiteral);
			if (enumLiteral != oldEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ENUM_LITERAL_ATOM__ENUM_LITERAL, oldEnumLiteral, enumLiteral));
			}
		}
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumLiteral basicGetEnumLiteral() {
		return enumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumLiteral(EnumLiteral newEnumLiteral) {
		EnumLiteral oldEnumLiteral = enumLiteral;
		enumLiteral = newEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ENUM_LITERAL_ATOM__ENUM_LITERAL, oldEnumLiteral, enumLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.ENUM_LITERAL_ATOM__ENUM_LITERAL:
				if (resolve) return getEnumLiteral();
				return basicGetEnumLiteral();
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
			case WorkflowPackage.ENUM_LITERAL_ATOM__ENUM_LITERAL:
				setEnumLiteral((EnumLiteral)newValue);
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
			case WorkflowPackage.ENUM_LITERAL_ATOM__ENUM_LITERAL:
				setEnumLiteral((EnumLiteral)null);
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
			case WorkflowPackage.ENUM_LITERAL_ATOM__ENUM_LITERAL:
				return enumLiteral != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumLiteralAtomImpl
