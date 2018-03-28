package coded.util;

import workflow.Case;
import workflow.Marking;
import workflow.PetriNet;
import workflow.Place;
import workflow.Token;
import workflow.WorkflowFactory;

public class PlaceUtil {
	
	private static PlaceUtil instance;

	final WorkflowFactory factory = WorkflowFactory.eINSTANCE;
	
	public static PlaceUtil getInstance()  {
		if (instance != null)
			return instance;
		else 
			return new PlaceUtil();
		
	}

	public boolean containsToken(Place place, Marking marking) 
	{
		for (Token token : marking.getTokens())
			if (token.getPlace() == place) return true;
		
		return false;	
	}
	
	public void removeToken(Place place, Marking marking) 
	{
		for (Token token : marking.getTokens())
			if (token.getPlace() == place) 
			{
				marking.getTokens().remove(token);
				
				Case case_ = (Case) marking.eContainer().eContainer();
				if (!case_.isStarted()) case_.setStarted(true);
				
				return;
			}
		
		throw new RuntimeException("Could not remove token!");	
	}
	
	public void addToken(Place place, Marking marking) {
		
		Token token = factory.createToken();
		token.setPlace(place);
		marking.getTokens().add(token);
		
		PetriNet ecnonet = (PetriNet) place.eContainer();
		if (ecnonet.getFinish() == place) {
			Case case_ = (Case) marking.eContainer().eContainer();
			case_.setFinished(true);
		}

	}
	
}

