package booking;

public class Time implements Timed{

	private int startHour;
	private int startMinute;
	private int endHour;
	private int endMinute;
	
	//this Time class is based on a 24-hour clock
	public Time(int startHour, int startMinute, int endHour, int endMinute) {
		this.startHour = startHour;
		this.startMinute = startMinute;
		this.endHour = endHour;
		this.endMinute = endMinute;
	}
	
	public Time(Time time) {
		this(time.getStartHour(), time.getStartMinute(), time.getEndHour(), time.getEndMinute());
	}

	public int getStartHour() {
		return startHour;
	}

	public int getStartMinute() {
		return startMinute;
	}

	public int getEndHour() {
		return endHour;
	}

	public int getEndMinute() {
		return endMinute;
	}
	
	public boolean isBefore(Time otherTime) {
		return this.startHour < otherTime.startHour && this.startMinute < otherTime.startMinute;
	}
	
	public double totalTime() {
		//returns the total time of booking in hours
		return getEndHour()-getStartHour()+(getStartMinute()-getEndMinute())/60;
	}

	public void setEndHour(int whole) {
		this.endHour = whole;
		
	}

	public void setEndMinute(int d) {
		this.endMinute = d;
		
	}
}
