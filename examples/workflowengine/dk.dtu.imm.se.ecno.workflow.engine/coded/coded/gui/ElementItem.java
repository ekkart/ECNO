package coded.gui;

import java.util.ArrayList;
import java.util.List;

import workflow.Activity;
import workflow.Case;
import workflow.Document;
import workflow.Process;
import workflow.impl.ActivityImpl;
import workflow.impl.CaseImpl;
import workflow.impl.DocumentImpl;
import workflow.impl.ProcessImpl;

public class ElementItem {
	
	private Object element;
	private List<ECNOConnector> connectors = new ArrayList<ECNOConnector>();
	
	ElementItem(Object element) {
		this.element = element;
	}
	
	ElementItem(Object element, ECNOConnector connector) {
		this.element = element;
		connectors.add(connector);
	}
	
	public void addConnector(ECNOConnector connector) {
		connectors.add(connector);
	}
	
	public ECNOConnector getConnector(String eventName) {
		
		for (ECNOConnector connector : connectors) {
			if(connector.eventType.getName().equals(eventName)) return connector;
		}
		
		throw new RuntimeException("Connector not found");
		
	}
	
	public ECNOConnector getConnector() {
		
		if (connectors.size()!=1) 
			throw new RuntimeException("This method only works with a single connector");
		
		return connectors.get(0);
		
	}
	
	
	public String toString() {
		
		if (element instanceof CaseImpl) {
			Case case_ = (Case)element;
			if (case_.isStarted())
				return case_.getProcess().getName()+" ("+case_.getId()+")";
			else
				return case_.getProcess().getName()+" (initialized)";
						
					
		}
		
		if (element instanceof ProcessImpl) 
			return ((Process)element).getName();
		
		if (element instanceof ActivityImpl) {
			Activity activity = (Activity)element;
			Case case_ = (Case) activity.eContainer();
			return activity.getTask().getName()+" -- in "+case_.getProcess().getName()+" ("+case_.getId()+")";
		}
		
		if (element instanceof DocumentImpl) {
			Document doc = (Document)element;
			return "("+doc.getId()+") "+doc.getName()+" : "+((workflow.DefaultDocumentType)doc.getDocumentType()).getName();
		}
		
		return "unknown element";
	}

	public Object getElement() {
		
		return element;
	}
	
}
