package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import dk.dtu.imm.se.ecno.runtime.CopyMappings;
import dk.dtu.imm.se.ecno.runtime.Interaction;

public class InteractionComputation {

	private Interaction interaction;
	private List<Continuation> stack;
	
	private Set<InteractionComputation> preceedsInteractions;
	private Set<InteractionComputation> succeedsInteractions;

	public InteractionComputation(Interaction interaction,
			List<Continuation> stack) {
		this(interaction, stack, new HashSet<InteractionComputation>(),new HashSet<InteractionComputation>());
	}
	
	public InteractionComputation(Interaction interaction,
			List<Continuation> stack,
			Set<InteractionComputation> preceedsInteractions,
			Set<InteractionComputation> succeedsInteractions) {
		super();
		this.interaction = interaction;
		this.stack = stack;
		this.preceedsInteractions = preceedsInteractions;
		this.succeedsInteractions = succeedsInteractions;
	}

	public Interaction getInteraction() {
		return interaction;
	}

	public List<Continuation> getStack() {
		return stack;
	}

	public void addPreceeds(InteractionComputation computation) {
		preceedsInteractions.add(computation);
	}
	
	public void removePreceeds(InteractionComputation computation) {
		preceedsInteractions.remove(computation);
	}
	
	public Set<InteractionComputation> getPreceeds() {
		return Collections.unmodifiableSet(preceedsInteractions);
	}
	
	public Set<InteractionComputation> getSucceeds() {
		return Collections.unmodifiableSet(succeedsInteractions);
	}
	
	public void addSucceeds(InteractionComputation computation) {
		succeedsInteractions.add(computation);
	}
	
	public void removeSucceeds(InteractionComputation computation) {
		succeedsInteractions.remove(computation);
	}
	
	public InteractionComputation copy(CopyMappings mappings) {
		Interaction interaction = this.interaction.copy(mappings);
		
		List<Continuation> stack =  new ArrayList<Continuation>();
		for (Continuation continuation: this.stack) {
			stack.add(continuation.copy(mappings));
		}
		
		return new InteractionComputation(interaction, stack, 
				new HashSet<InteractionComputation>(this.preceedsInteractions),
				new HashSet<InteractionComputation>(this.succeedsInteractions));
	}

}
