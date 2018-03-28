package coded.util;

import workflow.Activity;
import workflow.ActivityAspect;
import workflow.ActivityI;
import workflow.ActivityO;
import workflow.Case;
import workflow.CaseAspect;
import workflow.CaseC;
import workflow.CaseI;
import workflow.CaseO;
import workflow.InformationRuntimeAspect;
import workflow.RuntimeCoreModel;
import workflow.RuntimeModelAspect;
import workflow.Task;
import workflow.TaskAspect;
import workflow.TaskC;
import workflow.TaskI;
import workflow.TaskO;
import workflow.WorkflowFactory;
import workflow.impl.ActivityIImpl;
import workflow.impl.ActivityOImpl;
import workflow.impl.CaseCImpl;
import workflow.impl.CaseIImpl;
import workflow.impl.CaseOImpl;
import workflow.impl.TaskCImpl;
import workflow.impl.TaskIImpl;
import workflow.impl.TaskOImpl;

public class GlobalUtil {
	
	private static GlobalUtil instance;

	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static GlobalUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new GlobalUtil();
		
	}

	public TaskO getTaskO(Task task) {

		for (TaskAspect aspect : task.getAspects()) 
			if (aspect instanceof TaskOImpl) {
				return (TaskO) aspect;

			}

		return null;
	}
	
	public TaskC getTaskC(Task task) {

		for (TaskAspect aspect : task.getAspects()) 
			if (aspect instanceof TaskCImpl) {
				return (TaskC) aspect;

			}

		return null;
	}
	
	public TaskI getTaskI(Task task) {

		for (TaskAspect aspect : task.getAspects()) 
			if (aspect instanceof TaskIImpl) {
				return (TaskI) aspect;

			}

		return null;
	}
	
	public CaseC getCaseC(Case case_) {

		for (CaseAspect aspect : case_.getAspects()) 
			if (aspect instanceof CaseCImpl) {
				return (CaseC) aspect;

			}

		return null;
	}
	
	public CaseI getCaseI(Case case_) {

		for (CaseAspect aspect : case_.getAspects()) 
			if (aspect instanceof CaseIImpl) {
				return (CaseI) aspect;

			}

		return null;
	}
	
	public CaseO getCaseO(Case case_) {

		for (CaseAspect aspect : case_.getAspects()) 
			if (aspect instanceof CaseOImpl) {
				return (CaseO) aspect;

			}

		return null;
	}
	
	public ActivityO getActivityO(Activity activity) {
		
		for (ActivityAspect aspect : activity.getAspects()) 
			if (aspect instanceof ActivityOImpl) {
				return (ActivityO) aspect;

			}
		
		return null;
	}
	
	public ActivityI getActivityI(Activity activity) {
		
		for (ActivityAspect aspect : activity.getAspects()) 
			if (aspect instanceof ActivityIImpl) {
				return (ActivityI) aspect;

			}
		
		return null;
	}
	
	public InformationRuntimeAspect getInformationRuntimeAspect(RuntimeCoreModel runtimeCoreModel) {
		
		for (RuntimeModelAspect aspect : runtimeCoreModel.getAspects()) 
			if (aspect instanceof InformationRuntimeAspect)
				return (InformationRuntimeAspect)aspect;
			
				
		return null;
	}
}

