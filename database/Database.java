package database;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import booking.Time;
import client.Client;
import client.SiteUser;
import client.types.Student;
import client.types.Visitor;
import management.ManagementTeam;
import parking.ParkingLot;
import parking.ParkingSpace;

public class Database implements Observer {

	private static Database database;
	
	private HashMap<String, String> users;
	private ArrayList<Client> clients;
	private ArrayList<Client> unverifiedClients;

	public ArrayList<ParkingLot> pLots; //Available Parking Lots
	private ArrayList<ArrayList<ParkingSpace>> pSpaces; //Available ParkingSpaces
	private HashMap<ParkingSpace,Client> occupiedMappings;
	private ArrayList<ParkingSpace> occupiedSpaces;
	
	
	
	
	private ArrayList<ManagementTeam> mgmtTeams;
	
	private Database() {
		this.users = new HashMap<String, String>();//mapping email to pword
		this.mgmtTeams = new ArrayList<ManagementTeam>();
		this.occupiedMappings=new HashMap<ParkingSpace,Client>();
		this.pLots = new ArrayList<>();
		this.pSpaces=new ArrayList<>();
		this.clients = new ArrayList<>();
		this.unverifiedClients = new ArrayList<Client>();
		
		this.occupiedSpaces = new ArrayList<>();
		
		//TODO adding this so that greatlove can test the login page
		this.clients.add(new Student(new SiteUser(), "great", "love", "bari", "gl"));
			
	}
	public static Database getInstance() {
		if(database == null) {
			database = new Database();
		}
		return database;
	}
	
	public void setPlot(ArrayList<ParkingLot> plots) {
		//add all the parking lots to database 
		this.pLots = plots;
		this.setPspace();
	}
	public void setPspace() {
		//add all the parking spaces from the parking lots to the database
		for(int i=0; i<pLots.size(); i++) {
			pSpaces.set(i, pLots.get(i).getavailSpaces());
		}
	}

	public Client getClient(ParkingSpace p) {
		return occupiedMappings.get(p);
	}
	
	public Client getClient(String email, String password) {
		Client answer = null;
		for(int i=0; i< clients.size(); i++) {
			Client client = clients.get(i);
			if(client.getEmailAddress().equals(email) && client.getPassword().equals(password)) {
				answer = client;
				break;
			}
		}
		return answer;
	}
	public HashMap<String, String> getUsers() {
		return this.users;
	}
	public ArrayList<ParkingSpace> getReservations(){
		return this.occupiedSpaces;
	}
	
	
	@Override
	public void update(Client c, ParkingSpace p) {
		if(!(c==null) && users.get(c.getEmailAddress()) == null) {
			occupiedMappings.put(p,c);
			 occupiedSpaces.add(p);
		}
			ParkingLot lot = p.getLot();
			int index=pLots.indexOf(lot);
//			pspace.get(index).remove(p);
		
	}
	public void add(ManagementTeam team) {
		mgmtTeams.add(team);
	}
	
	public ArrayList<ManagementTeam> getTeams() {
		return mgmtTeams;
	}
	
	public void verify(Client client) {
		System.out.println("Client verified");
		unverifiedClients.remove(client);
	}
	public void add(Client client) {
		clients.add(client);
		users.put(client.getEmailAddress(), client.getPassword());
		if(!client.isApproved()) {
			Random random = new Random();
			unverifiedClients.add(client);
			mgmtTeams.get(random.nextInt(mgmtTeams.size())).verify(client);
		}
	}
	public void printClientNames() {
		for(int i = 0; i < clients.size(); i++) {
			System.out.println(clients.get(i).getFullName());
		}
	}
	public ArrayList<Client> getClients() {
		return clients;
	}
	public ArrayList<Client> getUnverifiedClients() {
		return unverifiedClients;
	}
	public ArrayList<ParkingLot> getLots() {
		return pLots;
	}
	public ArrayList<ArrayList<ParkingSpace>> getSpaces() {
		return pSpaces;
	}
	public HashMap<ParkingSpace, Client> getOccupiedMappings() {
		return occupiedMappings;
	}
	public ArrayList<ParkingSpace> getOccupiedSpaces() {
		return occupiedSpaces;
	}
	public ArrayList<ManagementTeam> getMgmtTeams() {
		return mgmtTeams;
	}
	public void add(ParkingLot parkingLot) {
		//adds the lot and its spaces to the arrays
		this.pLots.add(parkingLot);
		this.pSpaces.add(parkingLot.getavailSpaces());
	}
	public void add(ParkingSpace p) {
		//used when a space is added to some parking lot to update the database lists
		//identify the lot to which the input space belongs and add the space to the list of parking spaces at that lot's index
		
		pSpaces.get(
				pLots.indexOf(p.getLot()))
									.add(p);
		
	}
	public void remove(ParkingSpace p) {
		//used when a space is removed from some parking lot to update the database lists
		//identify the lot to which the input space belongs and removed the space from the list of parking spaces at that lot's index
				
		pSpaces.get(
				pLots.indexOf(p.getLot()))
									.remove(p);
	}
	public static void refreshInstance() {
		// specifically for test cases where the Database instance needs to be re-initalized after some test method runs
		database = null;
		
	}
	
	
}
