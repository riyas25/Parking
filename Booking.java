package booking;


import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import client.Client;
import database.Database;
import parking.Car;
import parking.ParkingSpace;
import payment.Payable;


public class Booking implements Timed {

	protected Client booker;
	protected String plate;
	protected ParkingSpace space;
	protected boolean isActive;
	protected boolean cancelled;

	protected boolean onTime;
	protected Time time;

	protected Date startDate;
	protected Date finishDate;
	
	protected Car car;
	
	private Database database = Database.getInstance();
	private Payable paymentMethod;


	public Booking(Client booker, Time time, Date d1, Date d2, ParkingSpace space, Car car, Payable paymentMethod) {
		this.booker = booker;
		this.booker.getBookings().add(this);
		this.space = space;
		this.time = new Time(time);
		
		this.startDate=d1;
		this.finishDate=d2;
		this.paymentMethod = paymentMethod;

		database.update(booker, space);
		this.car=car;
		
		
		 
		// Getting deposit from user
		booker.deposit(paymentMethod);
		
		
		/*
		 * This interface can schedule code to run once after a specified delay or at fixed time intervals.

		To run a piece of code once after a delay, we can use the schedule method:
		 */
		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
	//	executorService.schedule(this.depositCheck(), 1+time.getStartHour(), TimeUnit.HOURS);
		
	
	}
	//Changing Time
	public void editBookingTime(Time time) {
		 Calendar now = Calendar.getInstance();
		 int hour= Calendar.HOUR_OF_DAY;
		 int min= Calendar.MINUTE;
		 if( time.getStartHour()<=hour|| time.getStartMinute()<min) {
			 this.time=time;
		 }
	}
	public void extendBookingTime(int extendHour) {
		 Calendar now = Calendar.getInstance();
		 int hour= Calendar.HOUR_OF_DAY;
		 int min= Calendar.MINUTE;
		 if( time.getEndHour()<=hour|| time.getEndMinute()<min) {
			time.setEndHour(time.getEndHour()+extendHour);
		 }
		
	}
	
	public void editBookingDate(Date startdate,Date finishdate) {
		if(this.startDate.compareTo(startdate)>0 ) {
			this.startDate=startdate;
			this.finishDate=finishdate;
		}

	}
	// Give the deposit back
	public Runnable depositCheck() {
	
	if(space.getSensor().getOccupied()==true) {
			booker.returnDeposit();
		}
	return new Runnable() {
	       public void run() { System.out.println("Booking.depositCheck reached"); }
	     };

	}
	
	public boolean isActive(){
		return this.isActive;
	}
	public boolean isOnTime() {
		return onTime;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public Time getTime() {
		return this.time;
	}

	@Override
	public int getStartHour() {
		return this.time.getStartHour();
	}

	@Override
	public int getStartMinute() {
		return this.time.getStartMinute();
	}

	@Override
	public int getEndHour() {
		return this.time.getEndHour();
	}

	@Override
	public int getEndMinute() {
		return this.time.getEndMinute();
	}

	public double totalTime() {
		//returns the total time of booking in hours
		return getEndHour()-getStartHour()+(getStartMinute()-getEndMinute())/60;
	}

	public double timeSpent() {
		//returns the total time of booking in hours, taking into account if the client was on time

		double timeSpent = getEndHour()-getStartHour()+(getStartMinute()-getEndMinute())/60;
		if(onTime) timeSpent -= 1;
		return timeSpent;
	}
	
	public void cancel() {
		//only set the booking to inactive so that info can be retrieved
		this.booker = null;
		//this.time = null;
		this.space = null;
		this.car = null;
		this.cancelled = true;
	}
	
	public ParkingSpace getSpace() {
		return space;
	}
	
	@Override
	public String toString() {
		return "Lot " + this.space.getLot().getName() + ", Space " + this.space.getLocation();
	}

	public String getPlate() {
		return plate;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void extend(double extension) {
		//TODO
		int whole = (int) extension;
		int fraction = (int) ((extension-(double)whole)*60);
		this.time.setEndHour(whole+getEndHour());
		this.time.setEndMinute(fraction+getEndMinute());
		
		
	}

	public boolean isCancelled() {
		return cancelled;
	}

	public Payable getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setArrival(boolean b) {
		//will indicate whether client arrived on time for the booking
		this.onTime = true;
	}
}
