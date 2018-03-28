/**
 */
package workflow.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import workflow.Activity;
import workflow.ActivityO;
import workflow.Agent;
import workflow.TaskAspect;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity O</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.ActivityOImpl#getTask <em>Task</em>}</li>
 *   <li>{@link workflow.impl.ActivityOImpl#getCore <em>Core</em>}</li>
 *   <li>{@link workflow.impl.ActivityOImpl#getAssignedTo <em>Assigned To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityOImpl extends EObjectImpl implements ActivityO {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected TaskAspect task;

	/**
	 * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedTo()
	 * @generated
	 * @ordered
	 */
	protected Agent assignedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.ACTIVITY_O;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAspect getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (TaskAspect)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ACTIVITY_O__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaskAspect basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(TaskAspect newTask) {
		TaskAspect oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_O__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getCore() {
		if (eContainerFeatureID() != WorkflowPackage.ACTIVITY_O__CORE) return null;
		return (Activity)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Activity newCore, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCore, WorkflowPackage.ACTIVITY_O__CORE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Activity newCore) {
		if (newCore != eInternalContainer() || (eContainerFeatureID() != WorkflowPackage.ACTIVITY_O__CORE && newCore != null)) {
			if (EcoreUtil.isAncestor(this, newCore))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, WorkflowPackage.ACTIVITY__ASPECTS, Activity.class, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_O__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent getAssignedTo() {
		if (assignedTo != null && assignedTo.eIsProxy()) {
			InternalEObject oldAssignedTo = (InternalEObject)assignedTo;
			assignedTo = (Agent)eResolveProxy(oldAssignedTo);
			if (assignedTo != oldAssignedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.ACTIVITY_O__ASSIGNED_TO, oldAssignedTo, assignedTo));
			}
		}
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent basicGetAssignedTo() {
		return assignedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedTo(Agent newAssignedTo, NotificationChain msgs) {
		Agent oldAssignedTo = assignedTo;
		assignedTo = newAssignedTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_O__ASSIGNED_TO, oldAssignedTo, newAssignedTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedTo(Agent newAssignedTo) {
		if (newAssignedTo != assignedTo) {
			NotificationChain msgs = null;
			if (assignedTo != null)
				msgs = ((InternalEObject)assignedTo).eInverseRemove(this, WorkflowPackage.AGENT__ACTIVE, Agent.class, msgs);
			if (newAssignedTo != null)
				msgs = ((InternalEObject)newAssignedTo).eInverseAdd(this, WorkflowPackage.AGENT__ACTIVE, Agent.class, msgs);
			msgs = basicSetAssignedTo(newAssignedTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.ACTIVITY_O__ASSIGNED_TO, newAssignedTo, newAssignedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.ACTIVITY_O__CORE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCore((Activity)otherEnd, msgs);
			case WorkflowPackage.ACTIVITY_O__ASSIGNED_TO:
				if (assignedTo != null)
					msgs = ((InternalEObject)assignedTo).eInverseRemove(this, WorkflowPackage.AGENT__ACTIVE, Agent.class, msgs);
				return basicSetAssignedTo((Agent)otherEnd, msgs);
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
			case WorkflowPackage.ACTIVITY_O__CORE:
				return basicSetCore(null, msgs);
			case WorkflowPackage.ACTIVITY_O__ASSIGNED_TO:
				return basicSetAssignedTo(null, msgs);
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
			case WorkflowPackage.ACTIVITY_O__CORE:
				return eInternalContainer().eInverseRemove(this, WorkflowPackage.ACTIVITY__ASPECTS, Activity.class, msgs);
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
			case WorkflowPackage.ACTIVITY_O__TASK:
				if (resolve) return getTask();
				return basicGetTask();
			case WorkflowPackage.ACTIVITY_O__CORE:
				return getCore();
			case WorkflowPackage.ACTIVITY_O__ASSIGNED_TO:
				if (resolve) return getAssignedTo();
				return basicGetAssignedTo();
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
			case WorkflowPackage.ACTIVITY_O__TASK:
				setTask((TaskAspect)newValue);
				return;
			case WorkflowPackage.ACTIVITY_O__CORE:
				setCore((Activity)newValue);
				return;
			case WorkflowPackage.ACTIVITY_O__ASSIGNED_TO:
				setAssignedTo((Agent)newValue);
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
			case WorkflowPackage.ACTIVITY_O__TASK:
				setTask((TaskAspect)null);
				return;
			case WorkflowPackage.ACTIVITY_O__CORE:
				setCore((Activity)null);
				return;
			case WorkflowPackage.ACTIVITY_O__ASSIGNED_TO:
				setAssignedTo((Agent)null);
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
			case WorkflowPackage.ACTIVITY_O__TASK:
				return task != null;
			case WorkflowPackage.ACTIVITY_O__CORE:
				return getCore() != null;
			case WorkflowPackage.ACTIVITY_O__ASSIGNED_TO:
				return assignedTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityOImpl
