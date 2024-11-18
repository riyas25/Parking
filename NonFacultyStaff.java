package client.types;

import client.Client;
import client.SiteUser;

public class NonFacultyStaff extends Client {
	private final double RATE = 10.0;

	public NonFacultyStaff(SiteUser context) {
		super(context);
		super.setRATE(RATE);
	}
	
	public NonFacultyStaff(SiteUser context, String email, String password, String lastname, String firstname) {
		super(context, email, password, lastname, firstname);
		super.setRATE(RATE);
	}

}
