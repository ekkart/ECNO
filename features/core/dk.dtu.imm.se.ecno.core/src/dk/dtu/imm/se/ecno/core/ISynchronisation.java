package dk.dtu.imm.se.ecno.core;

public interface ISynchronisation {
	
	public SynchronisationType getSyncType();
	
	public IEventType getEvent();
	
	public IReference getReference();

}
