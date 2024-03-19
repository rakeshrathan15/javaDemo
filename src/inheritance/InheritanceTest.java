package inheritance;

public class InheritanceTest {


    public static void main(String[] args) {

        RetailAccount retailAccount = new RetailAccount("51212487",2000,true,5000);
        // up casting

        Account retailAccount1= new RetailAccount("1234566",2000,false,4000);

        System.out.println(retailAccount1.getAccountNumber());


        System.out.println(retailAccount);

    }
}
