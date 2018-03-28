package dk.dtu.imm.se.ecno.gui;

import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.Interaction;

public interface IPresentationUtil {
	
	public String getElementLabel(Object element);

	public String getEventLabel(Event event);
	
	public String getInteractionLabel(Interaction interaction);

}
