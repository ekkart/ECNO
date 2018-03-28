import org.eclipse.emf.ecore.EClassifier;

import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.EventContext;
import dk.dtu.imm.se.ecno.model.generator.EventExtensionContext;

public class CLASS {

	private String className;
	private String packageName;
	private String baseEventClassName;	
	
	private Context context;
	
	private EventTypeExtension eventTypeExtension;
	private EventExtensionContext eventTypeExtensionContext;
	
	private EventContext baseEventContext;	

	private void initialize(Object argument) {
		eventTypeExtensionContext =  (EventExtensionContext) argument;
		eventTypeExtension = eventTypeExtensionContext.getEventExtension();
		context = eventTypeExtensionContext.getContext();
		
		baseEventContext = eventTypeExtensionContext.getBaseEventContext();
		
		className =   eventTypeExtensionContext.getClassName();
		packageName = context.getEcnogenmodel().getBasePathECNOEvents();
		
		EventType baseEventType = eventTypeExtension.getBase();
		if (baseEventType == null) {
			baseEventClassName = "null";
		} else {
			baseEventClassName = baseEventContext.getContext().getEventValueClassQualifiedName(baseEventType.getName());
		}
	}

	public String generate(Object argument) {
		return "";
	} 
}