/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen.impl;

import dk.dtu.imm.se.ecno.genmodel.ecnogen.*;

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
public class EcnogenFactoryImpl extends EFactoryImpl implements EcnogenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcnogenFactory init() {
		try {
			EcnogenFactory theEcnogenFactory = (EcnogenFactory)EPackage.Registry.INSTANCE.getEFactory("http://ecno.se.imm.dtu.dk/ecno/gen"); 
			if (theEcnogenFactory != null) {
				return theEcnogenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcnogenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnogenFactoryImpl() {
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
			case EcnogenPackage.ECNO_GEN_MODEL: return createECNOGenModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECNOGenModel createECNOGenModel() {
		ECNOGenModelImpl ecnoGenModel = new ECNOGenModelImpl();
		return ecnoGenModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnogenPackage getEcnogenPackage() {
		return (EcnogenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcnogenPackage getPackage() {
		return EcnogenPackage.eINSTANCE;
	}

} //EcnogenFactoryImpl
