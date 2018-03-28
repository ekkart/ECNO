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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dk.dtu.compute.se.emf.processalgebra.Action;
import dk.dtu.compute.se.emf.processalgebra.ActionDef;
import dk.dtu.compute.se.emf.processalgebra.ActionInst;
import dk.dtu.compute.se.emf.processalgebra.ProcessInstance;
import dk.dtu.compute.se.emf.processalgebra.ProcessalgebraPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl#isBar <em>Bar</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link dk.dtu.compute.se.emf.processalgebra.impl.ActionImpl#getInstances <em>Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends ProcessImpl implements Action {
	/**
	 * The default value of the '{@link #isBar() <em>Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBar()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBar() <em>Bar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBar()
	 * @generated
	 * @ordered
	 */
	protected boolean bar = BAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionDef action;

	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionInst> instances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProcessalgebraPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBar() {
		return bar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBar(boolean newBar) {
		boolean oldBar = bar;
		bar = newBar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.ACTION__BAR, oldBar, bar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDef getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject)action;
			action = (ActionDef)eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessalgebraPackage.ACTION__ACTION, oldAction, action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionDef basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(ActionDef newAction, NotificationChain msgs) {
		ActionDef oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.ACTION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionDef newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, ProcessalgebraPackage.ACTION_DEF__USES, ActionDef.class, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, ProcessalgebraPackage.ACTION_DEF__USES, ActionDef.class, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessalgebraPackage.ACTION__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionInst> getInstances() {
		if (instances == null) {
			instances = new EObjectWithInverseResolvingEList<ActionInst>(ActionInst.class, this, ProcessalgebraPackage.ACTION__INSTANCES, ProcessalgebraPackage.ACTION_INST__ACTION);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessInstance createInstance() {
		ActionInst instance = dk.dtu.compute.se.emf.processalgebra.ProcessalgebraFactory.eINSTANCE.createActionInst();
		instance.setAction(this);
		return instance;
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
			case ProcessalgebraPackage.ACTION__ACTION:
				if (action != null)
					msgs = ((InternalEObject)action).eInverseRemove(this, ProcessalgebraPackage.ACTION_DEF__USES, ActionDef.class, msgs);
				return basicSetAction((ActionDef)otherEnd, msgs);
			case ProcessalgebraPackage.ACTION__INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInstances()).basicAdd(otherEnd, msgs);
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
			case ProcessalgebraPackage.ACTION__ACTION:
				return basicSetAction(null, msgs);
			case ProcessalgebraPackage.ACTION__INSTANCES:
				return ((InternalEList<?>)getInstances()).basicRemove(otherEnd, msgs);
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
			case ProcessalgebraPackage.ACTION__BAR:
				return isBar();
			case ProcessalgebraPackage.ACTION__ACTION:
				if (resolve) return getAction();
				return basicGetAction();
			case ProcessalgebraPackage.ACTION__INSTANCES:
				return getInstances();
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
			case ProcessalgebraPackage.ACTION__BAR:
				setBar((Boolean)newValue);
				return;
			case ProcessalgebraPackage.ACTION__ACTION:
				setAction((ActionDef)newValue);
				return;
			case ProcessalgebraPackage.ACTION__INSTANCES:
				getInstances().clear();
				getInstances().addAll((Collection<? extends ActionInst>)newValue);
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
			case ProcessalgebraPackage.ACTION__BAR:
				setBar(BAR_EDEFAULT);
				return;
			case ProcessalgebraPackage.ACTION__ACTION:
				setAction((ActionDef)null);
				return;
			case ProcessalgebraPackage.ACTION__INSTANCES:
				getInstances().clear();
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
			case ProcessalgebraPackage.ACTION__BAR:
				return bar != BAR_EDEFAULT;
			case ProcessalgebraPackage.ACTION__ACTION:
				return action != null;
			case ProcessalgebraPackage.ACTION__INSTANCES:
				return instances != null && !instances.isEmpty();
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
		result.append(" (bar: ");
		result.append(bar);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
