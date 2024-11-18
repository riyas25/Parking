package PaymentClientView;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;



public class ParkingBookingSystemGUI extends JFrame {



    private JTextField nameTextField, emailTextField, dateTextField, startTimeTextField, endTimeTextField, licensePlateTextField, spotNameTextField, spotLocationTextField;

    private JRadioButton creditRadioButton, debitRadioButton, applePayRadioButton, googlePayRadioButton;

    private JButton confirmButton, cancelButton, helpButton;



    public ParkingBookingSystemGUI() {

        setTitle("Parking Booking System");

        setSize(706, 550);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.setLayout(null);



        JLabel label = new JLabel("Name:");
        label.setBounds(112, 22, 210, 50);
        panel.add(label);
        
                nameTextField = new JTextField(20);
                nameTextField.setBounds(173, 22, 210, 50);
                
                        panel.add(nameTextField);



        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(112, 83, 210, 50);

        panel.add(emailLabel);

        emailTextField = new JTextField(20);
        emailTextField.setBounds(173, 83, 210, 50);

        panel.add(emailTextField);



        JLabel label_1 = new JLabel("Date (MM/DD/YYYY):");
        label_1.setBounds(54, 442, 210, 50);
        panel.add(label_1);

        dateTextField = new JTextField(20);
        dateTextField.setBounds(173, 203, 210, 50);

        panel.add(dateTextField);



        JLabel label_2 = new JLabel("Start Time (HH:MM AM/PM):");
        label_2.setBounds(21, 142, 210, 50);
        panel.add(label_2);

        startTimeTextField = new JTextField(20);
        startTimeTextField.setBounds(173, 144, 210, 50);

        panel.add(startTimeTextField);



        JLabel label_3 = new JLabel("End Time (HH:MM AM/PM):");
        label_3.setBounds(21, 203, 210, 50);
        panel.add(label_3);

        endTimeTextField = new JTextField(20);
        endTimeTextField.setBounds(173, 382, 210, 50);

        panel.add(endTimeTextField);



        JLabel label_4 = new JLabel("License Plate:");
        label_4.setBounds(84, 382, 210, 50);
        panel.add(label_4);

        licensePlateTextField = new JTextField(20);
        licensePlateTextField.setBounds(173, 321, 210, 50);

        panel.add(licensePlateTextField);



        JLabel label_5 = new JLabel("Spot Name:");
        label_5.setBounds(98, 264, 210, 50);
        panel.add(label_5);

        spotNameTextField = new JTextField(20);
        spotNameTextField.setBounds(173, 262, 210, 50);

        panel.add(spotNameTextField);



        JLabel label_6 = new JLabel("Spot Location:");
        label_6.setBounds(84, 321, 210, 50);
        panel.add(label_6);

        spotLocationTextField = new JTextField(20);
        spotLocationTextField.setBounds(173, 442, 210, 50);

        panel.add(spotLocationTextField);



        ButtonGroup paymentButtonGroup = new ButtonGroup();



        helpButton = new JButton("Help");
        helpButton.setBounds(593, 452, 89, 50);

        helpButton.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));

        panel.add(helpButton);



        getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(192, 192, 192));
        panel_1.setBounds(424, 31, 258, 354);
        panel.add(panel_1);
        panel_1.setLayout(null);
        
        
        
                JLabel label_7 = new JLabel("Payment Options:");
                label_7.setBounds(10, 11, 210, 50);
                panel_1.add(label_7);
                label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
                
                
                
                        applePayRadioButton = new JRadioButton("Apple Pay");
                        applePayRadioButton.setBounds(30, 51, 210, 50);
                        panel_1.add(applePayRadioButton);
                        
                                paymentButtonGroup.add(applePayRadioButton);
                                
                                
                                
                                        debitRadioButton = new JRadioButton("Debit");
                                        debitRadioButton.setBounds(30, 84, 210, 50);
                                        panel_1.add(debitRadioButton);
                                        
                                                paymentButtonGroup.add(debitRadioButton);
                                                
                                                
                                                
                                                        creditRadioButton = new JRadioButton("Credit");
                                                        creditRadioButton.setBounds(30, 122, 210, 50);
                                                        panel_1.add(creditRadioButton);
                                                        
                                                                paymentButtonGroup.add(creditRadioButton);
                                                                
                                                                
                                                                
                                                                        googlePayRadioButton = new JRadioButton("Google Pay");
                                                                        googlePayRadioButton.setBounds(30, 162, 210, 50);
                                                                        panel_1.add(googlePayRadioButton);
                                                                        
                                                                                paymentButtonGroup.add(googlePayRadioButton);
                                                                                
                                                                                
                                                                                
                                                                                        confirmButton = new JButton("Confirm");
                                                                                        confirmButton.setBounds(30, 219, 210, 50);
                                                                                        panel_1.add(confirmButton);
                                                                                        
                                                                                        
                                                                                        
                                                                                                cancelButton = new JButton("Cancel");
                                                                                                cancelButton.setBounds(30, 280, 210, 50);
                                                                                                panel_1.add(cancelButton);

        setVisible(true);

    }



    public static void main(String[] args) {

        new ParkingBookingSystemGUI();

    }
}

