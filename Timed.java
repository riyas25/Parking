package booking;

public interface Timed {
	
	public int getStartHour();
	public int getStartMinute();
	public int getEndHour();
	public int getEndMinute();
	public double totalTime();
}
