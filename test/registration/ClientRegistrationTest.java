package test.registration;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import management.ManagementTeam;
import management.Manager;

import parking.ParkingLot;
import parking.ParkingSpace;

import client.SiteUser;
import client.Client;

import database.Database;
import database.Verifier;
import payment.CreditCard;

class ClientRegistrationTest {
	
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

	@Test
	void testSyntax() {
		/*
		 * Will test:
		 * valid email syntax
		 * valid password syntax
		 */
		
		String validation = user1.register("user1@gmail.com", "USER1@pwd", "User", "One", "Student");
		
		assertFalse(validation.equals(Verifier.WEAK_PW), "User1 Password validation failed");
		assertFalse(validation.equals(Verifier.INVALID_EMAIL), "User1 email validation failed");
		assertFalse(validation.equals(Verifier.DUPE_EMAIL), "User1 email non-duplicate failed");
		assertTrue(validation.equals(Verifier.SUCCESSFUL), "User1 registration failed");
		
		/*
		 * attempting to register user2 with weak password
		 */
		String validation3 = user2.register("user2@gmail.com", "USER2", "User", "Two", "Student");
		
		assertTrue(validation3.equals(Verifier.WEAK_PW), "User2 Password validation failed");
		
		/*
		 * attempting to register user2 with invalid email
		 */
		String validation4 = user2.register("user2gmail.com", "USER2@pw", "User", "Two", "Student");
		
		assertTrue(validation4.equals(Verifier.INVALID_EMAIL), "User2 Password validation failed");		
		
		/*
		 * attempting to register user2 with all valid credentials
		 */
		String validation5 = user2.register("user2@gmail.com", "USER2@pw", "User", "Two", "Student");
		
		assertTrue(validation5.equals(Verifier.SUCCESSFUL), "User2 registration failed");		
		
	}
	
	@Test
	void testDuplicates() {
		/*
		 * Will test:
		 * no registration with already used email 
		 * user cannot register twice
		 * user cannot sign in before registration
		 */
		
		String validation = user1.register("user1@gmail.com", "USER1@pwd", "User", "One", "Student");
		
		assertFalse(validation.equals(Verifier.WEAK_PW), "User1 Password validation failed");
		assertFalse(validation.equals(Verifier.INVALID_EMAIL), "User1 email validation failed");
		assertFalse(validation.equals(Verifier.DUPE_EMAIL), "User1 email non-duplicate failed");
		assertTrue(validation.equals(Verifier.SUCCESSFUL), "User1 registration failed");
		
		/*
		 * attempting to register user2 with dupe email 
		 */
		String validation2 = user2.register("user1@gmail.com", "USER1@pwd", "User", "One", "Student");
		
		assertTrue(validation2.equals(Verifier.DUPE_EMAIL), "User2 email duplicate not identified"); //dupe email is the first return value
		assertFalse(validation2.equals(Verifier.INVALID_EMAIL), "User2 email validation failed");
		assertFalse(validation2.equals(Verifier.WEAK_PW), "User2 Password validation failed");
		assertFalse(validation2.equals(Verifier.SUCCESSFUL), "User2 registration failed");
		
		/*
		 * attempting to register user twice
		 */
		String validation3 = user1.register("user1@gmail.com", "USER1@pwd", "User", "One", "Student");
		
		assertTrue(validation3.equals(SiteUser.ALREADY_REGISTERED), "User1 duplicate registration not identified");
		assertFalse(validation3.equals(Verifier.INVALID_EMAIL), "User1 email validation failed");
		assertFalse(validation3.equals(Verifier.WEAK_PW), "User1 Password validation failed");
		assertFalse(validation3.equals(Verifier.SUCCESSFUL), "User1 registration failed");
		
		/*
		 * attempting to sign unregistered user in
		 */
		boolean validation4 = user2.login("user2@gmail.coom", "USER2@pw");
		
		assertFalse(validation4, "Successful User2 login without registration");
		
		
	}
	@Test
	void testClientType() {
		/*
		 * Will test:
		 * students get validation from manager before being able to book
		 * faculty get validation from manager before being able to book
		 * non-faculty staff get validation from manager before being able to book
		 */
		String validation = user1.register("user1@gmail.com", "USER1@pwd", "User", "One", "Student");
		
		assertFalse(validation.equals(Verifier.WEAK_PW), "User1 Password validation failed");
		assertFalse(validation.equals(Verifier.INVALID_EMAIL), "User1 email validation failed");
		assertFalse(validation.equals(Verifier.DUPE_EMAIL), "User1 email non-duplicate failed");
		assertTrue(validation.equals(Verifier.SUCCESSFUL), "User1 registration failed");
		
		ParkingSpace user1_space = user1.book(lot1, "ABCD1234", new CreditCard("1000200030004000", 0124, 100));
		
		assertEquals(null, user1_space, "User1 booked space without manager validation");
 
		Client user1_client = (Client) user1.getState();
		//user 1 registered with non-yorku email address so they will not be validated
		assertFalse(man1.validate(user1_client, user1_client.getEmailAddress()));
		
		//change user's email and retry
		user1_client.setEmailAddress("user1@my.yorku.ca");
		assertTrue(man1.validate(user1_client, user1_client.getEmailAddress()));
		
		ParkingSpace user1_space2 = user1.book(lot1, "ABCD1234", new CreditCard("1000200030004000", 0124, 100));
		
		assertNotEquals(null, user1_space2, "User unable to book space after manager validation");
		
	}
	
