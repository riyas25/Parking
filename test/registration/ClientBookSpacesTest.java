package test.registration;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import booking.Booking;
import booking.Time;
import management.ManagementTeam;
import management.Manager;

import parking.ParkingLot;
import parking.ParkingSpace;
import client.SiteUser;
import client.types.Faculty;
import client.types.NonFacultyStaff;
import client.types.Student;
import client.types.Visitor;
import database.Database;
import database.Verifier;
import payment.CreditCard;

class ClientBookSpacesTest {
	
	ManagementTeam team1;
	
	Manager man1;
	Manager man2;
	Manager man3;
	
	ParkingLot lot1;
	ParkingLot lot2;
	ParkingLot lot3;
	
	SiteUser user1;
	SiteUser user2;

	
	@BeforeEach
	void setUp() throws Exception {
		/*
		 * setting up the system
		 * - create management team
		 * - add manager
		 * - add parking lot
		 * - add all parking spaces
		 */
		
		team1 = new ManagementTeam("Team 1");
		
		//managers are signed in by default when an instance is created
		man1 = new Manager("John", "Griffin", "jGriff@gmail.com", team1);
		man2 = new Manager("Jim", "Barten", "bartmen@gmail.com", team1);
		man3 = new Manager("Goob", "Inter", "intergoob@gmail.com", team1);
		
		lot1 = new ParkingLot(1, "William Small", "250 Centre Park");
		lot2 = new ParkingLot(2, "King Arboretum", "22 Arboretum ln");
		lot3 = new ParkingLot(3, "Window Sill", "22 Sill ln");
		 
		user1 = new SiteUser();
		user2 = new SiteUser();
		
	}

	@AfterEach
	void tearDown() throws Exception {
		//clear information from the database so test methods do not interfere with one another
		Database.refreshInstance();
	}

	// use case 4
	// verify the license plate syntax
	@Test
	void testLicensePlate () {
		
		String validLicensePlate = "ABC123";
		String invalidLicensePlate = "12AB34";
		assertTrue(Verifier.verifyPlate(validLicensePlate));
		assertFalse(Verifier.verifyPlate(invalidLicensePlate));
		
	}
	
	// use case 4
	//Tests that each user's payment rate is correct and based on their client type
	@Test
	void testRateBasedOnAccountType() {
		SiteUser user1 = new SiteUser();
		SiteUser user2 = new SiteUser();
		SiteUser user3 = new SiteUser();
		SiteUser user4 = new SiteUser();

		
		// Registering and testing rate for Student
		user1.register("student@my.yorku.ca", "StrongP@ssword123", "Doe", "John", "Student");
		assertTrue(user1.getState() instanceof Student, "User state should be an instance of Student");
		Student student = (Student) user1.getState();
		assertEquals(5.0, student.getRate(), "Student rate should be 5.0");
		
		// Registering and testing rate for Faculty
		user2.register("faculty@my.yorku.ca", "StrongP@ssword123", "Smith", "Jane", "Faculty");
		assertTrue(user2.getState() instanceof Faculty, "User state should be an instance of Faculty");
		Faculty faculty = (Faculty) user2.getState();
		assertEquals(8.0, faculty.getRate(), "Faculty rate should be 8.0");
		
		// Registering and testing rate for NonFacultyStaff
		user3.register("nonfacultystaff@my.yorku.ca", "StrongP@ssword123", "Johnson", "Michael", "NonFacultyStaff");
		assertTrue(user3.getState() instanceof NonFacultyStaff, "User state should be an instance of NonFacultyStaff");
		NonFacultyStaff nonFacultyStaff = (NonFacultyStaff) user3.getState();
		assertEquals(10.0, nonFacultyStaff.getRate(), "NonFacultyStaff rate should be 10.0");
		
		// Registering and testing rate for Visitor
		user4.register("visitor@outlook.com", "StrongP@ssword123", "Williams", "Emily", "Visitor");
		assertTrue(user4.getState() instanceof Visitor, "User state should be an instance of Visitor");
		Visitor visitor = (Visitor) user4.getState();
		assertEquals(15.0, visitor.getRate(), "Visitor rate should be 15.0");
	}

