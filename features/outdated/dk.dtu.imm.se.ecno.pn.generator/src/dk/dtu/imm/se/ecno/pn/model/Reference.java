package dk.dtu.imm.se.ecno.pn.model;

import dk.dtu.imm.se.ecno.core.IReference;

public class Reference extends NamedElement implements IReference {
	
	private ElementType source;
	private ElementType target; 

	public Reference(ElementType source, String name, ElementType target) {
		super(source, name);
		this.source = source;
		this.target = target;
		
		if (source != null && target != null ) {
			source.addReference(this);
		}
	}

	public ElementType getSourceElementType() {
		return source;
	}

	public ElementType getTargetElementType() {
		return target;
	}

}