	@Test
	void testAutoAccountGeneration() {
		/*
		 * Will test:
		 * ONLY super-manager can generate unique accounts for managing team
		 * super manager can generate unique accounts
		 * generated accounts have unique email addresses and passwords
		 * credentials of unique accounts are retrievable
		 */
		
		/*
		 * super manager can generate a unique account for some team
		 */
		
		String man1SuperPW = "MAN1#sUPER1";
		man1.setSuper(team1, man1SuperPW);
		boolean result = false;
		try {
			result = man1.generateAccount(man1SuperPW, team1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//verify that the generated user name is unique and password is strong
		/* 
		 * generated user names are intrinsically unique due to the inner HashMap which holds all the
		 * user names generated by the auto account generations system and the differing format of
		 * generated user names from client formats
		 */
		assertTrue(Verifier.verifyUsername(team1.getUsername()));
		assertTrue(Verifier.verifyPassword(team1.getPassword()));
		assertTrue(result, "Man1 generation of account failed");
		
		/*
		 * non-super manager cannot generate a unique account
		 */
		try {
			man2.generateAccount(man1SuperPW, team1);
			fail("Expected an Exception to be thrown");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * test that logging in with the generated
		 * credentials gives the manager access to maintaining parking services
		 */
	
		man1.logOut();
		
		//logged out super manager cannot generate a unique account for some team
		boolean result2 = false;
		try {
			result2 = man1.generateAccount(man1SuperPW, team1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertFalse(result2, "Manager generated account while logged out");
		
		//logged out manager cannot perform manager actions
		man2.logOut();
		
		assertFalse(man2.disable(lot1), "Manager disabled lot while logged out");
		
		//logging in gives managers access to manager/team actions
		
		man2.login(man2.getTeam().getUsername(), man2.getTeam().getPassword(), man2.getTeam().getTeamName());
		
		man1.login(man1.getTeam().getUsername(), man1.getTeam().getPassword(), man1.getTeam().getTeamName());
		
		boolean result3 = false;
		try {
			result3 = man1.generateAccount(man1SuperPW, team1);
		} catch (Exception e) {
			e.printStackTrace();
		}

		assertTrue(result3, "Manager could not generate account while logged in");

		assertTrue(man2.disable(lot1), "Manager could not disable lot while logged in");
		
		//TODO test that generated email is unique
	}

}
