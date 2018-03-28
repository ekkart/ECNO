/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.impl;

import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUses;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Uses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUsesImpl#getEventuse <em>Eventuse</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUsesImpl#isDropParent <em>Drop Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventUsesImpl extends EObjectImpl implements EventUses {
	/**
	 * The cached value of the '{@link #getEventuse() <em>Eventuse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventuse()
	 * @generated
	 * @ordered
	 */
	protected EList<EventUse> eventuse;

	/**
	 * The default value of the '{@link #isDropParent() <em>Drop Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropParent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DROP_PARENT_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDropParent() <em>Drop Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropParent()
	 * @generated
	 * @ordered
	 */
	protected boolean dropParent = DROP_PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventUsesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EcnonetsPackage.Literals.EVENT_USES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventUse> getEventuse() {
		if (eventuse == null) {
			eventuse = new EObjectContainmentEList<EventUse>(EventUse.class, this, EcnonetsPackage.EVENT_USES__EVENTUSE);
		}
		return eventuse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDropParent() {
		return dropParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropParent(boolean newDropParent) {
		boolean oldDropParent = dropParent;
		dropParent = newDropParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EcnonetsPackage.EVENT_USES__DROP_PARENT, oldDropParent, dropParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EcnonetsPackage.EVENT_USES__EVENTUSE:
				return ((InternalEList<?>)getEventuse()).basicRemove(otherEnd, msgs);
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
			case EcnonetsPackage.EVENT_USES__EVENTUSE:
				return getEventuse();
			case EcnonetsPackage.EVENT_USES__DROP_PARENT:
				return isDropParent();
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
			case EcnonetsPackage.EVENT_USES__EVENTUSE:
				getEventuse().clear();
				getEventuse().addAll((Collection<? extends EventUse>)newValue);
				return;
			case EcnonetsPackage.EVENT_USES__DROP_PARENT:
				setDropParent((Boolean)newValue);
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
			case EcnonetsPackage.EVENT_USES__EVENTUSE:
				getEventuse().clear();
				return;
			case EcnonetsPackage.EVENT_USES__DROP_PARENT:
				setDropParent(DROP_PARENT_EDEFAULT);
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
			case EcnonetsPackage.EVENT_USES__EVENTUSE:
				return eventuse != null && !eventuse.isEmpty();
			case EcnonetsPackage.EVENT_USES__DROP_PARENT:
				return dropParent != DROP_PARENT_EDEFAULT;
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
		result.append(" (dropParent: ");
		result.append(dropParent);
		result.append(')');
		return result.toString();
	}

} //EventUsesImpl
