package dk.dtu.imm.se.ecno.core;

import java.util.Collection;

public interface IEventTypeExtension extends IEventKind {
	
	public IEventType getBaseEventType();
	
	public Collection<String> getSuperEventTypeExtensionKeys();
	
	public IEventTypeExtension getSuperTypeExtension(String key);

}
