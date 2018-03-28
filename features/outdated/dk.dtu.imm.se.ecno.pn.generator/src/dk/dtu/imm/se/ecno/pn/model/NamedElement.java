package dk.dtu.imm.se.ecno.pn.model;

import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.core.INamespace;

public abstract class NamedElement implements INamedElement {
	
	private String name;
	private Namespace container;

	public NamedElement(Namespace container, String name) {
		super();
		this.container = container;
		this.name = name;
		if (container != null) {
			container.addElement(this);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public INamespace getNamespace() {
		return container;
	}

}
