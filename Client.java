
package client;

import java.util.ArrayList;

import booking.Booking;
import booking.Time;
import client.types.Student;
import database.Verifier;
import parking.Car;
import parking.ParkingLot;
import parking.ParkingSpace;
import payment.BankAccount;
import payment.Payable;

public abstract class Client implements ClientState {

	protected SiteUser context;
	protected ArrayList<Booking> bookings;
	protected double RATE;
	protected String password; 
	protected String emailAddress; 
	protected String lastname;
	protected String firstname;
	protected boolean isApproved;
	protected BankAccount account;
	protected ArrayList<Car> cars;
	
	/*
	 * TODO must update this for every new subclass of Client
	 */
	public static final Class[] subclasses = {Student.class};
	
	public Client(SiteUser context) {
		//default, mainly for the SiteUser.changeState()
		this(context, "email", "password", "lastname", "firstname");
		this.context = context;
	}
	
	public BankAccount getAccount() {
		return this.account;
	}
	
	// If the plateNumber is valid, it adds the car into Client's cars.
	public void addCar(String model,String color,String plateNumber) {
		 		  
		 if( Verifier.verifyPlate(plateNumber)) {
		
		cars.add(new Car(model,color,plateNumber));
		 }
		 else {
			 System.out.println("Invalid plateNumber. Please try again");
		 }
	}
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public Client(SiteUser context, String email, String password, String lastname, String firstname) {
		this.context = context;
		this.bookings = new ArrayList<Booking>();
		this.password = password;
		this.emailAddress = email;
		this.lastname = lastname;
		this.firstname = firstname;
		this.isApproved = false;
		this.account = new BankAccount(this);
		this.cars=new ArrayList<Car>();
	}
	
	@Override
	public boolean login(String email, String password) {
		// a client type is only accessible after logging in as SiteVisitor so return caller
		System.out.println("Already logged in");
		return false;
	}
	@Override
	public void logout() {
		context.setState(new SiteVisitor(context));
	}

	@Override
	public String register(String email, String password, String firstname, String lastname, String type) {
		// a client type is only accessible after registration as SiteVisitor so do nothing
		return SiteUser.ALREADY_REGISTERED; 
	}

	@Override
	public void changeBookingTime(Booking booking, Time time) {
		//TODO extend time
		if(!booking.isActive() && !booking.isCancelled()) {
			System.out.println(booking.getStartHour());
			booking.setTime(time);
			System.out.println(booking.getStartHour());
			System.out.println("Time Change Successful");
		}else {
			System.out.println("Booking already active. Time cannot be modified");
		}
	}
	public String deposit(Payable paymentMethod) {
		//special case of pay - pay for only an hour
		return this.pay(1, paymentMethod);
	}
	public String pay(Booking booking) {
		//special case of pay: pay for a whole booking
		//rounding up with an int cast

		return pay(booking, booking.getPaymentMethod());
	}
	@Override
	public String pay(Booking booking, Payable paymentMethod) {
		// all public payment methods must refer to this one in order to process payment accurately
		// special case of pay: pay for a whole booking
		//rounding up with an int cast

		/*
		- make client leave spot
		- reset bookings, space avail, etc
		 */
		booking.getSpace().setOccupied(false);
		booking.getSpace().getSensor().leaveCar();
		booking.setActive(false);

		return pay((int) booking.timeSpent(), paymentMethod);
	}

	private String pay(int time, Payable method) {

		if(!(method==null) && method.makePayment(RATE*time)) {
			return "Payment Successful";
		}
		return "Unsuccessful Payment";
	}

	@Override
	public ParkingSpace book(ParkingLot lot, String plate, Payable paymentMethod) {
		// returns a randomly selected available space from the input parking lot
		 
		Car car = new Car(plate);
		boolean exp=Verifier.verifyPlate(plate);
		if(exp==true && this.isApproved) {
			ParkingSpace space = lot.getAvailableSpace(this, plate );
			cars.add(car);
				if(space != null) {
					System.out.println("Found available space: " + space.getLocation());
						if (this.pay(1, paymentMethod).equals("Payment Successful")) {
								// payment is successful, meaning client has booked space
								// make space unavailable and enabled is false
								space.disable();
								return space;
						}
				}
		}
			
			else if(!exp) {
				System.out.println("Enter a valid plate number");
				
			}
			else {
				System.out.println("No available space in the lot");
							}
		return null;
	}

	@Override
	public String find(ParkingSpace space) {
		return space.getLocation();
	}

	@Override
	public boolean cancelBooking(Booking booking) {
		if(!booking.isActive()) {
			booking.cancel();
			booking = null;
			this.bookings.remove(booking);
			return true;
		}
		return false;
	}
	public double getRate() {
		return this.RATE;
	}
	public void setRATE(double rATE) {
		this.RATE = rATE;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public ArrayList<Booking> getBookings() {
		return bookings;
	}
	public String getLastname() {
		return lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public String getFullName() {
		return firstname + " " + lastname;
	}
	public void returnDeposit() {
		this.account.deposit(RATE);
	}
	
	@Override
	public String toString() {
		return this.getClass().getCanonicalName();
	}


}