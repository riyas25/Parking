package clientView;

import javax.swing.JFrame;
import javax.swing.JPanel;

import PaymentClientView.BookingInformationGUI;
import PaymentClientView.ParkingBookingSystemGUI;
import booking.Booking;
import booking.Time;
import client.Client;
import database.Database;
import parking.Car;
import parking.ParkingLot;
import parking.ParkingSpace;
import payment.CreditCard;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

public class ClientHomeView {

	private JFrame frame;
	private Client client;
	private ArrayList<Booking> allBookings;
	
	private static Database database;

	/**
	 * Create the application.
	 * @throws ParseException 
	 */
	public ClientHomeView(Client client) throws ParseException {
		allBookings = new ArrayList<Booking>();
		    
		initialize(client);
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws ParseException 
	 */
	private void initialize(Client client) throws ParseException {
		this.client = client;
		this.database = Database.getInstance();
		
//		allBookings = client.getBookings();
		
		//TODO remove this manual definition of Parking lot and space
		
		ParkingLot dummyLot = new ParkingLot(1, "P1", "Willi small");
		dummyLot.add(new ParkingSpace(dummyLot, "id", "location"));
		dummyLot.add(new ParkingSpace(dummyLot, "id2", "location2"));
		Car c1= new Car("c1","Black","AB-12-CD-3456");
		Car c2=new Car("c2","White","ST-67-UV-4321");
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    
		allBookings.add(new Booking(client, new Time(11,11,15,12),d1,d2, dummyLot.getSpaces().get(0),c1, new CreditCard("1000200030004000", 0124, 100)));
		allBookings.add(new Booking(client, new Time(12,10,20,14),d1,d2, dummyLot.getSpaces().get(1),c2, new CreditCard("1000200030004000", 0124, 100)));
		
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JScrollPane bookingsScrollPane = new JScrollPane();
		bookingsScrollPane.setToolTipText("Your Bookings");
		GroupLayout bookingsgroupLayout = new GroupLayout(bookingsScrollPane);
		bookingsgroupLayout.setHorizontalGroup(
			bookingsgroupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 337, Short.MAX_VALUE)
		);
		bookingsgroupLayout.setVerticalGroup(
			bookingsgroupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 300, Short.MAX_VALUE)
		);
		
		JList<Booking> bookingsJlist = new JList<Booking>();
		DefaultListModel<Booking> lm = new DefaultListModel<Booking>();
		lm.addAll(allBookings);
		bookingsJlist.setModel(lm);

		bookingsScrollPane.setRowHeaderView(bookingsJlist);
		
        
        class ToggleButtonListener implements ItemListener  {
        	// ItemListener is notified whenever you click on the Button
        	private JToggleButton btn;
        	private  JTextArea field;
        	
        	public ToggleButtonListener(JToggleButton btn, JTextArea field) {
        		this.btn = btn;
        		this.field = field;
        		this.btn.addItemListener(this);
        	}
            // itemStateChanged() method is invoked automatically
            // whenever you click or unclick the Button.
            
			@Override
			public void itemStateChanged(ItemEvent itemEvent) {

                // event is generated in button
                int state = itemEvent.getStateChange();
 
                Booking selectedBooking = bookingsJlist.getSelectedValue();
				int index = bookingsJlist.getSelectedIndex();
				
				
                // if selected print selected in console
                if (state == ItemEvent.SELECTED) {
                	if(index != -1) {
                    	selectedBooking.setActive(true);
                    	field.setText("Active");
    					btn.setText("Deactivate");
                	}
                	else {
                    	JOptionPane.showMessageDialog(frame, "Select a valid booking");
                    }
                }else {
                	field.setText("Inactive");
                	btn.setText("Activate");
                }

                
			}
        }
        
        
		//class to define listeners of the  JList's currently-selected item
		class BookingsSelectionListener implements ListSelectionListener {
			private JTextArea textArea;
			private  String command;
			private JToggleButton button;
			
