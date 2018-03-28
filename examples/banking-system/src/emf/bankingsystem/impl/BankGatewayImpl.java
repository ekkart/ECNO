/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package emf.bankingsystem.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.bankingsystem.ATMController;
import emf.bankingsystem.AccountMngr;
import emf.bankingsystem.BankGateway;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.SwiftNetwork;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.BankGatewayImpl#getATMs <em>AT Ms</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.BankGatewayImpl#getAccountMngrs <em>Account Mngrs</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.BankGatewayImpl#getSwift <em>Swift</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BankGatewayImpl extends ComponentImpl implements BankGateway {
	/**
	 * The cached value of the '{@link #getATMs() <em>AT Ms</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATMs()
	 * @generated
	 * @ordered
	 */
	protected EList<ATMController> atMs;

	/**
	 * The cached value of the '{@link #getAccountMngrs() <em>Account Mngrs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccountMngrs()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountMngr> accountMngrs;

	/**
	 * The cached value of the '{@link #getSwift() <em>Swift</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwift()
	 * @generated
	 * @ordered
	 */
	protected SwiftNetwork swift;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.BANK_GATEWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ATMController> getATMs() {
		if (atMs == null) {
			atMs = new EObjectWithInverseResolvingEList<ATMController>(ATMController.class, this, BankingsystemPackage.BANK_GATEWAY__AT_MS, BankingsystemPackage.ATM_CONTROLLER__GATEWAY);
		}
		return atMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccountMngr> getAccountMngrs() {
		if (accountMngrs == null) {
			accountMngrs = new EObjectWithInverseResolvingEList<AccountMngr>(AccountMngr.class, this, BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS, BankingsystemPackage.ACCOUNT_MNGR__GATEWAY);
		}
		return accountMngrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiftNetwork getSwift() {
		if (swift != null && swift.eIsProxy()) {
			InternalEObject oldSwift = (InternalEObject)swift;
			swift = (SwiftNetwork)eResolveProxy(oldSwift);
			if (swift != oldSwift) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.BANK_GATEWAY__SWIFT, oldSwift, swift));
			}
		}
		return swift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwiftNetwork basicGetSwift() {
		return swift;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwift(SwiftNetwork newSwift, NotificationChain msgs) {
		SwiftNetwork oldSwift = swift;
		swift = newSwift;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.BANK_GATEWAY__SWIFT, oldSwift, newSwift);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwift(SwiftNetwork newSwift) {
		if (newSwift != swift) {
			NotificationChain msgs = null;
			if (swift != null)
				msgs = ((InternalEObject)swift).eInverseRemove(this, BankingsystemPackage.SWIFT_NETWORK__GATEWAYS, SwiftNetwork.class, msgs);
			if (newSwift != null)
				msgs = ((InternalEObject)newSwift).eInverseAdd(this, BankingsystemPackage.SWIFT_NETWORK__GATEWAYS, SwiftNetwork.class, msgs);
			msgs = basicSetSwift(newSwift, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.BANK_GATEWAY__SWIFT, newSwift, newSwift));
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
			case BankingsystemPackage.BANK_GATEWAY__AT_MS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getATMs()).basicAdd(otherEnd, msgs);
			case BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccountMngrs()).basicAdd(otherEnd, msgs);
			case BankingsystemPackage.BANK_GATEWAY__SWIFT:
				if (swift != null)
					msgs = ((InternalEObject)swift).eInverseRemove(this, BankingsystemPackage.SWIFT_NETWORK__GATEWAYS, SwiftNetwork.class, msgs);
				return basicSetSwift((SwiftNetwork)otherEnd, msgs);
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
			case BankingsystemPackage.BANK_GATEWAY__AT_MS:
				return ((InternalEList<?>)getATMs()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS:
				return ((InternalEList<?>)getAccountMngrs()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.BANK_GATEWAY__SWIFT:
				return basicSetSwift(null, msgs);
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
			case BankingsystemPackage.BANK_GATEWAY__AT_MS:
				return getATMs();
			case BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS:
				return getAccountMngrs();
			case BankingsystemPackage.BANK_GATEWAY__SWIFT:
				if (resolve) return getSwift();
				return basicGetSwift();
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
			case BankingsystemPackage.BANK_GATEWAY__AT_MS:
				getATMs().clear();
				getATMs().addAll((Collection<? extends ATMController>)newValue);
				return;
			case BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS:
				getAccountMngrs().clear();
				getAccountMngrs().addAll((Collection<? extends AccountMngr>)newValue);
				return;
			case BankingsystemPackage.BANK_GATEWAY__SWIFT:
				setSwift((SwiftNetwork)newValue);
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
			case BankingsystemPackage.BANK_GATEWAY__AT_MS:
				getATMs().clear();
				return;
			case BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS:
				getAccountMngrs().clear();
				return;
			case BankingsystemPackage.BANK_GATEWAY__SWIFT:
				setSwift((SwiftNetwork)null);
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
			case BankingsystemPackage.BANK_GATEWAY__AT_MS:
				return atMs != null && !atMs.isEmpty();
			case BankingsystemPackage.BANK_GATEWAY__ACCOUNT_MNGRS:
				return accountMngrs != null && !accountMngrs.isEmpty();
			case BankingsystemPackage.BANK_GATEWAY__SWIFT:
				return swift != null;
		}
		return super.eIsSet(featureID);
	}

} //BankGatewayImpl
