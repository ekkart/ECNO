package dk.dtu.imm.se.ecno.runtime.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InteractionComputationPriorityList {
	
	private Map<Integer,List<InteractionComputation>> priorities2List;
	
	public InteractionComputationPriorityList() {
		priorities2List = new HashMap<Integer,List<InteractionComputation>>();
	}
	
	public void add(InteractionComputation computation, int priority) {
		List<InteractionComputation> list = priorities2List.get(priority);
		if (list == null) {
			list = new ArrayList<InteractionComputation>();
			priorities2List.put(priority, list);
		}
		list.add(computation);
		for (Integer i: priorities2List.keySet()) {
			if (i < priority) {
				for (InteractionComputation other:  priorities2List.get(i)) {
					computation.addPreceeds(other);
				}
			} else if  (i > priority) {
				for (InteractionComputation other:  priorities2List.get(i)) {
					other.addPreceeds(computation);
				}
			}
		}
	}
	
	public void addToExploration(IExplorationStrategy exploration) {
		for (Integer i: priorities2List.keySet()) {
			for (InteractionComputation computation:  priorities2List.get(i)) {
				exploration.add(computation);
			}
		}		
	}

}
