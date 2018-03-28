package coded.util;

import workflow.Task;
import workflow.TaskAspect;
import workflow.Transition;
import workflow.WorkflowFactory;

public class TransitionUtil {
	
	private static TransitionUtil instance;

	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static TransitionUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new TransitionUtil();
		
	}

	public boolean isTaskAspectOf(Task task, Transition transition) {
		
		for (TaskAspect aspect : task.getAspects()) {
			if (aspect == transition) return true;
		}
		
		return false;
		
	}
	
}

