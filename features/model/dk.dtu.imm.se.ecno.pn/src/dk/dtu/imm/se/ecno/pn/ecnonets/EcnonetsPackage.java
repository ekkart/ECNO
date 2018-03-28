/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

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
 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsFactory
 * @model kind="package"
 * @generated
 */
public interface EcnonetsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecnonets";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.imm.dtu.dk/ecno/ecnonets";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecnonets";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnonetsPackage eINSTANCE = dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ECNONetImpl <em>ECNO Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ECNONetImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getECNONet()
	 * @generated
	 */
	int ECNO_NET = 0;

	/**
	 * The number of structural features of the '<em>ECNO Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECNO_NET_FEATURE_COUNT = PtnetPackage.PT_NET_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = PnmlcoremodelPackage.TRANSITION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PnmlcoremodelPackage.TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TOOLSPECIFIC = PnmlcoremodelPackage.TRANSITION__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GRAPHICS = PnmlcoremodelPackage.TRANSITION__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__UNKNOWN = PnmlcoremodelPackage.TRANSITION__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OUT = PnmlcoremodelPackage.TRANSITION__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IN = PnmlcoremodelPackage.TRANSITION__IN;

	/**
	 * The feature id for the '<em><b>Eventbinding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EVENTBINDING = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__CONDITION = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTION = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PnmlcoremodelPackage.TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.PageImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ID = PnmlcoremodelPackage.PAGE__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = PnmlcoremodelPackage.PAGE__NAME;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TOOLSPECIFIC = PnmlcoremodelPackage.PAGE__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__GRAPHICS = PnmlcoremodelPackage.PAGE__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__UNKNOWN = PnmlcoremodelPackage.PAGE__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Out</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OUT = PnmlcoremodelPackage.PAGE__OUT;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IN = PnmlcoremodelPackage.PAGE__IN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OBJECT = PnmlcoremodelPackage.PAGE__OBJECT;

	/**
	 * The feature id for the '<em><b>Page Label Proxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_LABEL_PROXY = PnmlcoremodelPackage.PAGE__PAGE_LABEL_PROXY;

	/**
	 * The feature id for the '<em><b>Labelproxy</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LABELPROXY = PnmlcoremodelPackage.PAGE__LABELPROXY;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__IMPORTS = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__ATTRIBUTES = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = PnmlcoremodelPackage.PAGE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ConditionImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventBindingImpl <em>Event Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventBindingImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getEventBinding()
	 * @generated
	 */
	int EVENT_BINDING = 4;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_BINDING_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ActionImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 5;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TOOLSPECIFIC = StructuredpntypemodelPackage.STRUCTURED_LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__GRAPHICS = StructuredpntypemodelPackage.STRUCTURED_LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__UNKNOWN = StructuredpntypemodelPackage.STRUCTURED_LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TEXT = StructuredpntypemodelPackage.STRUCTURED_LABEL__TEXT;

	/**
	 * The feature id for the '<em><b>Structure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STRUCTURE = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = StructuredpntypemodelPackage.STRUCTURED_LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUsesImpl <em>Event Uses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUsesImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getEventUses()
	 * @generated
	 */
	int EVENT_USES = 6;

	/**
	 * The feature id for the '<em><b>Eventuse</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USES__EVENTUSE = 0;

	/**
	 * The feature id for the '<em><b>Drop Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USES__DROP_PARENT = 1;

	/**
	 * The number of structural features of the '<em>Event Uses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USES_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl <em>Event Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getEventUse()
	 * @generated
	 */
	int EVENT_USE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USE__EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USE__PARAMETER = 3;

	/**
	 * The number of structural features of the '<em>Event Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_USE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaExpressionImpl <em>Java Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaExpressionImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getJavaExpression()
	 * @generated
	 */
	int JAVA_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION__CODE = 0;

	/**
	 * The number of structural features of the '<em>Java Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaStatementImpl <em>Java Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaStatementImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getJavaStatement()
	 * @generated
	 */
	int JAVA_STATEMENT = 9;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATEMENT__CODE = 0;

	/**
	 * The number of structural features of the '<em>Java Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_STATEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ImportsImpl <em>Imports</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ImportsImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getImports()
	 * @generated
	 */
	int IMPORTS = 10;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Imports</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTS_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.AttributeDeclarationsImpl <em>Attribute Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.AttributeDeclarationsImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getAttributeDeclarations()
	 * @generated
	 */
	int ATTRIBUTE_DECLARATIONS = 11;

	/**
	 * The feature id for the '<em><b>Toolspecific</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATIONS__TOOLSPECIFIC = PnmlcoremodelPackage.LABEL__TOOLSPECIFIC;

	/**
	 * The feature id for the '<em><b>Graphics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATIONS__GRAPHICS = PnmlcoremodelPackage.LABEL__GRAPHICS;

	/**
	 * The feature id for the '<em><b>Unknown</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATIONS__UNKNOWN = PnmlcoremodelPackage.LABEL__UNKNOWN;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATIONS__TEXT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DECLARATIONS_FEATURE_COUNT = PnmlcoremodelPackage.LABEL_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.NamedParameterImpl <em>Named Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.NamedParameterImpl
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getNamedParameter()
	 * @generated
	 */
	int NAMED_PARAMETER = 12;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER__OPTIONAL = 2;

	/**
	 * The number of structural features of the '<em>Named Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_PARAMETER_FEATURE_COUNT = 3;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet <em>ECNO Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECNO Net</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet
	 * @generated
	 */
	EClass getECNONet();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getEventbinding <em>Eventbinding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Eventbinding</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getEventbinding()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Eventbinding();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getCondition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Transition#getAction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Action();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Page#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Page#getImports()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Page#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Page#getAttributes()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Attributes();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Condition#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Condition#getStructure()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Structure();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding <em>Event Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Binding</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding
	 * @generated
	 */
	EClass getEventBinding();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding#getStructure()
	 * @see #getEventBinding()
	 * @generated
	 */
	EReference getEventBinding_Structure();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Action#getStructure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Structure</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Action#getStructure()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Structure();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses <em>Event Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Uses</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUses
	 * @generated
	 */
	EClass getEventUses();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#getEventuse <em>Eventuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eventuse</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#getEventuse()
	 * @see #getEventUses()
	 * @generated
	 */
	EReference getEventUses_Eventuse();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#isDropParent <em>Drop Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drop Parent</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUses#isDropParent()
	 * @see #getEventUses()
	 * @generated
	 */
	EAttribute getEventUses_DropParent();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse <em>Event Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Use</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUse
	 * @generated
	 */
	EClass getEventUse();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getName()
	 * @see #getEventUse()
	 * @generated
	 */
	EAttribute getEventUse_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getExpression()
	 * @see #getEventUse()
	 * @generated
	 */
	EReference getEventUse_Expression();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getType()
	 * @see #getEventUse()
	 * @generated
	 */
	EAttribute getEventUse_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EventUse#getParameter()
	 * @see #getEventUse()
	 * @generated
	 */
	EReference getEventUse_Parameter();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression <em>Java Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Expression</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression
	 * @generated
	 */
	EClass getJavaExpression();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression#getCode()
	 * @see #getJavaExpression()
	 * @generated
	 */
	EAttribute getJavaExpression_Code();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement <em>Java Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Statement</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement
	 * @generated
	 */
	EClass getJavaStatement();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement#getCode()
	 * @see #getJavaStatement()
	 * @generated
	 */
	EAttribute getJavaStatement_Code();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Imports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imports</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Imports
	 * @generated
	 */
	EClass getImports();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.Imports#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.Imports#getText()
	 * @see #getImports()
	 * @generated
	 */
	EAttribute getImports_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations <em>Attribute Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Declarations</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations
	 * @generated
	 */
	EClass getAttributeDeclarations();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations#getText()
	 * @see #getAttributeDeclarations()
	 * @generated
	 */
	EAttribute getAttributeDeclarations_Text();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter <em>Named Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Parameter</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter
	 * @generated
	 */
	EClass getNamedParameter();

	/**
	 * Returns the meta object for the containment reference '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getExpression()
	 * @see #getNamedParameter()
	 * @generated
	 */
	EReference getNamedParameter_Expression();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#getName()
	 * @see #getNamedParameter()
	 * @generated
	 */
	EAttribute getNamedParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter#isOptional()
	 * @see #getNamedParameter()
	 * @generated
	 */
	EAttribute getNamedParameter_Optional();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcnonetsFactory getEcnonetsFactory();

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
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ECNONetImpl <em>ECNO Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ECNONetImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getECNONet()
		 * @generated
		 */
		EClass ECNO_NET = eINSTANCE.getECNONet();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.TransitionImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Eventbinding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__EVENTBINDING = eINSTANCE.getTransition_Eventbinding();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__CONDITION = eINSTANCE.getTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.PageImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__IMPORTS = eINSTANCE.getPage_Imports();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__ATTRIBUTES = eINSTANCE.getPage_Attributes();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ConditionImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__STRUCTURE = eINSTANCE.getCondition_Structure();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventBindingImpl <em>Event Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventBindingImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getEventBinding()
		 * @generated
		 */
		EClass EVENT_BINDING = eINSTANCE.getEventBinding();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_BINDING__STRUCTURE = eINSTANCE.getEventBinding_Structure();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ActionImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Structure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STRUCTURE = eINSTANCE.getAction_Structure();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUsesImpl <em>Event Uses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUsesImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getEventUses()
		 * @generated
		 */
		EClass EVENT_USES = eINSTANCE.getEventUses();

		/**
		 * The meta object literal for the '<em><b>Eventuse</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_USES__EVENTUSE = eINSTANCE.getEventUses_Eventuse();

		/**
		 * The meta object literal for the '<em><b>Drop Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_USES__DROP_PARENT = eINSTANCE.getEventUses_DropParent();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl <em>Event Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EventUseImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getEventUse()
		 * @generated
		 */
		EClass EVENT_USE = eINSTANCE.getEventUse();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_USE__NAME = eINSTANCE.getEventUse_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_USE__EXPRESSION = eINSTANCE.getEventUse_Expression();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_USE__TYPE = eINSTANCE.getEventUse_Type();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_USE__PARAMETER = eINSTANCE.getEventUse_Parameter();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaExpressionImpl <em>Java Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaExpressionImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getJavaExpression()
		 * @generated
		 */
		EClass JAVA_EXPRESSION = eINSTANCE.getJavaExpression();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_EXPRESSION__CODE = eINSTANCE.getJavaExpression_Code();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaStatementImpl <em>Java Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.JavaStatementImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getJavaStatement()
		 * @generated
		 */
		EClass JAVA_STATEMENT = eINSTANCE.getJavaStatement();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_STATEMENT__CODE = eINSTANCE.getJavaStatement_Code();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.ImportsImpl <em>Imports</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.ImportsImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getImports()
		 * @generated
		 */
		EClass IMPORTS = eINSTANCE.getImports();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTS__TEXT = eINSTANCE.getImports_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.AttributeDeclarationsImpl <em>Attribute Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.AttributeDeclarationsImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getAttributeDeclarations()
		 * @generated
		 */
		EClass ATTRIBUTE_DECLARATIONS = eINSTANCE.getAttributeDeclarations();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DECLARATIONS__TEXT = eINSTANCE.getAttributeDeclarations_Text();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.pn.ecnonets.impl.NamedParameterImpl <em>Named Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.NamedParameterImpl
		 * @see dk.dtu.imm.se.ecno.pn.ecnonets.impl.EcnonetsPackageImpl#getNamedParameter()
		 * @generated
		 */
		EClass NAMED_PARAMETER = eINSTANCE.getNamedParameter();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_PARAMETER__EXPRESSION = eINSTANCE.getNamedParameter_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_PARAMETER__NAME = eINSTANCE.getNamedParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_PARAMETER__OPTIONAL = eINSTANCE.getNamedParameter_Optional();

	}

} //EcnonetsPackage
