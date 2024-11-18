package managerView;

import java.awt.EventQueue;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import clientView.SiteVisitorView;
import management.ManagementTeam;
import management.Manager;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class showManagerHomepage extends JFrame {
	
	JPanel contentPane;
	
	
	public static void main(String[] args) {
		
        ManagementTeam team1 = new ManagementTeam("Team A");
		
		Manager man1 = new Manager("John", "Griffin", "jGriff@gmail.com", team1);
		
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	showManagerHomepage frame = new showManagerHomepage(man1);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
	
	public showManagerHomepage(Manager man) {
			
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 600);
        setTitle("Manager - Homepage");
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);
	        				
		JButton btnManageClients = new JButton("Manage Clients");
		btnManageClients.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ManagerClientView(man);
			}
		});
		btnManageClients.setBounds(126, 240, 332, 33);
		btnManageClients.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		JButton btnManageParkingLot = new JButton("Manage Parking Lot");
		btnManageParkingLot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new ManageParkingView(man);
				dispose();
			}
		});
		btnManageParkingLot.setBounds(84, 284, 406, 33);
		btnManageParkingLot.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.setLayout(null);
		contentPane.add(btnManageClients);
		contentPane.add(btnManageParkingLot);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		panel_1.setBounds(10, 11, 566, 46);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome " + man.firstname + "!");
		lblNewLabel.setBounds(10, 11, 391, 24);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		panel_1.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.setBounds(436, 9, 120, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SiteVisitorView.main(null);
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		panel_1.add(btnNewButton);
		

        revalidate();
        repaint();
        
      //  setVisible(true);
    }
}

	