	// use case 4
	// tests that when a user books a space, the correct deposit amount is deducted from their account
	@Test
	void testDepositPaidAtBooking() {

        // Registering and testing deposit payment for Student
        user1.register("student@my.yorku.ca", "StrongP@ssword123", "Doe", "John", "Student");
        assertTrue(user1.getState() instanceof Student, "User state should be an instance of Student");
        Student student = (Student) user1.getState();
        man1.validate(student, student.getEmailAddress());
        double initialStudentBalance = student.getAccount().getBalance();
        ParkingSpace studentSpace = student.book(lot1, "STU123", student.getAccount());
        assertNotNull(studentSpace, "Student should be able to book a space");
        assertEquals(initialStudentBalance - student.getRate(), student.getAccount().getBalance(), "Student account balance should be reduced by deposit amount");
        user1.logout();

        // Registering and testing deposit payment for NonFacultyStaff
        user2.register("nonfacultystaff@my.yorku.ca", "StrongP@ssword123", "Johnson", "Michael", "NonFacultyStaff");
        assertTrue(user2.getState() instanceof NonFacultyStaff, "User state should be an instance of NonFacultyStaff");
        NonFacultyStaff nonFacultyStaff = (NonFacultyStaff) user2.getState();
        man1.validate(nonFacultyStaff, nonFacultyStaff.getEmailAddress());
        double initialNonFacultyStaffBalance = nonFacultyStaff.getAccount().getBalance();
        ParkingSpace nonFacultyStaffSpace = user2.book(lot2, "NFS456", nonFacultyStaff.getAccount());
        assertNotNull(nonFacultyStaffSpace, "NonFacultyStaff should be able to book a space");
        assertEquals(initialNonFacultyStaffBalance - nonFacultyStaff.getRate(), nonFacultyStaff.getAccount().getBalance(), "NonFacultyStaff account balance should be reduced by deposit amount");
        user2.logout();
	}

	// use case 4
	// test that a user who is not registered or logged in cannot book a space
	@Test
	void testOnlyLoggedInUsersCanBookSpace() {
		 SiteUser siteUser = new SiteUser();
		 
		// Attempt to book a space without logging in (should fail)
	     ParkingSpace space1 = siteUser.book(lot1, "ABC123", new CreditCard("1000200030004000", 0124, 100));
	     assertNull(space1, "Non-logged in user should not be able to book a space");
	     
	}

	// use case 4
	// Tests that after a client books a space, that space becomes unavailable
	@Test
	void testSpaceInvalidAfterBooking() {
		
        user1.register("student@york.com", "StrongP@ssword123", "Doe", "John", "Visitor");
        assertTrue(user1.getState() instanceof Visitor, "User state should be an instance of Visitor");
        Visitor Visitor = (Visitor) user1.getState();
        ParkingSpace VisitorSpace = Visitor.book(lot1, "STU123", new CreditCard("1000200030004000", 0124, 100));
        assertNotNull(VisitorSpace, "Visitor should be able to book a space");

        // Check if the space is disabled after booking
        assertFalse(VisitorSpace.isEnabled(), "The space should be disabled after successful booking");
        user1.logout();
	}

	// use case 7
	// tests that when a user extends a booking, the new end time is correct
	@Test
	void testExtendedBookingEndTime() throws ParseException {
        // Create a SiteUser and log in as a Visitor
        user2.register("email@example.com", "StrongP@ssword123", "John", "Doe", "Visitor");
        assertTrue(user2.getState() instanceof Visitor, "User state should be an instance of Visitor");
        Visitor Visitor = (Visitor) user2.getState();

        // Create a ParkingLot, ParkingSpace, and Time for the booking
        Time initialTime = new Time(10, 0, 12, 0);

        // Book a parking space
        ParkingSpace bookedSpace = Visitor.book(lot2, "ABC123", new CreditCard("1000200030004000", 0124, 100));
        
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    
        Booking booking = new Booking(Visitor, initialTime,d1,d2, bookedSpace, bookedSpace.getCar(), new CreditCard("1000200030004000", 0124, 100));

        // Extend the booking time by 1.5 hours
        double extension = 1.5;
        booking.extend(extension);

        // Check if the extended end time is correct
        int extendedEndHour = 13;
        int extendedEndMinute = 30;

        assertEquals(extendedEndHour, booking.getEndHour(), "Extended end hour is incorrect");
        assertEquals(extendedEndMinute, booking.getEndMinute(), "Extended end minute is incorrect");
	}

