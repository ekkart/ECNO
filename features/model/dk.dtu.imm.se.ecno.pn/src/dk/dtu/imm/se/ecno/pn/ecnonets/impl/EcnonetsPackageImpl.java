/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.impl;

import dk.dtu.imm.se.ecno.pn.ecnonets.Action;
import dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations;
import dk.dtu.imm.se.ecno.pn.ecnonets.Condition;
import dk.dtu.imm.se.ecno.pn.ecnonets.ECNONet;
import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsFactory;
import dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUses;
import dk.dtu.imm.se.ecno.pn.ecnonets.Imports;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement;
import dk.dtu.imm.se.ecno.pn.ecnonets.NamedParameter;
import dk.dtu.imm.se.ecno.pn.ecnonets.Page;
import dk.dtu.imm.se.ecno.pn.ecnonets.Transition;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.pnml.tools.epnk.pnmlcoremodel.PnmlcoremodelPackage;

import org.pnml.tools.epnk.pntypes.ptnet.PtnetPackage;

import org.pnml.tools.epnk.structuredpntypemodel.StructuredpntypemodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EcnonetsPackageImpl extends EPackageImpl implements EcnonetsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ecnoNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventUsesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaStatementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeDeclarationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedParameterEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dk.dtu.imm.se.ecno.pn.ecnonets.EcnonetsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EcnonetsPackageImpl() {
		super(eNS_URI, EcnonetsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EcnonetsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EcnonetsPackage init() {
		if (isInited) return (EcnonetsPackage)EPackage.Registry.INSTANCE.getEPackage(EcnonetsPackage.eNS_URI);

		// Obtain or create and register package
		EcnonetsPackageImpl theEcnonetsPackage = (EcnonetsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EcnonetsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EcnonetsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		StructuredpntypemodelPackage.eINSTANCE.eClass();
		PtnetPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEcnonetsPackage.createPackageContents();

		// Initialize created meta-data
		theEcnonetsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEcnonetsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EcnonetsPackage.eNS_URI, theEcnonetsPackage);
		return theEcnonetsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECNONet() {
		return ecnoNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Eventbinding() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Condition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Action() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Imports() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_Attributes() {
		return (EReference)pageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Structure() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBinding() {
		return eventBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBinding_Structure() {
		return (EReference)eventBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Structure() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventUses() {
		return eventUsesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventUses_Eventuse() {
		return (EReference)eventUsesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventUses_DropParent() {
		return (EAttribute)eventUsesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventUse() {
		return eventUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventUse_Name() {
		return (EAttribute)eventUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventUse_Expression() {
		return (EReference)eventUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventUse_Type() {
		return (EAttribute)eventUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventUse_Parameter() {
		return (EReference)eventUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaExpression() {
		return javaExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaExpression_Code() {
		return (EAttribute)javaExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaStatement() {
		return javaStatementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaStatement_Code() {
		return (EAttribute)javaStatementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImports() {
		return importsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImports_Text() {
		return (EAttribute)importsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDeclarations() {
		return attributeDeclarationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDeclarations_Text() {
		return (EAttribute)attributeDeclarationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedParameter() {
		return namedParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedParameter_Expression() {
		return (EReference)namedParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedParameter_Name() {
		return (EAttribute)namedParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedParameter_Optional() {
		return (EAttribute)namedParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnonetsFactory getEcnonetsFactory() {
		return (EcnonetsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ecnoNetEClass = createEClass(ECNO_NET);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__EVENTBINDING);
		createEReference(transitionEClass, TRANSITION__CONDITION);
		createEReference(transitionEClass, TRANSITION__ACTION);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__IMPORTS);
		createEReference(pageEClass, PAGE__ATTRIBUTES);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__STRUCTURE);

		eventBindingEClass = createEClass(EVENT_BINDING);
		createEReference(eventBindingEClass, EVENT_BINDING__STRUCTURE);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__STRUCTURE);

		eventUsesEClass = createEClass(EVENT_USES);
		createEReference(eventUsesEClass, EVENT_USES__EVENTUSE);
		createEAttribute(eventUsesEClass, EVENT_USES__DROP_PARENT);

		eventUseEClass = createEClass(EVENT_USE);
		createEAttribute(eventUseEClass, EVENT_USE__NAME);
		createEReference(eventUseEClass, EVENT_USE__EXPRESSION);
		createEAttribute(eventUseEClass, EVENT_USE__TYPE);
		createEReference(eventUseEClass, EVENT_USE__PARAMETER);

		javaExpressionEClass = createEClass(JAVA_EXPRESSION);
		createEAttribute(javaExpressionEClass, JAVA_EXPRESSION__CODE);

		javaStatementEClass = createEClass(JAVA_STATEMENT);
		createEAttribute(javaStatementEClass, JAVA_STATEMENT__CODE);

		importsEClass = createEClass(IMPORTS);
		createEAttribute(importsEClass, IMPORTS__TEXT);

		attributeDeclarationsEClass = createEClass(ATTRIBUTE_DECLARATIONS);
		createEAttribute(attributeDeclarationsEClass, ATTRIBUTE_DECLARATIONS__TEXT);

		namedParameterEClass = createEClass(NAMED_PARAMETER);
		createEReference(namedParameterEClass, NAMED_PARAMETER__EXPRESSION);
		createEAttribute(namedParameterEClass, NAMED_PARAMETER__NAME);
		createEAttribute(namedParameterEClass, NAMED_PARAMETER__OPTIONAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PtnetPackage thePtnetPackage = (PtnetPackage)EPackage.Registry.INSTANCE.getEPackage(PtnetPackage.eNS_URI);
		StructuredpntypemodelPackage theStructuredpntypemodelPackage = (StructuredpntypemodelPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredpntypemodelPackage.eNS_URI);
		PnmlcoremodelPackage thePnmlcoremodelPackage = (PnmlcoremodelPackage)EPackage.Registry.INSTANCE.getEPackage(PnmlcoremodelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ecnoNetEClass.getESuperTypes().add(thePtnetPackage.getPTNet());
		ecnoNetEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredPetriNetType());
		transitionEClass.getESuperTypes().add(thePnmlcoremodelPackage.getTransition());
		pageEClass.getESuperTypes().add(thePnmlcoremodelPackage.getPage());
		conditionEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		eventBindingEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		actionEClass.getESuperTypes().add(theStructuredpntypemodelPackage.getStructuredLabel());
		importsEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());
		attributeDeclarationsEClass.getESuperTypes().add(thePnmlcoremodelPackage.getLabel());

		// Initialize classes and features; add operations and parameters
		initEClass(ecnoNetEClass, ECNONet.class, "ECNONet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Eventbinding(), this.getEventBinding(), null, "eventbinding", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Condition(), this.getCondition(), null, "condition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Action(), this.getAction(), null, "action", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_Imports(), this.getImports(), null, "imports", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPage_Attributes(), this.getAttributeDeclarations(), null, "attributes", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Structure(), this.getJavaExpression(), null, "structure", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBindingEClass, EventBinding.class, "EventBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventBinding_Structure(), this.getEventUses(), null, "structure", null, 0, 1, EventBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Structure(), this.getJavaStatement(), null, "structure", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventUsesEClass, EventUses.class, "EventUses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventUses_Eventuse(), this.getEventUse(), null, "eventuse", null, 0, -1, EventUses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventUses_DropParent(), ecorePackage.getEBoolean(), "dropParent", null, 0, 1, EventUses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventUseEClass, EventUse.class, "EventUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEventUse_Name(), ecorePackage.getEString(), "name", null, 1, 1, EventUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventUse_Expression(), this.getJavaExpression(), null, "expression", null, 0, -1, EventUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEventUse_Type(), ecorePackage.getEString(), "type", null, 1, 1, EventUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventUse_Parameter(), this.getNamedParameter(), null, "parameter", null, 0, -1, EventUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaExpressionEClass, JavaExpression.class, "JavaExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaExpression_Code(), ecorePackage.getEString(), "code", null, 1, 1, JavaExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaStatementEClass, JavaStatement.class, "JavaStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaStatement_Code(), ecorePackage.getEString(), "code", null, 1, 1, JavaStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importsEClass, Imports.class, "Imports", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImports_Text(), ecorePackage.getEString(), "text", null, 0, 1, Imports.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDeclarationsEClass, AttributeDeclarations.class, "AttributeDeclarations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDeclarations_Text(), ecorePackage.getEString(), "text", null, 0, 1, AttributeDeclarations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedParameterEClass, NamedParameter.class, "NamedParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedParameter_Expression(), this.getJavaExpression(), null, "expression", null, 1, 1, NamedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, NamedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNamedParameter_Optional(), ecorePackage.getEBoolean(), "optional", null, 1, 1, NamedParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EcnonetsPackageImpl
