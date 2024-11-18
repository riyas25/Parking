package clientView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import client.Client;
import client.SiteUser;
import database.Verifier;

public class LoginView {
    
    public LoginView() {
    	initialize();
    }
	public void initialize() {

		int DEFAULT_TEXT_FIELD_SIZE = 18;
		JFrame frame = new JFrame("York University Parking");
		JPanel logInPanel = new JPanel();
		GridBagLayout logInPanelLayout  = new GridBagLayout();
		
		JPanel usernamePanel = new JPanel();
		JPanel passwordPanel = new JPanel();
	    JPanel failedLoginLabelPanel = new JPanel();
		
	    JLabel usernameLabel = new JLabel("Username");
	    JTextField usernameField = new JTextField(DEFAULT_TEXT_FIELD_SIZE);
	    
	    JLabel passwordLabel = new JLabel("Password");
	    JPasswordField passwordField = new JPasswordField(DEFAULT_TEXT_FIELD_SIZE);  
	   
	    JLabel failedLoginLabel = new JLabel("Incorrect username or password");

	    JPanel buttonsPanel = new JPanel();
	    
	    JButton logInButton = new JButton("Log In");
	    JButton signUpButton = new JButton("Sign Up");
	    
	    /*
	     * signUpPanel contents
	     */
	    
		JPanel signUpPanel = new JPanel();
		GridBagLayout signUpPanelLayout  = new GridBagLayout();
		
		JPanel emailPanel = new JPanel();
		JPanel pwPanel = new JPanel();
		JPanel fnPanel = new JPanel();
		JPanel lnPanel = new JPanel();
		JPanel clientTypePanel = new JPanel();
		
		 JLabel promptLabel = new JLabel("Please complete this sign up form");
		
	     JLabel emailLabel = new JLabel("Email Address");
	     JTextField emailField = new JTextField(DEFAULT_TEXT_FIELD_SIZE);
	    
	     JLabel passwordLabel2 = new JLabel("Password");
	     JPasswordField passwordField2 = new JPasswordField(DEFAULT_TEXT_FIELD_SIZE);//import of JPasswordField not working for some reason  
	   
	     JLabel fnLabel = new JLabel("First Name");
	     JTextField fnField = new JTextField(DEFAULT_TEXT_FIELD_SIZE);
	    
	     JLabel lnLabel = new JLabel("Last Name");
	     JTextField lnField = new JTextField(DEFAULT_TEXT_FIELD_SIZE);//import of JPasswordField not working for some reason  

	     JLabel typeLabel = new JLabel("Client Type");
	     String[] clientTypes = { "Student", "Faculty", "Non Faculty Staff", "Visitor", "Manager" };

	    //Create a combo box, select item at index 0.
	     JComboBox clientsList = new JComboBox(clientTypes);
	    
	     JPanel buttonsPanel2= new JPanel();
	    
	     JButton logInButton2 = new JButton("Log In");
	     JButton signUpButton2 = new JButton("Sign Up");
	    
		// the gui which a client will interact with after login
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

        GridBagConstraints logInPanelConstraint = new GridBagConstraints();
        
        logInPanel.setLayout(logInPanelLayout);
        
        logInPanelConstraint.gridx = GridBagConstraints.FIRST_LINE_START;
        logInPanelConstraint.gridy = GridBagConstraints.FIRST_LINE_START;

        //add fields to panel before buttons due to relative placement in GridBag
        //add the username text label beside the username text field
        usernamePanel.add(usernameLabel);
        usernamePanel.add(usernameField);
        
        logInPanelLayout.setConstraints(usernamePanel, logInPanelConstraint);
      
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);
        
        logInPanelConstraint.gridy = GridBagConstraints.RELATIVE;
        logInPanelLayout.setConstraints(passwordPanel, logInPanelConstraint);
       
       
        failedLoginLabelPanel.add(failedLoginLabel);
        
        //formatting the failed login message
        failedLoginLabel.setFont(new Font("Verdana", Font.PLAIN, 10));
        failedLoginLabel.setForeground(Color.decode("#eb4634"));
        failedLoginLabel.setVisible(false); //failed login invisible default
        
        logInPanelLayout.setConstraints(failedLoginLabelPanel, logInPanelConstraint);
        
        //sets the button panel below the text fields
        logInPanelConstraint.gridy = GridBagConstraints.LAST_LINE_END;
        logInPanelLayout.setConstraints(buttonsPanel, logInPanelConstraint);
        
        //add buttons to their panel
        buttonsPanel.add(logInButton);
        buttonsPanel.add(signUpButton);
        
        //add all sub-panels to the whole window panel in order
        
