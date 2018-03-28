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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.ModelRegistry;
import workflow.RuntimeCoreModel;
import workflow.RuntimeGlobalAspect;
import workflow.WorkflowEngine;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.WorkflowEngineImpl#getModelRegistry <em>Model Registry</em>}</li>
 *   <li>{@link workflow.impl.WorkflowEngineImpl#getRuntimeCoreModels <em>Runtime Core Models</em>}</li>
 *   <li>{@link workflow.impl.WorkflowEngineImpl#getRuntimeGlobalAspects <em>Runtime Global Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowEngineImpl extends EObjectImpl implements WorkflowEngine {
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
	 * The cached value of the '{@link #getRuntimeCoreModels() <em>Runtime Core Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeCoreModels()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeCoreModel> runtimeCoreModels;

	/**
	 * The cached value of the '{@link #getRuntimeGlobalAspects() <em>Runtime Global Aspects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeGlobalAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<RuntimeGlobalAspect> runtimeGlobalAspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowEngineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.WORKFLOW_ENGINE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY, oldModelRegistry, modelRegistry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY, oldModelRegistry, newModelRegistry);
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
				msgs = ((InternalEObject)modelRegistry).eInverseRemove(this, WorkflowPackage.MODEL_REGISTRY__ENGINE, ModelRegistry.class, msgs);
			if (newModelRegistry != null)
				msgs = ((InternalEObject)newModelRegistry).eInverseAdd(this, WorkflowPackage.MODEL_REGISTRY__ENGINE, ModelRegistry.class, msgs);
			msgs = basicSetModelRegistry(newModelRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY, newModelRegistry, newModelRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeCoreModel> getRuntimeCoreModels() {
		if (runtimeCoreModels == null) {
			runtimeCoreModels = new EObjectContainmentEList<RuntimeCoreModel>(RuntimeCoreModel.class, this, WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_CORE_MODELS);
		}
		return runtimeCoreModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RuntimeGlobalAspect> getRuntimeGlobalAspects() {
		if (runtimeGlobalAspects == null) {
			runtimeGlobalAspects = new EObjectWithInverseResolvingEList<RuntimeGlobalAspect>(RuntimeGlobalAspect.class, this, WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS, WorkflowPackage.RUNTIME_GLOBAL_ASPECT__ENGINE);
		}
		return runtimeGlobalAspects;
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
			case WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY:
				if (modelRegistry != null)
					msgs = ((InternalEObject)modelRegistry).eInverseRemove(this, WorkflowPackage.MODEL_REGISTRY__ENGINE, ModelRegistry.class, msgs);
				return basicSetModelRegistry((ModelRegistry)otherEnd, msgs);
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRuntimeGlobalAspects()).basicAdd(otherEnd, msgs);
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
			case WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY:
				return basicSetModelRegistry(null, msgs);
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_CORE_MODELS:
				return ((InternalEList<?>)getRuntimeCoreModels()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS:
				return ((InternalEList<?>)getRuntimeGlobalAspects()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY:
				if (resolve) return getModelRegistry();
				return basicGetModelRegistry();
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_CORE_MODELS:
				return getRuntimeCoreModels();
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS:
				return getRuntimeGlobalAspects();
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
			case WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY:
				setModelRegistry((ModelRegistry)newValue);
				return;
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_CORE_MODELS:
				getRuntimeCoreModels().clear();
				getRuntimeCoreModels().addAll((Collection<? extends RuntimeCoreModel>)newValue);
				return;
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS:
				getRuntimeGlobalAspects().clear();
				getRuntimeGlobalAspects().addAll((Collection<? extends RuntimeGlobalAspect>)newValue);
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
			case WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY:
				setModelRegistry((ModelRegistry)null);
				return;
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_CORE_MODELS:
				getRuntimeCoreModels().clear();
				return;
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS:
				getRuntimeGlobalAspects().clear();
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
			case WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY:
				return modelRegistry != null;
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_CORE_MODELS:
				return runtimeCoreModels != null && !runtimeCoreModels.isEmpty();
			case WorkflowPackage.WORKFLOW_ENGINE__RUNTIME_GLOBAL_ASPECTS:
				return runtimeGlobalAspects != null && !runtimeGlobalAspects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowEngineImpl
