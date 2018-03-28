/**
 * This is a manually programmed class for setting up the customized GUI
 * for the Workers example. This class defines an ECNO instance running
 * with the customized GUI; it can be started via the main method
 * (Run As -> Java Application).
 */
package dk.dtu.imm.se.ecno.examples.workers.instances;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.examples.workers.coordination.WorkersModel;
import dk.dtu.imm.se.ecno.examples.workers.gui.WorkersGUI;

public class SettingWorkersGUI {

    public static void main(String[] args) {
    	ExecutionEngine engine = ExecutionEngine.createNewInstance();
    	WorkersModel model = WorkersModel.getModel(engine);
    	engine.addPackageAdapter(model);
    	if (!engine.resolveNamespaceImports()) {
    		System.err.println("Package imports could not be resolved");
    	}
    	new WorkersGUI(engine, model);
    	Setting instance = new Setting();
    	// Note: to create an instance from here, made the method createInstance in
    	//       the automatically generated class Setting visible for the package.
    	instance.createInstance(engine);
    }

}
