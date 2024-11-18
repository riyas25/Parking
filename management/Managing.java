package management;

import booking.Booking;
import parking.Parking;

public interface Managing {

	void enable(Parking p);
	boolean disable(Parking p);
	void cancel(Booking booking);
	boolean validate(String email, String password, String type);
}
