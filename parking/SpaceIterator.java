package parking;

import java.util.Iterator;
import java.util.List;

public class SpaceIterator implements ParkingIterator {

    private Iterator<ParkingSpace> parkingSpotIterator;
    protected ParkingSpace nextSpot;

    public SpaceIterator(List<ParkingSpace> parkingSpots) {
        this.parkingSpotIterator = parkingSpots.iterator();
        this.nextSpot = findNextAvailableSpot();
    }

    @Override
    public boolean hasNext() {
        return nextSpot != null;
    }

    @Override
    public ParkingSpace getNext() {
    	ParkingSpace currentSpot = nextSpot;
        nextSpot = findNextAvailableSpot();
        return currentSpot;
    }

    // This method finds the next available parking spot by iterating over all parking spots in the lot.
    // If no available spot is found, it returns null.
    private ParkingSpace findNextAvailableSpot() {
        while (parkingSpotIterator.hasNext()) {
        	ParkingSpace spot = parkingSpotIterator.next();
            if (spot.isEnabled()) {
                return spot;
            }
        }
        return null;
    }

}
