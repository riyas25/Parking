package database;

import booking.Time;
import client.Client;
import parking.ParkingSpace;

public interface Observer {

void update(Client c, ParkingSpace p);

}
