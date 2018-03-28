/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage
 * @generated
 */
public interface EcnonetsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnonetsFactory eINSTANCE = dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ECNO Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ECNO Net</em>'.
	 * @generated
	 */
	ECNONet createECNONet();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition</em>'.
	 * @generated
	 */
	Condition createCondition();

	/**
	 * Returns a new object of class '<em>Event Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Binding</em>'.
	 * @generated
	 */
	EventBinding createEventBinding();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Event Uses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Uses</em>'.
	 * @generated
	 */
	EventUses createEventUses();

	/**
	 * Returns a new object of class '<em>Event Use</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Use</em>'.
	 * @generated
	 */
	EventUse createEventUse();

	/**
	 * Returns a new object of class '<em>Java Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Expression</em>'.
	 * @generated
	 */
	JavaExpression createJavaExpression();

	/**
	 * Returns a new object of class '<em>Java Statement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Java Statement</em>'.
	 * @generated
	 */
	JavaStatement createJavaStatement();

	/**
	 * Returns a new object of class '<em>Imports</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Imports</em>'.
	 * @generated
	 */
	Imports createImports();

	/**
	 * Returns a new object of class '<em>Attribute Declarations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Declarations</em>'.
	 * @generated
	 */
	AttributeDeclarations createAttributeDeclarations();

	/**
	 * Returns a new object of class '<em>Named Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Named Parameter</em>'.
	 * @generated
	 */
	NamedParameter createNamedParameter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EcnonetsPackage getEcnonetsPackage();

} //EcnonetsFactory
