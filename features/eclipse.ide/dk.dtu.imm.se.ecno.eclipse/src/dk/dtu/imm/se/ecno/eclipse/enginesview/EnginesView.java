package dk.dtu.imm.se.ecno.eclipse.enginesview;

import java.util.EventObject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import dk.dtu.imm.se.ecno.eclipse.enginesregistry.ECNOEngineRegistry;
import dk.dtu.imm.se.ecno.eclipse.enginesregistry.EngineWrapper;
import dk.dtu.imm.se.ecno.eclipse.enginesregistry.IEngineRegistryListener;
import dk.dtu.imm.se.ecno.engine.EngineTerminatedException;
import dk.dtu.imm.se.ecno.runtime.transactions.Transaction;
import dk.dtu.imm.se.ecno.runtime.transactions.TransactionManager;

/**
 * This is a simple view that shows the ECNO engines that are currently running
 * (under the control of the ECNOEngineRegistry.
 * 
 * @author ekki@dtu.dk
 */
public class EnginesView extends ViewPart implements ISelectionChangedListener, IEngineRegistryListener {
	
	private static final String[] columnHead = new String[] 
			{ "Engine name", "Resource name/path" };
	private static final int[] columnWidth = new int[] 
			{ 100, 500 };
	private static final int[] columnAlignment = new int[] 
			{ SWT.LEFT, SWT.LEFT };
	
	private EngineWrapper selected;

	/**
	 * The viewer that shows the overview.
	 */
	private CheckboxTableViewer viewer;
	
	/**
	 * This is a callback method that is used to create the viewer and 
	 * initialize it.
	 */
	public void createPartControl(Composite parent) {
		selected = null;
		
        viewer = CheckboxTableViewer.newCheckList(parent, SWT.FULL_SELECTION | SWT.MULTI);
        viewer.setContentProvider(new ArrayContentProvider());
		viewer.setLabelProvider(new EnginesTableLabelProvider());

		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
	
		TableColumn[] columns = new TableColumn[columnHead.length];
		
        for (int i=0; i < columnHead.length; i++) {
        	columns[i] = new TableColumn(table, columnAlignment[i]);
        	columns[i].setText(columnHead[i]);
        	columns[i].setWidth(columnWidth[i]);
        }
        
		TableViewerColumn viewerColumn = new TableViewerColumn(viewer, columns[0]);
		viewerColumn.setEditingSupport(new EngineNameEditingSupport(viewer));
		viewerColumn.setLabelProvider(new EngineNameColumnLabeProvider());
				
		viewer.addSelectionChangedListener(this);
		
        ECNOEngineRegistry registry = ECNOEngineRegistry.getInstance();
        
		viewer.setInput(registry.getEngineWrappers());
		registry.addListener(this);
		
		createViewActions();
	}
	

	private Action undoAction;
	private Action redoAction;
	private Action resetAction;
	
	private Action saveEnginesStateAction;
	private Action infoEngineAction;
	private Action deleteEnginesAction;
	private IActionBars actionBars;
	
	private CommandStackListener commandStackListener;
	