        logInPanel.add(usernamePanel);
        logInPanel.add(passwordPanel);
		logInPanel.add(failedLoginLabelPanel);
        logInPanel.add(buttonsPanel);
        
        /*
         * describing the sign up panel
         */
        
        GridBagConstraints signUpPanelConstraint = new GridBagConstraints();
        
        signUpPanel.setLayout(signUpPanelLayout);
        
        signUpPanelConstraint.gridx = GridBagConstraints.FIRST_LINE_START;
        signUpPanelConstraint.gridy = GridBagConstraints.FIRST_LINE_START;

        //formatting the prompt
        promptLabel.setFont(new Font("Verdana", Font.PLAIN, 15));
        promptLabel.setForeground(Color.decode("#2e0552"));
        
        signUpPanelLayout.setConstraints(promptLabel, signUpPanelConstraint);
        
        //add fields to panel before buttons due to relative placement in GridBag
        //add the username text label beside the username text field
        signUpPanelConstraint.gridy = GridBagConstraints.RELATIVE;
        
        emailPanel.add(emailLabel);
        emailPanel.add(emailField);
        
        signUpPanelLayout.setConstraints(emailPanel, signUpPanelConstraint);
      
        pwPanel.add(passwordLabel2);
        pwPanel.add(passwordField2);
   
        signUpPanelLayout.setConstraints(pwPanel, signUpPanelConstraint);
        
        fnPanel.add(fnLabel);
        fnPanel.add(fnField);
       
        signUpPanelLayout.setConstraints(fnPanel, signUpPanelConstraint);
        
        lnPanel.add(lnLabel);
        lnPanel.add(lnField);
       
        signUpPanelLayout.setConstraints(lnPanel, signUpPanelConstraint);
        
        clientTypePanel.add(typeLabel);
        clientTypePanel.add(clientsList);
       
        signUpPanelLayout.setConstraints(clientTypePanel, signUpPanelConstraint);
        
        //sets the button panel below the text fields
        //add buttons to their panel
//        buttonsPanel2.add(logInButton2);
        buttonsPanel2.add(signUpButton2);
        
//        signUpPanelConstraint.gridy = GridBagConstraints.LAST_LINE_END;
        signUpPanelLayout.setConstraints(buttonsPanel2, signUpPanelConstraint);
        
        clientsList.setSelectedIndex(0);
        
        //add all sub-panels to the bottom of the window panel in order
        signUpPanel.add(promptLabel);
        signUpPanel.add(emailPanel);
        signUpPanel.add(pwPanel);
        signUpPanel.add(fnPanel);
        signUpPanel.add(lnPanel);
        signUpPanel.add(clientTypePanel);
        signUpPanel.add(buttonsPanel2);
        
        /*
         * sign up panel description ends
         */
        
        frame.getContentPane().add(BorderLayout.CENTER, logInPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, signUpPanel);
        
        signUpPanel.setVisible(false); //sign up panel only appears when sign up button clicked
        
        frame.setVisible(true);
        
        //adding functionality to buttons
        logInButton.addActionListener(logInListener -> {
    		//defines what happens when the log in button is pressed
    		
    		String username = usernameField.getText();
    		String password = String.valueOf(passwordField.getPassword());
    		
    		SiteUser user = new SiteUser();
    		if(user.login(username, password)) {
    			frame.setVisible(false);
    			try {
					new ClientHomeView((Client) user.getState());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}else {
    			failedLoginLabel.setVisible(true);
    		}
    		
    	});
        signUpButton.addActionListener(signUpListener -> {
    		//defines what happens when the sign up button is pressed from the home view
    		signUpPanel.setVisible(true);
    	});
        
        signUpButton2.addActionListener(signUpListener -> {
    		//what to do when the user has filled the sign up form
    		SiteUser user = new SiteUser();
    		
    		String output = user.register(emailField.getText(), String.valueOf(passwordField2.getPassword()), 
    				lnField.getText(), fnField.getText(), (String) clientsList.getSelectedItem());
    		//TODO check for empty/ cells
    		if(output.equals(Verifier.INVALID_EMAIL)) {
    			JOptionPane.showMessageDialog(frame, "Please enter a valid email address.");
    		}else if(output.equals(Verifier.DUPE_EMAIL)) {
    			JOptionPane.showMessageDialog(frame, "Email already in use.");
    		}else if(output.equals(Verifier.WEAK_PW)) {
    			JOptionPane.showMessageDialog(frame, "Please enter a stronger password.");
    		}
    		if(output.equals(Verifier.SUCCESSFUL)) {
    			try {
					new ClientHomeView((Client) user.getState());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    				
    		
    	});
 	}
	

}
