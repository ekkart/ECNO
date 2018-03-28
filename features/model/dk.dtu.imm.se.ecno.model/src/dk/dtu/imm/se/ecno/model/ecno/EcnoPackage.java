/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

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
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoFactory
 * @model kind="package"
 * @generated
 */
public interface EcnoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ecno";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecno.se.imm.dtu.dk/ecno";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecno";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EcnoPackage eINSTANCE = dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl.init();

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.IElementType <em>IElement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.IElementType
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIElementType()
	 * @generated
	 */
	int IELEMENT_TYPE = 7;

	/**
	 * The number of structural features of the '<em>IElement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IELEMENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl <em>Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__PACKAGE_URI = IELEMENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__TYPE_NAME = IELEMENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__IMPORTED = IELEMENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__IMPORT = IELEMENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__ECLASS = IELEMENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Coordination Sets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__COORDINATION_SETS = IELEMENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__REFERENCES = IELEMENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__NAME = IELEMENT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Gui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__GUI = IELEMENT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__SUPER = IELEMENT_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Parallel Trigger Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS = IELEMENT_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_TYPE_FEATURE_COUNT = IELEMENT_TYPE_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.IEventType <em>IEvent Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.IEventType
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIEventType()
	 * @generated
	 */
	int IEVENT_TYPE = 8;

	/**
	 * The number of structural features of the '<em>IEvent Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl <em>Event Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getEventType()
	 * @generated
	 */
	int EVENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PACKAGE_URI = IEVENT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__TYPE_NAME = IEVENT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__IMPORTED = IEVENT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__IMPORT = IEVENT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__PARAMETERS = IEVENT_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__NAME = IEVENT_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Gui</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__GUI = IEVENT_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Super</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE__SUPER = IEVENT_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Event Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_FEATURE_COUNT = IEVENT_TYPE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.INamespace <em>INamespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.INamespace
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getINamespace()
	 * @generated
	 */
	int INAMESPACE = 13;

	/**
	 * The number of structural features of the '<em>INamespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INAMESPACE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 2;

	/**
	 * The feature id for the '<em><b>Element Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__ELEMENT_TYPES = INAMESPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>EPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EPACKAGE = INAMESPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Event Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EVENT_TYPES = INAMESPACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__USES = INAMESPACE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__URI = INAMESPACE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Event Type Extensions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__EVENT_TYPE_EXTENSIONS = INAMESPACE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = INAMESPACE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.ICoordinationSet <em>ICoordination Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.ICoordinationSet
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getICoordinationSet()
	 * @generated
	 */
	int ICOORDINATION_SET = 12;

	/**
	 * The number of structural features of the '<em>ICoordination Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICOORDINATION_SET_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl <em>Coordination Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getCoordinationSet()
	 * @generated
	 */
	int COORDINATION_SET = 3;

	/**
	 * The feature id for the '<em><b>Synchronisations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SET__SYNCHRONISATIONS = ICOORDINATION_SET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trigger Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SET__TRIGGER_EVENT = ICOORDINATION_SET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SET__TRIGGER = ICOORDINATION_SET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SET__PRIORITY = ICOORDINATION_SET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Coordination Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATION_SET_FEATURE_COUNT = ICOORDINATION_SET_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.ISynchronisation <em>ISynchronisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.ISynchronisation
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getISynchronisation()
	 * @generated
	 */
	int ISYNCHRONISATION = 9;

	/**
	 * The number of structural features of the '<em>ISynchronisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISYNCHRONISATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl <em>Synchronisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getSynchronisation()
	 * @generated
	 */
	int SYNCHRONISATION = 4;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION__EVENT_TYPE = ISYNCHRONISATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION__TYPE = ISYNCHRONISATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION__REFERENCE = ISYNCHRONISATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Coordination Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION__COORDINATION_SET = ISYNCHRONISATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Event Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION__EVENT_NAME = ISYNCHRONISATION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Synchronisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONISATION_FEATURE_COUNT = ISYNCHRONISATION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.IReference <em>IReference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.IReference
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIReference()
	 * @generated
	 */
	int IREFERENCE = 11;

	/**
	 * The number of structural features of the '<em>IReference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IREFERENCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>EReference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__EREFERENCE = IREFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__TARGET = IREFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE = IREFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Synchronisations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SYNCHRONISATIONS = IREFERENCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = IREFERENCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__UPPER_BOUND = IREFERENCE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = IREFERENCE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.FormalParameterImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getFormalParameter()
	 * @generated
	 */
	int FORMAL_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__EANNOTATIONS = EcorePackage.EPARAMETER__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__NAME = EcorePackage.EPARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Ordered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__ORDERED = EcorePackage.EPARAMETER__ORDERED;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__UNIQUE = EcorePackage.EPARAMETER__UNIQUE;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__LOWER_BOUND = EcorePackage.EPARAMETER__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__UPPER_BOUND = EcorePackage.EPARAMETER__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__MANY = EcorePackage.EPARAMETER__MANY;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__REQUIRED = EcorePackage.EPARAMETER__REQUIRED;

	/**
	 * The feature id for the '<em><b>EType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__ETYPE = EcorePackage.EPARAMETER__ETYPE;

	/**
	 * The feature id for the '<em><b>EGeneric Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__EGENERIC_TYPE = EcorePackage.EPARAMETER__EGENERIC_TYPE;

	/**
	 * The feature id for the '<em><b>EOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__EOPERATION = EcorePackage.EPARAMETER__EOPERATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__LABEL = EcorePackage.EPARAMETER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Collective</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER__COLLECTIVE = EcorePackage.EPARAMETER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Formal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETER_FEATURE_COUNT = EcorePackage.EPARAMETER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.IFormalParameter <em>IFormal Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.IFormalParameter
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIFormalParameter()
	 * @generated
	 */
	int IFORMAL_PARAMETER = 10;

	/**
	 * The number of structural features of the '<em>IFormal Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFORMAL_PARAMETER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType <em>Imported Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getImportedType()
	 * @generated
	 */
	int IMPORTED_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE__PACKAGE_URI = 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE__TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE__IMPORTED = 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE__IMPORT = 3;

	/**
	 * The number of structural features of the '<em>Imported Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.core.IEventTypeExtension <em>IEvent Type Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.core.IEventTypeExtension
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIEventTypeExtension()
	 * @generated
	 */
	int IEVENT_TYPE_EXTENSION = 17;

	/**
	 * The number of structural features of the '<em>IEvent Type Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IEVENT_TYPE_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl <em>Event Type Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getEventTypeExtension()
	 * @generated
	 */
	int EVENT_TYPE_EXTENSION = 15;

	/**
	 * The feature id for the '<em><b>Package URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__PACKAGE_URI = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__TYPE_NAME = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Imported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__IMPORTED = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__IMPORT = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__BASE = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__NAME = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__PARAMETERS = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Super</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION__SUPER = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Event Type Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_TYPE_EXTENSION_FEATURE_COUNT = IEVENT_TYPE_EXTENSION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.String2EventTypeExtensionMapImpl <em>String2 Event Type Extension Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.String2EventTypeExtensionMapImpl
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getString2EventTypeExtensionMap()
	 * @generated
	 */
	int STRING2_EVENT_TYPE_EXTENSION_MAP = 16;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_EVENT_TYPE_EXTENSION_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_EVENT_TYPE_EXTENSION_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String2 Event Type Extension Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING2_EVENT_TYPE_EXTENSION_MAP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link dk.dtu.imm.se.ecno.model.ecno.SynchronisationType <em>Synchronisation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dk.dtu.imm.se.ecno.model.ecno.SynchronisationType
	 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getSynchronisationType()
	 * @generated
	 */
	int SYNCHRONISATION_TYPE = 18;


	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Type</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType
	 * @generated
	 */
	EClass getElementType();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EClass</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getEClass()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_EClass();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getCoordinationSets <em>Coordination Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordination Sets</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getCoordinationSets()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_CoordinationSets();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getReferences()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_References();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getName()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#isGui <em>Gui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gui</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#isGui()
	 * @see #getElementType()
	 * @generated
	 */
	EAttribute getElementType_Gui();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getSuper()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_Super();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType#getParallelTriggerEvents <em>Parallel Trigger Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parallel Trigger Events</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType#getParallelTriggerEvents()
	 * @see #getElementType()
	 * @generated
	 */
	EReference getElementType_ParallelTriggerEvents();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventType
	 * @generated
	 */
	EClass getEventType();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventType#getParameters()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventType#getName()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#isGui <em>Gui</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gui</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventType#isGui()
	 * @see #getEventType()
	 * @generated
	 */
	EAttribute getEventType_Gui();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.EventType#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventType#getSuper()
	 * @see #getEventType()
	 * @generated
	 */
	EReference getEventType_Super();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getElementTypes <em>Element Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Element Types</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package#getElementTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_ElementTypes();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEPackage <em>EPackage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EPackage</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package#getEPackage()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_EPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEventTypes <em>Event Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Types</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package#getEventTypes()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_EventTypes();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Uses</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package#getUses()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Uses();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package#getUri()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Uri();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.Package#getEventTypeExtensions <em>Event Type Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Event Type Extensions</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package#getEventTypeExtensions()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_EventTypeExtensions();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet <em>Coordination Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordination Set</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet
	 * @generated
	 */
	EClass getCoordinationSet();

	/**
	 * Returns the meta object for the reference list '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getSynchronisations <em>Synchronisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Synchronisations</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getSynchronisations()
	 * @see #getCoordinationSet()
	 * @generated
	 */
	EReference getCoordinationSet_Synchronisations();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTriggerEvent <em>Trigger Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Trigger Event</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTriggerEvent()
	 * @see #getCoordinationSet()
	 * @generated
	 */
	EReference getCoordinationSet_TriggerEvent();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trigger</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getTrigger()
	 * @see #getCoordinationSet()
	 * @generated
	 */
	EAttribute getCoordinationSet_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet#getPriority()
	 * @see #getCoordinationSet()
	 * @generated
	 */
	EAttribute getCoordinationSet_Priority();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation <em>Synchronisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronisation</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation
	 * @generated
	 */
	EClass getSynchronisation();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Event Type</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventType()
	 * @see #getSynchronisation()
	 * @generated
	 */
	EReference getSynchronisation_EventType();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getType()
	 * @see #getSynchronisation()
	 * @generated
	 */
	EAttribute getSynchronisation_Type();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Reference</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getReference()
	 * @see #getSynchronisation()
	 * @generated
	 */
	EReference getSynchronisation_Reference();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getCoordinationSet <em>Coordination Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Coordination Set</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getCoordinationSet()
	 * @see #getSynchronisation()
	 * @generated
	 */
	EReference getSynchronisation_CoordinationSet();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventName <em>Event Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Name</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation#getEventName()
	 * @see #getSynchronisation()
	 * @generated
	 */
	EAttribute getSynchronisation_EventName();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getEReference <em>EReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getEReference()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_EReference();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getTarget()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Target();

	/**
	 * Returns the meta object for the container reference '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getSource()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Source();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getSynchronisations <em>Synchronisations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Synchronisations</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getSynchronisations()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_Synchronisations();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getName()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_Name();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.Reference#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference#getUpperBound()
	 * @see #getReference()
	 * @generated
	 */
	EAttribute getReference_UpperBound();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameter</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.FormalParameter
	 * @generated
	 */
	EClass getFormalParameter();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.FormalParameter#getLabel()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Label();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter#isCollective <em>Collective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collective</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.FormalParameter#isCollective()
	 * @see #getFormalParameter()
	 * @generated
	 */
	EAttribute getFormalParameter_Collective();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.IElementType <em>IElement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IElement Type</em>'.
	 * @see dk.dtu.imm.se.ecno.core.IElementType
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.IElementType"
	 * @generated
	 */
	EClass getIElementType();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.IEventType <em>IEvent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEvent Type</em>'.
	 * @see dk.dtu.imm.se.ecno.core.IEventType
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.IEventType"
	 * @generated
	 */
	EClass getIEventType();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.ISynchronisation <em>ISynchronisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ISynchronisation</em>'.
	 * @see dk.dtu.imm.se.ecno.core.ISynchronisation
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.ISynchronisation"
	 * @generated
	 */
	EClass getISynchronisation();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.IFormalParameter <em>IFormal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IFormal Parameter</em>'.
	 * @see dk.dtu.imm.se.ecno.core.IFormalParameter
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.IFormalParameter"
	 * @generated
	 */
	EClass getIFormalParameter();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.IReference <em>IReference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IReference</em>'.
	 * @see dk.dtu.imm.se.ecno.core.IReference
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.IReference"
	 * @generated
	 */
	EClass getIReference();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.ICoordinationSet <em>ICoordination Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICoordination Set</em>'.
	 * @see dk.dtu.imm.se.ecno.core.ICoordinationSet
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.ICoordinationSet"
	 * @generated
	 */
	EClass getICoordinationSet();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.INamespace <em>INamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>INamespace</em>'.
	 * @see dk.dtu.imm.se.ecno.core.INamespace
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.INamespace"
	 * @generated
	 */
	EClass getINamespace();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Type</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType
	 * @generated
	 */
	EClass getImportedType();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getPackageURI <em>Package URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package URI</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType#getPackageURI()
	 * @see #getImportedType()
	 * @generated
	 */
	EAttribute getImportedType_PackageURI();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType#getTypeName()
	 * @see #getImportedType()
	 * @generated
	 */
	EAttribute getImportedType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#isImported <em>Imported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType#isImported()
	 * @see #getImportedType()
	 * @generated
	 */
	EAttribute getImportedType_Imported();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Import</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType#getImport()
	 * @see #getImportedType()
	 * @generated
	 */
	EReference getImportedType_Import();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension <em>Event Type Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Type Extension</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension
	 * @generated
	 */
	EClass getEventTypeExtension();

	/**
	 * Returns the meta object for the reference '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getBase()
	 * @see #getEventTypeExtension()
	 * @generated
	 */
	EReference getEventTypeExtension_Base();

	/**
	 * Returns the meta object for the attribute '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getName()
	 * @see #getEventTypeExtension()
	 * @generated
	 */
	EAttribute getEventTypeExtension_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getParameters()
	 * @see #getEventTypeExtension()
	 * @generated
	 */
	EReference getEventTypeExtension_Parameters();

	/**
	 * Returns the meta object for the map '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getSuper <em>Super</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Super</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension#getSuper()
	 * @see #getEventTypeExtension()
	 * @generated
	 */
	EReference getEventTypeExtension_Super();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String2 Event Type Extension Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String2 Event Type Extension Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension" valueRequired="true"
	 * @generated
	 */
	EClass getString2EventTypeExtensionMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getString2EventTypeExtensionMap()
	 * @generated
	 */
	EAttribute getString2EventTypeExtensionMap_Key();

	/**
	 * Returns the meta object for the reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getString2EventTypeExtensionMap()
	 * @generated
	 */
	EReference getString2EventTypeExtensionMap_Value();

	/**
	 * Returns the meta object for class '{@link dk.dtu.imm.se.ecno.core.IEventTypeExtension <em>IEvent Type Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IEvent Type Extension</em>'.
	 * @see dk.dtu.imm.se.ecno.core.IEventTypeExtension
	 * @model instanceClass="dk.dtu.imm.se.ecno.core.IEventTypeExtension"
	 * @generated
	 */
	EClass getIEventTypeExtension();

	/**
	 * Returns the meta object for enum '{@link dk.dtu.imm.se.ecno.model.ecno.SynchronisationType <em>Synchronisation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Synchronisation Type</em>'.
	 * @see dk.dtu.imm.se.ecno.model.ecno.SynchronisationType
	 * @generated
	 */
	EEnum getSynchronisationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EcnoFactory getEcnoFactory();

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
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl <em>Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.ElementTypeImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getElementType()
		 * @generated
		 */
		EClass ELEMENT_TYPE = eINSTANCE.getElementType();

		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__ECLASS = eINSTANCE.getElementType_EClass();

		/**
		 * The meta object literal for the '<em><b>Coordination Sets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__COORDINATION_SETS = eINSTANCE.getElementType_CoordinationSets();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__REFERENCES = eINSTANCE.getElementType_References();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

		/**
		 * The meta object literal for the '<em><b>Gui</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_TYPE__GUI = eINSTANCE.getElementType_Gui();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__SUPER = eINSTANCE.getElementType_Super();

		/**
		 * The meta object literal for the '<em><b>Parallel Trigger Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_TYPE__PARALLEL_TRIGGER_EVENTS = eINSTANCE.getElementType_ParallelTriggerEvents();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl <em>Event Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getEventType()
		 * @generated
		 */
		EClass EVENT_TYPE = eINSTANCE.getEventType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__PARAMETERS = eINSTANCE.getEventType_Parameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__NAME = eINSTANCE.getEventType_Name();

		/**
		 * The meta object literal for the '<em><b>Gui</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE__GUI = eINSTANCE.getEventType_Gui();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE__SUPER = eINSTANCE.getEventType_Super();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.PackageImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Element Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__ELEMENT_TYPES = eINSTANCE.getPackage_ElementTypes();

		/**
		 * The meta object literal for the '<em><b>EPackage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EPACKAGE = eINSTANCE.getPackage_EPackage();

		/**
		 * The meta object literal for the '<em><b>Event Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EVENT_TYPES = eINSTANCE.getPackage_EventTypes();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__USES = eINSTANCE.getPackage_Uses();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__URI = eINSTANCE.getPackage_Uri();

		/**
		 * The meta object literal for the '<em><b>Event Type Extensions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__EVENT_TYPE_EXTENSIONS = eINSTANCE.getPackage_EventTypeExtensions();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl <em>Coordination Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.CoordinationSetImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getCoordinationSet()
		 * @generated
		 */
		EClass COORDINATION_SET = eINSTANCE.getCoordinationSet();

		/**
		 * The meta object literal for the '<em><b>Synchronisations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SET__SYNCHRONISATIONS = eINSTANCE.getCoordinationSet_Synchronisations();

		/**
		 * The meta object literal for the '<em><b>Trigger Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATION_SET__TRIGGER_EVENT = eINSTANCE.getCoordinationSet_TriggerEvent();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_SET__TRIGGER = eINSTANCE.getCoordinationSet_Trigger();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATION_SET__PRIORITY = eINSTANCE.getCoordinationSet_Priority();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl <em>Synchronisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.SynchronisationImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getSynchronisation()
		 * @generated
		 */
		EClass SYNCHRONISATION = eINSTANCE.getSynchronisation();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION__EVENT_TYPE = eINSTANCE.getSynchronisation_EventType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONISATION__TYPE = eINSTANCE.getSynchronisation_Type();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION__REFERENCE = eINSTANCE.getSynchronisation_Reference();

		/**
		 * The meta object literal for the '<em><b>Coordination Set</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONISATION__COORDINATION_SET = eINSTANCE.getSynchronisation_CoordinationSet();

		/**
		 * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYNCHRONISATION__EVENT_NAME = eINSTANCE.getSynchronisation_EventName();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.ReferenceImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>EReference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__EREFERENCE = eINSTANCE.getReference_EReference();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SOURCE = eINSTANCE.getReference_Source();

		/**
		 * The meta object literal for the '<em><b>Synchronisations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SYNCHRONISATIONS = eINSTANCE.getReference_Synchronisations();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__NAME = eINSTANCE.getReference_Name();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE__UPPER_BOUND = eINSTANCE.getReference_UpperBound();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.FormalParameterImpl <em>Formal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.FormalParameterImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getFormalParameter()
		 * @generated
		 */
		EClass FORMAL_PARAMETER = eINSTANCE.getFormalParameter();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__LABEL = eINSTANCE.getFormalParameter_Label();

		/**
		 * The meta object literal for the '<em><b>Collective</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_PARAMETER__COLLECTIVE = eINSTANCE.getFormalParameter_Collective();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.IElementType <em>IElement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.IElementType
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIElementType()
		 * @generated
		 */
		EClass IELEMENT_TYPE = eINSTANCE.getIElementType();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.IEventType <em>IEvent Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.IEventType
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIEventType()
		 * @generated
		 */
		EClass IEVENT_TYPE = eINSTANCE.getIEventType();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.ISynchronisation <em>ISynchronisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.ISynchronisation
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getISynchronisation()
		 * @generated
		 */
		EClass ISYNCHRONISATION = eINSTANCE.getISynchronisation();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.IFormalParameter <em>IFormal Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.IFormalParameter
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIFormalParameter()
		 * @generated
		 */
		EClass IFORMAL_PARAMETER = eINSTANCE.getIFormalParameter();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.IReference <em>IReference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.IReference
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIReference()
		 * @generated
		 */
		EClass IREFERENCE = eINSTANCE.getIReference();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.ICoordinationSet <em>ICoordination Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.ICoordinationSet
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getICoordinationSet()
		 * @generated
		 */
		EClass ICOORDINATION_SET = eINSTANCE.getICoordinationSet();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.INamespace <em>INamespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.INamespace
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getINamespace()
		 * @generated
		 */
		EClass INAMESPACE = eINSTANCE.getINamespace();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType <em>Imported Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getImportedType()
		 * @generated
		 */
		EClass IMPORTED_TYPE = eINSTANCE.getImportedType();

		/**
		 * The meta object literal for the '<em><b>Package URI</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_TYPE__PACKAGE_URI = eINSTANCE.getImportedType_PackageURI();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_TYPE__TYPE_NAME = eINSTANCE.getImportedType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Imported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_TYPE__IMPORTED = eINSTANCE.getImportedType_Imported();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTED_TYPE__IMPORT = eINSTANCE.getImportedType_Import();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl <em>Event Type Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EventTypeExtensionImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getEventTypeExtension()
		 * @generated
		 */
		EClass EVENT_TYPE_EXTENSION = eINSTANCE.getEventTypeExtension();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE_EXTENSION__BASE = eINSTANCE.getEventTypeExtension_Base();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT_TYPE_EXTENSION__NAME = eINSTANCE.getEventTypeExtension_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE_EXTENSION__PARAMETERS = eINSTANCE.getEventTypeExtension_Parameters();

		/**
		 * The meta object literal for the '<em><b>Super</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_TYPE_EXTENSION__SUPER = eINSTANCE.getEventTypeExtension_Super();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.impl.String2EventTypeExtensionMapImpl <em>String2 Event Type Extension Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.String2EventTypeExtensionMapImpl
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getString2EventTypeExtensionMap()
		 * @generated
		 */
		EClass STRING2_EVENT_TYPE_EXTENSION_MAP = eINSTANCE.getString2EventTypeExtensionMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING2_EVENT_TYPE_EXTENSION_MAP__KEY = eINSTANCE.getString2EventTypeExtensionMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING2_EVENT_TYPE_EXTENSION_MAP__VALUE = eINSTANCE.getString2EventTypeExtensionMap_Value();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.core.IEventTypeExtension <em>IEvent Type Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.core.IEventTypeExtension
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getIEventTypeExtension()
		 * @generated
		 */
		EClass IEVENT_TYPE_EXTENSION = eINSTANCE.getIEventTypeExtension();

		/**
		 * The meta object literal for the '{@link dk.dtu.imm.se.ecno.model.ecno.SynchronisationType <em>Synchronisation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dk.dtu.imm.se.ecno.model.ecno.SynchronisationType
		 * @see dk.dtu.imm.se.ecno.model.ecno.impl.EcnoPackageImpl#getSynchronisationType()
		 * @generated
		 */
		EEnum SYNCHRONISATION_TYPE = eINSTANCE.getSynchronisationType();

	}

} //EcnoPackage
