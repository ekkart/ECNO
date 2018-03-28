/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen;

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
 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenFactory
 * @model kind="package"
 * @generated
 */
public interface EcnoinstancegenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecnoinstancegen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecno.se.imm.dtu.dk/ecno/instancegen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecnoinstancegen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnoinstancegenPackage eINSTANCE = dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.EcnoinstancegenPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl <em>ECNO Instance Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.EcnoinstancegenPackageImpl#getECNOInstanceGenModel()
	 * @generated
	 */
	int ECNO_INSTANCE_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_INSTANCE_GEN_MODEL__INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Ecno Gen Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Path ECNO Instance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Instance Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME = 3;

	/**
	 * The number of structural features of the '<em>ECNO Instance Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_INSTANCE_GEN_MODEL_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel <em>ECNO Instance Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECNO Instance Gen Model</em>'.
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel
	 * @generated
	 */
	EClass getECNOInstanceGenModel();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance</em>'.
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstance()
	 * @see #getECNOInstanceGenModel()
	 * @generated
	 */
	EReference getECNOInstanceGenModel_Instance();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getEcnoGenModel <em>Ecno Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ecno Gen Model</em>'.
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getEcnoGenModel()
	 * @see #getECNOInstanceGenModel()
	 * @generated
	 */
	EReference getECNOInstanceGenModel_EcnoGenModel();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getBasePathECNOInstance <em>Base Path ECNO Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path ECNO Instance</em>'.
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getBasePathECNOInstance()
	 * @see #getECNOInstanceGenModel()
	 * @generated
	 */
	EAttribute getECNOInstanceGenModel_BasePathECNOInstance();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstanceClassName <em>Instance Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class Name</em>'.
	 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.ECNOInstanceGenModel#getInstanceClassName()
	 * @see #getECNOInstanceGenModel()
	 * @generated
	 */
	EAttribute getECNOInstanceGenModel_InstanceClassName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcnoinstancegenFactory getEcnoinstancegenFactory();

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
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl <em>ECNO Instance Gen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.ECNOInstanceGenModelImpl
		 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.EcnoinstancegenPackageImpl#getECNOInstanceGenModel()
		 * @generated
		 */
		EClass ECNO_INSTANCE_GEN_MODEL = eINSTANCE.getECNOInstanceGenModel();

		/**
		 * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECNO_INSTANCE_GEN_MODEL__INSTANCE = eINSTANCE.getECNOInstanceGenModel_Instance();

		/**
		 * The meta object literal for the '<em><b>Ecno Gen Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECNO_INSTANCE_GEN_MODEL__ECNO_GEN_MODEL = eINSTANCE.getECNOInstanceGenModel_EcnoGenModel();

		/**
		 * The meta object literal for the '<em><b>Base Path ECNO Instance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_INSTANCE_GEN_MODEL__BASE_PATH_ECNO_INSTANCE = eINSTANCE.getECNOInstanceGenModel_BasePathECNOInstance();

		/**
		 * The meta object literal for the '<em><b>Instance Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_INSTANCE_GEN_MODEL__INSTANCE_CLASS_NAME = eINSTANCE.getECNOInstanceGenModel_InstanceClassName();

	}

} //EcnoinstancegenPackage
