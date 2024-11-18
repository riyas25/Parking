package parking;

import java.util.ArrayList;

import client.Client;
import database.Database;

public class ParkingLot implements Parking {

	private int id;
	private String name;
	private String location;
	private ArrayList<ParkingSpace> spaces;
	private ArrayList<ParkingSpace> availSpaces;
	private boolean isEnabled;
	
	private Database database;
	
	public ParkingLot(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.spaces = new ArrayList<ParkingSpace>(100);
		 
        for (int i = 1; i <= 100; i++) {
            spaces.add(new ParkingSpace(this, this.name+"-"+i, "Location:"+this.location+" ParkingSpace: " +this.name+"-"+i));
        }
		this.availSpaces = new ArrayList<ParkingSpace>(100);
		this.setEnabled(true);

		this.database = Database.getInstance();
		this.database.add(this);
	}
	public String getLocation() {
		return this.location;
	}
	public int getId() {
        return id;
    }

    public ArrayList<ParkingSpace> getSpaces() {
        return spaces;
    }

	public String getName() {
		return name;
	}
	public  ArrayList<ParkingSpace> getavailSpaces() {
		return availSpaces;
	}
	
	public void add(ParkingSpace p) {
		spaces.add(p);
		this.availSpaces.add(p);
		
		database.add(p);
		System.out.println("Reached ParkingLot.add");
	}
	
	public void remove(ParkingSpace p) {
		spaces.remove(p);
		this.availSpaces.remove(p);
		
		database.remove(p);
		System.out.println("Reached ParkingLot.removed");	
	}

	@Override
	public void enable() {
		this.setEnabled(true);
	}
	
	public void enable(ParkingSpace p) {
		p.enable();
	}

	@Override
	public void disable() {
		this.setEnabled(false);
		// It also disables all the parking spaces that are in parking lot
		for(int i=0; i<spaces.size();i++) {
			spaces.get(i).disable();
		}
		this.availSpaces = new ArrayList<ParkingSpace>(100);
		
	}
	
	public void disable(ParkingSpace p) {
		p.disable();
		this.availSpaces.remove(p);
	}

    // This method returns an iterator that iterates over all available parking spots in the lot.
    public ParkingIterator availableSpotsIterator() {
        for (ParkingSpace spot : spaces) {
            if (spot.isEnabled()) {
            	availSpaces.add(spot);
            }
        }
        return new SpaceIterator(availSpaces);
    }

    // to get the next available spot in the parking lot
    // have to test!! not sure of implementation.

	public ParkingSpace getAvailableSpace(Client client, String plate) {

		ParkingIterator goodSpaces = this.availableSpotsIterator();
		if(plate != null) {
			ParkingSpace availableSpot = ((SpaceIterator) goodSpaces).nextSpot;
			return availableSpot; 
		}
		System.out.println("Invalid License plate number provided. Retry booking");
		return null;

	}
	@Override
	public String toString() {
		return this.name;
	}

	public boolean isEnabled() {
		return isEnabled;
		
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
		if(isEnabled==true) {
			for(int i=0; i<spaces.size();i++) {
				spaces.get(i).enable();
			}
		}
	}

}
