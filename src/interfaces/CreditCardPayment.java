package interfaces;

public class CreditCardPayment implements PaymentGateway {

    private String cardNumber;
    private String expDate;

    private String cvv;
    public double  cardbalance=10000;

    public CreditCardPayment(String cardNumber, String expDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        this.cvv = cvv;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public double processPayment(double amount, String cardNumber, String cvv) {

        if(this.cardNumber.equals(cardNumber) && this.cvv.equals(cvv)){
            cardbalance=cardbalance-amount;
            System.out.println(cardbalance);

           // return cardbalance;


        }


       return cardbalance;
    }

    @Override
    public double refundPayment(double amount, String cardNumber, String cvv) {



        return 0;
    }
}
