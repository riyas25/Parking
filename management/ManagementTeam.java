package management;

import java.util.ArrayList;
import java.util.HashMap;

import booking.Booking;
import client.Client;
import database.Database;
import parking.Parking;

public class ManagementTeam implements Managing {
	
	private String teamName;
	private ArrayList<Manager> team;
	private Manager superM;
	private HashMap<Parking, Flag> parkingTodos;
	private HashMap<Client, Flag> clientTodos;
	private HashMap<Booking, Flag> bookingTodos;
	private String Username;
	private String Password;

	public ManagementTeam(String name) {
		this.teamName = name;
		this.team = new ArrayList<Manager>();

		this.parkingTodos = new HashMap<Parking, Flag>();
		this.clientTodos = new HashMap<Client, Flag>();
		this.bookingTodos = new HashMap<Booking, Flag>();

		Database.getInstance().add(this);
	}
	
	public void add(Manager manager) {
		team.add(manager);
	}

	public void setTeam(ArrayList<Manager> team){
		this.team=team;
	}
	
	public void setSuper(Manager superM) {
		this.superM=superM;
	}
	@Override
	public void enable(Parking p) {
		parkingTodos.put(p, new Flag("enable"));
	}

	@Override
	public boolean disable(Parking p) {
		//TODO add relevant conditionals to prevent always return true
		parkingTodos.put(p, new Flag("disable"));
		return true;
	}

	@Override
	public void cancel(Booking booking) {
		bookingTodos.put(booking, new Flag("cancel"));
	}

	@Override
	public boolean validate(String email, String password, String type) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verify(Client client) {
		// TODO Auto-generated method stub
		Database.getInstance().verify(client);
	}

	public ArrayList<Manager> getTeam() {
		return team;
	}

	public Manager getSuperM() {
		return superM;
	}

	public HashMap<Parking, Flag> getParkingTodos() {
		return parkingTodos;
	}

	public HashMap<Client, Flag> getClientTodos() {
		return clientTodos;
	}

	public HashMap<Booking, Flag> getBookingTodos() {
		return bookingTodos;
	}
	
	public String getUsername() {
		return this.Username;
	}

	public String getPassword() {
		return this.Password;
	}

	public void setUsername(String username) {
		this.Username = username;
	}

	public void setPassword(String password) {
		this.Password = password;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
