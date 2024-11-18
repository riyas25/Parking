package test;

import client.SiteUser;
import clientView.LoginView;
import database.Database;
import management.ManagementTeam;
import management.Manager;
import parking.ParkingLot;
import parking.ParkingSpace;

public class Demo {

	public static void main(String[] args) {
		new LoginView();
		
		
		/*setting up the system
		 * - create management team
		 * - add manager
		 * - add parking lot
		 * - add all parking spaces
		 */
		
//		ManagementTeam team1 = new ManagementTeam("Team 1");
//		
//		Manager man1 = new Manager("John", "Griffin", "jGriff@gmail.com", "Re#4", team1);
//		Manager man2 = new Manager("Jim", "Barten", "bartmen@gmail.com", "JusTICE123#", team1);
//		Manager man3 = new Manager("Goob", "Inter", "intergoob@gmail.com", "GGGer34#", team1);
//		
//		ParkingLot lot1 = new ParkingLot(1, "William Small", "250 Centre Park");
//		//add spaces to lot1
//		
//		SiteUser user1 = new SiteUser();
//		String user1sPlate = "CERA1234";
//		
//		//testing that all the punctuation are being recognized in verification
//		//punct = "[!\"#$%&'()*,/:;<=>?@`{|}~+_.-]"; - from Verifier.java
//
//		System.out.print("1");
//		user1.register("grbr@gmail.com", "3!REEtreyju", "goober", "roober", "Student");
//		System.out.print("2");
//		user1.register("grbr@gmail.com", "3\"REEtreyju", "goober", "roober", "Student");
//		
//		/*
//		System.out.print("3");
//		user1.register("grbr@gmail.com", "3#REEtreyju", "goober", "roober", "Student");
//		System.out.print("4");
//		user1.register("grbr@gmail.com", "3$REEtreyju", "goober", "roober", "Student");
//		System.out.print("5");
//		user1.register("grbr@gmail.com", "3%REEtreyju", "goober", "roober", "Student");
//		System.out.print("6");
//		user1.register("grbr@gmail.com", "3&REEtreyju", "goober", "roober", "Student");
//		System.out.print("7");
//		user1.register("grbr@gmail.com", "3'REEtreyju", "goober", "roober", "Student");
//		System.out.print("8");
//		user1.register("grbr@gmail.com", "3(REEtreyju", "goober", "roober", "Student");
//		System.out.print("9");
//		user1.register("grbr@gmail.com", "3)REEtreyju", "goober", "roober", "Student");
//		System.out.print("10");
//		user1.register("grbr@gmail.com", "3*REEtreyju", "goober", "roober", "Student");
//		System.out.print("11");
//		user1.register("grbr@gmail.com", "3,REEtreyju", "goober", "roober", "Student");
//		System.out.print("12");
//		user1.register("grbr@gmail.com", "3/REEtreyju", "goober", "roober", "Student");
//		System.out.print("13");
//		user1.register("grbr@gmail.com", "3:REEtreyju", "goober", "roober", "Student");
//		System.out.print("14");
//		user1.register("grbr@gmail.com", "3;REEtreyju", "goober", "roober", "Student");
//		System.out.print("15");
//		user1.register("grbr@gmail.com", "3<REEtreyju", "goober", "roober", "Student");
//		System.out.print("16");
//		user1.register("grbr@gmail.com", "3=REEtreyju", "goober", "roober", "Student");
//		System.out.print("17");
//		user1.register("grbr@gmail.com", "3>REEtreyju", "goober", "roober", "Student");
//		System.out.print("18");
//		user1.register("grbr@gmail.com", "3?REEtreyju", "goober", "roober", "Student");
//		System.out.print("19");
//		user1.register("grbr@gmail.com", "3@REEtreyju", "goober", "roober", "Student");
//		System.out.print("20");
//		user1.register("grbr@gmail.com", "3`REEtreyju", "goober", "roober", "Student");
//		System.out.print("21");
//		user1.register("grbr@gmail.com", "3{REEtreyju", "goober", "roober", "Student");
//		System.out.print("22");
//		user1.register("grbr@gmail.com", "3|REEtreyju", "goober", "roober", "Student");
//		System.out.print("23");
//		user1.register("grbr@gmail.com", "3}REEtreyju", "goober", "roober", "Student");
//		System.out.print("24");
//		user1.register("grbr@gmail.com", "3~REEtreyju", "goober", "roober", "Student");
//		System.out.print("25");
//		user1.register("grbr@gmail.com", "3+REEtreyju", "goober", "roober", "Student");
//		System.out.print("26");
//		user1.register("grbr@gmail.com", "3_REEtreyju", "goober", "roober", "Student");
//		System.out.print("27");
//		user1.register("grbr@gmail.com", "3.REEtreyju", "goober", "roober", "Student");
//		System.out.print("28");
//		user1.register("grbr@gmail.com", "3-REEtreyju", "goober", "roober", "Student");
//	*/
//		
//		//to show that the user was registered only once
//		System.out.println("\nCurrently registered clients");
//		Database.getInstance().printClientNames();
//		
//		user1.book(lot1, user1sPlate);
//		
//		user1.login("grbr@gmail.com", "3!REEtreyju");
//		
//		SiteUser user2 = new SiteUser();
//		user2.register("adss@gmail.com", "3!REEtreyju", "doobe", "roober", "Visitor");
//		
//		man1.setSuper(team1);
//		man2.login(team1.getUsername(), team1.getPassword(), "Team 1");
//		man2.disable(lot1);
//		man3.enable(lot1);
	}
	

}
