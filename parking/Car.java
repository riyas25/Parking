package parking;

public class Car {

	private String model;
	private String color;
	private String plateNumber;
	
	public Car(String model,String color,String plateNumber) {
		this.model=model;
		this.color=color;
		this.plateNumber=plateNumber;
	}
	public Car(String plateNumber) {
		this.plateNumber=plateNumber;
		this.color="Unkown";
		this.model="Unkown";
	}
	public String getPlateNumber() {
		return this.plateNumber;
	}
	public String getModel() {
		return this.model;
	}
	public String getColor() {
		return this.color;
	}
}
