/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.pn.ecnonets.impl;

import dk.dtu.imm.se.ecno.pn.ecnonets.*;

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
public class EcnonetsFactoryImpl extends EFactoryImpl implements EcnonetsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EcnonetsFactory init() {
		try {
			EcnonetsFactory theEcnonetsFactory = (EcnonetsFactory)EPackage.Registry.INSTANCE.getEFactory("http://se.imm.dtu.dk/ecno/ecnonets"); 
			if (theEcnonetsFactory != null) {
				return theEcnonetsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EcnonetsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnonetsFactoryImpl() {
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
			case EcnonetsPackage.ECNO_NET: return createECNONet();
			case EcnonetsPackage.TRANSITION: return createTransition();
			case EcnonetsPackage.PAGE: return createPage();
			case EcnonetsPackage.CONDITION: return createCondition();
			case EcnonetsPackage.EVENT_BINDING: return createEventBinding();
			case EcnonetsPackage.ACTION: return createAction();
			case EcnonetsPackage.EVENT_USES: return createEventUses();
			case EcnonetsPackage.EVENT_USE: return createEventUse();
			case EcnonetsPackage.JAVA_EXPRESSION: return createJavaExpression();
			case EcnonetsPackage.JAVA_STATEMENT: return createJavaStatement();
			case EcnonetsPackage.IMPORTS: return createImports();
			case EcnonetsPackage.ATTRIBUTE_DECLARATIONS: return createAttributeDeclarations();
			case EcnonetsPackage.NAMED_PARAMETER: return createNamedParameter();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECNONet createECNONet() {
		ECNONetImpl ecnoNet = new ECNONetImpl();
		return ecnoNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBinding createEventBinding() {
		EventBindingImpl eventBinding = new EventBindingImpl();
		return eventBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventUses createEventUses() {
		EventUsesImpl eventUses = new EventUsesImpl();
		return eventUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventUse createEventUse() {
		EventUseImpl eventUse = new EventUseImpl();
		return eventUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExpression createJavaExpression() {
		JavaExpressionImpl javaExpression = new JavaExpressionImpl();
		return javaExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaStatement createJavaStatement() {
		JavaStatementImpl javaStatement = new JavaStatementImpl();
		return javaStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imports createImports() {
		ImportsImpl imports = new ImportsImpl();
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDeclarations createAttributeDeclarations() {
		AttributeDeclarationsImpl attributeDeclarations = new AttributeDeclarationsImpl();
		return attributeDeclarations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedParameter createNamedParameter() {
		NamedParameterImpl namedParameter = new NamedParameterImpl();
		return namedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnonetsPackage getEcnonetsPackage() {
		return (EcnonetsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EcnonetsPackage getPackage() {
		return EcnonetsPackage.eINSTANCE;
	}

} //EclanetsFactoryImpl
