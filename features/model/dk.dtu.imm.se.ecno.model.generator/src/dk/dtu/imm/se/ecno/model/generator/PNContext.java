package dk.dtu.imm.se.ecno.model.generator;

import org.eclipse.emf.ecore.EClass;
import org.pnml.tools.epnk.helpers.FlatAccess;
import org.pnml.tools.epnk.pnmlcoremodel.PetriNet;

import dk.dtu.imm.se.ecno.pn.ecnonets.EventBinding;
import dk.dtu.imm.se.ecno.pn.ecnonets.EventUse;
import dk.dtu.imm.se.ecno.pn.ecnonets.Transition;

public class PNContext {
	
	final private Context context;
	final private PetriNet net;
	final private EClass eclass;
	
	private FlatAccess flatNet;
	private boolean usesNamedParametersOnly = false;

	public PNContext(Context context, PetriNet net, EClass clazz) {
		super();
		this.context = context;
		this.net = net;
		this.eclass = clazz;
	}

	public Context getContext() {
		return context;
	}


	public PetriNet getNet() {
		return net;
	}

	public EClass getEClass() {
		return eclass;
	}
	
	public boolean usesNamedParametersOnly() {
		if (flatNet == null) {
			flatNet = FlatAccess.getFlatAccess(net);
			for (org.pnml.tools.epnk.pnmlcoremodel.Transition transition: flatNet.getTransitions()) {
				if (transition instanceof Transition) {
					Transition t = (Transition) transition;
					EventBinding binding = t.getEventbinding();
					if (binding != null && binding.getStructure() != null) {
						for (EventUse eventUse: binding.getStructure().getEventuse()) {
							if (eventUse.getExpression() != null && !eventUse.getExpression().isEmpty()) {
								return false;
							}
						}
					}
				}
			}
			this.usesNamedParametersOnly = true;
		}
		return this.usesNamedParametersOnly;
	}

}
