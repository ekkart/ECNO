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

import workflow.DocumentCondition;
import workflow.DocumentDescriptor;
import workflow.Task;
import workflow.TaskI;
import workflow.WorkflowPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task I</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link workflow.impl.TaskIImpl#getCore <em>Core</em>}</li>
 *   <li>{@link workflow.impl.TaskIImpl#getIn <em>In</em>}</li>
 *   <li>{@link workflow.impl.TaskIImpl#getOut <em>Out</em>}</li>
 *   <li>{@link workflow.impl.TaskIImpl#getStart <em>Start</em>}</li>
 *   <li>{@link workflow.impl.TaskIImpl#getFinish <em>Finish</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskIImpl extends EObjectImpl implements TaskI {
	/**
	 * The cached value of the '{@link #getCore() <em>Core</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCore()
	 * @generated
	 * @ordered
	 */
	protected Task core;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentDescriptor> in;

	/**
	 * The cached value of the '{@link #getOut() <em>Out</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOut()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentDescriptor> out;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentCondition> start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentCondition> finish;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkflowPackage.Literals.TASK_I;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getCore() {
		if (core != null && core.eIsProxy()) {
			InternalEObject oldCore = (InternalEObject)core;
			core = (Task)eResolveProxy(oldCore);
			if (core != oldCore) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WorkflowPackage.TASK_I__CORE, oldCore, core));
			}
		}
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task basicGetCore() {
		return core;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCore(Task newCore, NotificationChain msgs) {
		Task oldCore = core;
		core = newCore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK_I__CORE, oldCore, newCore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCore(Task newCore) {
		if (newCore != core) {
			NotificationChain msgs = null;
			if (core != null)
				msgs = ((InternalEObject)core).eInverseRemove(this, WorkflowPackage.TASK__ASPECTS, Task.class, msgs);
			if (newCore != null)
				msgs = ((InternalEObject)newCore).eInverseAdd(this, WorkflowPackage.TASK__ASPECTS, Task.class, msgs);
			msgs = basicSetCore(newCore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkflowPackage.TASK_I__CORE, newCore, newCore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentDescriptor> getIn() {
		if (in == null) {
			in = new EObjectContainmentEList<DocumentDescriptor>(DocumentDescriptor.class, this, WorkflowPackage.TASK_I__IN);
		}
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentDescriptor> getOut() {
		if (out == null) {
			out = new EObjectContainmentEList<DocumentDescriptor>(DocumentDescriptor.class, this, WorkflowPackage.TASK_I__OUT);
		}
		return out;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentCondition> getStart() {
		if (start == null) {
			start = new EObjectContainmentEList<DocumentCondition>(DocumentCondition.class, this, WorkflowPackage.TASK_I__START);
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DocumentCondition> getFinish() {
		if (finish == null) {
			finish = new EObjectContainmentEList<DocumentCondition>(DocumentCondition.class, this, WorkflowPackage.TASK_I__FINISH);
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkflowPackage.TASK_I__CORE:
				if (core != null)
					msgs = ((InternalEObject)core).eInverseRemove(this, WorkflowPackage.TASK__ASPECTS, Task.class, msgs);
				return basicSetCore((Task)otherEnd, msgs);
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
			case WorkflowPackage.TASK_I__CORE:
				return basicSetCore(null, msgs);
			case WorkflowPackage.TASK_I__IN:
				return ((InternalEList<?>)getIn()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.TASK_I__OUT:
				return ((InternalEList<?>)getOut()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.TASK_I__START:
				return ((InternalEList<?>)getStart()).basicRemove(otherEnd, msgs);
			case WorkflowPackage.TASK_I__FINISH:
				return ((InternalEList<?>)getFinish()).basicRemove(otherEnd, msgs);
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
			case WorkflowPackage.TASK_I__CORE:
				if (resolve) return getCore();
				return basicGetCore();
			case WorkflowPackage.TASK_I__IN:
				return getIn();
			case WorkflowPackage.TASK_I__OUT:
				return getOut();
			case WorkflowPackage.TASK_I__START:
				return getStart();
			case WorkflowPackage.TASK_I__FINISH:
				return getFinish();
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
			case WorkflowPackage.TASK_I__CORE:
				setCore((Task)newValue);
				return;
			case WorkflowPackage.TASK_I__IN:
				getIn().clear();
				getIn().addAll((Collection<? extends DocumentDescriptor>)newValue);
				return;
			case WorkflowPackage.TASK_I__OUT:
				getOut().clear();
				getOut().addAll((Collection<? extends DocumentDescriptor>)newValue);
				return;
			case WorkflowPackage.TASK_I__START:
				getStart().clear();
				getStart().addAll((Collection<? extends DocumentCondition>)newValue);
				return;
			case WorkflowPackage.TASK_I__FINISH:
				getFinish().clear();
				getFinish().addAll((Collection<? extends DocumentCondition>)newValue);
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
			case WorkflowPackage.TASK_I__CORE:
				setCore((Task)null);
				return;
			case WorkflowPackage.TASK_I__IN:
				getIn().clear();
				return;
			case WorkflowPackage.TASK_I__OUT:
				getOut().clear();
				return;
			case WorkflowPackage.TASK_I__START:
				getStart().clear();
				return;
			case WorkflowPackage.TASK_I__FINISH:
				getFinish().clear();
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
			case WorkflowPackage.TASK_I__CORE:
				return core != null;
			case WorkflowPackage.TASK_I__IN:
				return in != null && !in.isEmpty();
			case WorkflowPackage.TASK_I__OUT:
				return out != null && !out.isEmpty();
			case WorkflowPackage.TASK_I__START:
				return start != null && !start.isEmpty();
			case WorkflowPackage.TASK_I__FINISH:
				return finish != null && !finish.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TaskIImpl
