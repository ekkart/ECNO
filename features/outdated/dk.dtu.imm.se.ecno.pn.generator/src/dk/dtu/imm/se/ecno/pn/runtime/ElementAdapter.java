package dk.dtu.imm.se.ecno.pn.runtime;

import java.util.ArrayList;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import dk.dtu.imm.se.ecno.pn.model.CoordinationReference;
import dk.dtu.imm.se.ecno.pn.model.ElementType;
import dk.dtu.imm.se.ecno.pn.model.EventType;
import dk.dtu.imm.se.ecno.pn.model.Package;
import dk.dtu.imm.se.ecno.runtime.EventExtension_Values;
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public class ElementAdapter implements IPackageAdapter {
	
	final private ExecutionEngine engine;
	final private Package pack;
	
    public ElementAdapter(ExecutionEngine engine, Package pack) {
    	super();
    	this.engine = engine;
    	this.pack = pack;
    }

	@Override
	public IElementType getElementType(Object element) {
		if (element instanceof Element) {
			return ((Element) element).getElementType();
		}	
		return null;
	}
	
	public boolean supportsElementType(IElementType type) {
		return type instanceof ElementType;
	}

	@Override
	public IElementBehaviour createElementBehaviour(Object element, IElementType type) {
		if (element instanceof Element && type instanceof ElementType) {
			return ((ElementType) type).createBehaviour(engine, (Element) element);
		}
		return null;
	}

	@Override
	public List<Object> getLinks(Object element, ISynchronisation reference) {
		ArrayList<Object> result = new ArrayList<Object>();
		if (element instanceof Element && reference instanceof CoordinationReference) {
		    Element[] list = ((Element) element).getLinks(((CoordinationReference)reference).getReference());
		    for (int i=0; i< list.length; i++) {
		    	result.add(list[i]);
		    }
		}
		return result;
	}

	@Override
	public boolean supportsEventType(IEventType eventType) {
		return eventType instanceof EventType;
	}

	@Override
	public Class<? extends Event_Values> getEventValuesClass(IEventType eventType) {
		if (eventType instanceof EventType) {
			return ((EventType) eventType).getEventValuesClass();
		}
		return null;
	}

	@Override
	public Package getNamespace() {
		return pack;
	}

	@Override
	public boolean supportsEventTypeExtension(
			IEventTypeExtension eventTypeExtension) {
		// TODO This adapter for manually implementing ECNO models does not yet support EventTypeExtensions
		return false;
	}

	@Override
	public Class<? extends EventExtension_Values> getEventValuesClass(
			IEventTypeExtension eventTypeExtension) {
		// TODO This adapter for manually implementing ECNO models does not yet support EventTypeExtensions
		return null;
	}

}
