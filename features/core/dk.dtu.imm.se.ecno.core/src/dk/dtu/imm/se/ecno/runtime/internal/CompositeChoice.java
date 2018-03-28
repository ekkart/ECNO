package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.Collection;

import dk.dtu.imm.se.ecno.core.IElementBehaviour;
import dk.dtu.imm.se.ecno.runtime.IChoice;

public abstract interface CompositeChoice extends IChoice {

	public abstract Collection<IElementBehaviour> getBehaviours(); 

}
