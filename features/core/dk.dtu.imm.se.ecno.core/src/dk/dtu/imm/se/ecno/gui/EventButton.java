package dk.dtu.imm.se.ecno.gui;

import javax.swing.JButton;
import javax.swing.JToolTip;

@SuppressWarnings("serial")
public class EventButton extends JButton {
	
	public JToolTip createToolTip() {
		MultiLineToolTip tip = new MultiLineToolTip();
		tip.setComponent(this);
		return tip;
	}

}
