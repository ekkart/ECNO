/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen;

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
 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenFactory
 * @model kind="package"
 * @generated
 */
public interface EcnogenPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecnogen";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecno.se.imm.dtu.dk/ecno/gen";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecnogen";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnogenPackage eINSTANCE = dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.EcnogenPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl <em>ECNO Gen Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.EcnogenPackageImpl#getECNOGenModel()
	 * @generated
	 */
	int ECNO_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Emf Gen Model</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__EMF_GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Ecno Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__ECNO_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Path ECNO Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS = 2;

	/**
	 * The feature id for the '<em><b>Base Path ECNO Automata</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA = 3;

	/**
	 * The feature id for the '<em><b>Automata Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Behaviour Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__BEHAVIOUR_MODEL = 5;

	/**
	 * The feature id for the '<em><b>Base Path Model Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS = 6;

	/**
	 * The feature id for the '<em><b>Model Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__MODEL_CLASS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Package Adapter Factory Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Required</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL__REQUIRED = 9;

	/**
	 * The number of structural features of the '<em>ECNO Gen Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_GEN_MODEL_FEATURE_COUNT = 10;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel <em>ECNO Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECNO Gen Model</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel
	 * @generated
	 */
	EClass getECNOGenModel();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEmfGenModel <em>Emf Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Emf Gen Model</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEmfGenModel()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EReference getECNOGenModel_EmfGenModel();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEcnoModel <em>Ecno Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ecno Model</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getEcnoModel()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EReference getECNOGenModel_EcnoModel();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOEvents <em>Base Path ECNO Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path ECNO Events</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOEvents()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EAttribute getECNOGenModel_BasePathECNOEvents();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOAutomata <em>Base Path ECNO Automata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path ECNO Automata</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathECNOAutomata()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EAttribute getECNOGenModel_BasePathECNOAutomata();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getAutomataFactoryClassName <em>Automata Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Automata Factory Class Name</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getAutomataFactoryClassName()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EAttribute getECNOGenModel_AutomataFactoryClassName();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBehaviourModel <em>Behaviour Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behaviour Model</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBehaviourModel()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EReference getECNOGenModel_BehaviourModel();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathModelClass <em>Base Path Model Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path Model Class</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getBasePathModelClass()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EAttribute getECNOGenModel_BasePathModelClass();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getModelClassName <em>Model Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Class Name</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getModelClassName()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EAttribute getECNOGenModel_ModelClassName();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getPackageAdapterFactoryClassName <em>Package Adapter Factory Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Adapter Factory Class Name</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getPackageAdapterFactoryClassName()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EAttribute getECNOGenModel_PackageAdapterFactoryClassName();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Required</em>'.
	 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.ECNOGenModel#getRequired()
	 * @see #getECNOGenModel()
	 * @generated
	 */
	EReference getECNOGenModel_Required();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcnogenFactory getEcnogenFactory();

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
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl <em>ECNO Gen Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.ECNOGenModelImpl
		 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.EcnogenPackageImpl#getECNOGenModel()
		 * @generated
		 */
		EClass ECNO_GEN_MODEL = eINSTANCE.getECNOGenModel();

		/**
		 * The meta object literal for the '<em><b>Emf Gen Model</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECNO_GEN_MODEL__EMF_GEN_MODEL = eINSTANCE.getECNOGenModel_EmfGenModel();

		/**
		 * The meta object literal for the '<em><b>Ecno Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECNO_GEN_MODEL__ECNO_MODEL = eINSTANCE.getECNOGenModel_EcnoModel();

		/**
		 * The meta object literal for the '<em><b>Base Path ECNO Events</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_GEN_MODEL__BASE_PATH_ECNO_EVENTS = eINSTANCE.getECNOGenModel_BasePathECNOEvents();

		/**
		 * The meta object literal for the '<em><b>Base Path ECNO Automata</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_GEN_MODEL__BASE_PATH_ECNO_AUTOMATA = eINSTANCE.getECNOGenModel_BasePathECNOAutomata();

		/**
		 * The meta object literal for the '<em><b>Automata Factory Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_GEN_MODEL__AUTOMATA_FACTORY_CLASS_NAME = eINSTANCE.getECNOGenModel_AutomataFactoryClassName();

		/**
		 * The meta object literal for the '<em><b>Behaviour Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECNO_GEN_MODEL__BEHAVIOUR_MODEL = eINSTANCE.getECNOGenModel_BehaviourModel();

		/**
		 * The meta object literal for the '<em><b>Base Path Model Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_GEN_MODEL__BASE_PATH_MODEL_CLASS = eINSTANCE.getECNOGenModel_BasePathModelClass();

		/**
		 * The meta object literal for the '<em><b>Model Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_GEN_MODEL__MODEL_CLASS_NAME = eINSTANCE.getECNOGenModel_ModelClassName();

		/**
		 * The meta object literal for the '<em><b>Package Adapter Factory Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECNO_GEN_MODEL__PACKAGE_ADAPTER_FACTORY_CLASS_NAME = eINSTANCE.getECNOGenModel_PackageAdapterFactoryClassName();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ECNO_GEN_MODEL__REQUIRED = eINSTANCE.getECNOGenModel_Required();

	}

} //EcnogenPackage
