package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstStrategy implements IExplorationStrategy{

	private final List<InteractionComputation> computations;
	private final List<InteractionComputation> suspended;
	
	public DepthFirstStrategy() {
		computations = new ArrayList<InteractionComputation>();
		suspended = new ArrayList<InteractionComputation>();
	}
	
	@Override
	public boolean isEmpty() {
		return computations.isEmpty();
	}

	@Override
	public void add(InteractionComputation computation) {
		addSucceeds(computation);
		if (computation.getSucceeds().isEmpty()) {
			computations.add(computation);
		} else {
			suspended.add(computation);
		}
	}

	@Override
	public InteractionComputation remove() {
		int size = computations.size();
		if (size > 0) {
			InteractionComputation computation = computations.remove(size-1);
			removeSucceeds(computation);
			return computation;
		} else {
			return null;
		}
	}
	
	private void removeSucceeds(InteractionComputation computation) {
		for (InteractionComputation other: computation.getPreceeds()) {
			other.removeSucceeds(computation);
			if (other.getSucceeds().isEmpty() && suspended.remove(other)) {
				computations.add(other);
			}
		}
	}
	
	private void addSucceeds(InteractionComputation computation) {
		for (InteractionComputation other: computation.getPreceeds()) {
			other.addSucceeds(computation);
			if (computations.remove(other)) {
				suspended.add(other);
			}
		}
	}
	
	public void discard(InteractionComputation computation) {
		for (InteractionComputation other: computation.getPreceeds()) {
			if (!suspended.remove(other)) {
				computations.remove(other);
			}
			discard(other);
		}
	}

}
