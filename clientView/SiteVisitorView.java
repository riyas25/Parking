package clientView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import client.SiteUser;
import management.ManagementTeam;
import management.Manager;
import managerView.ManageClients;
import managerView.ManageParkingView;
import managerView.ManagerLoginView;
import parking.ParkingLot;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class SiteVisitorView extends JFrame {
	static Manager man1 = null;
	
    private JPanel panel;


	/**
	 * Launch the application.
	 */
    
	
	public static void main(String[] args) {
		
		ManagementTeam team1 = new ManagementTeam("Team A");
		
		man1 = new Manager("John", "Griffin", "jGriff@gmail.com", team1);
		Manager man2 = new Manager("Jim", "Barten", "bartmen@gmail.com", team1);
		Manager man3 = new Manager("Goob", "Inter", "intergoob@gmail.com", team1);
		
		ParkingLot lot1 = new ParkingLot(120, "William Small", "250 Centre Park");
		
		SiteUser user1 = new SiteUser();
		String user1sPlate = "CERA1234";
		
		man1.setSuper(team1, "MAN1@sup");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SiteVisitorView frame = new SiteVisitorView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SiteVisitorView() {
		
		setTitle("Welcome to the YorkU Parking Lot System!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		
		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("Register/Login as:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(163, 188, 239, 31);
		panel.add(lblNewLabel);
		
		JButton manager = new JButton("Manager");
		manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ManagerLoginView(man1);
				dispose();
			}
		});
		manager.setBounds(298, 230, 173, 74);
		manager.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.setLayout(null);
		panel.add(manager);
		
		JButton btnUser = new JButton("User");
		btnUser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                    new LoginView();
                    dispose(); // close the login window
                
            }
        });
		btnUser.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUser.setBounds(149, 230, 121, 74);
		panel.add(btnUser);
		

        revalidate();
        repaint();
		

	}
	
}
