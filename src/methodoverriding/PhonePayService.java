package methodoverriding;

public class PhonePayService extends BankAccountService{

    public boolean transfer(String fromMobileNumber,String toMobileNumber,int amt){

        System.out.println("From Sub class PhonePayService ");

       return  super.transfer(fromMobileNumber,toMobileNumber,amt);
    }


    public boolean credit(String fromMobileNUmber){

        return true;
    }






}
