package booking;
import database.Observer;

public interface Subject {
	void removeObserver(Observer observer);
	void registerObserver(Observer observer);
}

