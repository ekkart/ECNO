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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Case;
import workflow.CoreModel;
import workflow.RuntimeCoreModel;
import workflow.RuntimeModelAspect;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Runtime Core Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.RuntimeCoreModelImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link workflow.impl.RuntimeCoreModelImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link workflow.impl.RuntimeCoreModelImpl#getCoreModel <em>Core Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuntimeCoreModelImpl extends EObjectImpl implements RuntimeCoreModel {
	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeModelAspect> aspects;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> cases;

	/**
	 * The cached value of the '{@link #getCoreModel() <em>Core Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreModel()
	 * @generated
	 * @ordered
	 */
	protected CoreModel coreModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeCoreModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.RUNTIME_CORE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeModelAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<RuntimeModelAspect>(RuntimeModelAspect.class, this, WorkflowPackage.RUNTIME_CORE_MODEL__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Case> getCases() {
		if (cases == null) {
			cases = new EObjectContainmentWithInverseEList<Case>(Case.class, this, WorkflowPackage.RUNTIME_CORE_MODEL__CASES, WorkflowPackage.CASE__RUNTIME_CORE_MODEL);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModel getCoreModel() {
		if (coreModel != null && coreModel.eIsProxy()) {
			InternalEObject oldCoreModel = (InternalEObject)coreModel;
			coreModel = (CoreModel)eResolveProxy(oldCoreModel);
			if (coreModel != oldCoreModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.RUNTIME_CORE_MODEL__CORE_MODEL, oldCoreModel, coreModel));
			}
		}
		return coreModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreModel basicGetCoreModel() {
		return coreModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreModel(CoreModel newCoreModel) {
		CoreModel oldCoreModel = coreModel;
		coreModel = newCoreModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.RUNTIME_CORE_MODEL__CORE_MODEL, oldCoreModel, coreModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.RUNTIME_CORE_MODEL__CASES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCases()).basicAdd(otherEnd, msgs);
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
			case WorkflowPackage.RUNTIME_CORE_MODEL__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.RUNTIME_CORE_MODEL__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.RUNTIME_CORE_MODEL__ASPECTS:
				return getAspects();
			case WorkflowPackage.RUNTIME_CORE_MODEL__CASES:
				return getCases();
			case WorkflowPackage.RUNTIME_CORE_MODEL__CORE_MODEL:
				if (resolve) return getCoreModel();
				return basicGetCoreModel();
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
			case WorkflowPackage.RUNTIME_CORE_MODEL__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends RuntimeModelAspect>)newValue);
				return;
			case WorkflowPackage.RUNTIME_CORE_MODEL__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
				return;
			case WorkflowPackage.RUNTIME_CORE_MODEL__CORE_MODEL:
				setCoreModel((CoreModel)newValue);
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
			case WorkflowPackage.RUNTIME_CORE_MODEL__ASPECTS:
				getAspects().clear();
				return;
			case WorkflowPackage.RUNTIME_CORE_MODEL__CASES:
				getCases().clear();
				return;
			case WorkflowPackage.RUNTIME_CORE_MODEL__CORE_MODEL:
				setCoreModel((CoreModel)null);
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
			case WorkflowPackage.RUNTIME_CORE_MODEL__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case WorkflowPackage.RUNTIME_CORE_MODEL__CASES:
				return cases != null && !cases.isEmpty();
			case WorkflowPackage.RUNTIME_CORE_MODEL__CORE_MODEL:
				return coreModel != null;
		}
		return super.eIsSet(featureID);
	}

} //RuntimeCoreModelImpl
