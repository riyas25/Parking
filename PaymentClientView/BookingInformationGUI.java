package PaymentClientView;

import javax.swing.*;
import java.awt.*;

public class BookingInformationGUI extends JFrame {
    private JPanel panel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel dateLabel;
    private JLabel startTimeLabel;
    private JLabel endTimeLabel;
    private JLabel licensePlateLabel;
    private JLabel spotNameLabel;
    private JLabel spotLocationLabel;
    private JLabel paymentLabel;
    private JLabel bookingIdLabel;
    private JLabel statusLabel;

    public BookingInformationGUI(String name, String email, String date, String startTime,
                                  String endTime, String licensePlate, String spotName,
                                  String spotLocation, String payment, int bookingId, String status) {
        setTitle("Booking Information");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        panel = new JPanel(new GridLayout(11, 2));

        nameLabel = new JLabel("Name: " + name);
        panel.add(nameLabel);

        emailLabel = new JLabel("Email: " + email);
        panel.add(emailLabel);

        dateLabel = new JLabel("Date: " + date);
        panel.add(dateLabel);

        startTimeLabel = new JLabel("Start Time: " + startTime);
        panel.add(startTimeLabel);

        endTimeLabel = new JLabel("End Time: " + endTime);
        panel.add(endTimeLabel);

        licensePlateLabel = new JLabel("License Plate: " + licensePlate);
        panel.add(licensePlateLabel);

        spotNameLabel = new JLabel("Spot Name: " + spotName);
        panel.add(spotNameLabel);

        spotLocationLabel = new JLabel("Spot Location: " + spotLocation);
        panel.add(spotLocationLabel);

        paymentLabel = new JLabel("Payment Option: " + payment);
        panel.add(paymentLabel);

        bookingIdLabel = new JLabel("Booking ID: " + bookingId);
        panel.add(bookingIdLabel);

        statusLabel = new JLabel("Booking Status: " + status);
        panel.add(statusLabel);

        add(panel);
        setVisible(true);
    }
}
