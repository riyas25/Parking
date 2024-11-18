package managerView;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import clientView.SiteVisitorView;
import database.Database;
import management.Manager;
import parking.ParkingLot;
import net.miginfocom.swing.MigLayout;

public class ManageParkingView extends JFrame {

    private JPanel contentPane;
    private ButtonGroup parkingLotsGroup = new ButtonGroup();
    private JPanel parkingSpacesPanel = new JPanel();
    private Map<String, Color[]> parkingLots = new HashMap<>();
    JPanel parkingLotsPanel = new JPanel();
    JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    /*
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ManageParkingView frame = new ManageParkingView();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    */

    /**
     * Create the frame.
     */
    public ManageParkingView(Manager man) {
    	setTitle("MANAGER (PARKING VIEW)");
    	
    	//JFrame frame = new JFrame("Manage Parking Lots and Spaces");
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 707, 678);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        parkingLotsPanel.setBounds(53, 88, 273, 150);
        contentPane.add(parkingLotsPanel);
        parkingLotsPanel.setLayout(new GridLayout(5, 1, 0, 0));

        for (char lot = 'A'; lot <= 'H'; lot++) {
            createParkingLot("Lot " + lot);
        }

        JButton btnEnableLot = new JButton("Enable Lot");
        btnEnableLot.setBounds(513, 116, 120, 23);
        contentPane.add(btnEnableLot);

        btnEnableLot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLot = getSelectedParkingLot();
                
