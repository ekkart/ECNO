package dk.dtu.imm.se.ecno.model.generator;

import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;

public class EventContext {
	
	final private Context context;
	
	final private EventType event;
	
	final private boolean hasOwnCollectiveParameters;

	public EventContext(Context context, EventType event) {
		super();
		this.context = context;
		this.event = event;
		boolean collective = false;
		for (FormalParameter formalParameter: event.getParameters()) {
			if (formalParameter.isCollective()) {
				collective = true;
				break;
			}
		}
		hasOwnCollectiveParameters = collective;
	}

	public Context getContext() {
		return context;
	}

	public EventType getEvent() {
		return event;
	}
	
	public String getClassName() {
		return Utils.getClassName(event.getName());
	}
	
	public boolean hasOwnCollectiveParameters() {
		return hasOwnCollectiveParameters;
	}

}
