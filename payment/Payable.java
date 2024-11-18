package payment;

//PaymentContext: a class that uses the CardPayment interface to make payments.


public interface Payable {

  public boolean makePayment(double amount);
  public double getRecentPayment();
}