	// use case 7
	// tests that when a client cancels a booking, it can no longer be modified
	@Test
	void testCannotModifyCancelledBooking() throws ParseException {
		
        // Create a SiteUser and log in
		user2.register("email@example.com", "StrongP@ssword123", "John", "Doe", "Visitor");
        assertTrue(user2.getState() instanceof Visitor, "User state should be an instance of Visitor");
        Visitor Visitor = (Visitor) user2.getState();

        // book a space
        ParkingSpace bookedSpace = Visitor.book(lot1, "ABC123", new CreditCard("1000200030004000", 0124, 100));

        // Create a Booking and cancel it
        Time bookingTime = new Time(10, 0, 12, 0);
        
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    
        Booking booking = new Booking(Visitor, bookingTime,d1,d2, bookedSpace, bookedSpace.getCar(), new CreditCard("1000200030004000", 0124, 100));
        Visitor.cancelBooking(booking);

        // Attempt to modify the cancelled booking
        Time newTime = new Time(15, 3, 14, 10);
        Visitor.changeBookingTime(booking, newTime);

        // Assert that the booking time has not been modified and is null
        assertNotEquals(newTime.getStartHour(), booking.getStartHour());
        assertNotEquals(newTime.getStartMinute(), booking.getStartMinute());
        assertNotEquals(newTime.getEndHour(), booking.getEndHour());
        assertNotEquals(newTime.getEndMinute(), booking.getEndMinute());
    }

	// use case 7
	// Tests that a booking cannot be edited after it becomes active
	@Test
	void testBookingCannotBeModifiedAfterActive() throws ParseException {
		// Implement test for booking being cancelled or edited only before its start time
		
		 // Create a SiteUser and log in as a client
		user1.register("email@example.com", "StrongP@ssword123", "John", "Doe", "Visitor");
        assertTrue(user1.getState() instanceof Visitor, "User state should be an instance of Visitor");
        Visitor visitor = (Visitor) user1.getState();

        // Create a parking lot and book a parking space
        ParkingSpace space = visitor.book(lot2, "ABC123", new CreditCard("1000200030004000", 0124, 100));

        // Create a booking with desired time
        Time pastTime = new Time(1, 0, 3, 0);
        
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
	    Date d1 = sdformat.parse("2019-04-15");
	    Date d2 = sdformat.parse("2019-08-10");
	    
        Booking booking = new Booking(visitor, pastTime,d1,d2, space, space.getCar(), new CreditCard("1000200030004000", 0124, 100));

        // Make booking active (that is, start time has began). Attempt to change booking time
        booking.setActive(true);
        Time newTime = new Time(2, 30, 4, 3);
        visitor.changeBookingTime(booking, newTime);

        // Assert that the booking time has not been changed
        assertNotEquals(newTime.getStartHour(), booking.getStartHour());
        assertNotEquals(newTime.getStartMinute(), booking.getStartMinute());
        assertNotEquals(newTime.getEndHour(), booking.getEndHour());
        assertNotEquals(newTime.getEndMinute(), booking.getEndMinute());

        // Attempt to cancel booking
        assertFalse(visitor.cancelBooking(booking));
	}

	// use case 8
	// Tests that the spaces booked are only valid spaces
	@Test
	void testSomeBookedSpaceIsValid() {
		
		// Create a SiteUser and log in as a client
		user1.register("email@yahoo.com", "StrongP@ssword123", "John", "Doe", "Visitor");
		assertTrue(user1.getState() instanceof Visitor, "User state should be an instance of Visitor");
		Visitor Visitor = (Visitor) user1.getState();
		
        ParkingSpace bookedSpace = Visitor.book(lot2, "ABC123", new CreditCard("1000200030004000", 0124, 100));
        assertNotNull(bookedSpace); // Not null
        assertFalse(bookedSpace.isOccupied()); // Not occupied
	}

	// use case 8
	// Tests that spaces cannot be booked in a disabled lot.
	@Test
	void testBookSpaceOfEnabledLot() {
		
		user1.register("person@yorku.com", "StrongP@ssword123", "John", "Doe", "Faculty");
		assertTrue(user1.getState() instanceof Faculty, "User state should be an instance of Faculty");
		Faculty faculty = (Faculty) user1.getState();
		
        lot2.disable();

        // Attempt to book a parking space in the disabled parking lot
        ParkingSpace disabledSpace = faculty.book(lot2, "ABC123", new CreditCard("1000200030004000", 0124, 100));
        assertNull(disabledSpace);
		
	}


}
