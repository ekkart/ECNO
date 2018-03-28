/**
 */
package dk.dtu.compute.se.emf.processalgebra.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dk.dtu.compute.se.emf.processalgebra.ActionDef;
import dk.dtu.compute.se.emf.processalgebra.Hide;
import dk.dtu.compute.se.emf.processalgebra.ProcessInstance;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hide</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.HideImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.HideImpl#getProcess <em>Process</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HideImpl extends ProcessImpl implements Hide {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionDef> actions;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected dk.dtu.compute.se.emf.processalgebra.Process process;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HideImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.HIDE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionDef> getActions() {
		if (actions == null) {
			actions = new EObjectResolvingEList<ActionDef>(ActionDef.class, this, ProcessalgebraPackage.HIDE__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dk.dtu.compute.se.emf.processalgebra.Process getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcess(dk.dtu.compute.se.emf.processalgebra.Process newProcess, NotificationChain msgs) {
		dk.dtu.compute.se.emf.processalgebra.Process oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.HIDE__PROCESS, oldProcess, newProcess);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcess(dk.dtu.compute.se.emf.processalgebra.Process newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject)process).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessalgebraPackage.HIDE__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject)newProcess).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessalgebraPackage.HIDE__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.HIDE__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createInstance() {
		dk.dtu.compute.se.emf.processalgebra.HideInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createHideInst();
		instance.getActions().addAll(this.getActions());
		instance.getChild().add(this.getProcess().createInstance());			
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProcessalgebraPackage.HIDE__PROCESS:
				return basicSetProcess(null, msgs);
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
			case ProcessalgebraPackage.HIDE__ACTIONS:
				return getActions();
			case ProcessalgebraPackage.HIDE__PROCESS:
				return getProcess();
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
			case ProcessalgebraPackage.HIDE__ACTIONS:
				getActions().clear();
				getActions().addAll((Collection<? extends ActionDef>)newValue);
				return;
			case ProcessalgebraPackage.HIDE__PROCESS:
				setProcess((dk.dtu.compute.se.emf.processalgebra.Process)newValue);
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
			case ProcessalgebraPackage.HIDE__ACTIONS:
				getActions().clear();
				return;
			case ProcessalgebraPackage.HIDE__PROCESS:
				setProcess((dk.dtu.compute.se.emf.processalgebra.Process)null);
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
			case ProcessalgebraPackage.HIDE__ACTIONS:
				return actions != null && !actions.isEmpty();
			case ProcessalgebraPackage.HIDE__PROCESS:
				return process != null;
		}
		return super.eIsSet(featureID);
	}

} //HideImpl