			public BookingsSelectionListener(JTextArea textArea, String command) {
				this.textArea = textArea;
				this.command = command;
			}
			public BookingsSelectionListener(JToggleButton button, String command) {
				this.button = button;
				this.command = command;
			}
			@Override
			public void valueChanged(ListSelectionEvent e) {
				//if the JList's selection changes, decide the text area change based on the given command 
				if (bookingsJlist.getSelectedIndex() != -1) {
					Booking selectedBooking = bookingsJlist.getSelectedValue();
					switch(command) {
					case "start-time": {
						String startTime = selectedBooking.getStartHour() + ":" + selectedBooking.getStartMinute();
						this.textArea.setText(startTime);
						}
						break;
					case "end-time": {
						String endTime = selectedBooking.getEndHour() + ":" + selectedBooking.getEndMinute();
						this.textArea.setText(endTime);
						}
						break;
					case "location": this.textArea.setText(selectedBooking.getSpace().getLocation());
						break;
					case "lot": this.textArea.setText(selectedBooking.getSpace().getLot().getName());
						break;
					case "plate": this.textArea.setText(selectedBooking.getPlate());
						break;
					case "active": {
						String isActive = "";
						if(selectedBooking.isActive()) {
							isActive  = "Active";
						}else {
							isActive = "Inactive";
						}
						this.textArea.setText(isActive);
					}
						break;
					case "activate": {
						if(selectedBooking.isActive()) {
							button.setText("Deactivate");
						}else {
							button.setText("Activate");
						}
					}
						break;
					}
				}
			}	
		}
		
		JPanel bookingDetailsPane = new JPanel();
		
		JPanel manageBookingPane = new JPanel();
		
