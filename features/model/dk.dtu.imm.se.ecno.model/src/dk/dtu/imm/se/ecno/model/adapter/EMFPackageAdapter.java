package dk.dtu.imm.se.ecno.model.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.model.ecno.EcnoFactory;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.Package;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.runtime.EventExtension_Values;

public abstract class EMFPackageAdapter implements IPackageAdapter {

	final Package ecnoPackage;

	final Map<EClass,IElementType> eclass2type;
	
	final EMFBehaviourAdaptor behaviourAdaptor;
	
	protected EMFPackageAdapter(EMFBehaviourAdaptor behaviourAdaptor) {
		eclass2type = new HashMap<EClass,IElementType>();
		this.behaviourAdaptor = behaviourAdaptor; 
		ecnoPackage = EcnoFactory.eINSTANCE.createPackage();
	}
	
	@Override
	public IElementType getElementType(Object element) {		
		if (element instanceof EObject) {
			EObject object = (EObject) element;
			IElementType result = eclass2type.get(object.eClass());
			return result;
		}
		return null;
	}
	
	@Override
	public boolean supportsElementType(IElementType type) {
		if (this.behaviourAdaptor != null && type instanceof ElementType) {
			return this.behaviourAdaptor.supportsEClass(((ElementType) type).getEClass());
		} else {
			return false;
		}
	}

	public IElementBehaviour createElementBehaviour(Object element, IElementType type) {
		if (behaviourAdaptor != null && type instanceof ElementType) {
			return behaviourAdaptor.createElementBehaviour(element, (ElementType) type);
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> getLinks(Object element, ISynchronisation reference) {
		if (element instanceof EObject && reference instanceof Synchronisation) {
			EObject object = (EObject) element;
			Synchronisation synchronisation = (Synchronisation) reference;
			EReference ref = synchronisation.getReference().getEReference();
			
			Object content = object.eGet(ref);
			if (content != null) {
				if (ref.isMany() && content instanceof EList) {
					return new ArrayList<Object>((List<EObject>) content);
				} else if (!ref.isMany()) {
					ArrayList<Object> result = new ArrayList<Object>();
					result.add(content);
					return result;
				}
			}	
		}
		return null;
	}

	@Override
	public boolean supportsEventType(IEventType eventType) {
		return ecnoPackage.getEventTypes().contains(eventType);
	}

	@Override
	public boolean supportsEventTypeExtension(
			IEventTypeExtension eventTypeExtension) {
		return ecnoPackage.getEventTypeExtensions().contains(eventTypeExtension);
	}

	@Override
	public Class<? extends EventExtension_Values> getEventValuesClass(IEventTypeExtension extension) {
		// should be overridden by subclasses
		// TODO once the generators are adjusted to this setting, this can actually be deleted
		//      from here, to make it easier to spot problems with the generated code.
		return null;
	}
	
	/**
	 * Returns the package behind this package adapter. Note that this method
	 * might eventually be deleted; the getNamespace() method should be used instead.
	 * 
	 * @deprecated
	 * @return
	 */
	public Package getPackage() {
		return ecnoPackage;
	}
	
	public Package getNamespace() {
		return ecnoPackage;
	}

	protected void addElementType(ElementType type) {
		if (type.getPackageURI() == null || type.getPackageURI().equals("")) {
			eclass2type.put(type.getEClass(), type);
		}
		ecnoPackage.getElementTypes().add(type);
	}

	protected void addEventType(EventType type) {
		ecnoPackage.getEventTypes().add(type);
	}
	
	protected void addEventTypeExtension(EventTypeExtension typeExtension) {
		ecnoPackage.getEventTypeExtensions().add(typeExtension);
	}

}
