package dk.dtu.imm.se.ecno.gui;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.ToolTipManager;

import dk.dtu.imm.se.ecno.core.IElementType;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.engine.EngineTerminatedException;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;

public class ECNOGUI extends JFrame implements IController  {

	private static final long serialVersionUID = 1L;

	private ExecutionEngine engine;
	private PresentationUtil presentation;

	private HashMap<Object,ElementButtonPanel> elementPanelMap;

	private Map<Object,Integer> elementIdMap; 
	private int maxId;

	public ECNOGUI(ExecutionEngine engine) {
		super();
		this.engine = engine;
		elementPanelMap = new HashMap<Object,ElementButtonPanel>();
		this.presentation = new PresentationUtil(engine, this);

		elementIdMap = new WeakHashMap<Object,Integer>();
		maxId = 1;

		ToolTipManager.sharedInstance().setInitialDelay(1000);
		ToolTipManager.sharedInstance().setDismissDelay(5*60*1000);

		this.setTitle("ECNO: GUI");
		this.setSize(600,600);
		this.setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));

		Dimension minSize = new Dimension(0, 0);
		Dimension prefSize = new Dimension(Short.MAX_VALUE, Short.MAX_VALUE);
		Dimension maxSize = new Dimension(Short.MAX_VALUE,Short.MAX_VALUE );
		this.add(new Box.Filler(minSize, prefSize, maxSize));

		engine.addController(this);

		// Add a listener that disposes of this GUI,
		// when the GUI window is closed.
		this.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e) {
						ECNOGUI.this.dispose();
						// eki: experiment whether ECNOGUI could properly 
						//      take down the engine (and remove it from the
						//      EngineVie which might run in a different 
						//      -- non-GUI -- thread).
						// ECNOGUI.this.engine.exit();
					}
				});

		this.setVisible(true);				
	}

	public synchronized void addElement(final Object element) {
		// Note that the GUI update is always deferred, even if the method
		// is called from the GUI thread (event dispatch thread) in order
		// to preserve the order of the add and remove updates (among all
		// threads.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (elementPanelMap != null && !elementPanelMap.containsKey(element)) {
					IElementType type = engine.getElementType(element);
					if (type != null) {
						List<IEventType> events = type.getGUIEventTypes();
						if (events != null && events.size() > 0) {
							ElementButtonPanel panel = 
									new ElementButtonPanel(ECNOGUI.this.engine, ECNOGUI.this.presentation, element);
							ECNOGUI.this.add(panel, ECNOGUI.this.elementPanelMap.size());
							ECNOGUI.this.setVisible(true);
							elementPanelMap.put(element,panel);
						}
					}
				}
			}
		});
	}

	public synchronized void removeElement(final Object element) {
		// Note that the GUI update is always deferred, even if the method
		// is called from the GUI thread (event dispatch thread) in order
		// to preserve the order of the add and remove updates (among all
		// threads.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				if (elementPanelMap != null) {
					ElementButtonPanel panel = elementPanelMap.get(element);
					if (panel != null) {
						ECNOGUI.this.remove(panel);
						ECNOGUI.this.setVisible(true);
						panel.dispose();
						elementPanelMap.remove(element);
					}
				}
			}
		});
	}

	private int getNewId() {
		return maxId++;
	}

	public synchronized int getID(Object element) {
		if (elementIdMap != null) {
			if (elementIdMap.containsKey(element)) {
				return elementIdMap.get(element).intValue();
			}
		}

		return 0;
	}

	public synchronized void elementEncountered(Object element) {
		if (elementPanelMap!= null && !elementIdMap.containsKey(element)) {
			elementIdMap.put(element, getNewId());
		}
	}

	private boolean disposing = false;

	private synchronized boolean isFirstDispose() {
		if (!disposing) {
			disposing = true;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void dispose() {
		if (isFirstDispose()) {
			try {
				this.engine.removeController(this);
			} catch (EngineTerminatedException e) {}
			this.elementPanelMap = null;
			this.elementIdMap = null;
			this.engine = null;
			if (SwingUtilities.isEventDispatchThread()) {
				super.dispose();
			} else {
				SwingUtilities.invokeLater(new Runnable() {
					public void run() {
						ECNOGUI.super.dispose();
					}
				});
			}
		}
	}
	
	static public ECNOGUI createECNOGUI(final ExecutionEngine engine) {
		if (SwingUtilities.isEventDispatchThread()) {
			return new ECNOGUI(engine);
		} else {
			SwingOperation<ECNOGUI> operation =
					new SwingOperation<ECNOGUI>() {

						@Override
						public ECNOGUI execute() {
							return new ECNOGUI(engine);
						}

			};
			return operation.invokeAndWait();
		}
	}	

}
