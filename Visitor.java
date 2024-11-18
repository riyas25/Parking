package client.types;

import client.Client;
import client.SiteUser;

public class Visitor extends Client {
	private final double RATE = 15.0;
	
	public Visitor(SiteUser context) {
		super(context);
		super.setRATE(RATE);
	}
	
	public Visitor(SiteUser context, String email, String password, String lastname, String firstname) {
		super(context, email, password, lastname, firstname);
		this.setApproved(true);
		super.setRATE(RATE);
	}

}
