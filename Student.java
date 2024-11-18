package client.types;

import booking.Booking;
import client.Client;
import client.SiteUser;
import parking.ParkingLot;
import parking.ParkingSpace;

public class Student extends Client {

	private final double RATE = 5.0;
	
	public Student(SiteUser context) {
		super(context);
		super.setRATE(RATE);
	}
	
	public Student(SiteUser context, String email, String password, String lastname, String firstname) {
		super(context, email, password, lastname, firstname);
		super.setRATE(RATE);
	}

}
