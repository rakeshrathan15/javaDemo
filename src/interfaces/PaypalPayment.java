package interfaces;

public class PaypalPayment {


    public static void main(String[] args) {
        CreditCardPayment creditCardPayment=new CreditCardPayment("123","2/2/24","444");

        creditCardPayment.processPayment(200,"123","444");


    }
}
