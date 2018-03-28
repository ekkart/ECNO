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