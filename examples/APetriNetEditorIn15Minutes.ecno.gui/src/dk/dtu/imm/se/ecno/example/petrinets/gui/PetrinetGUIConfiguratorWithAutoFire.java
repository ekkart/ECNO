package dk.dtu.imm.se.ecno.example.petrinets.gui;

import org.eclipse.core.commands.operations.IOperationHistory;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import PetriNets.PetriNet;
import PetriNets.Transition;
import PetriNets.diagram.part.PetriNetDiagramEditorUtil;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ObjectReference;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;

/**
 * This is a controller configurator, which installs the graphical
 * editor as a graphical GUI for the ECNO simulation of Petri nets along
 * with the standard ECNO GUI for interacting with the simulation.
 * 
 * @author Ekkart Kindler, ekki@dtu.dk
 *
 */
public class PetrinetGUIConfiguratorWithAutoFire implements IControllerConfigurator, IController {

	private IEditorPart editor = null;
	private ExecutionEngine engine = null;
	private TransactionalEditingDomain domain = null;
	private Diagram diagram = null;
	private PetriNet petrinet = null;
	private PetrinetContentListener listener = null;
	
	private IEventType fireEvent = null;

	
	@Override
	public void initializeControllers(ExecutionEngine engine,
			ControllerState state) {
		this.engine = engine;

		if (state instanceof ObjectReference) {
			EObject object = ((ObjectReference) state).getObject();
			if (object instanceof Diagram) {
				diagram = (Diagram) object;
				EObject element = diagram.getElement();
				if (element instanceof PetriNet) {
					petrinet = (PetriNet) element;
					listener = new PetrinetContentListener(engine);		
					petrinet.eAdapters().add(listener);

					if (!petrinet.getObject().isEmpty()) {
						
						INamedElement event = engine.getPackageAdapter(petrinet.getObject().get(0)).getNamespace().getElement("fire");
						if (event instanceof IEventType) {
							fireEvent = (IEventType) event;
						}
					}
				}
				ResourceSet resourceSet = object.eResource().getResourceSet();
				final IOperationHistory operationHistory = OperationHistoryFactory.getOperationHistory();
				domain = GMFEditingDomainFactory.getInstance().createEditingDomain(resourceSet, operationHistory);
				domain.setID("APetriNetEditorIn15Minutes.diagram.EditingDomain");
				
				Runnable runnable = new Runnable()  {
					@Override
					public void run() {
						try {
							editor = PetriNetDiagramEditorUtil.openDiagram(diagram, operationHistory);
						} catch (PartInitException e) {
							e.printStackTrace();
						}
					}
				};

				if (Display.getDefault().getThread().equals(Thread.currentThread())) {
					runnable.run();
				} else {
					Display.getDefault().syncExec(runnable);
				}
			}
		}
		ECNOGUI.createECNOGUI(engine);
		engine.addController(this);
	}

	
	
	@Override
	public void addElement(Object element) {
		if (fireEvent != null && element instanceof Transition) {
			(new FireTransitionController(engine, (Transition) element, fireEvent)).initialize();
		}
		
	}

	@Override
	public void removeElement(Object element) {
		
	}

	@Override
	public void elementEncountered(Object element) {
		
	}

	@Override
	synchronized public void dispose() {
		if (editor != null) {
			Runnable runnable = new Runnable()  {
				@Override
				public void run() {
					IWorkbench workbench = PlatformUI.getWorkbench();
					if (workbench != null) {
						IWorkbenchWindow window = workbench.getActiveWorkbenchWindow();
						if (window != null) {
							IWorkbenchPage page = window.getActivePage();
							if (page != null) {
								page.closeEditor(editor, false);
							}		    		
						}
					}
				}
			};
			if (Display.getDefault().getThread().equals(Thread.currentThread())) {
				runnable.run();
			} else {
				Display.getDefault().syncExec(runnable);
			}
			editor = null;
		}
		
		if (petrinet != null) {
			if (listener != null) {
				petrinet.eAdapters().remove(listener);
				listener = null;
			}
			petrinet = null;
		}
		
		if (domain != null) {
			domain.dispose();	
		}
		
		if (engine != null) {
			engine.removeController(this);
			engine = null;
		}
	}

}
