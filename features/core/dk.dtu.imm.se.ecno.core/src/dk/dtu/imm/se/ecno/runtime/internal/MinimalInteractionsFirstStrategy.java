package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class MinimalInteractionsFirstStrategy implements IExplorationStrategy{
	
	final private static Comparator<InteractionComputation> sizeComparator = new Comparator<InteractionComputation>() {

		@Override
		public int compare(InteractionComputation arg0, InteractionComputation arg1) {
			int result = arg0.getInteraction().size() - arg1.getInteraction().size();
			if (result != 0 || arg0.equals(arg1)) {
				return result;
			} else {
				// FIXME even though, we use the system's identity hash code, these hash codes are
				//       NOT guaranteed to be different for different objects in all Java 
				//       implementations. This should work for most implementations though.
				//       To be sure that this works for all implementations, the InteractionComputation
				//       class would need to implement a separate id, which is guaranteed to
				//       be unique.
				return System.identityHashCode(arg0) - System.identityHashCode(arg1);
			}
		}
	};
	
	private final SortedSet<InteractionComputation> computations;
	private final List<InteractionComputation> suspended;
	
	public MinimalInteractionsFirstStrategy() {
		computations = new TreeSet<InteractionComputation>(sizeComparator);
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
		if (!computations.isEmpty()) {
			InteractionComputation result = computations.first();
			computations.remove(result);
			removeSucceeds(result);
			return result;
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


