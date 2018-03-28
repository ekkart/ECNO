/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.EcnoinstancegenPackage
 * @generated
 */
public interface EcnoinstancegenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnoinstancegenFactory eINSTANCE = dk.dtu.imm.se.ecno.instancegenmodel.ecnoinstancegen.impl.EcnoinstancegenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ECNO Instance Gen Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECNO Instance Gen Model</em>'.
	 * @generated
	 */
	ECNOInstanceGenModel createECNOInstanceGenModel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcnoinstancegenPackage getEcnoinstancegenPackage();

} //EcnoinstancegenFactory
