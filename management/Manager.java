package management;

import booking.Booking;
import client.Client;
import database.Database;
import database.Verifier;

import java.util.Random;
import parking.Parking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Manager implements Managing {
	private HashMap<Boolean, ManagementTeam> isSuper;
	private String password; 
	private String emailAddress; 
	private String lastname;
	public String firstname;
	private ManagementTeam team;
	private Boolean superM;
	private boolean loggedIn;
	
	
	public Manager(String firstname, String lastname, String emailAddress, ManagementTeam team) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = "";
		this.emailAddress = emailAddress;
		this.setTeam(team);
		this.isSuper = new HashMap<Boolean, ManagementTeam>();
		this.loggedIn = true;
	}
	
	public void setSuper(ManagementTeam team, String password){
		if(this.loggedIn) {
			isSuper.put(true, team);
			superM = true;
			this.password = password;
			team.setSuper(this);
		}
		
	}
	public void removeSuper(ManagementTeam team){
		if(this.loggedIn) {
			isSuper.remove(true, team);
			if (isSuper.isEmpty()) {
				superM = false;
			}
		}
	}
	
	public void addManager(String name, String password){
		//TODO implement adding a manager to a team
	}
	
	public boolean generateAccount(String password, ManagementTeam team) throws Exception {
		return generateAccount(password, team.getTeamName());
    }

	public boolean generateAccount(String password, String teamname) throws Exception{
		if (loggedIn == true){
			if (this.password.equals(password) && superM == true && this.team.getTeamName().equals(teamname)) {
	            AutoAccountGenerationSystem.generateNewAccount(this.team);
	        } else if (!this.password.equals(password)) {
	            throw new Exception("Incorrect password");
	        } else {
	            throw new Exception("Access denied. Only the super manager for the selected team can generate new accounts.");
	        }
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean login(String username, String password, String teamname) {
		if (loggedIn == true){
			System.out.println("Already logged into Management Team");
			return false;
		}else {
			if (this.getTeam().getTeamName().equals(teamname)) {
				if (username.equals(this.getTeam().getUsername()) && 
						password.equals(this.getTeam().getPassword())) {
					this.loggedIn = true;
					System.out.println("Successfully logged into Management Team");
				    return true;	
				}
				else {
					System.out.println("Wrong Username of Password. Try again");
					return false;
				}			
			}
			else {
				System.out.println("You are not a member of this team. Try again with the right team");
				return false;
			}	
		}
		
	}
	
	public void logOut() {
		this.loggedIn = false;
		System.out.println("Log out successful");
	}
	
	// the manager has to be logged into the system in order to maintain the parking services
	// (i.e enable, disable etc)
	public void enable(Parking p) {
		if (loggedIn == true){
			p.enable();
			System.out.println("location has been enabled");
		}
		else {
			System.out.println("Not Authorized to carry out this action");
		}
	}

	@Override
	public boolean disable(Parking p) {
		if (loggedIn == true){
			p.disable();
			System.out.println("location has been disabled");
			return true;
		}
		else {
			System.out.println("Not Authorized to carry out this action");
			return false;
		}
	}

	@Override
	public void cancel(Booking booking) {
		if (loggedIn == true){
			booking.cancel();
			System.out.println("booking cancelled");
		}
		else {
			System.out.println("Not Authorized to carry out this action");
		}
	}

	@Override
	public boolean validate(String email, String password, String type) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void enableAllLots() {
		//enable all lots in the parkingToDos HashMap
		if (loggedIn == true){
			for (Map.Entry<Parking, Flag> entry : getTeam().getParkingTodos().entrySet()) {
				if(entry.getValue().getCause().equals("enable")) {
					entry.getKey().enable();
					getTeam().getParkingTodos().remove(entry.getKey());
				}
	        }
			System.out.println("Lots have been enabled");
		}
		else {
			System.out.println("Not Authorized to carry out this action");
		}

	}
	public void disableAllLots() {
		//enable all lots in the parkingToDos HashMap
		if (loggedIn == true){
			for (Map.Entry<Parking, Flag> entry : getTeam().getParkingTodos().entrySet()) {
				if(entry.getValue().getCause().equals("disable")) {
					entry.getKey().disable();
					getTeam().getParkingTodos().remove(entry.getKey());
				}
	        }
			System.out.println("Lots have been disabled");
		}
		else {
			System.out.println("Not Authorized to carry out this action");
		}

	}

	public void cancelAllBookingTodos() {
		//cancel all bookings in the bookingToDos HashMap
		if (loggedIn == true){
			for (Map.Entry<Booking, Flag> entry : getTeam().getBookingTodos().entrySet()) {
				if(entry.getValue().getCause().equals("cancel")) {
					entry.getKey().cancel();
					getTeam().getBookingTodos().remove(entry.getKey());
				}
			}
			System.out.println("Bookings have been cancelled");
		}
		else {
			System.out.println("Not Authorized to carry out this action");
		}

	}

	public ManagementTeam getTeam() {
		return team;
	}

	public void setTeam(ManagementTeam team) {
		this.team = team;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean validate(Client client, String emailAddress) {
		//client is validated only if their email address matches the yorku email syntax
		if(Verifier.verifyNonVisitorEmail(emailAddress)) {
			client.setApproved(true);
			return true;
		}
		
		return false;
		
	}

	
}
