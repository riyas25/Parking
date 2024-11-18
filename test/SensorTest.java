package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import booking.Booking;
import booking.Time;
import client.Client;
import client.SiteUser;
import database.Database;
import management.ManagementTeam;
import management.Manager;
import org.junit.jupiter.api.AfterEach;
import parking.Car;
import parking.ParkingLot;
import parking.ParkingSpace;
import parking.Sensor;
import payment.CreditCard;

public class SensorTest {
	@AfterEach
	void tearDown() throws Exception {
		//clear information from the database so test methods do not interfere with one another
		Database.refreshInstance();
	}

	@SuppressWarnings("unlikely-arg-type")
	@Test
	public void test1() throws ParseException {
		
		ManagementTeam t= new ManagementTeam("Mangament Team");
		Manager manager= new Manager("John","James","John@yorku.ca",t);
		t.add(manager);
		
		
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
		
		Car c1= new Car("c1","Black","AB-12-CD-3456");
		Car c2=new Car("c2","White","ST-67-UV-4321");
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    
		Booking booking1=new Booking(client1, new Time(11,10,22,14),d1,d2, dummyLot.getSpaces().get(1),c1, new CreditCard("1000200030004000", 0124, 100));
		Booking booking2=new Booking(client2, new Time(12,10,20,14),d1,d2, dummyLot.getSpaces().get(2),c2, new CreditCard("1000200030004000", 0124, 100));
		
		ParkingSpace p1= booking1.getSpace();
		Sensor sensor1= p1.getSensor();
		assertEquals(sensor1.update(),"There is no car at this place");
		sensor1.setCar(c1);
		String s1 ="Car Model: c1\nCar Color: Black\n"
				+ "Car PlateNumber: AB-12-CD-3456";
		assertEquals(s1, sensor1.update());
		
		sensor1.leaveCar();
		assertEquals(sensor1.update(),"There is no car at this place");
		
		ParkingSpace p2= booking2.getSpace();
		Sensor sensor2= p2.getSensor();
		assertEquals(sensor2.update(),"There is no car at this place");
		sensor2.setCar(c2);
		String s2 ="Car Model: c2\nCar Color: White\n"
				+ "Car PlateNumber: ST-67-UV-4321";
		assertEquals(s2, sensor1.update());
		
		sensor2.leaveCar();
		assertEquals(sensor2.update(),"There is no car at this place");
		
		
	}
	@Test
	public void test2() throws ParseException {
		ManagementTeam t= new ManagementTeam("Mangament Team");
		Manager manager= new Manager("John","James","John@yorku.ca",t);
		t.add(manager);
		
		
		SiteUser context1= new SiteUser();
		SiteUser context2= new SiteUser();
		context1.register("Mary@yorku.ca", "M@ry123", "Adams", "Mary", "Student");
		context2.register("Anton@yorku.ca", "Anton123!", "James", "Anton", "Faculty");
		Client client1= (Client) context1.getState();
		Client client2=(Client) context2.getState();
		client1.setApproved(true);
		client2.setApproved(true);
		context1.login("Mary@yorku.ca","M@ry123");
		context2.login("Anton@yorku.ca", "Anton123!");
	
	
		ParkingLot dummyLot = new ParkingLot(1, "P1", "Willi small");
		
		Car c1= new Car("c1","Black","AB-12-CD-3456");
		Car c2=new Car("c2","White","ST-67-UV-4321");
		
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
		
		Booking booking1=new Booking(client1, new Time(11,10,22,14),d1,d2, dummyLot.getSpaces().get(3),c1, new CreditCard("1000200030004000", 0124, 100));
		Booking booking2=new Booking(client2, new Time(12,10,20,14),d1,d2, dummyLot.getSpaces().get(4),c2, new CreditCard("1000200030004000", 0124, 100));
		
		Database database = Database.getInstance();
		
		ParkingSpace p1= booking1.getSpace();
		Sensor sensor1= p1.getSensor();
		int index=database.getOccupiedSpaces().indexOf(p1);
		assertTrue(database.getOccupiedSpaces().get(index).isOccupied()==false);
		sensor1.setCar(c1);
		assertTrue(database.getOccupiedSpaces().get(index).isOccupied()==true);
		
		sensor1.leaveCar();
		assertTrue(database.getOccupiedSpaces().get(index).isOccupied()==false);
		
	
	}
	@Test
	public void test3() {
		
		Database database = Database.getInstance();
		ParkingSpace p1= database.getOccupiedSpaces().get(0);
		Client client= database.getOccupiedMappings().get(p1);
		
		SiteUser context1= new SiteUser();
		context1.login("sara@yorku.ca","S@ra123");
		Client client1= (Client) context1.getState();
		
		assertTrue(client==client1);
		assertEquals(p1,client.getBookings().get(0).getSpace());
		
		SiteUser context2= new SiteUser();
		context2.login("Alex@yorku.ca", "Alex123!");
		Client client2=(Client) context2.getState();
		
		ParkingSpace p2= database.getOccupiedSpaces().get(1);
		Client client3= database.getOccupiedMappings().get(p2);
		
		assertTrue(client2==client3);
		

		
		
		
		
		
	}
}
