/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.impl;

import dk.dtu.imm.se.ecno.pn.ecnonets.Action;
import dk.dtu.imm.se.ecno.pn.ecnonets.Condition;
import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding;
import dk.dtu.imm.se.ecno.pn.ecnonets.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl#getEventbinding <em>Eventbinding</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends org.pnml.tools.epnk.pnmlcoremodel.impl.TransitionImpl implements Transition {
	/**
	 * The cached value of the '{@link #getEventbinding() <em>Eventbinding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventbinding()
	 * @generated
	 * @ordered
	 */
	protected EventBinding eventbinding;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnonetsPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBinding getEventbinding() {
		return eventbinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventbinding(EventBinding newEventbinding, NotificationChain msgs) {
		EventBinding oldEventbinding = eventbinding;
		eventbinding = newEventbinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcnonetsPackage.TRANSITION__EVENTBINDING, oldEventbinding, newEventbinding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventbinding(EventBinding newEventbinding) {
		if (newEventbinding != eventbinding) {
			NotificationChain msgs = null;
			if (eventbinding != null)
				msgs = ((InternalEObject)eventbinding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcnonetsPackage.TRANSITION__EVENTBINDING, null, msgs);
			if (newEventbinding != null)
				msgs = ((InternalEObject)newEventbinding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcnonetsPackage.TRANSITION__EVENTBINDING, null, msgs);
			msgs = basicSetEventbinding(newEventbinding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnonetsPackage.TRANSITION__EVENTBINDING, newEventbinding, newEventbinding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcnonetsPackage.TRANSITION__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcnonetsPackage.TRANSITION__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcnonetsPackage.TRANSITION__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnonetsPackage.TRANSITION__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcnonetsPackage.TRANSITION__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcnonetsPackage.TRANSITION__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcnonetsPackage.TRANSITION__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnonetsPackage.TRANSITION__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnonetsPackage.TRANSITION__EVENTBINDING:
				return basicSetEventbinding(null, msgs);
			case EcnonetsPackage.TRANSITION__CONDITION:
				return basicSetCondition(null, msgs);
			case EcnonetsPackage.TRANSITION__ACTION:
				return basicSetAction(null, msgs);
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
			case EcnonetsPackage.TRANSITION__EVENTBINDING:
				return getEventbinding();
			case EcnonetsPackage.TRANSITION__CONDITION:
				return getCondition();
			case EcnonetsPackage.TRANSITION__ACTION:
				return getAction();
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
			case EcnonetsPackage.TRANSITION__EVENTBINDING:
				setEventbinding((EventBinding)newValue);
				return;
			case EcnonetsPackage.TRANSITION__CONDITION:
				setCondition((Condition)newValue);
				return;
			case EcnonetsPackage.TRANSITION__ACTION:
				setAction((Action)newValue);
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
			case EcnonetsPackage.TRANSITION__EVENTBINDING:
				setEventbinding((EventBinding)null);
				return;
			case EcnonetsPackage.TRANSITION__CONDITION:
				setCondition((Condition)null);
				return;
			case EcnonetsPackage.TRANSITION__ACTION:
				setAction((Action)null);
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
			case EcnonetsPackage.TRANSITION__EVENTBINDING:
				return eventbinding != null;
			case EcnonetsPackage.TRANSITION__CONDITION:
				return condition != null;
			case EcnonetsPackage.TRANSITION__ACTION:
				return action != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
