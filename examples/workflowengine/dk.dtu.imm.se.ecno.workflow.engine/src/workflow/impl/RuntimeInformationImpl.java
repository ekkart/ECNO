/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import workflow.RuntimeInformation;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.RuntimeInformationImpl#getCaseIdCount <em>Case Id Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeInformationImpl extends EObjectImpl implements RuntimeInformation {
	/**
	 * The default value of the '{@link #getCaseIdCount() <em>Case Id Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseIdCount()
	 * @generated
	 * @ordered
	 */
	protected static final long CASE_ID_COUNT_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getCaseIdCount() <em>Case Id Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaseIdCount()
	 * @generated
	 * @ordered
	 */
	protected long caseIdCount = CASE_ID_COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.RUNTIME_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getCaseIdCount() {
		return caseIdCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaseIdCount(long newCaseIdCount) {
		long oldCaseIdCount = caseIdCount;
		caseIdCount = newCaseIdCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.RUNTIME_INFORMATION__CASE_ID_COUNT, oldCaseIdCount, caseIdCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.RUNTIME_INFORMATION__CASE_ID_COUNT:
				return getCaseIdCount();
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
			case WorkflowPackage.RUNTIME_INFORMATION__CASE_ID_COUNT:
				setCaseIdCount((Long)newValue);
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
			case WorkflowPackage.RUNTIME_INFORMATION__CASE_ID_COUNT:
				setCaseIdCount(CASE_ID_COUNT_EDEFAULT);
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
			case WorkflowPackage.RUNTIME_INFORMATION__CASE_ID_COUNT:
				return caseIdCount != CASE_ID_COUNT_EDEFAULT;
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
		result.append(" (caseIdCount: ");
		result.append(caseIdCount);
		result.append(')');
		return result.toString();
	}

} //RuntimeInformationImpl
