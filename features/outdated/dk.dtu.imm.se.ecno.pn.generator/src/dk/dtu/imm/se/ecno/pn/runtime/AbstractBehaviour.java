package dk.dtu.imm.se.ecno.pn.runtime;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.AbstractElementBehaviour;

public abstract class AbstractBehaviour extends AbstractElementBehaviour {
	
	public AbstractBehaviour(ExecutionEngine engine, IElementType type, Element element) {
		super(engine, type, element);
		element.registerListener(this);
		
	}
	
	void notifyChange(Element element) {
		notifyChangeListeners();
	}

}
