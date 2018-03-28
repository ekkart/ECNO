package dk.dtu.imm.se.ecno.gui;

import java.awt.FlowLayout;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class ElementButtonPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	private ElementEventButton[] buttons;

	public ElementButtonPanel(ExecutionEngine engine, IPresentationUtil presentation, Object element) {
		super();

		IElementType elementType = engine.getElementType(element);

		Border etched = BorderFactory.createEtchedBorder();
		Border titled = BorderFactory.createTitledBorder(etched, 
				" " + (presentation != null ? presentation.getElementLabel(element) : "") + " ");

		this.setBorder(titled);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		List<IEventType> eventTypes = elementType.getGUIEventTypes();

		buttons = new  ElementEventButton[eventTypes.size()];
		for (int i= 0; i < eventTypes.size(); i++) {
			buttons[i] = new ElementEventButton(engine, presentation, element, eventTypes.get(i),this);
			buttons[i].initialize();
		}
	}

	public void dispose() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].dispose();
		}
	}

}
