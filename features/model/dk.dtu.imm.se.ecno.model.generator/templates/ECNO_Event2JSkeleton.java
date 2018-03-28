import org.eclipse.emf.ecore.EClassifier;

import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.EventContext;

public class CLASS {

	private String className;
	private String packageName;
	private String superClassName;	
	
	private Context context;
	private EventType event;
	
	private EventContext eventcontext;
	
	// private List<IFormalParameter> inheritedParameters;

	private void initialize(Object argument) {
		eventcontext =  (EventContext) argument;
		event = eventcontext.getEvent();
		context = eventcontext.getContext();
		
		className =   eventcontext.getClassName();
		packageName = context.getEcnogenmodel().getBasePathECNOEvents();
		
		EventType superType = event.getSuper();
		if (superType == null) {
			superClassName = "Event_Values";
		} else {
			superClassName = context.getEventValueClassQualifiedName(superType.getName());
		}
		
		// inheritedParameters = new ArrayList<IFormalParameter>(event.getFormalParametersList());
		// inheritedParameters.removeAll(event.getParameters());
	}

	public String generate(Object argument) {
		return "";
	} 
}