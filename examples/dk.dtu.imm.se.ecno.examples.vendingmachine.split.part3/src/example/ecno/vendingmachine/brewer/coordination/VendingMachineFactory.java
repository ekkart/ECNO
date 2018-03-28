/**
 * This is an automatically generated class. It was generated by the
 * ECNO framework. This class defines ECNOPackageAdapterFactory and which 
 * provides access to the package adapter of the model for the ECNO EMF engine.
 */
package example.ecno.vendingmachine.brewer.coordination;

import dk.dtu.imm.se.ecno.eclipse.adapterfactory.IPackageAdapterFactory;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

public class VendingMachineFactory implements IPackageAdapterFactory {

	public VendingMachineModel getModel(ExecutionEngine engine) {
		return VendingMachineModel.getModel(engine);
	}

	public String getECNOPackageURI() {
		return "example.ecno.vendingmachine.brewers";
	}

}
