/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import emf.bankingsystem.ATMController;
import emf.bankingsystem.BankGateway;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.HW;
import emf.bankingsystem.Session;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATM Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.ATMControllerImpl#getHw <em>Hw</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.ATMControllerImpl#getGateway <em>Gateway</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.ATMControllerImpl#getSession <em>Session</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATMControllerImpl extends ComponentImpl implements ATMController {
	/**
	 * The cached value of the '{@link #getHw() <em>Hw</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHw()
	 * @generated
	 * @ordered
	 */
	protected HW hw;

	/**
	 * The cached value of the '{@link #getGateway() <em>Gateway</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGateway()
	 * @generated
	 * @ordered
	 */
	protected BankGateway gateway;

	/**
	 * The cached value of the '{@link #getSession() <em>Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSession()
	 * @generated
	 * @ordered
	 */
	protected Session session;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATMControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.ATM_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HW getHw() {
		if (hw != null && hw.eIsProxy()) {
			InternalEObject oldHw = (InternalEObject)hw;
			hw = (HW)eResolveProxy(oldHw);
			if (hw != oldHw) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.ATM_CONTROLLER__HW, oldHw, hw));
			}
		}
		return hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HW basicGetHw() {
		return hw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHw(HW newHw, NotificationChain msgs) {
		HW oldHw = hw;
		hw = newHw;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ATM_CONTROLLER__HW, oldHw, newHw);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHw(HW newHw) {
		if (newHw != hw) {
			NotificationChain msgs = null;
			if (hw != null)
				msgs = ((InternalEObject)hw).eInverseRemove(this, BankingsystemPackage.HW__CONTROLLER, HW.class, msgs);
			if (newHw != null)
				msgs = ((InternalEObject)newHw).eInverseAdd(this, BankingsystemPackage.HW__CONTROLLER, HW.class, msgs);
			msgs = basicSetHw(newHw, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ATM_CONTROLLER__HW, newHw, newHw));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankGateway getGateway() {
		if (gateway != null && gateway.eIsProxy()) {
			InternalEObject oldGateway = (InternalEObject)gateway;
			gateway = (BankGateway)eResolveProxy(oldGateway);
			if (gateway != oldGateway) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.ATM_CONTROLLER__GATEWAY, oldGateway, gateway));
			}
		}
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankGateway basicGetGateway() {
		return gateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGateway(BankGateway newGateway, NotificationChain msgs) {
		BankGateway oldGateway = gateway;
		gateway = newGateway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ATM_CONTROLLER__GATEWAY, oldGateway, newGateway);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGateway(BankGateway newGateway) {
		if (newGateway != gateway) {
			NotificationChain msgs = null;
			if (gateway != null)
				msgs = ((InternalEObject)gateway).eInverseRemove(this, BankingsystemPackage.BANK_GATEWAY__AT_MS, BankGateway.class, msgs);
			if (newGateway != null)
				msgs = ((InternalEObject)newGateway).eInverseAdd(this, BankingsystemPackage.BANK_GATEWAY__AT_MS, BankGateway.class, msgs);
			msgs = basicSetGateway(newGateway, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ATM_CONTROLLER__GATEWAY, newGateway, newGateway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session getSession() {
		if (session != null && session.eIsProxy()) {
			InternalEObject oldSession = (InternalEObject)session;
			session = (Session)eResolveProxy(oldSession);
			if (session != oldSession) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.ATM_CONTROLLER__SESSION, oldSession, session));
			}
		}
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Session basicGetSession() {
		return session;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSession(Session newSession) {
		Session oldSession = session;
		session = newSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.ATM_CONTROLLER__SESSION, oldSession, session));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankingsystemPackage.ATM_CONTROLLER__HW:
				if (hw != null)
					msgs = ((InternalEObject)hw).eInverseRemove(this, BankingsystemPackage.HW__CONTROLLER, HW.class, msgs);
				return basicSetHw((HW)otherEnd, msgs);
			case BankingsystemPackage.ATM_CONTROLLER__GATEWAY:
				if (gateway != null)
					msgs = ((InternalEObject)gateway).eInverseRemove(this, BankingsystemPackage.BANK_GATEWAY__AT_MS, BankGateway.class, msgs);
				return basicSetGateway((BankGateway)otherEnd, msgs);
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
			case BankingsystemPackage.ATM_CONTROLLER__HW:
				return basicSetHw(null, msgs);
			case BankingsystemPackage.ATM_CONTROLLER__GATEWAY:
				return basicSetGateway(null, msgs);
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
			case BankingsystemPackage.ATM_CONTROLLER__HW:
				if (resolve) return getHw();
				return basicGetHw();
			case BankingsystemPackage.ATM_CONTROLLER__GATEWAY:
				if (resolve) return getGateway();
				return basicGetGateway();
			case BankingsystemPackage.ATM_CONTROLLER__SESSION:
				if (resolve) return getSession();
				return basicGetSession();
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
			case BankingsystemPackage.ATM_CONTROLLER__HW:
				setHw((HW)newValue);
				return;
			case BankingsystemPackage.ATM_CONTROLLER__GATEWAY:
				setGateway((BankGateway)newValue);
				return;
			case BankingsystemPackage.ATM_CONTROLLER__SESSION:
				setSession((Session)newValue);
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
			case BankingsystemPackage.ATM_CONTROLLER__HW:
				setHw((HW)null);
				return;
			case BankingsystemPackage.ATM_CONTROLLER__GATEWAY:
				setGateway((BankGateway)null);
				return;
			case BankingsystemPackage.ATM_CONTROLLER__SESSION:
				setSession((Session)null);
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
			case BankingsystemPackage.ATM_CONTROLLER__HW:
				return hw != null;
			case BankingsystemPackage.ATM_CONTROLLER__GATEWAY:
				return gateway != null;
			case BankingsystemPackage.ATM_CONTROLLER__SESSION:
				return session != null;
		}
		return super.eIsSet(featureID);
	}

} //ATMControllerImpl
