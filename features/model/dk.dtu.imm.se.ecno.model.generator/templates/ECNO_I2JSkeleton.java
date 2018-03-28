import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.InstanceContext;

public class CLASS {

	private String className;
	private String packageName;

	private InstanceContext instancecontext;
	// private Context context;
	// private ECNOModelContext mcontext;

	private List<EObject> contents;

	private void initialize(Object argument) {
		instancecontext =  (InstanceContext) argument;
		// mcontext = new ECNOModelContext(context);

		contents = instancecontext.getContainedEObjects();

		className =   instancecontext.getInstanceClassName();
		packageName = instancecontext.getInstanceClassPackage();		
	}

	public String generate(Object argument) {
		return "";
	} 
}