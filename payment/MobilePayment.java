package payment;

public class MobilePayment implements Payable {

    private double recentPayment;
    private String email;

private String password;

public MobilePayment(String email, String password) {

this.email = email;

this.password = password;
this.recentPayment = 0;

}

@Override

public boolean makePayment(double amount) {
this.recentPayment = amount;
// Logic for making a PayPal payment
return true;
}

    @Override
    public double getRecentPayment() {
        return this.recentPayment;
    }

}