	private void createViewActions() {
		undoAction = new Action() {
			public void run() {
				EngineWrapper wrapper = EnginesView.this.selected;
				if (wrapper != null) {
					TransactionalEditingDomain domain = wrapper.getDomain();
					if (domain != null) {
						// make sure undo runs exclusively in engine (since undo/redo is probably
						// not thread safe -- did not check that yet).
						wrapper.engine.lockExclusive();
						if (domain.getCommandStack().canUndo()) {
							TransactionManager manager = wrapper.engine.getTransactionManager();
							Transaction transaction;
							try {
								transaction = manager.startTransaction();
							} catch (Exception e) {
								wrapper.engine.unlock();
								return;
							}
							
							boolean success = true;
							
							if (success) {
								try {
									domain.getCommandStack().undo();
								} catch (Exception e) {}
							}
							
							try {
								manager.stopTransaction(transaction);
							} catch (Exception e) {}
						}
						wrapper.engine.unlock();
					}
				}
			}
		};
		undoAction.setId("Undo");
		undoAction.setText("Undo previous interaction");
		undoAction.setToolTipText("Undoes the previous interaction.");
		undoAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_BACK));
		
		redoAction = new Action() {
			public void run() {
				EngineWrapper wrapper = EnginesView.this.selected;
				if (wrapper != null) {
					TransactionalEditingDomain domain = wrapper.getDomain();
					if (domain != null) {
						// make sure undo runs exclusively in engine (since undo/redo is probably
						// not thread safe -- did not check that yet).
						wrapper.engine.lockExclusive();
						if (domain.getCommandStack().canRedo()) {
							TransactionManager manager = wrapper.engine.getTransactionManager();
							Transaction transaction;
							try {
								transaction = manager.startTransaction();
							} catch (Exception e) {
								wrapper.engine.unlock();
								return;
							}
							
							boolean success = true;							
							if (success) {
								try {
									domain.getCommandStack().redo();
								} catch (Exception e) {}
							}
							
							try {
								manager.stopTransaction(transaction);
							} catch (Exception e) {}
						}
						wrapper.engine.unlock();
					}
				}
			}
		};
		redoAction.setId("Redo");
		redoAction.setText("Redo next interaction");
		redoAction.setToolTipText("Redoes the next interaction.");
		redoAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_TOOL_FORWARD));
		
		resetAction = new Action() {
			public void run() {
				EngineWrapper wrapper = EnginesView.this.selected;
				if (wrapper != null) {
					TransactionalEditingDomain domain = wrapper.getDomain();
					if (domain != null) {
						domain.getCommandStack().flush();
						updateUndoRedoActions();
					}
				}
			}
		};
		resetAction.setId("Clear");
		resetAction.setText("Clear Command Stack");
		resetAction.setToolTipText("Clears the command stack");
		resetAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ETOOL_CLEAR));
		
		infoEngineAction = new Action() {
			public void run() {
				EngineWrapper wrapper = EnginesView.this.selected;
				if (wrapper != null) {
					try {
						MessageDialog.openInformation(
								null,
								"ECNO: Engine statistics",
								wrapper.getEngineStats());
					} catch (EngineTerminatedException e) {
						MessageDialog.openInformation(
								null,
								"ECNO: Engine statistics",
								"Engine terminated!");
					}
				}
			}
		};
		infoEngineAction.setId("infoEngineAction");
		infoEngineAction.setText("Statistics of selected engine");
		infoEngineAction.setToolTipText("Shows the statistics of the selected engine.");
		infoEngineAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_OBJS_INFO_TSK));
		
		saveEnginesStateAction = new Action() {
			public void run() {
				EngineWrapper wrapper = EnginesView.this.selected;
				if (wrapper != null && wrapper.isSavable()) {
					try {
						wrapper.save();
					} catch (EngineTerminatedException e) {
						// TODO maybe, there should be a message dialog here to inform the user
						//      that there was a problem with saving the bahviours
					}
				}
			}
		};
		
		saveEnginesStateAction.setId("saveEnginesAction");
		saveEnginesStateAction.setText("Save selected engine");
		saveEnginesStateAction.setToolTipText("Saves the state of the selecte engine.");
		saveEnginesStateAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ETOOL_SAVE_EDIT));
		
		
		deleteEnginesAction = new Action() {
			public void run() {
				final Object[] elements = EnginesView.this.viewer.getCheckedElements();
				// In order to avoid problems with the Swing GUI shut down on OS X,
				// the shut down of the engine is delegated to another thread (which
				// is not a Display thread)
				Thread thread = new Thread() {
					@Override
					public void run() {

						final ECNOEngineRegistry registry = ECNOEngineRegistry.getInstance();
						for (int i=0; i < elements.length; i++) {
							if (elements[i] instanceof EngineWrapper) {
								registry.remove((EngineWrapper) elements[i]);
							}

						}
						Display.getDefault().asyncExec(new Runnable() {

							@Override
							public void run() {
								EnginesView.this.viewer.setInput(registry.getEngineWrappers());
							}

						});
					}
				};
				thread.start();
			}
		};
		deleteEnginesAction.setId("deleteEngineAction");
		deleteEnginesAction.setText("Delete selected engines");
		deleteEnginesAction.setToolTipText("Delete the checked engines (check the engines in the table below).");
		deleteEnginesAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().
			getImageDescriptor(ISharedImages.IMG_ETOOL_DELETE));
		// deleteEnginesAction.setEnabled(EnginesView.this.viewer.getCheckedElements().length > 0);
		
		actionBars = getViewSite().getActionBars();
		actionBars.getToolBarManager().add(undoAction);
		actionBars.getToolBarManager().add(resetAction);
		actionBars.getToolBarManager().add(redoAction);
		actionBars.getToolBarManager().add(new Separator("save-separator"));
		actionBars.getToolBarManager().add(saveEnginesStateAction);
		actionBars.getToolBarManager().add(infoEngineAction);
		actionBars.getToolBarManager().add(new Separator("delete-separator"));
		actionBars.getToolBarManager().add(deleteEnginesAction);
		actionBars.getToolBarManager().update(false);
		
		commandStackListener = new CommandStackListener() {

			@Override
			public void commandStackChanged(EventObject arg0) {
				/*
				Display.getDefault().asyncExec(new Runnable() {

					@Override
					public void run() {
						EnginesView.this.updateUndoRedoActions();
					}
				
				});
				*/
				
				// In order to avoid possible deadlocks due to concurrent threads, this
				// update needs to be called right away (does not need to be in the
				// Display thread.
				EnginesView.this.updateUndoRedoActions();
			}
			
		};
		if (selected != null && selected.getDomain() != null) {
			selected.getDomain().getCommandStack().addCommandStackListener(commandStackListener);
		}
		updateActions();
	}
	
	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	/**
	 * Removes this view as SelectionListener when the view is disposed.
	 */
    public void dispose() {
        super.dispose();
        ECNOEngineRegistry registry = ECNOEngineRegistry.getInstance();
		registry.removeListener(this);
    }
	
	/**
	 *  Method required by SelectionListener interface, which will
	 *  be called, when the selection is changed so that the view
	 *  is updated accordingly.
	 *
	 */
	@Override
	public void selectionChanged(SelectionChangedEvent event) {
		if (selected != null && selected.getDomain() != null) {
			CommandStack stack = selected.getDomain().getCommandStack();
			if (stack != null) {
				stack.removeCommandStackListener(commandStackListener);
			}
		}
		if (event.getSource() == viewer) {
			ISelection selection = event.getSelection();
			if (selection.isEmpty()) {
				selected = null;		
			} else if (selection instanceof IStructuredSelection) {
				IStructuredSelection structuredSelection = (IStructuredSelection) selection;
				if (structuredSelection.size() == 1) {
					Object object = structuredSelection.getFirstElement();
					if (object instanceof EngineWrapper) {
						selected = (EngineWrapper) object;
					} else {
						selected = null;;	
					}
				} else {
					selected = null;	
				}		
			}
			if (selected != null && selected.getDomain() != null) {
				CommandStack stack = selected.getDomain().getCommandStack();
				if (stack != null) {
					stack.addCommandStackListener(commandStackListener);
				}
			}
			updateActions();
		}
	}
	
	private void updateActions() {
		if (viewer != null) {
			// eki: Update the enabledness of the delete action
			this.deleteEnginesAction.setEnabled(this.viewer.getCheckedElements().length > 0);

			// Update the enabledness of the save action
			this.saveEnginesStateAction.setEnabled(this.selected != null && this.selected.isSavable());
			
			this.infoEngineAction.setEnabled(this.selected != null);

			updateUndoRedoActions();
		}		
	}
	
	private void updateUndoRedoActions() {
		if (viewer != null) {
			boolean updated = false;
			if (selected != null) {
				TransactionalEditingDomain domain = selected.getDomain();
				if (domain != null) {
					CommandStack commandStack = domain.getCommandStack();
					if (commandStack != null && commandStack.canUndo()) {
						Command command = commandStack.getUndoCommand();
						if (command != null) {
							// this is a bit defensive (concurrency)
							this.undoAction.setEnabled(true);
							this.undoAction.setText("Undo " + command.getLabel());
							this.undoAction.setToolTipText("Undo " + command.getDescription());
						} else {
							this.undoAction.setEnabled(false);
							this.undoAction.setText("Undo");
							this.undoAction.setToolTipText("Undo previous interaction");
						}
					} else {
						this.undoAction.setEnabled(false);
						this.undoAction.setText("Undo");
						this.undoAction.setToolTipText("Undo previous interaction");						
					}

					if (commandStack != null && commandStack.canRedo()) {
						Command command = commandStack.getRedoCommand();
						if (command != null) {
							// this is a bit defensive (concurrency)
							this.redoAction.setEnabled(true);
							this.redoAction.setText("Redo " + command.getLabel());
							this.redoAction.setToolTipText("Redo " + command.getDescription());
						} else {
							this.redoAction.setEnabled(false);
							this.redoAction.setText("Redo");
							this.redoAction.setToolTipText("Redo next interaction");								
						}
					} else {
						this.redoAction.setEnabled(false);
						this.redoAction.setText("Redo");
						this.redoAction.setToolTipText("Redo next interaction");						
					}
					
					if (commandStack != null && (commandStack.canUndo() || commandStack.canRedo())) {
					    this.resetAction.setEnabled(true); 
					} else {
					    this.resetAction.setEnabled(false); 
					}
					updated = true;
				}
			}
			
			if (! updated) {
				this.undoAction.setEnabled(false);
				this.undoAction.setText("Undo");
				this.undoAction.setToolTipText("Undo previous interaction");
				this.redoAction.setEnabled(false);
				this.redoAction.setText("Redo");
				this.redoAction.setToolTipText("Redo next interaction");	
				this.resetAction.setEnabled(false);
			}
		}
	}

	@Override
	public void add(final EngineWrapper wrapper) {
		if (viewer != null) {
			// ekki@dtu.dk: Nov. 17, 2015: Make sure that an ECNO engine is properly 
			//   added to the EngineView of Eclipse, even when the engine is not started
			//   from the Eclipse display thread. This is relevant when the GUI thread
			//   of the ECNO GUI is not the same the Eclipse display thread (fixed that
			//   along with adjusting the ECNO GUIs for use with OS X).
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					TableViewer viewer = EnginesView.this.viewer;
					if (viewer != null) {
						EnginesView.this.viewer.add(wrapper);
						EnginesView.this.updateActions();
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

	@Override
	public void remove(final EngineWrapper wrapper) {
		if (viewer != null) {
			// eki: Make sure that the wrapper is removed in the
			//      proper display thread (otherwise, there might be
			//      an exception, when the exit on the ECNO engine is
			//      called from a non GUI thread).
			Runnable runnable =  new Runnable() {
				@Override
				public void run() {
				    TableViewer viewer = EnginesView.this.viewer;
					if (viewer != null) {
						viewer.remove(wrapper);
						EnginesView.this.updateActions();
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

	@Override
	public void update(EngineWrapper wrapper) {
		if (viewer != null) {
			viewer.update(wrapper, null);
			updateActions();
		}
	}

}