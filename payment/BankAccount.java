
package payment;

import client.Client;

public class BankAccount implements Payable{
	private final Client owner;
	private double balance;
	private double recentPayment;
	
	public BankAccount(Client owner) {
		this.owner = owner;
		this.balance = 100.0;
		this.recentPayment = 0;
	}
	public void deposit(double amount) {
		this.balance += amount;
	}

	public Client getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}


	@Override
	public boolean makePayment(double amount) {
		boolean valid = balance >= amount;
		if (valid) {
			balance = balance - amount;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public double getRecentPayment() {
		return this.recentPayment;
	}
}
