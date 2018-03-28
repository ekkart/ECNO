/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachine.impl;

import example.emf.vendingmachine.Coin;
import example.emf.vendingmachine.Safe;
import example.emf.vendingmachine.Slot;
import example.emf.vendingmachine.VendingmachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.impl.SlotImpl#getCoin <em>Coin</em>}</li>
 *   <li>{@link example.emf.vendingmachine.impl.SlotImpl#getSafe <em>Safe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SlotImpl extends VendingMachineComponentImpl implements Slot {
	/**
	 * The cached value of the '{@link #getCoin() <em>Coin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoin()
	 * @generated
	 * @ordered
	 */
	protected EList<Coin> coin;

	/**
	 * The cached value of the '{@link #getSafe() <em>Safe</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafe()
	 * @generated
	 * @ordered
	 */
	protected Safe safe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingmachinePackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Coin> getCoin() {
		if (coin == null) {
			coin = new EObjectResolvingEList<Coin>(Coin.class, this, VendingmachinePackage.SLOT__COIN);
		}
		return coin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safe getSafe() {
		if (safe != null && safe.eIsProxy()) {
			InternalEObject oldSafe = (InternalEObject)safe;
			safe = (Safe)eResolveProxy(oldSafe);
			if (safe != oldSafe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VendingmachinePackage.SLOT__SAFE, oldSafe, safe));
			}
		}
		return safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Safe basicGetSafe() {
		return safe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafe(Safe newSafe) {
		Safe oldSafe = safe;
		safe = newSafe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VendingmachinePackage.SLOT__SAFE, oldSafe, safe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VendingmachinePackage.SLOT__COIN:
				return getCoin();
			case VendingmachinePackage.SLOT__SAFE:
				if (resolve) return getSafe();
				return basicGetSafe();
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
			case VendingmachinePackage.SLOT__COIN:
				getCoin().clear();
				getCoin().addAll((Collection<? extends Coin>)newValue);
				return;
			case VendingmachinePackage.SLOT__SAFE:
				setSafe((Safe)newValue);
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
			case VendingmachinePackage.SLOT__COIN:
				getCoin().clear();
				return;
			case VendingmachinePackage.SLOT__SAFE:
				setSafe((Safe)null);
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
			case VendingmachinePackage.SLOT__COIN:
				return coin != null && !coin.isEmpty();
			case VendingmachinePackage.SLOT__SAFE:
				return safe != null;
		}
		return super.eIsSet(featureID);
	}

} //SlotImpl
