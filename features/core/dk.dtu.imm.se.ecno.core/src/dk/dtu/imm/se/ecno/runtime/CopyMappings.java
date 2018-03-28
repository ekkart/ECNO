package dk.dtu.imm.se.ecno.runtime;

import java.util.HashMap;
import java.util.Map;

public class CopyMappings {
	
	private Map<IChoice,IChoice> choices;
	private Map<Event,Event> events;
	
	public CopyMappings() {
		choices = new HashMap<IChoice,IChoice>();
		events = new HashMap<Event,Event>();
	}
	
	public IChoice getCopy(IChoice choice) {
		if (choice != null) {
			IChoice result = choices.get(choice);
			if (result == null) {
				result = choice.copy(this);
				choices.put(choice, result);
				
				// ekki 20.10.2015: Make sure to copy also choices that contain this one
				// in order to consistently copy continuations referring to both the 
				// container an a part of it; in the context how the engine currently
				// uses this, this would not be needed, since the container will be
				// copied at some point when copying computations, continuations, and
				// choices. But, to be safe, we copy it here, since otherwise a copy
				// of a contained choice might not be an exact copy (the copy
				// not being contained in a container at all) in some contexts.
				/* Since this is not strictly necessary, not included in the current
				 * experimental release 0.3.3x
				IChoice container = null;
				IChoice ancestor = choice;
				while (ancestor != null) {
					container = ancestor;
					ancestor = container.getChoiceContainer();			
				}
				if (container != null) {
					this.getCopy(container);
				}
				*/
			}
			return result;
		} else {
			return null;
		}
	}
	
	public Event getCopy(Event event) {
		if (event != null) {
			Event result = events.get(event);
			if (result == null) {
				result = event.copy(this);
				events.put(event, result);
			}
			return result;
		} else { 
			return null;
		}
	}

}
