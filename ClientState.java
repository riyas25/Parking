package client;

import java.util.ArrayList;

import booking.Booking;
import booking.Time;
import parking.ParkingLot;
import parking.ParkingSpace;
import payment.Payable;

public interface ClientState {

	public boolean login(String email, String password);
	public void logout();
	public String register(String email, String password, String firstname, String lastname, String type);
	public void changeBookingTime(Booking booking, Time time);

	public String pay(Booking booking, Payable paymentMethod);

	public ParkingSpace book(ParkingLot lot, String plate, Payable paymentMethod);

	public String find(ParkingSpace space);
	public boolean cancelBooking(Booking booking);
	public ArrayList<Booking> getBookings();
	
}