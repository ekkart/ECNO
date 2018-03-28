import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dk.dtu.imm.se.ecno.model.generator.PNContext;
import dk.dtu.imm.se.ecno.model.generator.Context;
import dk.dtu.imm.se.ecno.model.generator.util.ECNO_M2JGeneratorUtil;

import dk.dtu.imm.se.ecno.pn.ecnonets.Action;
import dk.dtu.imm.se.ecno.pn.ecnonets.AttributeDeclarations;
import dk.dtu.imm.se.ecno.pn.ecnonets.Condition;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUses;
import dk.dtu.imm.se.ecno.pn.ecnonets.Imports;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaExpression;
import dk.dtu.imm.se.ecno.pn.ecnonets.JavaStatement;
import dk.dtu.imm.se.ecno.pn.ecnonets.Page;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.Arc;
import org.pnml.tools.epnk.pnmlcoremodel.Name;
import org.pnml.tools.epnk.pnmlcoremodel.Node;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;
import org.pnml.tools.epnk.pnmlcoremodel.Place;
import org.pnml.tools.epnk.pnmlcoremodel.PlaceNode;
import org.pnml.tools.epnk.pnmlcoremodel.Transition;
import org.pnml.tools.epnk.pnmlcoremodel.TransitionNode;
import org.pnml.tools.epnk.pntypes.ptnet.PTMarking;

public class CLASS {
	
	private PNContext pncontext;
	private Context context;
	private PetriNet pn;
	private EClass eclass;

	private String className;
	private String packageName;
	
	private String selfClassQualifiedName;
	
	private int noPlaces;
	private int noTransitions;

	private HashMap<Integer,Place> intPlaces;
	private HashMap<Integer,Transition> intTransitions;
	private HashMap<Place,Integer> placesInt;
	private HashMap<Transition,Integer> transitionsInt;
	
	private List<Imports> imports;
	private List<AttributeDeclarations> attributeDeclarations;
	
	private FlatAccess flatnet;

	private void initialize(Object argument) {
		pncontext = (PNContext) argument;
		pn = pncontext.getNet();
		context = pncontext.getContext();
		eclass = pncontext.getEClass();
		
		flatnet = FlatAccess.getFlatAccess(pn);
		
		className = eclass.getName();
		packageName = context.getBehaviourClassPath();
		
		selfClassQualifiedName = context.getClassPackage(eclass) + "." + context.getClassName(eclass);
		
		noPlaces = 0;
		intPlaces = new HashMap<Integer,Place>();
		placesInt = new HashMap<Place,Integer>();
		
		for (Place place : flatnet.getPlaces()) {
			intPlaces.put(noPlaces,place);
			placesInt.put(place,noPlaces);
			noPlaces++;
		}
		
		noTransitions = 0;
		intTransitions = new HashMap<Integer,Transition>();
		transitionsInt = new HashMap<Transition,Integer>();
		
		for (Transition transition : flatnet.getTransitions()) {
			intTransitions.put(noTransitions,transition);
			transitionsInt.put(transition,noTransitions);
			noTransitions++;
		}
		
		imports = new ArrayList<Imports>();
		attributeDeclarations = new ArrayList<AttributeDeclarations>();
		
		for (org.pnml.tools.epnk.pnmlcoremodel.Object object: org.pnml.tools.epnk.helpers.NetFunctions.getAllNetObjects(pn)) {
			if (object instanceof Page) {
				Page page = (Page) object;
				imports.addAll(page.getImports());
				attributeDeclarations.addAll(page.getAttributes());
			}
		}
	}

	/* not used anymore
	private Place getPlace(int p) {
		if (intPlaces != null) {
			return intPlaces.get(p);
		} 

		return null;
	}
	*/
	
	private int getPlaceMarking(int p) {
		Place place = intPlaces.get(p);
		if (place instanceof org.pnml.tools.epnk.pntypes.ptnet.Place) {
			PTMarking marking = ((org.pnml.tools.epnk.pntypes.ptnet.Place) place).getInitialMarking();
			if (marking != null) {
				return marking.getText().getValue();
			}
		}
		return 0;
	}

	private int getPlaceNo(Node n) {
		if (!(n instanceof Place) && n instanceof PlaceNode) {
			n = flatnet.resolve((PlaceNode) n);
		}
		
		if (n instanceof Place && placesInt != null) {
			Place p = (Place) n;
			return placesInt.get(p).intValue();
		}

		return -1;
	}

	private Transition getTransition(int t) {
		if (intTransitions != null) {
			return intTransitions.get(t);
		} 

		return null;
	}
	
	private boolean getTransitionDropParent(int t) {
		dk.dtu.imm.se.ecno.pn.ecnonets.Transition transition = (dk.dtu.imm.se.ecno.pn.ecnonets.Transition) getTransition(t);
		if (transition != null) {
			EventBinding binding = transition.getEventbinding();
			if (binding != null) {
				EventUses uses = binding.getStructure();
				return uses.isDropParent();
			}
		}
		return false;		
	}

	private int getTransitionNo(Node n) {
		if (!(n instanceof Transition) && n instanceof TransitionNode) {
			n = flatnet.resolve((TransitionNode) n);
		}
		
		if (n instanceof Transition && transitionsInt != null) {
			Transition p = (Transition) n;
			return transitionsInt.get(p).intValue();
		}

		return -1;
	}
	
	private String getNodeName(Node node) {
		String result = null;
		
		Name name = node.getName();
		if (name != null) {
			result = name.getText();
		}
		
		if (result == null) {
			result = node.getId();
		}
		
		if (result == null) {
			if (node instanceof Place) {
				int no = getPlaceNo(node);
				result = "p" + (no >= 0 ? no : "X");
			}
		}
		
		if (result == null) {
			if (node instanceof Transition) {
				int no = getTransitionNo(node);
				result = "t" + (no >= 0 ? no : "X");
			}
		}
		
		return result;
	}
	
	/* not used anymore (the attribute className is used in the templates instead
	   Maybe, this should be changed in the templates again
	private String getClassName() {
		return className;
	}
	*/

	public String generate(Object argument) {
		return "";
	}
}