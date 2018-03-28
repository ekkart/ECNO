package dk.dtu.imm.se.ecno.core;

import java.util.List;

public interface IElementType extends INamedElement{
	
	public String getName();
	
	public ISynchronisation[][] getCoordinationSets(IEventType eventType);
	
	public List<ICoordinationSet> getCoordinationSetsList();
	
    public List<IEventType> getGUIEventTypes();	
    
    public IElementType getSuperElementType();
    
    public boolean isDerivedFrom(IElementType elementType);
    
    public boolean isParallelTriggerEvent(IEventType eventType);

}
