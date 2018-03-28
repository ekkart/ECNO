/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.emf.example.workers.impl;

import dk.dtu.imm.se.emf.example.workers.Car;
import dk.dtu.imm.se.emf.example.workers.Job;
import dk.dtu.imm.se.emf.example.workers.Setting;
import dk.dtu.imm.se.emf.example.workers.Worker;
import dk.dtu.imm.se.emf.example.workers.WorkersPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Setting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.impl.SettingImpl#getCar <em>Car</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.impl.SettingImpl#getWorker <em>Worker</em>}</li>
 *   <li>{@link dk.dtu.imm.se.emf.example.workers.impl.SettingImpl#getJob <em>Job</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SettingImpl extends EObjectImpl implements Setting {
	/**
	 * The cached value of the '{@link #getCar() <em>Car</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCar()
	 * @generated
	 * @ordered
	 */
	protected EList<Car> car;

	/**
	 * The cached value of the '{@link #getWorker() <em>Worker</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorker()
	 * @generated
	 * @ordered
	 */
	protected EList<Worker> worker;

	/**
	 * The cached value of the '{@link #getJob() <em>Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJob()
	 * @generated
	 * @ordered
	 */
	protected EList<Job> job;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SettingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkersPackage.Literals.SETTING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Car> getCar() {
		if (car == null) {
			car = new EObjectContainmentEList<Car>(Car.class, this, WorkersPackage.SETTING__CAR);
		}
		return car;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Worker> getWorker() {
		if (worker == null) {
			worker = new EObjectContainmentEList<Worker>(Worker.class, this, WorkersPackage.SETTING__WORKER);
		}
		return worker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Job> getJob() {
		if (job == null) {
			job = new EObjectContainmentEList<Job>(Job.class, this, WorkersPackage.SETTING__JOB);
		}
		return job;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WorkersPackage.SETTING__CAR:
				return ((InternalEList<?>)getCar()).basicRemove(otherEnd, msgs);
			case WorkersPackage.SETTING__WORKER:
				return ((InternalEList<?>)getWorker()).basicRemove(otherEnd, msgs);
			case WorkersPackage.SETTING__JOB:
				return ((InternalEList<?>)getJob()).basicRemove(otherEnd, msgs);
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
			case WorkersPackage.SETTING__CAR:
				return getCar();
			case WorkersPackage.SETTING__WORKER:
				return getWorker();
			case WorkersPackage.SETTING__JOB:
				return getJob();
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
			case WorkersPackage.SETTING__CAR:
				getCar().clear();
				getCar().addAll((Collection<? extends Car>)newValue);
				return;
			case WorkersPackage.SETTING__WORKER:
				getWorker().clear();
				getWorker().addAll((Collection<? extends Worker>)newValue);
				return;
			case WorkersPackage.SETTING__JOB:
				getJob().clear();
				getJob().addAll((Collection<? extends Job>)newValue);
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
			case WorkersPackage.SETTING__CAR:
				getCar().clear();
				return;
			case WorkersPackage.SETTING__WORKER:
				getWorker().clear();
				return;
			case WorkersPackage.SETTING__JOB:
				getJob().clear();
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
			case WorkersPackage.SETTING__CAR:
				return car != null && !car.isEmpty();
			case WorkersPackage.SETTING__WORKER:
				return worker != null && !worker.isEmpty();
			case WorkersPackage.SETTING__JOB:
				return job != null && !job.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SettingImpl
