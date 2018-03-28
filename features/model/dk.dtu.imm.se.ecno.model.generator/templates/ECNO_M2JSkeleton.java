import java.util.Set;

import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.EventTypeExtension;
import dk.dtu.imm.se.ecno.model.ecno.FormalParameter;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.ECNOModelContext;

public class CLASS {

	private String className;
	private String packageName;
	
	private Context context;
	private ECNOModelContext mcontext;

	private void initialize(Object argument) {
		mcontext = (ECNOModelContext) argument;
		context = mcontext.getContext();
		className = mcontext.getModelClassName();
		packageName = mcontext.getModelClassPath();
	}

	public String generate(Object argument) {
		return "";
	} 
}