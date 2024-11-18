package payment;

public abstract class CardPayment implements Payable{
	private String cardNumber;
	private int expirationDate;
	private int securityCode;
	private double recentPayment;
	public CardPayment(String cardNumber, int expirationDate, int securityCode) {

		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.recentPayment = 0;

	}
	public boolean makePayment(double amount) {
		this.recentPayment = amount;
		return true;
	}

	public double getRecentPayment() {
		return this.recentPayment;
	}
}

