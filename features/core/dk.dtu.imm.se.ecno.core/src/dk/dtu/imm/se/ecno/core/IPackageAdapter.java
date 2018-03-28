package dk.dtu.imm.se.ecno.core;

import java.util.List;

import dk.dtu.imm.se.ecno.runtime.EventExtension_Values;
import dk.dtu.imm.se.ecno.runtime.Event_Values;

public interface IPackageAdapter {
	
	public IElementType getElementType(Object element);
	
	public boolean supportsElementType(IElementType type);
	
    public IElementBehaviour createElementBehaviour(Object element, IElementType type);
	
    public List<Object> getLinks(Object element, ISynchronisation reference);
    
    public boolean supportsEventType(IEventType eventType);
    
    public boolean supportsEventTypeExtension(IEventTypeExtension eventTypeExtension);
    
    public Class<? extends Event_Values> getEventValuesClass(IEventType eventType);
    
    public Class<? extends EventExtension_Values> getEventValuesClass(IEventTypeExtension eventTypeExtension);
    
    public INamespace getNamespace();
	    
}
