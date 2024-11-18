package payment;

public class CreditCard extends CardPayment {

private String cardNumber;

private int expirationDate;

private int securityCode;

public CreditCard(String cardNumber, int expirationDate, int securityCode) {
    super(cardNumber, expirationDate, securityCode);
}

}

