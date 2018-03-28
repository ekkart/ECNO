/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.genmodel.ecnogen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.genmodel.ecnogen.EcnogenPackage
 * @generated
 */
public interface EcnogenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnogenFactory eINSTANCE = dk.dtu.imm.se.ecno.genmodel.ecnogen.impl.EcnogenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ECNO Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECNO Gen Model</em>'.
	 * @generated
	 */
	ECNOGenModel createECNOGenModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcnogenPackage getEcnogenPackage();

} //EcnogenFactory
