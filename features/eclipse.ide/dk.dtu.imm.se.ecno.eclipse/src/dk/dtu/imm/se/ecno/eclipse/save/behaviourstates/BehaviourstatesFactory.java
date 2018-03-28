/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.eclipse.save.behaviourstates;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.BehaviourstatesPackage
 * @generated
 */
public interface BehaviourstatesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviourstatesFactory eINSTANCE = dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.impl.BehaviourstatesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Behaviour States</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Behaviour States</em>'.
	 * @generated
	 */
	BehaviourStates createBehaviourStates();

	/**
	 * Returns a new object of class '<em>Default State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default State</em>'.
	 * @generated
	 */
	DefaultState createDefaultState();

	/**
	 * Returns a new object of class '<em>PT Net State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>PT Net State</em>'.
	 * @generated
	 */
	PTNetState createPTNetState();

	/**
	 * Returns a new object of class '<em>Inherited Behaviour State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inherited Behaviour State</em>'.
	 * @generated
	 */
	InheritedBehaviourState createInheritedBehaviourState();

	/**
	 * Returns a new object of class '<em>Default Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Container</em>'.
	 * @generated
	 */
	DefaultContainer createDefaultContainer();

	/**
	 * Returns a new object of class '<em>Element Behaviour State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Behaviour State</em>'.
	 * @generated
	 */
	ElementBehaviourState createElementBehaviourState();

	/**
	 * Returns a new object of class '<em>Controller Configurator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Configurator</em>'.
	 * @generated
	 */
	ControllerConfigurator createControllerConfigurator();

	/**
	 * Returns a new object of class '<em>Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Reference</em>'.
	 * @generated
	 */
	ObjectReference createObjectReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BehaviourstatesPackage getBehaviourstatesPackage();

} //BehaviourstatesFactory
