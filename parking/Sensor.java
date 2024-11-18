package parking;


import database.Database;

public class Sensor {
	Database database = Database.getInstance();
	private	String name;
	private boolean occupied;
	private ParkingSpace space;
	private Car car;

	public Sensor(ParkingSpace space) {
		this.name= space.getId();
		this.occupied=false;
		this.space = space;
		this.car=null;
	}
	
	public boolean getOccupied() {
		return occupied;
	}
	
	public void setCar(Car car) {
		occupied=true;
		this.space.setOccupied(true);
		this.car=car;
		int index = database.getSpaces().indexOf(space);
		database.getOccupiedSpaces().add(space);
		database.getSpaces().remove(space);
		
	}
	public void leaveCar() {
		this.car=null;
		this.space.setOccupied(false);
		occupied=false;
		int index=database.getOccupiedSpaces().indexOf(space);
		database.getOccupiedSpaces().get(index).setOccupied(false);
		
		
	}
	public String update() {
		String s;
		if(occupied==true) {
			 s="Car Model: "+car.getModel()+"\nCar Color: "+car.getColor()+
					 "\nCar PlateNumber: "+car.getPlateNumber();
		}
		else {
			s="There is no car at this place";
		}
		
		
		return s;
	}
	
}
