package clientView;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientView {

	public ClientView() {
		// the gui which a client will interact with to login
		
		JFrame frame = new JFrame("York University Parking");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);

        JPanel windowPanel = new JPanel();
        GridBagLayout windowPanelLayout  = new GridBagLayout();
        GridBagConstraints windowPanelConstraint = new GridBagConstraints();
        
        windowPanel.setLayout(windowPanelLayout);
        
        windowPanelConstraint.fill = GridBagConstraints.VERTICAL;
        windowPanelConstraint.gridx = GridBagConstraints.FIRST_LINE_START;
        windowPanelConstraint.gridy = GridBagConstraints.FIRST_LINE_START;

        //add fields to panel before buttons due to relative placement in GridBag
        JPanel fieldPanel1 = new JPanel();
        
        //add the username text field beside the username text field
        JLabel usernameLabel = new JLabel("Username");
        fieldPanel1.add(usernameLabel);
        JTextField usernameField = new JTextField(20);
        fieldPanel1.add(usernameField);
        
        windowPanelLayout.setConstraints(fieldPanel1, windowPanelConstraint);
        
        JPanel fieldPanel2 = new JPanel();
        
        JLabel passwordLabel = new JLabel("Password");
        fieldPanel2.add(passwordLabel);
        JTextField passwordField = new JTextField(20);
        fieldPanel2.add(passwordField);
        
        windowPanelConstraint.gridy = GridBagConstraints.RELATIVE;
        windowPanelLayout.setConstraints(fieldPanel2, windowPanelConstraint);
        
        JPanel buttonsPanel = new JPanel();
        //sets the button panel below the text fields
        windowPanelConstraint.gridy = GridBagConstraints.LAST_LINE_START;
        windowPanelLayout.setConstraints(buttonsPanel, windowPanelConstraint);
        
        JButton logInButton = new JButton("Log In");
        buttonsPanel.add(logInButton);
       
        JButton signUpButton = new JButton("Sign Up");
        buttonsPanel.add(signUpButton);
        
        windowPanel.add(fieldPanel1);
        windowPanel.add(fieldPanel2);
        windowPanel.add(buttonsPanel);
        
        frame.getContentPane().add(BorderLayout.CENTER, windowPanel);
        
        frame.setVisible(true);
 	}

}
