package dk.dtu.imm.se.ecno.pn.model;

import java.util.List;

import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.ISynchronisation;

public class CoordinationSet implements ICoordinationSet {
	
	private IEventType type;
	
	private List<ISynchronisation> synchronisations;
	
	

	public CoordinationSet(IEventType type,
			List<ISynchronisation> sychronisations) {
		super();
		this.type = type;
		this.synchronisations = sychronisations;
	}

	@Override
	public IEventType getTriggerEventType() {

		return type;
	}

	@Override
	public List<ISynchronisation> getSynchonisationsList() {
		return synchronisations;
	}

	@Override
	public int getPriority() {
		// TODO: for now, in this implementation of the ECNO model, there
		//       all priorities are 0
		return 0;
	}

}
