package parking;

import client.Client;
// import client.ClientContext;


public class ParkingSpace implements Parking{
	

	//private int num;
	private String id;
	private ParkingLot lot;
	private Client occupant;
	private String location;
	private boolean isOccupied;
	private boolean isEnabled;
	private Sensor sensor;
	private Car car;

	public ParkingSpace(ParkingLot lot, String id, String location) {
		this.id = id;
		this.lot =lot;
		this.location = location;
		this.isOccupied = false;
		this.isEnabled = true;
		//this.id=lot.getName()+num;
		this.car=null;

		this.sensor= new Sensor(this);

		this.sensor = new Sensor(this);

		
		
	}
	public void setOccupied(boolean b) {
		this.isOccupied=b;
	}
	public void setCar(Car car) {
		this.car = car;
		
	}
	
	public Sensor getSensor() {
		return this.sensor;
	}
	
	public void setOccupant(Client c) {
		this.occupant = c;
		
	}
	public String getId() {
		return this.id;
	}
	public ParkingLot getLot() {
		return this.lot;
	}
	@Override
	public void enable() {	
		this.isEnabled = true;

	}

	@Override
	public void disable() {
		this.isEnabled=false;
		
	}

    public String getLocation() {
        return this.location;
    }

    public ParkingLot getParkingLot() {
        return lot;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

	public boolean isEnabled() {
		return isEnabled;
	}

	@Override
	public ParkingIterator availableSpotsIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return this.location;
	}
	public Car getCar() {
		// TODO Auto-generated method stub
		return this.car;
	}


}