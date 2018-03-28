package dk.dtu.imm.se.ecno.core;

import java.util.List;

public interface ICoordinationSet {
	
	public IEventType getTriggerEventType();

	public List<ISynchronisation> getSynchonisationsList();
	
	public int getPriority();

}
