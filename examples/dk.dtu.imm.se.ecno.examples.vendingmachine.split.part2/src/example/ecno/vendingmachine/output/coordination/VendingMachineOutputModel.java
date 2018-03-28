/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. This class defines ECNO Model and provides the
 * adapter to the ECNO EMF engine.
 */
package example.ecno.vendingmachine.output.coordination;

import org.eclipse.emf.common.util.EList;

import example.emf.vendingmachineoutput.VendingmachineoutputPackage;
import example.ecno.vendingmachine.output.automata.VendingMachineOutputBehaviour;

import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IEventTypeExtension;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.runtime.EventExtension_Values;
import dk.dtu.imm.se.ecno.runtime.Event_Values;

import dk.dtu.imm.se.ecno.model.adapter.EMFPackageAdapter;
import dk.dtu.imm.se.ecno.model.ecno.CoordinationSet;
import dk.dtu.imm.se.ecno.model.ecno.EcnoFactory;
import dk.dtu.imm.se.ecno.model.ecno.ElementType;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.model.ecno.Reference;
import dk.dtu.imm.se.ecno.model.ecno.Synchronisation;
import dk.dtu.imm.se.ecno.model.ecno.SynchronisationType;

public class VendingMachineOutputModel extends EMFPackageAdapter {


	private EventType eventtype_cup_in;
	private EventType eventtype_cup_out;


	private ElementType elementtype_Output;
	private ElementType elementtype_Brewer;

	private Reference referencetype_Output_brewer;


	private VendingMachineOutputModel(ExecutionEngine engine) {
		super (new VendingMachineOutputBehaviour(engine));
		createModel();
	}

	protected void createModel() {
		EcnoFactory ecno_factory = EcnoFactory.eINSTANCE;
		VendingmachineoutputPackage pack = VendingmachineoutputPackage.eINSTANCE;

		getNamespace().setEPackage(pack);
		getNamespace().setUri("example.ecno.vendingmachine.output");


		eventtype_cup_in = ecno_factory.createEventType();
		eventtype_cup_in.setName("cup_in");
		eventtype_cup_in.setPackageURI("example.ecno.vendingmachine");
		eventtype_cup_in.setTypeName("cup_in");
		addEventType(eventtype_cup_in);

		eventtype_cup_out = ecno_factory.createEventType();
		eventtype_cup_out.setName("cup_out");
		eventtype_cup_out.setGui(true);
		addEventType(eventtype_cup_out);



		elementtype_Output = ecno_factory.createElementType();
		elementtype_Output.setEClass(pack.getOutput());
		elementtype_Output.setGui(true);
		addElementType(elementtype_Output);

		elementtype_Brewer = ecno_factory.createElementType();
		elementtype_Brewer.setPackageURI("example.ecno.vendingmachine");
		elementtype_Brewer.setTypeName("Brewer");
		addElementType(elementtype_Brewer);



		EList<Reference> references;

		references = elementtype_Output.getReferences();
		referencetype_Output_brewer = ecno_factory.createReference();
		referencetype_Output_brewer.setEReference(pack.getOutput_Brewer());
		referencetype_Output_brewer.setTarget(elementtype_Brewer);
		references.add(referencetype_Output_brewer);


		Synchronisation synch;
		CoordinationSet cset;

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_cup_in);
		synch = ecno_factory.createSynchronisation();
		synch.setReference(referencetype_Output_brewer);
		synch.setEventType(eventtype_cup_in);
		synch.setType(SynchronisationType.ONE);
		cset.getSynchronisations().add(synch);
		elementtype_Output.getCoordinationSets().add(cset);

		cset = ecno_factory.createCoordinationSet();
		cset.setTriggerEvent(eventtype_cup_out);
		elementtype_Output.getCoordinationSets().add(cset);

	}

	public Class<? extends Event_Values> getEventValuesClass(IEventType type) {
		{
			return null;
		}
	}

	public Class<? extends EventExtension_Values> getEventValuesClass(IEventTypeExtension eventTypeExtension) {
		{
			return null;
		}
	}

	public static VendingMachineOutputModel getModel(ExecutionEngine engine) {
		return new VendingMachineOutputModel(engine);
	}

}
