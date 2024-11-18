package managerView;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import client.SiteUser;
import clientView.SiteVisitorView;
import database.Database;
import management.ManagementTeam;
import management.Manager;
import parking.ParkingLot;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagerLoginView extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JPanel contentPane;

    
    public static void main(String[] args) {
		
		ManagementTeam team1 = new ManagementTeam("Team A");
		
		Manager man1 = new Manager("John", "Griffin", "jGriff@gmail.com", team1);
		Manager man2 = new Manager("Jim", "Barten", "bartmen@gmail.com", team1);
		Manager man3 = new Manager("Goob", "Inter", "intergoob@gmail.com", team1);
		
		ParkingLot lot1 = new ParkingLot(1, "William Small", "250 Centre Park");
		
		
		man1.setSuper(team1, "MAN1@ss");
    	
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ManagerLoginView frame = new ManagerLoginView(man1);
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    } 
    


    public ManagerLoginView(Manager man1) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Manager Login");
        setSize(600, 600);
        setLocationRelativeTo(null);

        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        usernameLabel.setBounds(133, 164, 100, 25);
        contentPane.add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(220, 165, 200, 25);
        contentPane.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
        passwordLabel.setBounds(133, 213, 100, 25);
        contentPane.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(220, 214, 200, 25);
        contentPane.add(passwordField);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Team A", "Team B", "Team C", "Team D"}));
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
        comboBox.setBounds(220, 262, 75, 22);
        contentPane.add(comboBox);
        
        JLabel lblSelectTeam = new JLabel("Select Team:");
        lblSelectTeam.setFont(new Font("Tahoma", Font.PLAIN, 13));
        lblSelectTeam.setBounds(133, 261, 100, 25);
        contentPane.add(lblSelectTeam);

        JButton loginButton = new JButton("Login");
        loginButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String team = (String) comboBox.getSelectedItem();

                // Check team, username and password here
                boolean valid = man1.login(username, password, team);

                valid = true;
                if (valid) {
                   new showManagerHomepage(man1);
                   dispose();
                } else {
                    JOptionPane.showMessageDialog(ManagerLoginView.this, "Invalid username or password");
                }
            }
        });
        loginButton.setBounds(273, 306, 100, 30);
        contentPane.add(loginButton);
        
     // Add "Generate Account" button
        JButton generateAccountButton = new JButton("Generate Account");
        generateAccountButton.setFont(new Font("Tahoma", Font.BOLD, 12));
        generateAccountButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showGenerateAccountDialog(man1);
            }
        });
        generateAccountButton.setBounds(380, 10, 200, 30);
        contentPane.add(generateAccountButton);


        setVisible(true);
    }
    
    private void showGenerateAccountDialog(Manager man1) {
        JPasswordField passwordField = new JPasswordField();
        JComboBox comboBox = new JComboBox(new DefaultComboBoxModel(new String[]{"Team A", "Team B", "Team C", "Team D"}));
        Object[] message = {
                "Enter Password:", passwordField,
                "Select Team:", comboBox
        };

        int option = JOptionPane.showConfirmDialog(this, message, "Generate Account", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String password = new String(passwordField.getPassword());
            String team = (String) comboBox.getSelectedItem();
            try {
                man1.generateAccount(password, team);
                JOptionPane.showMessageDialog(this, "Account created successfully:\nUsername: " + man1.getTeam().getUsername() + "\nPassword: " + man1.getTeam().getPassword(), "Account Details", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
   
}