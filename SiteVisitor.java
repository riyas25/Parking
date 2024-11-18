package client;

import java.util.ArrayList;

import booking.Booking;
import booking.Time;
import client.types.Faculty;
import client.types.NonFacultyStaff;
import client.types.Student;
import client.types.Visitor;
import database.Database;
import database.Verifier;
import parking.ParkingLot;
import parking.ParkingSpace;
import payment.Payable;

public class SiteVisitor implements ClientState {
	//this class represents a user of the parking system who is not logged in
	
	protected SiteUser context;
	
	public SiteVisitor(SiteUser context) {
		this.context = context;
	}
	
	@Override
	public boolean login(String email, String password) {
		return context.login(email, password);
	}

	@Override
	public String register(String email, String password, String firstname, String lastname, String type) {
		if(Database.getInstance().getUsers().get(email) == null) {
			if(Verifier.verifyEmail(email)) {
				System.out.println(Verifier.VERIFIED_EMAIL); 
				
				if(Verifier.verifyPassword(password)) {
					System.out.println(Verifier.STRONG_PW);
					Client client = new Visitor(context);
					switch(type) {
					case "Student":
						client = new Student(context, email, password, firstname, lastname);
						context.setState(client);
						break;
					case "Faculty":  
						client = new Faculty(context, email, password, firstname, lastname);
						context.setState(client);
						break;		
					case "NonFacultyStaff": 
						client = new NonFacultyStaff(context, email, password, firstname, lastname);
						context.setState(client);
						break;
					case "Visitor": 
						client = new Visitor(context, email, password, firstname, lastname);
						context.setState(client);
						break;
					}
					//update database
					Database.getInstance().add(client);
					System.out.println("isVerified " +client.isApproved );
					return Verifier.SUCCESSFUL;
				}else {
					return Verifier.WEAK_PW;
				}
			}else {
				System.out.println("Please enter a valid email address.");
				return Verifier.INVALID_EMAIL;
			}
			
		}else {
			System.out.println("Email already in use.");
			return Verifier.DUPE_EMAIL;
		}
	}

	@Override
	public void changeBookingTime(Booking booking, Time time) {
		System.out.println("Log in to manage a booking.");
	}

	@Override
	public ParkingSpace book(ParkingLot lot, String plate, Payable paymentMethod) {
		System.out.println("Log in to book a space.");
		return null;
	}

	@Override
	public String find(ParkingSpace space) {
		System.out.println("Log in to find a space.");
		return null;
	}

	@Override
	public boolean cancelBooking(Booking booking) {
		System.out.println("Log in to manage a booking.");
		return false;
	}

	@Override
	public String pay(Booking booking, Payable paymentMethod) {
		System.out.println("Log in to pay for a booking.");
		return null;
	}

	@Override
	public void logout() {
		System.out.println("You are not logged in.");
	}

	@Override
	public ArrayList<Booking> getBookings() {
		return new ArrayList<Booking>();
	}

}
