/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package dk.dtu.imm.se.ecno.model.ecno.util;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.ETypedElement;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.INamespace;
import dk.dtu.imm.se.ecno.core.IReference;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoPackage;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.ImportedType;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dk.dtu.imm.se.ecno.model.ecno.EcnoPackage
 * @generated
 */
public class EcnoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EcnoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EcnoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EcnoPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EcnoSwitch<Adapter> modelSwitch =
		new EcnoSwitch<Adapter>() {
			@Override
			public Adapter caseElementType(ElementType object) {
				return createElementTypeAdapter();
			}
			@Override
			public Adapter caseEventType(EventType object) {
				return createEventTypeAdapter();
			}
			@Override
			public Adapter casePackage(dk.dtu.imm.se.ecno.model.ecno.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseCoordinationSet(CoordinationSet object) {
				return createCoordinationSetAdapter();
			}
			@Override
			public Adapter caseSynchronisation(Synchronisation object) {
				return createSynchronisationAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter caseFormalParameter(FormalParameter object) {
				return createFormalParameterAdapter();
			}
			@Override
			public Adapter caseIElementType(IElementType object) {
				return createIElementTypeAdapter();
			}
			@Override
			public Adapter caseIEventType(IEventType object) {
				return createIEventTypeAdapter();
			}
			@Override
			public Adapter caseISynchronisation(ISynchronisation object) {
				return createISynchronisationAdapter();
			}
			@Override
			public Adapter caseIFormalParameter(IFormalParameter object) {
				return createIFormalParameterAdapter();
			}
			@Override
			public Adapter caseIReference(IReference object) {
				return createIReferenceAdapter();
			}
			@Override
			public Adapter caseICoordinationSet(ICoordinationSet object) {
				return createICoordinationSetAdapter();
			}
			@Override
			public Adapter caseINamespace(INamespace object) {
				return createINamespaceAdapter();
			}
			@Override
			public Adapter caseImportedType(ImportedType object) {
				return createImportedTypeAdapter();
			}
			@Override
			public Adapter caseEventTypeExtension(EventTypeExtension object) {
				return createEventTypeExtensionAdapter();
			}
			@Override
			public Adapter caseString2EventTypeExtensionMap(Map.Entry<String, EventTypeExtension> object) {
				return createString2EventTypeExtensionMapAdapter();
			}
			@Override
			public Adapter caseIEventTypeExtension(IEventTypeExtension object) {
				return createIEventTypeExtensionAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseENamedElement(ENamedElement object) {
				return createENamedElementAdapter();
			}
			@Override
			public Adapter caseETypedElement(ETypedElement object) {
				return createETypedElementAdapter();
			}
			@Override
			public Adapter caseEParameter(EParameter object) {
				return createEParameterAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ElementType
	 * @generated
	 */
	public Adapter createElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.EventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventType
	 * @generated
	 */
	public Adapter createEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.CoordinationSet <em>Coordination Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.CoordinationSet
	 * @generated
	 */
	public Adapter createCoordinationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.Synchronisation <em>Synchronisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Synchronisation
	 * @generated
	 */
	public Adapter createSynchronisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.FormalParameter <em>Formal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.FormalParameter
	 * @generated
	 */
	public Adapter createFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.IElementType <em>IElement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.IElementType
	 * @generated
	 */
	public Adapter createIElementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.IEventType <em>IEvent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.IEventType
	 * @generated
	 */
	public Adapter createIEventTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.ISynchronisation <em>ISynchronisation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.ISynchronisation
	 * @generated
	 */
	public Adapter createISynchronisationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.IFormalParameter <em>IFormal Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.IFormalParameter
	 * @generated
	 */
	public Adapter createIFormalParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.IReference <em>IReference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.IReference
	 * @generated
	 */
	public Adapter createIReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.ICoordinationSet <em>ICoordination Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.ICoordinationSet
	 * @generated
	 */
	public Adapter createICoordinationSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.INamespace <em>INamespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.INamespace
	 * @generated
	 */
	public Adapter createINamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.ImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.ImportedType
	 * @generated
	 */
	public Adapter createImportedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension <em>Event Type Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension
	 * @generated
	 */
	public Adapter createEventTypeExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String2 Event Type Extension Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createString2EventTypeExtensionMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dk.dtu.imm.se.ecno.core.IEventTypeExtension <em>IEvent Type Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dk.dtu.imm.se.ecno.core.IEventTypeExtension
	 * @generated
	 */
	public Adapter createIEventTypeExtensionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ENamedElement <em>ENamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ENamedElement
	 * @generated
	 */
	public Adapter createENamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.ETypedElement <em>ETyped Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.ETypedElement
	 * @generated
	 */
	public Adapter createETypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EParameter <em>EParameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EParameter
	 * @generated
	 */
	public Adapter createEParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EcnoAdapterFactory
