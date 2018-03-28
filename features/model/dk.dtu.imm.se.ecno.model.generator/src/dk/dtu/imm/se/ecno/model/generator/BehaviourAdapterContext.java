package dk.dtu.imm.se.ecno.model.generator;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

public class BehaviourAdapterContext {
	
	final private Context context;
	final private List<EClass>  classes;
	


	public BehaviourAdapterContext(Context context, List<EClass> classes) {
		super();
		this.context = context;
		this.classes = classes;
	}

	public Context getContext() {
		return context;
	}

	public List<EClass> getClasses() {
		return classes;
	}

}
