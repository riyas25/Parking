package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import client.Client;
import client.SiteUser;
import database.Database;
import management.ManagementTeam;
import management.Manager;
import org.junit.jupiter.api.AfterEach;
import parking.ParkingLot;

public class ParkingTest {
	@AfterEach
	void tearDown() throws Exception {
		//clear information from the database so test methods do not interfere with one another
		Database.refreshInstance();
	}
	@Test
	public void test1() {
		
		ManagementTeam t= new ManagementTeam("Mangament Team");
		Manager manager= new Manager("John","James","John@yorku.ca",t);
		t.add(manager);
		Database database = Database.getInstance();
		
		SiteUser context1= new SiteUser();
		SiteUser context2= new SiteUser();
		context1.register("sara@yorku.ca", "S@ra123", "Adams", "Sara", "Student");
		context2.register("Alex@yorku.ca", "Alex123!", "James", "Alex", "Faculty");
		Client client1= (Client) context1.getState();
		Client client2=(Client) context2.getState();
		client1.setApproved(true);
		client2.setApproved(true);
		context1.login("sara@yorku.ca","S@ra123");
		context2.login("Alex@yorku.ca", "Alex123!");
	
	
		ParkingLot dummyLot = new ParkingLot(1, "P1", "Willi small");
		
		assertTrue(database.getLots().get(0)==dummyLot);
		assertTrue(database.getLots().get(0).getSpaces().size()==100);
		
		database.getLots().get(0).disable();
		assertTrue(database.getLots().get(0).isEnabled()== false);
		assertTrue(database.getLots().get(0).isEnabled()== dummyLot.isEnabled());
		assertTrue(database.getLots().get(0).getSpaces().get(0).isEnabled()== false);
		assertTrue(database.getLots().get(0).getSpaces().get(50).isEnabled()== false);
		assertTrue(database.getLots().get(0).getSpaces().get(99).isEnabled()== false);
		
		database.getLots().get(0).enable();
		
		assertTrue(database.getLots().get(0).isEnabled()== true);
		assertTrue(database.getLots().get(0).isEnabled()== dummyLot.isEnabled());
		assertTrue(database.getLots().get(0).getSpaces().get(0).isEnabled()== true);
		assertTrue(database.getLots().get(0).getSpaces().get(50).isEnabled()== true);
		assertTrue(database.getLots().get(0).getSpaces().get(99).isEnabled()== true);
		

		assertTrue(database.getLots().get(0).getLocation()=="Willi small");
		assertTrue(dummyLot.getLocation()=="Willi small");
		
		
		
		for(int i=0;i<100;i++) {
			String name=dummyLot.getSpaces().get(i).getId();
			assertTrue(database.getLots().get(0).getSpaces().get(i).getId()==name);
		}
		
		
		
		
		
		
		
		
	}
}
