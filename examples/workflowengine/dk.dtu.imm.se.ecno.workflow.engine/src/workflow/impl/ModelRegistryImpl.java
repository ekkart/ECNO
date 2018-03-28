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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.CoreModel;
import workflow.GlobalAspect;
import workflow.ModelRegistry;
import workflow.WorkflowEngine;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Registry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.ModelRegistryImpl#getEngine <em>Engine</em>}</li>
 *   <li>{@link workflow.impl.ModelRegistryImpl#getCoreModels <em>Core Models</em>}</li>
 *   <li>{@link workflow.impl.ModelRegistryImpl#getGlobalAspects <em>Global Aspects</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelRegistryImpl extends EObjectImpl implements ModelRegistry {
	/**
	 * The cached value of the '{@link #getEngine() <em>Engine</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngine()
	 * @generated
	 * @ordered
	 */
	protected WorkflowEngine engine;

	/**
	 * The cached value of the '{@link #getCoreModels() <em>Core Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreModels()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreModel> coreModels;

	/**
	 * The cached value of the '{@link #getGlobalAspects() <em>Global Aspects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<GlobalAspect> globalAspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRegistryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.MODEL_REGISTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine getEngine() {
		if (engine != null && engine.eIsProxy()) {
			InternalEObject oldEngine = (InternalEObject)engine;
			engine = (WorkflowEngine)eResolveProxy(oldEngine);
			if (engine != oldEngine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.MODEL_REGISTRY__ENGINE, oldEngine, engine));
			}
		}
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowEngine basicGetEngine() {
		return engine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEngine(WorkflowEngine newEngine, NotificationChain msgs) {
		WorkflowEngine oldEngine = engine;
		engine = newEngine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.MODEL_REGISTRY__ENGINE, oldEngine, newEngine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEngine(WorkflowEngine newEngine) {
		if (newEngine != engine) {
			NotificationChain msgs = null;
			if (engine != null)
				msgs = ((InternalEObject)engine).eInverseRemove(this, WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY, WorkflowEngine.class, msgs);
			if (newEngine != null)
				msgs = ((InternalEObject)newEngine).eInverseAdd(this, WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY, WorkflowEngine.class, msgs);
			msgs = basicSetEngine(newEngine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.MODEL_REGISTRY__ENGINE, newEngine, newEngine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreModel> getCoreModels() {
		if (coreModels == null) {
			coreModels = new EObjectWithInverseResolvingEList<CoreModel>(CoreModel.class, this, WorkflowPackage.MODEL_REGISTRY__CORE_MODELS, WorkflowPackage.CORE_MODEL__MODEL_REGISTRY);
		}
		return coreModels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GlobalAspect> getGlobalAspects() {
		if (globalAspects == null) {
			globalAspects = new EObjectWithInverseResolvingEList<GlobalAspect>(GlobalAspect.class, this, WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS, WorkflowPackage.GLOBAL_ASPECT__MODEL_REGISTRY);
		}
		return globalAspects;
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
			case WorkflowPackage.MODEL_REGISTRY__ENGINE:
				if (engine != null)
					msgs = ((InternalEObject)engine).eInverseRemove(this, WorkflowPackage.WORKFLOW_ENGINE__MODEL_REGISTRY, WorkflowEngine.class, msgs);
				return basicSetEngine((WorkflowEngine)otherEnd, msgs);
			case WorkflowPackage.MODEL_REGISTRY__CORE_MODELS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCoreModels()).basicAdd(otherEnd, msgs);
			case WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGlobalAspects()).basicAdd(otherEnd, msgs);
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
			case WorkflowPackage.MODEL_REGISTRY__ENGINE:
				return basicSetEngine(null, msgs);
			case WorkflowPackage.MODEL_REGISTRY__CORE_MODELS:
				return ((InternalEList<?>)getCoreModels()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS:
				return ((InternalEList<?>)getGlobalAspects()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.MODEL_REGISTRY__ENGINE:
				if (resolve) return getEngine();
				return basicGetEngine();
			case WorkflowPackage.MODEL_REGISTRY__CORE_MODELS:
				return getCoreModels();
			case WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS:
				return getGlobalAspects();
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
			case WorkflowPackage.MODEL_REGISTRY__ENGINE:
				setEngine((WorkflowEngine)newValue);
				return;
			case WorkflowPackage.MODEL_REGISTRY__CORE_MODELS:
				getCoreModels().clear();
				getCoreModels().addAll((Collection<? extends CoreModel>)newValue);
				return;
			case WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS:
				getGlobalAspects().clear();
				getGlobalAspects().addAll((Collection<? extends GlobalAspect>)newValue);
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
			case WorkflowPackage.MODEL_REGISTRY__ENGINE:
				setEngine((WorkflowEngine)null);
				return;
			case WorkflowPackage.MODEL_REGISTRY__CORE_MODELS:
				getCoreModels().clear();
				return;
			case WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS:
				getGlobalAspects().clear();
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
			case WorkflowPackage.MODEL_REGISTRY__ENGINE:
				return engine != null;
			case WorkflowPackage.MODEL_REGISTRY__CORE_MODELS:
				return coreModels != null && !coreModels.isEmpty();
			case WorkflowPackage.MODEL_REGISTRY__GLOBAL_ASPECTS:
				return globalAspects != null && !globalAspects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelRegistryImpl
