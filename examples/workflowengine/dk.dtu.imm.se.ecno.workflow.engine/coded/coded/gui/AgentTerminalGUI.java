package coded.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.impl.EAttributeImpl;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import workflow.Activity;
import workflow.Agent;
import workflow.AgentContainer;
import workflow.Case;
import workflow.RuntimeCoreModel;
import workflow.RuntimeGlobalAspect;
import workflow.Task;
import workflow.coordination.WorkflowEcnoModel;
import workflow.impl.ActivityImpl;
import workflow.impl.AgentImpl;
import workflow.impl.CaseImpl;
import workflow.impl.ProcessImpl;
import coded.util.GlobalUtil;
import dk.dtu.imm.se.ecno.core.IEventType;
import dk.dtu.imm.se.ecno.core.IFormalParameter;
import dk.dtu.imm.se.ecno.core.INamedElement;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.model.ecno.EventType;
import dk.dtu.imm.se.ecno.runtime.Event;
import dk.dtu.imm.se.ecno.runtime.IChoice;
import dk.dtu.imm.se.ecno.runtime.IInvalidationListener;
import dk.dtu.imm.se.ecno.runtime.IInvalidationNotifier;
import dk.dtu.imm.se.ecno.runtime.Interaction;
import dk.dtu.imm.se.ecno.runtime.InteractionIterator;
import dk.dtu.imm.se.ecno.runtime.InvalidStateException;
import dk.dtu.imm.se.ecno.runtime.Parameter;

public class AgentTerminalGUI extends JFrameECNO implements IController, IWorkflowGUI, Adapter, IInvalidationListener {
	
	private int counter = 0;
	
	private GlobalUtil util = GlobalUtil.getInstance();
	
	//private InteractionIterator iterator;
	
	private int invalidation_counter = 0;
	
	private HashMap<InteractionIterator, IteratorInfo> iteMap;
	
	private EventType startActivity;
	private IFormalParameter taskParam;
	private IFormalParameter agentParam;
	
	private JButton btnStart;
	private JButton btnFinish;
	private JButton btnOpen;
	
	private ECNOButton btnLogin;
	private ECNOButton btnLogout;
	
	private JPanel contentPane;
	
	private JLabel lblLoginStatus;
	
	private JTextField txtUsername;
	private JTextField txtPassword;
	
	private JList inboxList;
	private JList workInProgressList;
	private JList processLibraryList;
	private JList caseList;
	
	private HashMap<Activity,TaskGUI> taskGuis = new HashMap<Activity, TaskGUI>();
		
	private DefaultListModel<InteractionItem> inboxListModel = new DefaultListModel<InteractionItem>();
	private DefaultListModel<ElementItem> workListModel = new DefaultListModel<ElementItem>();
	private DefaultListModel<ElementItem> processListModel = new DefaultListModel<ElementItem>();
	private DefaultListModel<ElementItem> caseListModel = new DefaultListModel<ElementItem>();

	private Agent activeAgent = null;

	private JLabel debug_execution_time;

	private JCheckBox chckbxNewCheckBox;
	
	// ekki@dtu.dk, 4. 2. 2014:
	private List<Object> elements = new ArrayList<Object>();
	
	public AgentTerminalGUI (ExecutionEngine executionEngine, WorkflowEcnoModel model) {
		super(executionEngine, model);
		setResizable(false);
		setTitle("Demonstrator for an ECNO based Workflow Engine");
		initGUI();
		executionEngine.addController(this);
		
			
		startActivity = null;
		List<EventType> events = model.getNamespace().getEventTypes();
		for (EventType type: events) {
			if ("StartActivity".equals(type.getName())) {
				startActivity = type;
				break;
			}
		}
		if (startActivity != null) {
			taskParam = startActivity.getFormalParametersList().get(0);
			agentParam = startActivity.getFormalParametersList().get(1);
		} else {
			throw new RuntimeException("StartActivity event type not available");
		}

	}
	
	public void initGUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 685, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Worklist Viewer");
		lblNewLabel.setForeground(new Color(51, 102, 153));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		// ekki@dtu.dk, 4. 2. 2014: changed position due to new button
		lblNewLabel.setBounds(10, 6, 208, 24);
		// lblNewLabel.setBounds(10, 65, 208, 24);
		contentPane.add(lblNewLabel);
		
		// ekki@dtu.dk, 4. 2. 2014: added a button for creating new AgentTerminalGUI
		// TODO: image resource should actually be diposed of properly (and only loaded
		//       once); but since this is not in the other parts of the GUI, I did
		//       not implement that here yet either.
		Icon icon = new ImageIcon(getClass().getResource("/images/new_wiz.gif"));
		JButton newWLButton = new JButton(icon);
		newWLButton.setToolTipText("Open a new Worklist Viewer");
		// newWLButton.setFont(new Font("Arial", Font.PLAIN, 11));
		newWLButton.setBounds(10, 32, 18, 18);
		newWLButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Thread thread = new Thread() {

					/* (non-Javadoc)
					 * @see java.lang.Thread#run()
					 */
					@Override
					public void run() {
						AgentTerminalGUI newGUI = new AgentTerminalGUI(AgentTerminalGUI.this.executionEngine, AgentTerminalGUI.this.model);
						// need to make sure that all elements are added to the new GUI
						for (Object element: AgentTerminalGUI.this.elements) {
							newGUI.addElement(element);
						}
					}
				};
				thread.start();
			}
			
		});
		contentPane.add(newWLButton);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(547, 6, 122, 20);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Arial", Font.PLAIN, 11));
		lblUsername.setBounds(480, 9, 74, 14);
		contentPane.add(lblUsername);

		btnLogin = new ECNOButton("Log in");
		btnLogin.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLogin.setBounds(480, 66, 89, 23);
		contentPane.add(btnLogin);

		lblLoginStatus = new JLabel("");
		lblLoginStatus.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLoginStatus.setForeground(Color.BLACK);
		lblLoginStatus.setFont(new Font("Arial", Font.PLAIN, 11));
		lblLoginStatus.setBounds(182, 108, 487, 14);
		contentPane.add(lblLoginStatus);
		
		JList list = new JList();
		list.setBounds(265, 142, 30, -18);
		contentPane.add(list);

		JLabel lblActivities = new JLabel("Inbox");
		lblActivities.setFont(new Font("Arial", Font.BOLD, 11));
		lblActivities.setBounds(255, 133, 178, 14);
		contentPane.add(lblActivities);

		JLabel lblNewLabel_3 = new JLabel("Work in Progress");
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_3.setBounds(255, 342, 127, 14);
		contentPane.add(lblNewLabel_3);
		
		btnStart = new JButton("Start");
		btnStart.setFont(new Font("Arial", Font.PLAIN, 11));
		btnStart.setBounds(255, 299, 113, 23);
		contentPane.add(btnStart);
		btnStart.setEnabled(false);
		btnStart.setIcon(new ImageIcon(getClass().getResource("/images/down.png")));
		
		btnFinish = new JButton("Finish");
		btnFinish.setFont(new Font("Arial", Font.PLAIN, 11));
		btnFinish.setBounds(255, 540, 113, 23);
		contentPane.add(btnFinish);
		btnFinish.setEnabled(false);
		btnFinish.setIcon(new ImageIcon(getClass().getResource("/images/ok.png")));

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial", Font.PLAIN, 11));
		lblPassword.setBounds(480, 34, 56, 14);
		contentPane.add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(547, 31, 122, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		btnLogout = new ECNOButton("Log out");
		btnLogout.setFont(new Font("Arial", Font.PLAIN, 11));
		btnLogout.setBounds(579, 66, 89, 23);
		contentPane.add(btnLogout);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(255, 158, 414, 130);
		contentPane.add(scrollPane);
		
		inboxList = new JList(inboxListModel);
		scrollPane.setViewportView(inboxList);
		inboxList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(255, 367, 414, 163);
		contentPane.add(scrollPane_1);

		workInProgressList = new JList(workListModel);
		scrollPane_1.setViewportView(workInProgressList);
		workInProgressList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 100, 659, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(217, 11, 1, 557);
		contentPane.add(separator_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 158, 222, 130);
		contentPane.add(scrollPane_2);
		
		processLibraryList = new JList(processListModel);
		processLibraryList.setEnabled(false);
		processLibraryList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane_2.setViewportView(processLibraryList);
		


		JLabel lblNewLabel_1 = new JLabel("Process Library");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 133, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 367, 222, 163);
		contentPane.add(scrollPane_3);
		
		caseList = new JList(caseListModel);
		caseList.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane_3.setViewportView(caseList);
		
		JLabel lblNewLabel_2 = new JLabel("Cases (involved in)");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 342, 150, 14);
		contentPane.add(lblNewLabel_2);
		
		btnOpen = new JButton("Open...");
		btnOpen.setEnabled(false);
		btnOpen.setIcon(new ImageIcon(getClass().getResource("/images/folder.png")));
		btnOpen.setFont(new Font("Arial", Font.PLAIN, 11));
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ElementItem item = (ElementItem) AgentTerminalGUI.this.workInProgressList.getSelectedValue();
				if (item != null) {
					
					final Activity activity = (Activity) item.getElement();
					
					// Don't open another frame if one is already open. 
					
					if (taskGuis.containsKey(activity)) {
						java.awt.EventQueue.invokeLater(new Runnable() {
						    @Override
						    public void run() {
						    	taskGuis.get(activity).toFront();
						    	taskGuis.get(activity).repaint();
						    }
						});
					} else {


						TaskGUI taskGui = new TaskGUI(AgentTerminalGUI.this, (Activity) item.getElement(), activeAgent, item);
						taskGuis.put((ActivityImpl) item.getElement(), taskGui);

					}
					
					// Making absolutely sure the newly created GUI gets called via eventDidEnable(..) of this class to update button status.
					item.getConnector().update();

				}
					
			}
		});
		btnOpen.setBounds(378, 540, 122, 23);
		contentPane.add(btnOpen);
		
		testPanel = new JPanel();
		testPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		testPanel.setBackground(Color.WHITE);
		testPanel.setBounds(172, 6, 298, 83);
		contentPane.add(testPanel);
		testPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Execution time (ms):");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_4.setBounds(10, 30, 134, 14);
		testPanel.add(lblNewLabel_4);
		
		debug_execution_time = new JLabel("0");
		debug_execution_time.setFont(new Font("Arial", Font.PLAIN, 11));
		debug_execution_time.setHorizontalAlignment(SwingConstants.RIGHT);
		debug_execution_time.setBounds(187, 30, 101, 14);
		testPanel.add(debug_execution_time);
		
		lblInvalidationNotifications = new JLabel("Invalidation notifications (to this frame):");
		lblInvalidationNotifications.setFont(new Font("Arial", Font.PLAIN, 11));
		lblInvalidationNotifications.setBounds(10, 50, 205, 14);
		testPanel.add(lblInvalidationNotifications);
		
		debug_notifications = new JLabel("0");
		debug_notifications.setFont(new Font("Arial", Font.PLAIN, 11));
		debug_notifications.setHorizontalAlignment(SwingConstants.RIGHT);
		debug_notifications.setBounds(204, 50, 84, 14);
		testPanel.add(debug_notifications);
		
		lblNewLabel_5 = new JLabel("Event type:");
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_5.setBounds(10, 10, 150, 14);
		testPanel.add(lblNewLabel_5);
		
		debug_event_type = new JLabel("-");
		debug_event_type.setFont(new Font("Arial", Font.PLAIN, 11));
		debug_event_type.setHorizontalAlignment(SwingConstants.RIGHT);
		debug_event_type.setBounds(170, 10, 118, 14);
		testPanel.add(debug_event_type);
		testPanel.setVisible(false);
		
		chckbxNewCheckBox = new JCheckBox("Debug");
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 11));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chckbxNewCheckBox.isSelected())
					testPanel.setVisible(true);
				else
					testPanel.setVisible(false);	
			}
		});
		// ekki@dtu.dk, 4. 2. 2014: changed position due to new button
		chckbxNewCheckBox.setBounds(6, 52, 64, 23);
		contentPane.add(chckbxNewCheckBox);

		initButtonListeners();
		initListSelectionListeners();
		initTextFieldListeners();
		initNotifiers();

		
		setVisible(true);
	}
	
	private void initNotifiers() {
		// TODO Auto-generated method stub
		
	}

	private void initTextFieldListeners() {
		
		txtUsername.getDocument().addDocumentListener(new DocumentListener() {
			 public void changedUpdate(DocumentEvent e) {		  
				  for (ECNOConnector connector : ecnoConnectors) 
					  if (connector.element.getClass().equals(AgentImpl.class) && connector.eventType.getName().equals("Login")) 
						  connector.putParameterValueWithUpdate("username", txtUsername.getText());
			  }

			@Override
			public void insertUpdate(DocumentEvent e) {
				for (ECNOConnector connector : ecnoConnectors) 
					  if (connector.element.getClass().equals(AgentImpl.class) && connector.eventType.getName().equals("Login")) 
						  connector.putParameterValueWithUpdate("username", txtUsername.getText());
				
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				for (ECNOConnector connector : ecnoConnectors) 
					  if (connector.element.getClass().equals(AgentImpl.class) && connector.eventType.getName().equals("Login")) 
						  connector.putParameterValueWithUpdate("username", txtUsername.getText());
				
			}
		});
		
		txtPassword.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {		    
				  for (ECNOConnector connector : ecnoConnectors) 
					  if (connector.element.getClass().equals(AgentImpl.class) && connector.eventType.getName().equals("Login")) 
						  connector.putParameterValueWithUpdate("password", txtPassword.getText());
			  }

			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				for (ECNOConnector connector : ecnoConnectors) 
					  if (connector.element.getClass().equals(AgentImpl.class) && connector.eventType.getName().equals("Login")) 
						  connector.putParameterValueWithUpdate("password", txtPassword.getText());
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				for (ECNOConnector connector : ecnoConnectors) 
					  if (connector.element.getClass().equals(AgentImpl.class) && connector.eventType.getName().equals("Login")) 
						  connector.putParameterValueWithUpdate("password", txtPassword.getText());
			}
		});
	}
	
	private void initListSelectionListeners() {
		
		/*
		processLibraryList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
			
				ElementItem item = (ElementItem) AgentTerminalGUI.this.processLibraryList.getSelectedValue();
				if (item != null) {	
					ProcessImpl process = (ProcessImpl) item.getElement();
					item.getConnector().putParameterValueWithUpdate("process", process);
				}

			}
		})
		*/;
		
		inboxList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				
				// nothing
			}
		});
		
		workInProgressList.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				
				ElementItem item = (ElementItem) AgentTerminalGUI.this.workInProgressList.getSelectedValue();
				if (item != null) {
					ActivityImpl activity = (ActivityImpl) item.getElement();
					// TODO: the parameter injected here was for equality test in local behavior
					// of activity, but it is probably redundant now, consider removing it...
					// Only needed when using ECNO to search for one activity in a list.
					item.getConnector().putParameterValueWithUpdate("activity", activity); 

				}

			}
		});
		
	}

	private void initButtonListeners() {
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				invalidation_counter = 0;
				long startTime = System.currentTimeMillis();
				
				ECNOConnector connector = btnLogin.getActive();	
				
				AgentImpl agent = (AgentImpl) connector.element;
				
				int i = 0;
				String roles = "";
				for (i = 0; i<agent.getTakenRoles().size() -1 ; i++) {
					roles = roles + agent.getTakenRoles().get(i).getName();
					roles = roles + ", ";
				}
				roles = roles + agent.getTakenRoles().get(i).getName();
				
				
				lblLoginStatus.setText("Logged in as: "+agent.getName()+ " ("+roles+")");
				
				// Ensure that only logged in agent can participate in logout
				btnLogout.putParamaterValueWithUpdate("agent", agent); // Ensure that only logged in agent can participate in logout

				activeAgent = agent; 
				connector.execute();
				
				txtPassword.setEnabled(false);
				txtUsername.setEnabled(false);
				
				processLibraryList.setEnabled(true);

				updateCases();
				updateInbox();
				updateWorkInProgress();
				
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;
				System.out.println("LOGIN: gui:"+ activeAgent.getName()+" cases: "+caseListModel.size()+"    time: "+elapsedTime);
				debug_execution_time.setText(String.valueOf(elapsedTime));
				debug_notifications.setText(String.valueOf(invalidation_counter));
				debug_event_type.setText("LOGIN");
							
			}

		});

		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				invalidation_counter = 0;
				long startTime = System.currentTimeMillis();
				
				activeAgent = null;
				ECNOConnector connector = btnLogout.getActive();	
				connector.execute();
				lblLoginStatus.setText("");

				txtPassword.setText("");
				txtUsername.setText("");
				txtPassword.setEnabled(true);
				txtUsername.setEnabled(true);
				
				for (ECNOConnector con : ecnoConnectors) {
					  if (con.element.getClass().equals(AgentImpl.class) && con.eventType.getName().equals("Login")) {
						  con.putParameterValueWithUpdate("password", "");
						  con.putParameterValueWithUpdate("username", "");
					  }  
				}
				
				btnFinish.setEnabled(false);
				btnStart.setEnabled(false);
				btnOpen.setEnabled(false);

				ElementItem item = (ElementItem) AgentTerminalGUI.this.processLibraryList.getSelectedValue();
				if (item != null) {	
					item.getConnector().putParameterValueWithUpdate("process", null);
				}
				processLibraryList.clearSelection();
				processLibraryList.setEnabled(false);
				
				caseListModel.clear();
				workListModel.clear();
				
				inboxListModel.removeAllElements();
				if (iteMap != null) {
					for (Map.Entry<InteractionIterator, IteratorInfo> entry : iteMap.entrySet()) 
						entry.getKey().unregisterListener(AgentTerminalGUI.this);
				}
				iteMap = null;
				
				//setVisible(true);
				
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;
				
				debug_execution_time.setText(String.valueOf(elapsedTime));
				debug_notifications.setText(String.valueOf(invalidation_counter));
				debug_event_type.setText("LOGOUT");

			}
		});
		
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				invalidation_counter = 0;
				long startTime = System.currentTimeMillis();
			
				AgentTerminalGUI.this.setAlwaysOnTop(true);
				
				Object selected = inboxList.getSelectedValue();
				if (selected instanceof InteractionItem) {
					Interaction interaction = ((InteractionItem) selected).interaction;
					if (interaction.isValid()) {
						try {
							interaction.execute();
						} catch (InvalidStateException e) { }
					}
				}
				
				AgentTerminalGUI.this.setAlwaysOnTop(false);
				
				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;
				System.out.println("START: gui:"+ activeAgent.getName()+" cases: "+caseListModel.size()+"    time: "+elapsedTime);
				debug_execution_time.setText(String.valueOf(elapsedTime));
				debug_notifications.setText(String.valueOf(invalidation_counter));
				debug_event_type.setText("START");
				
				

			}
		});
		
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AgentTerminalGUI.this.setAlwaysOnTop(true);
				
				ElementItem item = (ElementItem) workInProgressList.getSelectedValue();
				if (item != null)
				{
					finishActivity(item);
				}
				
				AgentTerminalGUI.this.setAlwaysOnTop(false);
		
			}
		});
	}
	
	@Override
	public void eventDidEnable(boolean enabled, ECNOConnector caller) {

		if (caller.elementEventTypeEquals(AgentImpl.class, "Login")) 
			if (activeAgent == null) 
				btnLogin.putEnabled(caller, enabled); 
			else 
				btnLogin.setEnabled(false);
		
		if (caller.elementEventTypeEquals(AgentImpl.class, "Logout")) 
				if (activeAgent != null) 
					btnLogout.putEnabled(caller, enabled);
				else
					btnLogout.putEnabled(caller, false);
			
		if (caller.elementEventTypeEquals(ActivityImpl.class, "FinishActivity")) {
			
			// Update button in TaskGUI if one is open on this activity.
			
			Activity activity = (Activity) caller.element;
			TaskGUI taskGui = taskGuis.get(activity);
			if (taskGui!=null)
				taskGui.setFinishActivityEnabled(enabled);
			
			// Update the local button only of the selected activity element corresponds
			// to the element of the calling element event controller.
			
			ElementItem item = (ElementItem) workInProgressList.getSelectedValue();
			if (item != null) {
				Activity selected = (Activity) item.getElement();
				if (selected == activity) {
					btnFinish.setEnabled(enabled);
					btnOpen.setEnabled(true);
				}
					
			} else {
				btnFinish.setEnabled(false);
				btnOpen.setEnabled(false);
			}
				

				
		}
			
		
		//if (caller.elementEventTypeEquals(ProcessImpl.class, "CreateCase")) {
			//btnCreateCase.setEnabled(enabled);	
		//}
			
		

	}

	private void addAgent(AgentImpl element) {
		registerEcnoConnector(element, "Login");
		registerEcnoConnector(element, "Logout");
		
	}
	
	@Override
	public void addElement(final Object element) {
		
		// ekki@dtu.dk, 4. 2. 2014:
		if (elements.contains(element)) {
			return;
		}
		
		if (element.getClass().equals(AgentImpl.class)) {
			addAgent((AgentImpl) element);
			//((AgentImpl) element).eAdapters().add(this);
			
			// ekki@dtu.dk, 4. 2. 2014:
			elements.add(element);
		}
		
		if (element instanceof ProcessImpl) {
			//ECNOConnector connector = registerEcnoConnector(element, "CreateCase");
			//processListModel.addElement(new ElementItem(element, connector));
			/*try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			// ekki@dtu.dk, 4. 2. 2014:
			elements.add(element);
			
			try {
				SwingUtilities.invokeAndWait(new Runnable() {

					@Override
					public void run() {
						processListModel.addElement(new ElementItem(element, null));
						
					}});
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			


		}
		
		if (activeAgent!=null) {

			if (element instanceof CaseImpl)
				if(activeAgent != null) 
					if (util.getCaseO((Case)element).getInvolved().contains(activeAgent) && ((Case)element).isFinished() == false) {	
						caseListModel.addElement(new ElementItem(element));
						updateInboxWithCase((Case)element);
						((Case)element).eAdapters().add(this);
					}

			if (element instanceof ActivityImpl) {
				if (activeAgent != null)
					if (util.getActivityO((Activity)element).getAssignedTo() == activeAgent) {
						ECNOConnector connector = registerEcnoConnector(element, "FinishActivity");
						workListModel.addElement(new ElementItem(element, connector));
					}

			}

 
		}

		
	}

	@Override
	public void removeElement(Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void elementEncountered(Object element) {
		// TODO Auto-generated method stub
		
	}
	
	private boolean disposing = false;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
		
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
			
			// ekki@dtu.dk: 4. 2. 2014: Added a quick fix so that the agent
			//              automatically logs out, when he closes the work list.
			Agent agent = activeAgent;
			if (agent != null && !executionEngine.isExiting()) {
				INamedElement element = this.model.getNamespace().getElement("Logout");
				if (element instanceof IEventType) {
					Event event = executionEngine.createInstance((IEventType) element);
					Parameter param = event.getParameter(((IEventType) element).getFormalParametersList().get(0));
					if (param != null) {
						param.setValue(activeAgent);
					}
					InteractionIterator iterator = this.executionEngine.getInteractions(activeAgent, event);
					try {
						if (iterator.hasNext()) {
							Interaction interaction = iterator.next();
							if (interaction != null) {
								interaction.execute();
							}
						}
					} catch (InvalidStateException e) {
						// ekki@dtu.dk: 4. 2. 2014: 
						// Actually to make this work in case of concurrent executions,
						// we would need to iterate until no interaction is possible
						// or the interaction was executed successfully or until
						// the engine is exiting!
					}
				}
			}
			
			this.executionEngine.removeController(this);
			super.dispose();
			
		}
	}

	private boolean unclean = false;
	private boolean updating = false;
	private JPanel testPanel;
	private JLabel lblInvalidationNotifications;
	private JLabel debug_notifications;
	private JLabel lblNewLabel_5;
	private JLabel debug_event_type;

	private synchronized boolean enterUpdate() {
		if (!updating) {
			unclean = false;
			updating = true;
			return true;
		} else {
			unclean = false;
			return false;
		}
	}

	private synchronized boolean leaveUpdate() {
		if (unclean) {
			unclean = false;
			return false;
		} else {
			updating = false;
			return true;
		}
	}
	
	
		
	
	public void updateInbox() {
		
		System.out.println("updateInbox was called !!!");
				
		long startTime = System.currentTimeMillis();

		if (enterUpdate()) {
			do {
				inboxListModel.removeAllElements();
 
				if (caseListModel != null)  {
		
					// Unregister all before getting rid of the old map.
					
					if (iteMap != null) {
						for (Map.Entry<InteractionIterator, IteratorInfo> entry : iteMap.entrySet()) 
							entry.getKey().unregisterListener(this);
					}

					// Initialize a new iterators map, old 
					// one will be garbage collected if it existed. 

				    iteMap = new HashMap<InteractionIterator, IteratorInfo>();
				    
					List<InteractionItem> interactions = new ArrayList<InteractionItem>();
									
					for (int i = 0; i < caseListModel.size(); i++) {

						Case case_ = (Case) caseListModel.get(i).getElement();
						InteractionIterator iterator = null;
						
						boolean success = false;
						do {
							Event event = executionEngine.createInstance(startActivity);
							if (event != null) {
								Parameter param = event.getParameter(agentParam);
								if (param != null) {
									param.setValue(activeAgent);
								}
								
								iterator = executionEngine.getInteractions(case_, event);

							}

							success = true;
							try {
								iterator.registerListener(this);
								
								IteratorInfo iteInfo = new IteratorInfo(case_);
								
								while (iterator.hasNext()) {
										
									Interaction interaction = iterator.next();
									IChoice choice = interaction.getElementsChoice(case_);
									event = choice.getEvent(startActivity);
									
									
									
									Parameter taskP = event.getParameter(taskParam);
									if (taskP != null) {
										Object task = taskP.getValue();
										if (task instanceof Task) {
											
											InteractionItem item = new InteractionItem(interaction, (Task) task, case_);
											interactions.add(item);
											iteInfo.items.add(item);
											
										}
									}
								}
								
								iteMap.put(iterator, iteInfo);
								
							} catch (InvalidStateException e) {
								if (iterator!=null) { // added by Jesper
									iterator.unregisterListener(this);
									iterator.dispose();	
								}
																
								success = false;
							}
						} while (!success);


					}
					
					for (InteractionItem item: interactions) {
						inboxListModel.addElement(item);
					}

					if (!interactions.isEmpty()) {
						btnStart.setEnabled(true);
						inboxList.setSelectedIndex(0);
					} else {
						btnStart.setEnabled(false);
						btnStart.setToolTipText("No interaction available");
					}

				}

			} while (!leaveUpdate());
		}


		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("gui:"+ activeAgent.getName()+" counter: "+counter+"    time: "+elapsedTime);
		counter++;
		
	}
	
	
	private void updateInboxWhenNotified(InteractionIterator interactionIterator) {
		
		invalidation_counter++;
		System.out.println("updateInboxWhenNotified was called");
		
		IteratorInfo iteInfo = iteMap.get(interactionIterator);
		interactionIterator.unregisterListener(this);
		iteMap.remove(interactionIterator);
		
		/* Remove invalidated interactions from the inbox */
		
		for (InteractionItem item : iteInfo.items) 
			inboxListModel.removeElement(item);
		
		/* Re-calculate the particular case */
		
		Case case_ = iteInfo.case_;
		updateInboxWithCase(case_);

		
	}
	
	
	private void updateInboxWithCase(Case case_) {
		
		System.out.println("updateInboxWithCase was called, case#: "+case_.getId());
		long startTime = System.currentTimeMillis();
		
		
		if (enterUpdate()) {
			do {
				
				List<InteractionItem> interactions = new ArrayList<InteractionItem>();

				InteractionIterator iterator = null;

				boolean success = false;
				do {
					Event event = executionEngine.createInstance(startActivity);
					if (event != null) {
						Parameter param = event.getParameter(agentParam);
						if (param != null) {
							param.setValue(activeAgent);
						}

						iterator = executionEngine.getInteractions(case_, event);

					}

					success = true;
					try {
						iterator.registerListener(this);

						IteratorInfo iteInfo = new IteratorInfo(case_);

						while (iterator.hasNext()) {

							Interaction interaction = iterator.next();
							IChoice choice = interaction.getElementsChoice(case_);
							event = choice.getEvent(startActivity);

							

							Parameter taskP = event.getParameter(taskParam);
							if (taskP != null) {
								Object task = taskP.getValue();
								if (task instanceof Task) {

									InteractionItem item = new InteractionItem(interaction, (Task) task, case_);
									interactions.add(item);
									iteInfo.items.add(item);

								}
							}
						}

						iteMap.put(iterator, iteInfo);

					} catch (InvalidStateException e) {
						if (iterator!=null) { // added by Jesper
							iterator.unregisterListener(this);
							iterator.dispose();	
						}

						success = false;
					}
				} while (!success);

				for (InteractionItem item: interactions) {
					inboxListModel.addElement(item);
				}

				if (!inboxListModel.isEmpty()) {
					btnStart.setEnabled(true);
					inboxList.setSelectedIndex(0);
				} else {
					btnStart.setEnabled(false);
					btnStart.setToolTipText("No interaction available");
				}



			} while (!leaveUpdate());
		}

		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("gui:"+ activeAgent.getName()+" counter: "+counter+"    time: "+elapsedTime);
		
		counter++;
	}

	
	private void updateCases() {
		
		System.out.println("updateCases was called !!!");
		
		if (activeAgent != null) {
			caseListModel.clear();
			
			for (RuntimeCoreModel runtimeCoreModel : getRuntimeCoreModels(activeAgent)) {
				for (Case case_ : runtimeCoreModel.getCases())
				if (util.getCaseO(case_).getInvolved().contains(activeAgent) && case_.isFinished() == false) {
					caseListModel.addElement(new ElementItem(case_));
					case_.eAdapters().add(this);
				}
			}	
		}
	}
	
	private List<RuntimeCoreModel> getRuntimeCoreModels(Agent activeAgent) {
		
		AgentContainer agentContainer = (AgentContainer) activeAgent.eContainer();
		return ((RuntimeGlobalAspect)agentContainer).getEngine().getRuntimeCoreModels();
	}
	
	private void updateWorkInProgress() {
		
		System.out.println("updateWorkInProgress was called !!!");
		
		// TODO Auto-generated method stub
		
		if (activeAgent != null) {
			workListModel.clear();
			
			for (RuntimeCoreModel runtimeCoreModel : getRuntimeCoreModels(activeAgent)) {
				for (Case case_ : runtimeCoreModel.getCases())
				if (util.getCaseO(case_).getInvolved().contains(activeAgent))
					for (Activity activity : case_.getActivities()) {
						if (util.getActivityO(activity).getAssignedTo() == activeAgent && activity.isFinished() == false) {
							ECNOConnector connector = registerEcnoConnector(activity, "FinishActivity");
							workListModel.addElement(new ElementItem(activity, connector));
						}
					}
			}
			
		}

	}

	@Override
	public void notifyChanged(Notification notification) {

		System.out.println("notifyChanged (case listener) was called !!!");
		
		CaseImpl case_ = (CaseImpl) notification.getNotifier();
		Object feature = notification.getFeature();
		
		if (feature instanceof EAttributeImpl) {
			EAttributeImpl attribute = (EAttributeImpl) feature;
			if (attribute.getName().equals("finished")) {
				// TODO: optimize this search
				for(int i = 0; i < caseListModel.size(); i++) {
					if (caseListModel.get(i).getElement() == case_) {
						caseListModel.remove(i);
						//setVisible(true);
					}	

				}
			}
		}
		
	
	}


	@Override
	public Notifier getTarget() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdapterForType(Object type) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void notifyInvalidation(IInvalidationNotifier invalidationNotifier) {
		// TODO Auto-generated method stub
			
		if (activeAgent!=null)
			if (invalidationNotifier instanceof InteractionIterator)
				updateInboxWhenNotified((InteractionIterator)invalidationNotifier);

	}
	
	// For callback by TaskGUI prior to disposing.
	
	public void removeTaskGui(Activity activity) {
		taskGuis.remove(activity);
	}
	
		
	public void finishActivity(ElementItem item) {
		
		invalidation_counter=0;
		long startTime = System.currentTimeMillis();
		
		// Remove from work list and execute
		workListModel.removeElement(item);
		item.getConnector().execute();
		
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("FINISH: gui:"+ activeAgent.getName()+" cases: "+caseListModel.size()+"    time: "+elapsedTime);
		debug_execution_time.setText(String.valueOf(elapsedTime));
		debug_notifications.setText(String.valueOf(invalidation_counter));
		debug_event_type.setText("FINISH");
		
		// Take down any existing GUIs for this element.
		Activity activity = (Activity) item.getElement();
		TaskGUI gui = taskGuis.get(activity);
		if (gui != null) gui.dispose(); // overridden dispose which also removes itself in the map.
		
		
		
	}
}
