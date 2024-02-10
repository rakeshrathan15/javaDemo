package BankDemo;

public class CardProcessTest {

    public static void main(String[] args) {
        CardProcessService processService = new CardProcessService();
        CardDetails cardDetails = new CardDetails();
        cardDetails.cardNumber = "1234 1234 1234";
        cardDetails.pinNumber = "1234";
        System.out.println(cardDetails.hashCode());

        boolean loginStatus = processService.login(cardDetails);
        CreditService creditService = new CreditService();
        if(loginStatus){
            int balance = creditService.credit("1234 1234 1234",100);
            System.out.println(balance);

            System.out.println("CreditService hashcode "+creditService.hashCode());
            int balance2 = creditService.credit("1234 1234 1234",100);
            System.out.println("CreditService creditService2 hascode "+creditService.hashCode());
            System.out.println(balance2);
        }
    }



}
