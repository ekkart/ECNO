import java.util.List;

import org.eclipse.emf.ecore.EClass;

import dk.dtu.imm.se.ecno.model.generator.BehaviourAdapterContext;
import dk.dtu.imm.se.ecno.model.generator.Context;

public class CLASS {
	
	private Context context;
	private List<EClass> eclasses;
	
	private void initialize(Object argument) {
		BehaviourAdapterContext behAdapterContext = (BehaviourAdapterContext) argument;

		context = behAdapterContext.getContext();
		eclasses = behAdapterContext.getClasses();
	}

	public String generate(Object argument) {
		return "";
	} 
}