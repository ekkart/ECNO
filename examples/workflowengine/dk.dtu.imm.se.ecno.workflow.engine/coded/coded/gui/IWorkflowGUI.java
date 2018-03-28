package coded.gui;


public interface IWorkflowGUI {
	
	public void setEnabled(boolean enabled);

	void eventDidEnable(boolean enabled, ECNOConnector caller);
	
}