package dk.dtu.imm.se.ecno.core;

import java.util.Set;

public interface IEventType extends IEventKind {

	public IEventType getDirectSuperType();

	public IEventType getTopSuper();

	public Set<IEventType> getSuperTypes();
	
	public boolean isCompatibleWith(IEventType eventType);

}
