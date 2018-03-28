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

import workflow.Information;
import workflow.ProcessDocument;
import workflow.TaskAspect;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.InformationImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link workflow.impl.InformationImpl#getCore <em>Core</em>}</li>
 *   <li>{@link workflow.impl.InformationImpl#getProcessDocuments <em>Process Documents</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationImpl extends EObjectImpl implements Information {
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
	 * The cached value of the '{@link #getProcessDocuments() <em>Process Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessDocuments()
	 * @generated
	 * @ordered
	 */
	protected EList<ProcessDocument> processDocuments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskAspect> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskAspect>(TaskAspect.class, this, WorkflowPackage.INFORMATION__TASKS);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.INFORMATION__CORE, oldCore, core));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.INFORMATION__CORE, oldCore, newCore);
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
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.INFORMATION__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProcessDocument> getProcessDocuments() {
		if (processDocuments == null) {
			processDocuments = new EObjectContainmentEList<ProcessDocument>(ProcessDocument.class, this, WorkflowPackage.INFORMATION__PROCESS_DOCUMENTS);
		}
		return processDocuments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.INFORMATION__CORE:
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
			case WorkflowPackage.INFORMATION__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.INFORMATION__CORE:
				return basicSetCore(null, msgs);
			case WorkflowPackage.INFORMATION__PROCESS_DOCUMENTS:
				return ((InternalEList<?>)getProcessDocuments()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.INFORMATION__TASKS:
				return getTasks();
			case WorkflowPackage.INFORMATION__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case WorkflowPackage.INFORMATION__PROCESS_DOCUMENTS:
				return getProcessDocuments();
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
			case WorkflowPackage.INFORMATION__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends TaskAspect>)newValue);
				return;
			case WorkflowPackage.INFORMATION__CORE:
				setCore((workflow.Process)newValue);
				return;
			case WorkflowPackage.INFORMATION__PROCESS_DOCUMENTS:
				getProcessDocuments().clear();
				getProcessDocuments().addAll((Collection<? extends ProcessDocument>)newValue);
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
			case WorkflowPackage.INFORMATION__TASKS:
				getTasks().clear();
				return;
			case WorkflowPackage.INFORMATION__CORE:
				setCore((workflow.Process)null);
				return;
			case WorkflowPackage.INFORMATION__PROCESS_DOCUMENTS:
				getProcessDocuments().clear();
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
			case WorkflowPackage.INFORMATION__TASKS:
				return tasks != null && !tasks.isEmpty();
			case WorkflowPackage.INFORMATION__CORE:
				return core != null;
			case WorkflowPackage.INFORMATION__PROCESS_DOCUMENTS:
				return processDocuments != null && !processDocuments.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InformationImpl
