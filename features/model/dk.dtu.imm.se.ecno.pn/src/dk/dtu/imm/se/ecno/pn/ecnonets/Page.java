/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.Page#getImports <em>Imports</em>}</li>
 *   <li>{@link dk.dtu.imm.se.ecno.pn.ecnonets.Page#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends org.pnml.tools.epnk.pnmlcoremodel.Page {
	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.pn.ecnonets.Imports}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getPage_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Imports> getImports();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#getPage_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeDeclarations> getAttributes();

} // Page
