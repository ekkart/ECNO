package dk.dtu.imm.se.ecno.pn.model;

import dk.dtu.imm.se.ecno.core.ISynchronisation;
import dk.dtu.imm.se.ecno.core.SynchronisationType;

public class CoordinationReference implements ISynchronisation {
	
	private Reference reference;
	private EventType eventType;	
	private SynchronisationType coordType;

	public CoordinationReference(
			Reference reference,
			EventType eventType,
			SynchronisationType coordType) {
		this.reference = reference;
		this.eventType = eventType;
		this.coordType = coordType;
	}

	public Reference getReference() {
		return reference;
	}
	
	/*
	public ElementType getSource() {
		if (reference != null) {
			return reference.getSource();
		} else {
			return null;
		}
	}

	public ElementType getTarget() {
		if (reference != null) {
			return reference.getTarget();
		} else {
			return null;
		}	}
    */
	
	public EventType getEvent() {
		return eventType;
	}

	public SynchronisationType getSyncType() {
		return coordType;
	}

}
