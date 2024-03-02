package interfacelatest;

public class SBIBankLoginProcess implements BankLoginService{

    BankOTPValidationService sbiBankLoginService;
   public SBIBankLoginProcess(){

       this.sbiBankLoginService=new SBIBankLoginService();


    }
    public SBIBankLoginProcess( SBIBankLoginService sbiBankLoginService){

        this.sbiBankLoginService= sbiBankLoginService;


    }

    @Override
    public boolean login(String username, String password) {

       if(sbiBankLoginService.login(username,password)){
           String otp=sbiBankLoginService.generateOTP(username);
           boolean validOtp= sbiBankLoginService.validateOTP(otp);
           if(validOtp){
               System.out.println("valid otp and login is successful");

           }else {
               System.out.println("Invalid otp & login failed");

           }
           return validOtp;
       }
       else {
           System.out.println("Invalid credentials");
           return false;
       }

    }
}
