package dk.dtu.imm.se.ecno.model.generator;

import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;

public class EventExtensionContext {
	
	final private Context context;
	final private EventContext baseEventContext;
	
	final private EventTypeExtension eventExtension;
	
	final private boolean hasOwnCollectiveParameters;

	public EventExtensionContext(Context context, EventTypeExtension eventExtension) {
		super();
		this.context = context;
		this.eventExtension = eventExtension;
		this.baseEventContext = new EventContext(context, eventExtension.getBase());
		boolean collective = false;
		for (FormalParameter formalParameter: eventExtension.getParameters()) {
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
	
	public EventContext getBaseEventContext() {
		return baseEventContext;
	}

	public EventTypeExtension getEventExtension() {
		return eventExtension;
	}
	
	public String getClassName() {
		return Utils.getClassName(eventExtension.getName());
	}
	
	public boolean hasOwnCollectiveParameters() {
		return hasOwnCollectiveParameters;
	}

}
