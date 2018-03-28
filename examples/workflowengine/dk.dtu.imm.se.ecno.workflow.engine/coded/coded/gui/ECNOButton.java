/**
 * This class links one button to multiple elements via connectors. 
 * If an interaction using at least one of the agent elements as partner is found,
 * the button enables.
 * 
 * TODO: This is bad (too complicated). Consider using a single "login manager" element which knows 
 * agents via coordination. That way the GUI only talks to the manager not to all agents. 
 */


package coded.gui;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;

public class ECNOButton extends JButton {

	HashMap<ECNOConnector, Boolean> connectors = new HashMap<ECNOConnector, Boolean>();
	ECNOConnector active = null;
	
	public ECNOButton(String string) {
		super(string);
	}

	public void putEnabled(ECNOConnector connector, Boolean enabled) {
		
		// Update status for this connector
		connectors.put(connector, enabled);
		
		// Set active connector (randomly if there are two or more enabled)
		for (Map.Entry<ECNOConnector, Boolean> entry : connectors.entrySet()) 
		    if (entry.getValue() == true) {
		    	active = entry.getKey();
		    	super.setEnabled(true);
		    	return;
		    }
		
		active = null;
		super.setEnabled(false);

	}
	
	public ECNOConnector getActive() {
		return active;
	}
	
	public void putParamaterValueWithUpdate(String paramterName, Object parameterValue) {
		
		for (Map.Entry<ECNOConnector, Boolean> entry : connectors.entrySet()) {
			ECNOConnector connector = entry.getKey();
			connector.putParameterValueWithUpdate(paramterName, parameterValue);
		}

	}
	
}
