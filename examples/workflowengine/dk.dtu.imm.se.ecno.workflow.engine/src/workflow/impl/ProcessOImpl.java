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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import workflow.ProcessO;
import workflow.Role;
import workflow.TaskAspect;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Process O</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.ProcessOImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link workflow.impl.ProcessOImpl#getCore <em>Core</em>}</li>
 *   <li>{@link workflow.impl.ProcessOImpl#getInvolved <em>Involved</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessOImpl extends EObjectImpl implements ProcessO {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskAspect> tasks;

	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected workflow.Process core;

	/**
	 * The cached value of the '{@link #getInvolved() <em>Involved</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvolved()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> involved;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.PROCESS_O;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskAspect> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskAspect>(TaskAspect.class, this, WorkflowPackage.PROCESS_O__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow.Process getCore() {
		if (core != null && core.eIsProxy()) {
			InternalEObject oldCore = (InternalEObject)core;
			core = (workflow.Process)eResolveProxy(oldCore);
			if (core != oldCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.PROCESS_O__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public workflow.Process basicGetCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(workflow.Process newCore, NotificationChain msgs) {
		workflow.Process oldCore = core;
		core = newCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.PROCESS_O__CORE, oldCore, newCore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(workflow.Process newCore) {
		if (newCore != core) {
			NotificationChain msgs = null;
			if (core != null)
				msgs = ((InternalEObject)core).eInverseRemove(this, WorkflowPackage.PROCESS__ASPECTS, workflow.Process.class, msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, WorkflowPackage.PROCESS__ASPECTS, workflow.Process.class, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.PROCESS_O__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Role> getInvolved() {
		if (involved == null) {
			involved = new EObjectResolvingEList<Role>(Role.class, this, WorkflowPackage.PROCESS_O__INVOLVED);
		}
		return involved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.PROCESS_O__CORE:
				if (core != null)
					msgs = ((InternalEObject)core).eInverseRemove(this, WorkflowPackage.PROCESS__ASPECTS, workflow.Process.class, msgs);
				return basicSetCore((workflow.Process)otherEnd, msgs);
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
			case WorkflowPackage.PROCESS_O__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.PROCESS_O__CORE:
				return basicSetCore(null, msgs);
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
			case WorkflowPackage.PROCESS_O__TASKS:
				return getTasks();
			case WorkflowPackage.PROCESS_O__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case WorkflowPackage.PROCESS_O__INVOLVED:
				return getInvolved();
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
			case WorkflowPackage.PROCESS_O__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends TaskAspect>)newValue);
				return;
			case WorkflowPackage.PROCESS_O__CORE:
				setCore((workflow.Process)newValue);
				return;
			case WorkflowPackage.PROCESS_O__INVOLVED:
				getInvolved().clear();
				getInvolved().addAll((Collection<? extends Role>)newValue);
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
			case WorkflowPackage.PROCESS_O__TASKS:
				getTasks().clear();
				return;
			case WorkflowPackage.PROCESS_O__CORE:
				setCore((workflow.Process)null);
				return;
			case WorkflowPackage.PROCESS_O__INVOLVED:
				getInvolved().clear();
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
			case WorkflowPackage.PROCESS_O__TASKS:
				return tasks != null && !tasks.isEmpty();
			case WorkflowPackage.PROCESS_O__CORE:
				return core != null;
			case WorkflowPackage.PROCESS_O__INVOLVED:
				return involved != null && !involved.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessOImpl
