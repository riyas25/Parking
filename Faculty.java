package client.types;

import client.Client;
import client.SiteUser;

public class Faculty extends Client {
	private final double RATE = 8.0;
	public Faculty(SiteUser context, String email, String password, String lastname, String firstname) {
		super(context, email, password, lastname, firstname);
		super.setRATE(RATE);
	} 
	
	public Faculty(SiteUser context) {
		super(context);
		super.setRATE(RATE);
	}

}
