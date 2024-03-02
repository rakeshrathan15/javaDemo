package interfaces;

public interface PaymentGateway {


  double processPayment(double amount,String cardNumber,String cvv);

  double  refundPayment(double amount,String cardNumber,String cvv);



}
