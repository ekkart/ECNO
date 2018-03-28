/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl;

import dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcnoinstancegenFactoryImpl extends EFactoryImpl implements EcnoinstancegenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcnoinstancegenFactory init() {
		try {
			EcnoinstancegenFactory theEcnoinstancegenFactory = (EcnoinstancegenFactory)EPackage.Registry.INSTANCE.getEFactory("http://ecno.se.imm.dtu.dk/ecno/instancegen"); 
			if (theEcnoinstancegenFactory != null) {
				return theEcnoinstancegenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcnoinstancegenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnoinstancegenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EcnoinstancegenPackage.ECNO_INSTANCE_GEN_MODEL: return createECNOInstanceGenModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECNOInstanceGenModel createECNOInstanceGenModel() {
		ECNOInstanceGenModelImpl ecnoInstanceGenModel = new ECNOInstanceGenModelImpl();
		return ecnoInstanceGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnoinstancegenPackage getEcnoinstancegenPackage() {
		return (EcnoinstancegenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcnoinstancegenPackage getPackage() {
		return EcnoinstancegenPackage.eINSTANCE;
	}

} //EcnoinstancegenFactoryImpl
