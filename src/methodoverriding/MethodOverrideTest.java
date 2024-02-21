package methodoverriding;

public class MethodOverrideTest {

    public static void main(String[] args) {


        PhonePayService phonePayService= new PhonePayService();

        phonePayService.transfer("12345","45678",100);


      //  phonePayService.transfer("12345","45678",100);
      //  phonePayService.transfer("12345","45678",100);

        System.out.println("TO Account Amount ="+ phonePayService.toAccountAmt);

        BankAccountService bankAccountService= new BankAccountService();
        System.out.println(  bankAccountService.transfer("12345","45678",100));

        System.out.println(bankAccountService.fromAccountAmt);
        System.out.println(bankAccountService.fromAccount);




    }



}
