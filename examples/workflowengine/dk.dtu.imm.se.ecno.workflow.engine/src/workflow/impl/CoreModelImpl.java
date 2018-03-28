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

import workflow.CoreModel;
import workflow.ModelAspect;
import workflow.ModelRegistry;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Core Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.CoreModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link workflow.impl.CoreModelImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link workflow.impl.CoreModelImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link workflow.impl.CoreModelImpl#getModelRegistry <em>Model Registry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoreModelImpl extends EObjectImpl implements CoreModel {
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
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelAspect> aspects;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected workflow.Process process;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CORE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CORE_MODEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentEList<ModelAspect>(ModelAspect.class, this, WorkflowPackage.CORE_MODEL__ASPECTS);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow.Process getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(workflow.Process newProcess, NotificationChain msgs) {
		workflow.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.CORE_MODEL__PROCESS, oldProcess, newProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(workflow.Process newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, WorkflowPackage.PROCESS__CORE_MODEL, workflow.Process.class, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, WorkflowPackage.PROCESS__CORE_MODEL, workflow.Process.class, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CORE_MODEL__PROCESS, newProcess, newProcess));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CORE_MODEL__MODEL_REGISTRY, oldModelRegistry, modelRegistry));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.CORE_MODEL__MODEL_REGISTRY, oldModelRegistry, newModelRegistry);
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
				msgs = ((InternalEObject)modelRegistry).eInverseRemove(this, WorkflowPackage.MODEL_REGISTRY__CORE_MODELS, ModelRegistry.class, msgs);
			if (newModelRegistry != null)
				msgs = ((InternalEObject)newModelRegistry).eInverseAdd(this, WorkflowPackage.MODEL_REGISTRY__CORE_MODELS, ModelRegistry.class, msgs);
			msgs = basicSetModelRegistry(newModelRegistry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CORE_MODEL__MODEL_REGISTRY, newModelRegistry, newModelRegistry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.CORE_MODEL__PROCESS:
				if (process != null)
					msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WorkflowPackage.CORE_MODEL__PROCESS, null, msgs);
				return basicSetProcess((workflow.Process)otherEnd, msgs);
			case WorkflowPackage.CORE_MODEL__MODEL_REGISTRY:
				if (modelRegistry != null)
					msgs = ((InternalEObject)modelRegistry).eInverseRemove(this, WorkflowPackage.MODEL_REGISTRY__CORE_MODELS, ModelRegistry.class, msgs);
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
			case WorkflowPackage.CORE_MODEL__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.CORE_MODEL__PROCESS:
				return basicSetProcess(null, msgs);
			case WorkflowPackage.CORE_MODEL__MODEL_REGISTRY:
				return basicSetModelRegistry(null, msgs);
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
			case WorkflowPackage.CORE_MODEL__NAME:
				return getName();
			case WorkflowPackage.CORE_MODEL__ASPECTS:
				return getAspects();
			case WorkflowPackage.CORE_MODEL__PROCESS:
				return getProcess();
			case WorkflowPackage.CORE_MODEL__MODEL_REGISTRY:
				if (resolve) return getModelRegistry();
				return basicGetModelRegistry();
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
			case WorkflowPackage.CORE_MODEL__NAME:
				setName((String)newValue);
				return;
			case WorkflowPackage.CORE_MODEL__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends ModelAspect>)newValue);
				return;
			case WorkflowPackage.CORE_MODEL__PROCESS:
				setProcess((workflow.Process)newValue);
				return;
			case WorkflowPackage.CORE_MODEL__MODEL_REGISTRY:
				setModelRegistry((ModelRegistry)newValue);
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
			case WorkflowPackage.CORE_MODEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkflowPackage.CORE_MODEL__ASPECTS:
				getAspects().clear();
				return;
			case WorkflowPackage.CORE_MODEL__PROCESS:
				setProcess((workflow.Process)null);
				return;
			case WorkflowPackage.CORE_MODEL__MODEL_REGISTRY:
				setModelRegistry((ModelRegistry)null);
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
			case WorkflowPackage.CORE_MODEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkflowPackage.CORE_MODEL__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case WorkflowPackage.CORE_MODEL__PROCESS:
				return process != null;
			case WorkflowPackage.CORE_MODEL__MODEL_REGISTRY:
				return modelRegistry != null;
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

} //CoreModelImpl
