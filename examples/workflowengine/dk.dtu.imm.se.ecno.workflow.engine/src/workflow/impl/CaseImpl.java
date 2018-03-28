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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.Activity;
import workflow.Case;
import workflow.CaseAspect;
import workflow.RuntimeCoreModel;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.CaseImpl#getId <em>Id</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#getClient <em>Client</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#isFinished <em>Finished</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#getActivities <em>Activities</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link workflow.impl.CaseImpl#getRuntimeCoreModel <em>Runtime Core Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends EObjectImpl implements Case {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final long ID_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected long id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getClient() <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected static final String CLIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected String client = CLIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected boolean started = STARTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected boolean finished = FINISHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<CaseAspect> aspects;

	/**
	 * The cached value of the '{@link #getActivities() <em>Activities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivities()
	 * @generated
	 * @ordered
	 */
	protected EList<Activity> activities;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected workflow.Process process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(long newId) {
		long oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(String newClient) {
		String oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStarted() {
		return started;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStarted(boolean newStarted) {
		boolean oldStarted = started;
		started = newStarted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE__STARTED, oldStarted, started));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinished() {
		return finished;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinished(boolean newFinished) {
		boolean oldFinished = finished;
		finished = newFinished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE__FINISHED, oldFinished, finished));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaseAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentWithInverseEList<CaseAspect>(CaseAspect.class, this, WorkflowPackage.CASE__ASPECTS, WorkflowPackage.CASE_ASPECT__CORE);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Activity> getActivities() {
		if (activities == null) {
			activities = new EObjectContainmentEList<Activity>(Activity.class, this, WorkflowPackage.CASE__ACTIVITIES);
		}
		return activities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow.Process getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject)process;
			process = (workflow.Process)eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.CASE__PROCESS, oldProcess, process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow.Process basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(workflow.Process newProcess) {
		workflow.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeCoreModel getRuntimeCoreModel() {
		if (eContainerFeatureID() != WorkflowPackage.CASE__RUNTIME_CORE_MODEL) return null;
		return (RuntimeCoreModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeCoreModel(RuntimeCoreModel newRuntimeCoreModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRuntimeCoreModel, WorkflowPackage.CASE__RUNTIME_CORE_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeCoreModel(RuntimeCoreModel newRuntimeCoreModel) {
		if (newRuntimeCoreModel != eInternalContainer() || (eContainerFeatureID() != WorkflowPackage.CASE__RUNTIME_CORE_MODEL && newRuntimeCoreModel != null)) {
			if (EcoreUtil.isAncestor(this, newRuntimeCoreModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRuntimeCoreModel != null)
				msgs = ((InternalEObject)newRuntimeCoreModel).eInverseAdd(this, WorkflowPackage.RUNTIME_CORE_MODEL__CASES, RuntimeCoreModel.class, msgs);
			msgs = basicSetRuntimeCoreModel(newRuntimeCoreModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.CASE__RUNTIME_CORE_MODEL, newRuntimeCoreModel, newRuntimeCoreModel));
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
			case WorkflowPackage.CASE__ASPECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAspects()).basicAdd(otherEnd, msgs);
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRuntimeCoreModel((RuntimeCoreModel)otherEnd, msgs);
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
			case WorkflowPackage.CASE__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.CASE__ACTIVITIES:
				return ((InternalEList<?>)getActivities()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				return basicSetRuntimeCoreModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				return eInternalContainer().eInverseRemove(this, WorkflowPackage.RUNTIME_CORE_MODEL__CASES, RuntimeCoreModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkflowPackage.CASE__ID:
				return getId();
			case WorkflowPackage.CASE__CLIENT:
				return getClient();
			case WorkflowPackage.CASE__STARTED:
				return isStarted();
			case WorkflowPackage.CASE__FINISHED:
				return isFinished();
			case WorkflowPackage.CASE__ASPECTS:
				return getAspects();
			case WorkflowPackage.CASE__ACTIVITIES:
				return getActivities();
			case WorkflowPackage.CASE__PROCESS:
				if (resolve) return getProcess();
				return basicGetProcess();
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				return getRuntimeCoreModel();
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
			case WorkflowPackage.CASE__ID:
				setId((Long)newValue);
				return;
			case WorkflowPackage.CASE__CLIENT:
				setClient((String)newValue);
				return;
			case WorkflowPackage.CASE__STARTED:
				setStarted((Boolean)newValue);
				return;
			case WorkflowPackage.CASE__FINISHED:
				setFinished((Boolean)newValue);
				return;
			case WorkflowPackage.CASE__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends CaseAspect>)newValue);
				return;
			case WorkflowPackage.CASE__ACTIVITIES:
				getActivities().clear();
				getActivities().addAll((Collection<? extends Activity>)newValue);
				return;
			case WorkflowPackage.CASE__PROCESS:
				setProcess((workflow.Process)newValue);
				return;
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				setRuntimeCoreModel((RuntimeCoreModel)newValue);
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
			case WorkflowPackage.CASE__ID:
				setId(ID_EDEFAULT);
				return;
			case WorkflowPackage.CASE__CLIENT:
				setClient(CLIENT_EDEFAULT);
				return;
			case WorkflowPackage.CASE__STARTED:
				setStarted(STARTED_EDEFAULT);
				return;
			case WorkflowPackage.CASE__FINISHED:
				setFinished(FINISHED_EDEFAULT);
				return;
			case WorkflowPackage.CASE__ASPECTS:
				getAspects().clear();
				return;
			case WorkflowPackage.CASE__ACTIVITIES:
				getActivities().clear();
				return;
			case WorkflowPackage.CASE__PROCESS:
				setProcess((workflow.Process)null);
				return;
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				setRuntimeCoreModel((RuntimeCoreModel)null);
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
			case WorkflowPackage.CASE__ID:
				return id != ID_EDEFAULT;
			case WorkflowPackage.CASE__CLIENT:
				return CLIENT_EDEFAULT == null ? client != null : !CLIENT_EDEFAULT.equals(client);
			case WorkflowPackage.CASE__STARTED:
				return started != STARTED_EDEFAULT;
			case WorkflowPackage.CASE__FINISHED:
				return finished != FINISHED_EDEFAULT;
			case WorkflowPackage.CASE__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case WorkflowPackage.CASE__ACTIVITIES:
				return activities != null && !activities.isEmpty();
			case WorkflowPackage.CASE__PROCESS:
				return process != null;
			case WorkflowPackage.CASE__RUNTIME_CORE_MODEL:
				return getRuntimeCoreModel() != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(", client: ");
		result.append(client);
		result.append(", started: ");
		result.append(started);
		result.append(", finished: ");
		result.append(finished);
		result.append(')');
		return result.toString();
	}

} //CaseImpl
