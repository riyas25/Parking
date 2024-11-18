package parking;

public interface Parking {
	
	void enable();
	void disable();
	public ParkingIterator availableSpotsIterator();
}
