package coded.gui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JFrame;

import workflow.coordination.WorkflowEcnoModel;
import dk.dtu.imm.se.ecno.core.ICoordinationSet;
import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

abstract public class JFrameECNO extends JFrame implements IWorkflowGUI {
	
	protected ExecutionEngine executionEngine;
	protected WorkflowEcnoModel model;
	protected HashMap<Object, Object> object2GuiObjectMap = new HashMap<Object, Object>();
	protected HashMap<Object, Object> guiObject2ObjectMap = new HashMap<Object, Object>(); 
	
	protected List<ECNOConnector> ecnoConnectors = new ArrayList<ECNOConnector>();
	
	public JFrameECNO(ExecutionEngine executionEngine, WorkflowEcnoModel model) {
		super();
		this.executionEngine = executionEngine; 
		this.model = model;
	}
	
	/**
	 * Currently ECNO connectors have the following purposes:
	 * 
	 * 1) Notify its owner (most likely a GUI) when event enable status changes on this particular element.
	 * 2) Add parameters to an event (most likely coming from the GUI).
	 * 3) Execute enabled events (start an interaction). 
	 *
	 * @param element
	 * @param eventTypeName
	 */

	public ECNOConnector registerEcnoConnector(Object element, String eventTypeName) {
		
		IElementType  elementType = model.getElementType(element);
		if (elementType != null) {

			for (ICoordinationSet coordinationSet:elementType.getCoordinationSetsList()) {
				IEventType eventType = coordinationSet.getTriggerEventType();
				if (eventType != null) {
					if (eventType.getName().equals(eventTypeName)) { 
						ECNOConnector connector = new ECNOConnector(executionEngine, element, eventType, this);
						connector.initialize();
						this.ecnoConnectors.add(connector);
						return connector;
					}
				}
			}
		}
		
		return null;
	}


	public ECNOConnector getEcnoConnector(Object element, String eventTypeName) {
		
		// TODO: this is not efficient
		
		for (ECNOConnector connector : ecnoConnectors) {
			if (connector.element.equals(element))
				if (connector.eventType.getName().equals(eventTypeName)) {
					return connector;
				}
					
		}
		
		return null;
	
	}
	

	@Override
	public void eventDidEnable(boolean enabled, ECNOConnector caller) {
		// TODO Auto-generated method stub
		
	}
	
	
	protected void addGuiMapping(Object object, Object guiObject) {
		object2GuiObjectMap.put(object, guiObject);
		guiObject2ObjectMap.put(guiObject, object);
	}
	
	protected void removeGuiMapping(Object object) {
		
		Object guiObject = object2GuiObjectMap.get(object);
		object2GuiObjectMap.remove(object);
		guiObject2ObjectMap.remove(guiObject);
		
	}
	
	
	
	
}