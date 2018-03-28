package coded.gui;

import java.util.HashMap;
import java.util.List;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.engine.ElementEventController;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class ECNOConnector extends ElementEventController {
	
	private IWorkflowGUI gui;
	private HashMap<String, Object> parameterValues = new HashMap<String, Object>();

	
	public ECNOConnector(ExecutionEngine engine, Object element,
			IEventType eventType, IWorkflowGUI gui) {
		
		super(engine, element, eventType);
		
		this.gui = gui;
		
	}	

	@Override
	protected void setEnabled(boolean enabled) {
		gui.eventDidEnable(enabled, this);
	}

	@Override
	protected void destroy() {
		// TODO Auto-generated method stub	
	}
	
	@Override
	protected Event getEvent() {
		Event event = super.getEvent();

		if (parameterValues != null) {
			List<IFormalParameter> params = event.getType().getFormalParametersList();
			
			for (IFormalParameter fparam : params) {
				String fparamName = fparam.getName(); 
				Parameter param = event.getParameter(fparam);
				if (parameterValues.containsKey(fparamName)) 
					param.setValue(parameterValues.get(fparamName));		
			}

		}
		
		return event;

	}
	
	public void putParameterValueWithUpdate(String paramterName, Object parameterValue) {
		parameterValues.put(paramterName, parameterValue);

		this.update();
	}
	
	public Object getParameterValue(String paramterName) {
		
		Event event = this.getEvent();
		
		List<IFormalParameter> params = event.getType().getFormalParametersList();
		
		Object paramValue = null;
		
		for (IFormalParameter fparam : params) {
			String fparamName = fparam.getName();
			if (fparam.getName().equals(paramterName))
				paramValue = event.getParameter(fparam).getValue();
		}
		
		return paramValue;
		
	}
	
	public boolean elementEventTypeEquals(Class class_, String eventName) {
		
		if (element.getClass().equals(class_) && eventType.getName().equals(eventName))
			return true;
		
		return false;

	}

}

