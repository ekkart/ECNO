/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.emf.example.workers.impl;

import dk.dtu.imm.se.emf.example.workers.Car;
import dk.dtu.imm.se.emf.example.workers.Job;
import dk.dtu.imm.se.emf.example.workers.Worker;
import dk.dtu.imm.se.emf.example.workers.WorkersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl#getName <em>Name</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl#getCar <em>Car</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl#getAssigned <em>Assigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkerImpl extends EObjectImpl implements Worker {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected Car car;

	/**
	 * The cached value of the '{@link #getAssigned() <em>Assigned</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssigned()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> assigned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkersPackage.Literals.WORKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkersPackage.WORKER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCar(Car newCar, NotificationChain msgs) {
		Car oldCar = car;
		car = newCar;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WorkersPackage.WORKER__CAR, oldCar, newCar);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCar(Car newCar) {
		if (newCar != car) {
			NotificationChain msgs = null;
			if (car != null)
				msgs = ((InternalEObject)car).eInverseRemove(this, WorkersPackage.CAR__PASSENGER, Car.class, msgs);
			if (newCar != null)
				msgs = ((InternalEObject)newCar).eInverseAdd(this, WorkersPackage.CAR__PASSENGER, Car.class, msgs);
			msgs = basicSetCar(newCar, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkersPackage.WORKER__CAR, newCar, newCar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getAssigned() {
		if (assigned == null) {
			assigned = new EObjectWithInverseEList.ManyInverse<Job>(Job.class, this, WorkersPackage.WORKER__ASSIGNED, WorkersPackage.JOB__NEEDED);
		}
		return assigned;
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
			case WorkersPackage.WORKER__CAR:
				if (car != null)
					msgs = ((InternalEObject)car).eInverseRemove(this, WorkersPackage.CAR__PASSENGER, Car.class, msgs);
				return basicSetCar((Car)otherEnd, msgs);
			case WorkersPackage.WORKER__ASSIGNED:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAssigned()).basicAdd(otherEnd, msgs);
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
			case WorkersPackage.WORKER__CAR:
				return basicSetCar(null, msgs);
			case WorkersPackage.WORKER__ASSIGNED:
				return ((InternalEList<?>)getAssigned()).basicRemove(otherEnd, msgs);
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
			case WorkersPackage.WORKER__NAME:
				return getName();
			case WorkersPackage.WORKER__CAR:
				return getCar();
			case WorkersPackage.WORKER__ASSIGNED:
				return getAssigned();
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
			case WorkersPackage.WORKER__NAME:
				setName((String)newValue);
				return;
			case WorkersPackage.WORKER__CAR:
				setCar((Car)newValue);
				return;
			case WorkersPackage.WORKER__ASSIGNED:
				getAssigned().clear();
				getAssigned().addAll((Collection<? extends Job>)newValue);
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
			case WorkersPackage.WORKER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WorkersPackage.WORKER__CAR:
				setCar((Car)null);
				return;
			case WorkersPackage.WORKER__ASSIGNED:
				getAssigned().clear();
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
			case WorkersPackage.WORKER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WorkersPackage.WORKER__CAR:
				return car != null;
			case WorkersPackage.WORKER__ASSIGNED:
				return assigned != null && !assigned.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //WorkerImpl
