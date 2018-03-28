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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import emf.bankingsystem.ATMController;
import emf.bankingsystem.BankNote;
import emf.bankingsystem.BankingsystemPackage;
import emf.bankingsystem.HW;
import emf.bankingsystem.PhysicalBankCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>HW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link emf.bankingsystem.impl.HWImpl#getInserted <em>Inserted</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.HWImpl#getHeld <em>Held</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.HWImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.HWImpl#getReady <em>Ready</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.HWImpl#getController <em>Controller</em>}</li>
 *   <li>{@link emf.bankingsystem.impl.HWImpl#getShow <em>Show</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HWImpl extends ComponentImpl implements HW {
	/**
	 * The cached value of the '{@link #getInserted() <em>Inserted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInserted()
	 * @generated
	 * @ordered
	 */
	protected PhysicalBankCard inserted;

	/**
	 * The cached value of the '{@link #getHeld() <em>Held</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeld()
	 * @generated
	 * @ordered
	 */
	protected EList<PhysicalBankCard> held;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected EList<BankNote> notes;

	/**
	 * The cached value of the '{@link #getReady() <em>Ready</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReady()
	 * @generated
	 * @ordered
	 */
	protected EList<BankNote> ready;

	/**
	 * The cached value of the '{@link #getController() <em>Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getController()
	 * @generated
	 * @ordered
	 */
	protected ATMController controller;

	/**
	 * The cached value of the '{@link #getShow() <em>Show</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected PhysicalBankCard show;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HWImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankingsystemPackage.Literals.HW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBankCard getInserted() {
		return inserted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInserted(PhysicalBankCard newInserted, NotificationChain msgs) {
		PhysicalBankCard oldInserted = inserted;
		inserted = newInserted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.HW__INSERTED, oldInserted, newInserted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInserted(PhysicalBankCard newInserted) {
		if (newInserted != inserted) {
			NotificationChain msgs = null;
			if (inserted != null)
				msgs = ((InternalEObject)inserted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BankingsystemPackage.HW__INSERTED, null, msgs);
			if (newInserted != null)
				msgs = ((InternalEObject)newInserted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BankingsystemPackage.HW__INSERTED, null, msgs);
			msgs = basicSetInserted(newInserted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.HW__INSERTED, newInserted, newInserted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhysicalBankCard> getHeld() {
		if (held == null) {
			held = new EObjectContainmentEList<PhysicalBankCard>(PhysicalBankCard.class, this, BankingsystemPackage.HW__HELD);
		}
		return held;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankNote> getNotes() {
		if (notes == null) {
			notes = new EObjectContainmentEList<BankNote>(BankNote.class, this, BankingsystemPackage.HW__NOTES);
		}
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BankNote> getReady() {
		if (ready == null) {
			ready = new EObjectContainmentEList<BankNote>(BankNote.class, this, BankingsystemPackage.HW__READY);
		}
		return ready;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATMController getController() {
		if (controller != null && controller.eIsProxy()) {
			InternalEObject oldController = (InternalEObject)controller;
			controller = (ATMController)eResolveProxy(oldController);
			if (controller != oldController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BankingsystemPackage.HW__CONTROLLER, oldController, controller));
			}
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATMController basicGetController() {
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(ATMController newController, NotificationChain msgs) {
		ATMController oldController = controller;
		controller = newController;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.HW__CONTROLLER, oldController, newController);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(ATMController newController) {
		if (newController != controller) {
			NotificationChain msgs = null;
			if (controller != null)
				msgs = ((InternalEObject)controller).eInverseRemove(this, BankingsystemPackage.ATM_CONTROLLER__HW, ATMController.class, msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, BankingsystemPackage.ATM_CONTROLLER__HW, ATMController.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.HW__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalBankCard getShow() {
		return show;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShow(PhysicalBankCard newShow, NotificationChain msgs) {
		PhysicalBankCard oldShow = show;
		show = newShow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BankingsystemPackage.HW__SHOW, oldShow, newShow);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShow(PhysicalBankCard newShow) {
		if (newShow != show) {
			NotificationChain msgs = null;
			if (show != null)
				msgs = ((InternalEObject)show).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BankingsystemPackage.HW__SHOW, null, msgs);
			if (newShow != null)
				msgs = ((InternalEObject)newShow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BankingsystemPackage.HW__SHOW, null, msgs);
			msgs = basicSetShow(newShow, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BankingsystemPackage.HW__SHOW, newShow, newShow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankingsystemPackage.HW__CONTROLLER:
				if (controller != null)
					msgs = ((InternalEObject)controller).eInverseRemove(this, BankingsystemPackage.ATM_CONTROLLER__HW, ATMController.class, msgs);
				return basicSetController((ATMController)otherEnd, msgs);
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
			case BankingsystemPackage.HW__INSERTED:
				return basicSetInserted(null, msgs);
			case BankingsystemPackage.HW__HELD:
				return ((InternalEList<?>)getHeld()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.HW__NOTES:
				return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.HW__READY:
				return ((InternalEList<?>)getReady()).basicRemove(otherEnd, msgs);
			case BankingsystemPackage.HW__CONTROLLER:
				return basicSetController(null, msgs);
			case BankingsystemPackage.HW__SHOW:
				return basicSetShow(null, msgs);
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
			case BankingsystemPackage.HW__INSERTED:
				return getInserted();
			case BankingsystemPackage.HW__HELD:
				return getHeld();
			case BankingsystemPackage.HW__NOTES:
				return getNotes();
			case BankingsystemPackage.HW__READY:
				return getReady();
			case BankingsystemPackage.HW__CONTROLLER:
				if (resolve) return getController();
				return basicGetController();
			case BankingsystemPackage.HW__SHOW:
				return getShow();
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
			case BankingsystemPackage.HW__INSERTED:
				setInserted((PhysicalBankCard)newValue);
				return;
			case BankingsystemPackage.HW__HELD:
				getHeld().clear();
				getHeld().addAll((Collection<? extends PhysicalBankCard>)newValue);
				return;
			case BankingsystemPackage.HW__NOTES:
				getNotes().clear();
				getNotes().addAll((Collection<? extends BankNote>)newValue);
				return;
			case BankingsystemPackage.HW__READY:
				getReady().clear();
				getReady().addAll((Collection<? extends BankNote>)newValue);
				return;
			case BankingsystemPackage.HW__CONTROLLER:
				setController((ATMController)newValue);
				return;
			case BankingsystemPackage.HW__SHOW:
				setShow((PhysicalBankCard)newValue);
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
			case BankingsystemPackage.HW__INSERTED:
				setInserted((PhysicalBankCard)null);
				return;
			case BankingsystemPackage.HW__HELD:
				getHeld().clear();
				return;
			case BankingsystemPackage.HW__NOTES:
				getNotes().clear();
				return;
			case BankingsystemPackage.HW__READY:
				getReady().clear();
				return;
			case BankingsystemPackage.HW__CONTROLLER:
				setController((ATMController)null);
				return;
			case BankingsystemPackage.HW__SHOW:
				setShow((PhysicalBankCard)null);
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
			case BankingsystemPackage.HW__INSERTED:
				return inserted != null;
			case BankingsystemPackage.HW__HELD:
				return held != null && !held.isEmpty();
			case BankingsystemPackage.HW__NOTES:
				return notes != null && !notes.isEmpty();
			case BankingsystemPackage.HW__READY:
				return ready != null && !ready.isEmpty();
			case BankingsystemPackage.HW__CONTROLLER:
				return controller != null;
			case BankingsystemPackage.HW__SHOW:
				return show != null;
		}
		return super.eIsSet(featureID);
	}

} //HWImpl
