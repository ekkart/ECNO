package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.List;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;

public class Failure extends Continuation {

	public Failure(ExecutionEngine engine, Object element) {
		super(engine, element);
	}
	
	protected Failure(Continuation continuation, CopyMappings mappings) {
		super(continuation, mappings);
	}

	@Override
	public List<Continuation[]> computeContinuations(Interaction interaction, InteractionIterator iterator) {
		return null;
	}

	@Override
	public Continuation copy(CopyMappings mappings) {
		return new Failure(this,mappings);
	}

}
