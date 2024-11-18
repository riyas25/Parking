
package client;

import java.util.ArrayList;
import booking.Booking;
import booking.Time;
import parking.ParkingLot;
import parking.ParkingSpace;
import database.Database;
import payment.Payable;

public class SiteUser implements ClientState{
	/*this class represents the context in the State pattern involving ClientState, Client, SiteVisitor
	 * and their subclasses
	 */
	private ClientState clientState;
	
	public final static String ALREADY_REGISTERED = "Already Registered";
	
	public SiteUser() {
		this.clientState = new SiteVisitor(this);
	}
	
	@Override
	public boolean login(String email, String password) {
		this.clientState = Database.getInstance().getClient(email, password);
		
		if(this.clientState == null) {
			System.out.println("Client does not exist.");
			return false;
		}else {
			System.out.println("Sign-in successful.");
			return true;
		}
	}
	
	public String register(String email, String password, String lastname, String firstname, String type) {
		return clientState.register(email, password, firstname, lastname, type);
	
	}
	
	public void changeBookingTime(Booking booking, Time time) {
		clientState.changeBookingTime(booking, time);
	}

	@Override
	public String pay(Booking booking, Payable paymentMethod) {
		return clientState.pay(booking, paymentMethod);
	}

	public boolean cancelBooking(Booking booking) {
		return clientState.cancelBooking(booking);
		
	}
	public String find(ParkingSpace space) {
		return clientState.find(space);
		
	}
	public ParkingSpace book(ParkingLot lot, String plate, Payable paymentMethod){
		return clientState.book(lot, plate, paymentMethod);
		
	}
	
	public void setState(ClientState state) {
		 this.clientState = state;
	}
	
	public ClientState getState() {
      return this.clientState;
   }
	public ClientState getClient() {
		
//		if(this.clientState.getClass().equals(Student.class))
		
	      return this.clientState;
	}

	public ArrayList<Booking> getBookings() {
		return this.clientState.getBookings();
	}

	@Override
	public void logout() {
		this.clientState.logout();
		
	}

}
