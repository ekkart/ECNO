/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package example.emf.vendingmachine.impl;

import example.emf.vendingmachine.Brewer;
import example.emf.vendingmachine.Control;
import example.emf.vendingmachine.Slot;
import example.emf.vendingmachine.VendingmachinePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link example.emf.vendingmachine.impl.ControlImpl#getSlot <em>Slot</em>}</li>
 *   <li>{@link example.emf.vendingmachine.impl.ControlImpl#getBrewer <em>Brewer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlImpl extends VendingMachineComponentImpl implements Control {
	/**
	 * The cached value of the '{@link #getSlot() <em>Slot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlot()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slot;

	/**
	 * The cached value of the '{@link #getBrewer() <em>Brewer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrewer()
	 * @generated
	 * @ordered
	 */
	protected EList<Brewer> brewer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VendingmachinePackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slot> getSlot() {
		if (slot == null) {
			slot = new EObjectResolvingEList<Slot>(Slot.class, this, VendingmachinePackage.CONTROL__SLOT);
		}
		return slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Brewer> getBrewer() {
		if (brewer == null) {
			brewer = new EObjectWithInverseResolvingEList<Brewer>(Brewer.class, this, VendingmachinePackage.CONTROL__BREWER, VendingmachinePackage.BREWER__CONTROL);
		}
		return brewer;
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
			case VendingmachinePackage.CONTROL__BREWER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBrewer()).basicAdd(otherEnd, msgs);
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
			case VendingmachinePackage.CONTROL__BREWER:
				return ((InternalEList<?>)getBrewer()).basicRemove(otherEnd, msgs);
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
			case VendingmachinePackage.CONTROL__SLOT:
				return getSlot();
			case VendingmachinePackage.CONTROL__BREWER:
				return getBrewer();
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
			case VendingmachinePackage.CONTROL__SLOT:
				getSlot().clear();
				getSlot().addAll((Collection<? extends Slot>)newValue);
				return;
			case VendingmachinePackage.CONTROL__BREWER:
				getBrewer().clear();
				getBrewer().addAll((Collection<? extends Brewer>)newValue);
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
			case VendingmachinePackage.CONTROL__SLOT:
				getSlot().clear();
				return;
			case VendingmachinePackage.CONTROL__BREWER:
				getBrewer().clear();
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
			case VendingmachinePackage.CONTROL__SLOT:
				return slot != null && !slot.isEmpty();
			case VendingmachinePackage.CONTROL__BREWER:
				return brewer != null && !brewer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ControlImpl
