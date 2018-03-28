/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.emf.example.workers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.emf.example.workers.WorkersFactory
 * @model kind="package"
 * @generated
 */
public interface WorkersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://workers.example.ecno.se.imm.dtu.dk/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WorkersPackage eINSTANCE = dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.emf.example.workers.impl.SettingImpl <em>Setting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.emf.example.workers.impl.SettingImpl
	 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getSetting()
	 * @generated
	 */
	int SETTING = 0;

	/**
	 * The feature id for the '<em><b>Car</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__CAR = 0;

	/**
	 * The feature id for the '<em><b>Worker</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__WORKER = 1;

	/**
	 * The feature id for the '<em><b>Job</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING__JOB = 2;

	/**
	 * The number of structural features of the '<em>Setting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl <em>Worker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl
	 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getWorker()
	 * @generated
	 */
	int WORKER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Car</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__CAR = 1;

	/**
	 * The feature id for the '<em><b>Assigned</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER__ASSIGNED = 2;

	/**
	 * The number of structural features of the '<em>Worker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKER_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.emf.example.workers.impl.JobImpl <em>Job</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.emf.example.workers.impl.JobImpl
	 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getJob()
	 * @generated
	 */
	int JOB = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NAME = 0;

	/**
	 * The feature id for the '<em><b>Needed</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB__NEEDED = 1;

	/**
	 * The number of structural features of the '<em>Job</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOB_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.emf.example.workers.impl.CarImpl <em>Car</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.emf.example.workers.impl.CarImpl
	 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getCar()
	 * @generated
	 */
	int CAR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__NAME = 0;

	/**
	 * The feature id for the '<em><b>Passenger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR__PASSENGER = 1;

	/**
	 * The number of structural features of the '<em>Car</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAR_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.emf.example.workers.Setting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Setting
	 * @generated
	 */
	EClass getSetting();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.emf.example.workers.Setting#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Car</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Setting#getCar()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Car();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.emf.example.workers.Setting#getWorker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Worker</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Setting#getWorker()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Worker();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.emf.example.workers.Setting#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Job</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Setting#getJob()
	 * @see #getSetting()
	 * @generated
	 */
	EReference getSetting_Job();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.emf.example.workers.Worker <em>Worker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Worker</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Worker
	 * @generated
	 */
	EClass getWorker();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.emf.example.workers.Worker#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Worker#getName()
	 * @see #getWorker()
	 * @generated
	 */
	EAttribute getWorker_Name();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.emf.example.workers.Worker#getCar <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Car</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Worker#getCar()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Car();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.emf.example.workers.Worker#getAssigned <em>Assigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assigned</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Worker#getAssigned()
	 * @see #getWorker()
	 * @generated
	 */
	EReference getWorker_Assigned();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.emf.example.workers.Job <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Job</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Job
	 * @generated
	 */
	EClass getJob();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.emf.example.workers.Job#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Job#getName()
	 * @see #getJob()
	 * @generated
	 */
	EAttribute getJob_Name();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.emf.example.workers.Job#getNeeded <em>Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Needed</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Job#getNeeded()
	 * @see #getJob()
	 * @generated
	 */
	EReference getJob_Needed();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.emf.example.workers.Car <em>Car</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Car</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Car
	 * @generated
	 */
	EClass getCar();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.emf.example.workers.Car#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Car#getName()
	 * @see #getCar()
	 * @generated
	 */
	EAttribute getCar_Name();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.emf.example.workers.Car#getPassenger <em>Passenger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passenger</em>'.
	 * @see dk.dtu.imm.se.emf.example.workers.Car#getPassenger()
	 * @see #getCar()
	 * @generated
	 */
	EReference getCar_Passenger();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WorkersFactory getWorkersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.emf.example.workers.impl.SettingImpl <em>Setting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.emf.example.workers.impl.SettingImpl
		 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getSetting()
		 * @generated
		 */
		EClass SETTING = eINSTANCE.getSetting();

		/**
		 * The meta object literal for the '<em><b>Car</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__CAR = eINSTANCE.getSetting_Car();

		/**
		 * The meta object literal for the '<em><b>Worker</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__WORKER = eINSTANCE.getSetting_Worker();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SETTING__JOB = eINSTANCE.getSetting_Job();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl <em>Worker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkerImpl
		 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getWorker()
		 * @generated
		 */
		EClass WORKER = eINSTANCE.getWorker();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKER__NAME = eINSTANCE.getWorker_Name();

		/**
		 * The meta object literal for the '<em><b>Car</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__CAR = eINSTANCE.getWorker_Car();

		/**
		 * The meta object literal for the '<em><b>Assigned</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKER__ASSIGNED = eINSTANCE.getWorker_Assigned();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.emf.example.workers.impl.JobImpl <em>Job</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.emf.example.workers.impl.JobImpl
		 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getJob()
		 * @generated
		 */
		EClass JOB = eINSTANCE.getJob();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JOB__NAME = eINSTANCE.getJob_Name();

		/**
		 * The meta object literal for the '<em><b>Needed</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOB__NEEDED = eINSTANCE.getJob_Needed();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.emf.example.workers.impl.CarImpl <em>Car</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.emf.example.workers.impl.CarImpl
		 * @see dk.dtu.imm.se.emf.example.workers.impl.WorkersPackageImpl#getCar()
		 * @generated
		 */
		EClass CAR = eINSTANCE.getCar();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAR__NAME = eINSTANCE.getCar_Name();

		/**
		 * The meta object literal for the '<em><b>Passenger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAR__PASSENGER = eINSTANCE.getCar_Passenger();

	}

} //WorkersPackage