                if (selectedLot != null) {
                    Color[] spaces = parkingLots.get(selectedLot);
                    for (int i = 0; i < spaces.length; i++) {
                        spaces[i] = null;
                    }
                    updateParkingSpaces();
                }
            }
        });

        JButton btnDisableLot = new JButton("Disable Lot");
        btnDisableLot.setBounds(513, 145, 120, 23);
        contentPane.add(btnDisableLot);

        btnDisableLot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedLot = getSelectedParkingLot();
                if (selectedLot != null) {
                    Color[] spaces = parkingLots.get(selectedLot);
                    for (int i = 0; i < spaces.length; i++) {
                        spaces[i] = Color.RED;
                    }
                    
                    // for disabling the parking lot
                    ArrayList<ParkingLot> lots = Database.getInstance().getLots();                
                    for (ParkingLot l: lots) {
                    	if (l.getName().equals(selectedLot)) {
                            l.disable();
                            break;
                        }
                    } 
                   
                    updateParkingSpaces();
                }
            }
        });

        JButton btnAddLot = new JButton("Add Lot");
        btnAddLot.setBounds(513, 173, 120, 23);
        contentPane.add(btnAddLot);

        btnAddLot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char lastLot = 'A';
                for (String lot : parkingLots.keySet()) {
                    lastLot = lot.charAt(lot.length() - 1);
                }

                if (lastLot < 'Z') {
                    createParkingLot("Lot " + (char) ('A' + parkingLots.size()));
                    parkingLotsPanel.revalidate();
                    parkingLotsPanel.repaint();
                }
            }
        });

        parkingSpacesPanel.setBounds(53, 280, 580, 350);
        contentPane.add(parkingSpacesPanel);
        parkingSpacesPanel.setLayout(new GridLayout(10, 10, 2, 2));
        
        JPanel panel = new JPanel();
        panel.setBounds(63, 249, 530, 26);
        contentPane.add(panel);
        
        lblNewLabel = new JLabel("Showing parking spaces for Lot: ");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
        panel.add(lblNewLabel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setBounds(10, 22, 673, 55);
        contentPane.add(panel_1);
                        panel_1.setLayout(null);
                        
                        JLabel lblHelloManager = new JLabel("Hello, Manager " + man.firstname);
                        lblHelloManager.setBounds(21, 7, 276, 41);
                        panel_1.add(lblHelloManager);
                        lblHelloManager.setForeground(new Color(25, 25, 25));
                        lblHelloManager.setFont(new Font("Tahoma", Font.BOLD, 20));
                        lblHelloManager.setBackground(new Color(25, 25, 25));
                
                        JButton btnPreviousPage = new JButton("<<Back");
                        btnPreviousPage.setBounds(458, 7, 101, 41);
                        panel_1.add(btnPreviousPage);
                        btnPreviousPage.addActionListener(new ActionListener() {
                        	public void actionPerformed(ActionEvent e) {
                        		 showManagerHomepage.main(null);
                        		 dispose();
                        	}
                        });
                
                        JButton btnLogout = new JButton("Logout");
                        btnLogout.setBounds(569, 7, 94, 41);
                        panel_1.add(btnLogout);
                btnLogout.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		SiteVisitorView.main(null);
                		dispose();
                	}
                });
        
        setVisible(true);
        
    }

    private void createParkingLot(String lotName) {
        // create actual lot in the code system
        new ParkingLot(101, lotName, "York Campus");
    	
        JRadioButton lotButton = new JRadioButton(lotName);
        parkingLotsGroup.add(lotButton);
        parkingLotsPanel.add(lotButton);

        lotButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	lblNewLabel.setText("Showing parking spaces for: " + lotName);
                updateParkingSpaces();
            }
        });

        Color[] spaces = new Color[100];
        for (int i = 0; i < spaces.length; i++) {
            spaces[i] = null;
        }
        parkingLots.put(lotName, spaces);
        
    }

    private String getSelectedParkingLot() {
        for (Enumeration<AbstractButton> buttons = parkingLotsGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }

    private void updateParkingSpaces() {
        parkingSpacesPanel.removeAll();

        String selectedLot = getSelectedParkingLot();
        if (selectedLot == null) {
            return;
        }       

        Color[] spaces = parkingLots.get(selectedLot);
        for (int i = 0; i < spaces.length; i++) {
        	 final int icopy = i;
            JButton spaceButton = new JButton(String.valueOf(i + 1));
            spaceButton.setBackground(spaces[i]);
            spaceButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    JDialog dialog = new JDialog(ManageParkingView.this, "Space Options", true);
                    dialog.setSize(200, 150);
                    dialog.setLocationRelativeTo(ManageParkingView.this);
                    dialog.getContentPane().setLayout(new FlowLayout());

                    JRadioButton btnEnable = new JRadioButton("Enable");
                    JRadioButton btnDisable = new JRadioButton("Disable");
                    ButtonGroup spaceOptionsGroup = new ButtonGroup();
                    spaceOptionsGroup.add(btnEnable);
                    spaceOptionsGroup.add(btnDisable);

                    JButton btnSave = new JButton("Save");
                    btnSave.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            if (btnEnable.isSelected()) {
                                spaceButton.setBackground(null);
                                spaces[Integer.parseInt(spaceButton.getText()) - 1] = null;
                                
                                // get the list of lots from database
                                // enable the selected space in the code system
                                ArrayList<ParkingLot> lots = Database.getInstance().getLots();
                                for (ParkingLot l: lots) {
                                	if (l.getName().equals(selectedLot)){
                                        l.getSpaces().get(icopy).enable();
                                        break;
                                    }
                                }           
           
                            } else if (btnDisable.isSelected()) {
                                spaceButton.setBackground(Color.RED);
                                spaces[Integer.parseInt(spaceButton.getText()) - 1] = Color.RED;
                                
                                // get the list of lots from database
                                // enable the selected space in the code system
                                ArrayList<ParkingLot> lots = Database.getInstance().getLots();
                                for (ParkingLot l: lots) {
                                	if (l.getName() == selectedLot) {
                                        l.getSpaces().get(icopy).disable();
                                        break;
                                    }
                                } 
                            }
                            dialog.dispose();
                        }
                    });

                    JButton btnCancel = new JButton("Cancel");
                    btnCancel.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                            dialog.dispose();
                        }
                    });

                    dialog.getContentPane().add(btnEnable);
                    dialog.getContentPane().add(btnDisable);
                    dialog.getContentPane().add(btnSave);
                    dialog.getContentPane().add(btnCancel);
                    dialog.setVisible(true);
                }
            });
            parkingSpacesPanel.add(spaceButton);
        }
        parkingSpacesPanel.revalidate();
        parkingSpacesPanel.repaint();
    }
}

