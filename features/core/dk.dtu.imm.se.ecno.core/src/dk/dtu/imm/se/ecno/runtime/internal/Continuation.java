package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.List;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IPackageAdapter;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;

public abstract class Continuation {
	
	// TODO eki: the adapter should probably be replaced with the engine
	//           in order to make the Engine work with different instances.
	
	final protected ExecutionEngine engine;
	
	protected Object element;
	protected IPackageAdapter adapter;
	protected IElementType type;
	
	public final int priority;

	public Continuation(ExecutionEngine engine, Object element) {
		this(engine, element, 0);
	}
	
	public Continuation(ExecutionEngine engine, Object element, int priority) {
		super();
		this.engine = engine;
		this.element = element;
		this.adapter = engine.getPackageAdapter(element);
		this.type = engine.getElementType(element);
		this.priority = priority;
	}
	
	protected Continuation(Continuation continuation, CopyMappings mappings) {
		this(continuation.engine, continuation.element, continuation.priority);
	}
	
	public Object getElement() {
		return element;
	}
	
	public abstract List<Continuation[]> computeContinuations(Interaction interaction, InteractionIterator iterator);

	public abstract Continuation copy(CopyMappings mappings);

}