		JButton backButton = new JButton("Log out");
		backButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				client.logout();
				frame.dispose();
				new LoginView();
				
			}
		});
		backButton.setBackground(SystemColor.window);
		
		JTextArea txtrYourBookings = new JTextArea();
		txtrYourBookings.setBackground(new Color(232, 231, 232));
		txtrYourBookings.setText("Your Bookings");
		txtrYourBookings.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(manageBookingPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(backButton)
								.addComponent(bookingsScrollPane, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtrYourBookings, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(bookingDetailsPane, GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(5)
							.addComponent(backButton)
							.addGap(7)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(bookingDetailsPane, GroupLayout.PREFERRED_SIZE, 483, GroupLayout.PREFERRED_SIZE)
								.addComponent(bookingsScrollPane, GroupLayout.PREFERRED_SIZE, 462, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(manageBookingPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(txtrYourBookings, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		bookingDetailsPane.setLayout(new BoxLayout(bookingDetailsPane, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		
		JTextArea txtrLot = new JTextArea();
		txtrLot.setEditable(false);
		txtrLot.setText("Lot: ");
		
		JTextArea txtrInsertLot = new JTextArea();
		txtrInsertLot.setEditable(false);
		txtrInsertLot.setForeground(SystemColor.inactiveCaptionText);
		
		//implement the dynamic update of the text area based on selected item in the bookingsList
		//add txtrInsertLot as a listener for the bookingsJlist
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(txtrInsertLot, "lot"));
		
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrLot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertLot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrLot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertLot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel.setLayout(gl_panel);
		bookingDetailsPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		bookingDetailsPane.add(panel_1);
		
		JTextArea txtrLocation = new JTextArea();
		txtrLocation.setEditable(false);
		txtrLocation.setText("Location: ");
		
		JTextArea txtrInsertLocation = new JTextArea();
		txtrInsertLocation.setEditable(false);
		
		//implement the dynamic update of the text area based on selected item in the bookingsList
		//add txtrInsertLocation as a listener for the bookingsJlist
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(txtrInsertLocation, "lot"));
		
		txtrInsertLocation.setForeground(SystemColor.inactiveCaption);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 243, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 21, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_1_5 = new JPanel();
		bookingDetailsPane.add(panel_1_5);
		
		JTextArea txtrPlate = new JTextArea();
		txtrPlate.setEditable(false);
		txtrPlate.setText("Plate:");
		
		JTextArea txtrInsertPlate = new JTextArea();
		txtrInsertPlate.setEditable(false);
		//implement the dynamic update of the text area based on selected item in the bookingsList
		//add txtrInsertPlate as a listener for the bookingsJlist
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(txtrInsertPlate, "plate"));
		
		txtrInsertPlate.setForeground(SystemColor.inactiveCaption);
		GroupLayout gl_panel_1_5 = new GroupLayout(panel_1_5);
		gl_panel_1_5.setHorizontalGroup(
			gl_panel_1_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_5.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrPlate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertPlate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(195, Short.MAX_VALUE))
		);
		gl_panel_1_5.setVerticalGroup(
			gl_panel_1_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_5.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1_5.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrPlate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertPlate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(144, Short.MAX_VALUE))
		);
		panel_1_5.setLayout(gl_panel_1_5);
		
		JPanel panel_1_4_2 = new JPanel();
		bookingDetailsPane.add(panel_1_4_2);
		
		JTextArea txtrStartDate = new JTextArea();
		txtrStartDate.setText("Start Date: ");
		txtrStartDate.setEditable(false);
		
		JTextArea txtrInsertStartDate = new JTextArea();
		txtrInsertStartDate.setText("March 24, 2023");
		txtrInsertStartDate.setForeground(SystemColor.inactiveCaption);
		txtrInsertStartDate.setEditable(false);
		GroupLayout gl_panel_1_4_2 = new GroupLayout(panel_1_4_2);
		gl_panel_1_4_2.setHorizontalGroup(
			gl_panel_1_4_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 241, Short.MAX_VALUE)
				.addGap(0, 241, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4_2.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrStartDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertStartDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
		);
		gl_panel_1_4_2.setVerticalGroup(
			gl_panel_1_4_2.createParallelGroup(Alignment.LEADING)
				.addGap(0, 133, Short.MAX_VALUE)
				.addGap(0, 126, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4_2.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1_4_2.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrStartDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertStartDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1_4_2.setLayout(gl_panel_1_4_2);
		
		JPanel panel_1_4 = new JPanel();
		bookingDetailsPane.add(panel_1_4);
		
		JTextArea txtrStartTime = new JTextArea();
		txtrStartTime.setEditable(false);
		txtrStartTime.setText("Start Time: ");
		
		JTextArea txtrInsertStartTime = new JTextArea();
		txtrInsertStartTime.setEditable(false);
		//implement the dynamic update of the text area based on selected item in the bookingsList
		//add txtrInsertStartTime as a listener for the bookingsJlist
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(txtrInsertStartTime, "start-time"));
		
		txtrInsertStartTime.setForeground(SystemColor.inactiveCaption);
		GroupLayout gl_panel_1_4 = new GroupLayout(panel_1_4);
		gl_panel_1_4.setHorizontalGroup(
			gl_panel_1_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 243, Short.MAX_VALUE)
				.addGap(0, 243, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrStartTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertStartTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_4.setVerticalGroup(
			gl_panel_1_4.createParallelGroup(Alignment.LEADING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGap(0, 21, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1_4.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrStartTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertStartTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1_4.setLayout(gl_panel_1_4);
		
		JPanel panel_1_4_2_1 = new JPanel();
		bookingDetailsPane.add(panel_1_4_2_1);
		
		JTextArea txtrEndDate = new JTextArea();
		txtrEndDate.setText("End Date: ");
		txtrEndDate.setEditable(false);
		
		JTextArea txtrInsertEndDate = new JTextArea();
		txtrInsertEndDate.setText("March 24, 2023");
		txtrInsertEndDate.setForeground(SystemColor.inactiveCaption);
		txtrInsertEndDate.setEditable(false);
		GroupLayout gl_panel_1_4_2_1 = new GroupLayout(panel_1_4_2_1);
		gl_panel_1_4_2_1.setHorizontalGroup(
			gl_panel_1_4_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 241, Short.MAX_VALUE)
				.addGap(0, 241, Short.MAX_VALUE)
				.addGap(0, 241, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4_2_1.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrEndDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertEndDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(157, Short.MAX_VALUE))
		);
		gl_panel_1_4_2_1.setVerticalGroup(
			gl_panel_1_4_2_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 45, Short.MAX_VALUE)
				.addGap(0, 133, Short.MAX_VALUE)
				.addGap(0, 126, Short.MAX_VALUE)
				.addGroup(gl_panel_1_4_2_1.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1_4_2_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrEndDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertEndDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1_4_2_1.setLayout(gl_panel_1_4_2_1);
		
		JPanel panel_1_3 = new JPanel();
		bookingDetailsPane.add(panel_1_3);
		
		JTextArea txtrEndTime = new JTextArea();
		txtrEndTime.setEditable(false);
		txtrEndTime.setText("End Time:");
		
		JTextArea txtrInsertEndTime = new JTextArea();
		txtrInsertEndTime.setEditable(false);
		//implement the dynamic update of the text area based on selected item in the bookingsList
		//add txtrInsertEndTime as a listener for the bookingsJlist
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(txtrInsertEndTime, "end-time"));
		
		txtrInsertEndTime.setForeground(SystemColor.inactiveCaption);
		GroupLayout gl_panel_1_3 = new GroupLayout(panel_1_3);
		gl_panel_1_3.setHorizontalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 243, Short.MAX_VALUE)
				.addGap(0, 243, Short.MAX_VALUE)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addGap(5)
					.addComponent(txtrEndTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(txtrInsertEndTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(75, Short.MAX_VALUE))
		);
		gl_panel_1_3.setVerticalGroup(
			gl_panel_1_3.createParallelGroup(Alignment.LEADING)
				.addGap(0, 462, Short.MAX_VALUE)
				.addGap(0, 21, Short.MAX_VALUE)
				.addGroup(gl_panel_1_3.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_panel_1_3.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrEndTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrInsertEndTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
		);
		panel_1_3.setLayout(gl_panel_1_3);
		
		JPanel panel_1_2 = new JPanel();
		bookingDetailsPane.add(panel_1_2);
		
		JTextArea txtrInsertIsActive = new JTextArea();
		txtrInsertIsActive.setEditable(false);
		
		//implement the dynamic update of the text area based on selected item in the bookingsList
		//add txtrInsertLocation_1_2 as a listener for the bookingsJlist
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(txtrInsertIsActive, "active"));

		txtrInsertIsActive.setForeground(SystemColor.inactiveCaption);
		GroupLayout gl_panel_1_2 = new GroupLayout(panel_1_2);
		gl_panel_1_2.setHorizontalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrInsertIsActive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(234, Short.MAX_VALUE))
		);
		gl_panel_1_2.setVerticalGroup(
			gl_panel_1_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrInsertIsActive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1_2.setLayout(gl_panel_1_2);
		
		JPanel panel_1_6 = new JPanel();
		bookingDetailsPane.add(panel_1_6);
		
		JToggleButton tglbtnActivate = new JToggleButton("Activate Booking");
		
		//to update the button and txtrInsertIsActive texts when the button is pushed
		ToggleButtonListener itemListener = new ToggleButtonListener(tglbtnActivate, txtrInsertIsActive);
		
		bookingsJlist.addListSelectionListener(new BookingsSelectionListener(tglbtnActivate, "activate"));
		
		GroupLayout gl_panel_1_6 = new GroupLayout(panel_1_6);
		gl_panel_1_6.setHorizontalGroup(
			gl_panel_1_6.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1_6.createSequentialGroup()
					.addContainerGap()
					.addComponent(tglbtnActivate)
					.addContainerGap(74, Short.MAX_VALUE))
		);
		gl_panel_1_6.setVerticalGroup(
			gl_panel_1_6.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1_6.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(tglbtnActivate))
		);
		panel_1_6.setLayout(gl_panel_1_6);
		
		JTextArea txtrAccountType = new JTextArea();
		txtrAccountType.setEditable(false);
		txtrAccountType.setText("Account Type:");
		manageBookingPane.add(txtrAccountType);
		
		JTextArea txtrInsertType = new JTextArea();
		txtrInsertType.setText(client.getClass().getSimpleName());
		txtrInsertType.setEditable(false);
		txtrInsertType.setForeground(SystemColor.inactiveCaption);
		manageBookingPane.add(txtrInsertType);
		
		JButton newBookingButton = new JButton("New Booking");
		manageBookingPane.add(newBookingButton);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(newBookingButton, popupMenu);
		
		for(int i=0; i<database.getLots().size(); i++) {
			//add all the available lots to the pop-up menu
			JMenuItem item = new JMenuItem(database.getLots().get(i).getName());
			popupMenu.add(item);
			item.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					if (e.isPopupTrigger() || e.getSource().equals(item)) {
						openBookingWindow(e);
					}
				}
				public void mouseReleased(MouseEvent e) {
					if (e.isPopupTrigger()) {
						openBookingWindow(e); 
					}
				}
				public void mouseClicked(MouseEvent e) {
					if (e.isPopupTrigger()) {
						openBookingWindow(e); 
					}
				}
				private void openBookingWindow(MouseEvent e) {
					/*
					 * BookingInformationGUI(String name, String email, String date, String startTime,
                                  String endTime, String licensePlate, String spotName,
                                  String spotLocation, String payment, int bookingId, String status) {
					 */
					new BookingInformationGUI(client.getFullName(), client.getEmailAddress(), "March 24, 2023",
							"10:10", "11:10", "ERTE432", "SPACE 12", "LOT 2", "10", 10, "true");
				}
				});
		}
		
		JButton btnPay = new JButton("Pay");
		btnPay.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//TODO
				
				Booking selectedBooking = bookingsJlist.getSelectedValue();
				int index = bookingsJlist.getSelectedIndex();
				if (e.getSource().equals(btnPay) && index != -1) {
					if(selectedBooking.isActive()) {
						//TODO merge two payment popups
						new ParkingBookingSystemGUI();
						
						lm.remove(index);
						JOptionPane.showMessageDialog(frame, "Payment Successful. You have been charged " 
						+ client.getRate()*selectedBooking.totalTime() + " for "
								+ selectedBooking.totalTime() + " hours.");
					}else {
						JOptionPane.showMessageDialog(frame, "Booking not active.");
					}
					
				}
			}
		});
		manageBookingPane.add(btnPay);
		
		JButton btnExtend = new JButton("Extend");
		btnExtend.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//TODO open edit booking view
			/*
			 * showInputDialog(Component parentComponent, Object message, String title, 
			 * int messageType, Icon icon, Object[] selectionValues, Object initialSelectionValue)
			 */
				
			Booking selectedBooking = bookingsJlist.getSelectedValue();
			int index = bookingsJlist.getSelectedIndex();
			if (e.getSource().equals(btnExtend) && index != -1) {
				if(selectedBooking.isActive()) {
					Object extension = 0;
					extension = JOptionPane.showInputDialog(frame, (Object)"Please enter how long to extend the booking",extension);
					
					if(!(extension == null)) {
						selectedBooking.extend(Double.valueOf((String) extension));
						txtrInsertEndTime.setText(selectedBooking.getEndHour()+":"+selectedBooking.getEndMinute());
						
						System.out.println(extension);
					}
				}else {
					JOptionPane.showMessageDialog(frame, "Booking not active.");
				}
			}
			}
		});
		
		manageBookingPane.add(btnExtend);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int decision = 0;
				decision = JOptionPane.showConfirmDialog(frame, "Confirm cancellation");
				
				switch(decision) {
				case JOptionPane.YES_OPTION: lm.remove(bookingsJlist.getSelectedIndex());
				break;
				case JOptionPane.NO_OPTION: break;
				case JOptionPane.CANCEL_OPTION: break;
				}
			}
		});
		manageBookingPane.add(btnCancel);
		frame.getContentPane().setLayout(groupLayout);
	}


	protected void dispose() {
		// TODO Auto-generated method stub
		
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger() || e.getSource().equals(component)) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e); 
				}
			}
			public void mouseClicked(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e); 
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY()); 
			}
		});
	}
	
}
