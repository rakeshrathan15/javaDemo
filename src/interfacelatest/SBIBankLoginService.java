package interfacelatest;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class SBIBankLoginService implements BankOTPValidationService{

    String accountNumber="111";
    String password="1234";
    String otp;

    Date otpExprieTime;



    public SBIBankLoginService(){


    }
    @Override
    public boolean login(String username, String password) {

        if(username.equals(accountNumber) && this.password.equals(password)){
            return true;
        }


        return false;
    }

    @Override
    public String generateOTP(String accountNumber) {

        if(this.accountNumber.equals(accountNumber)){
             otp=UUID.randomUUID().toString();
            System.out.println(otp);
            Calendar otpExpiryCalendar=Calendar.getInstance();
            otpExpiryCalendar.add(Calendar.SECOND,60);
            System.out.println("OtpExpiryCalendar "+otpExpiryCalendar.getTime());



            otpExprieTime=otpExpiryCalendar.getTime();
            return otp;

        }
        return null;
    }

    @Override
    public boolean validateOTP(String otp) throws InvalidOTPException {

        if(this.otp.equals(otp)){

            return  true;

        }else {

            System.out.println("Invalid OTP ");
            throw new InvalidOTPException(ErrorCodes.NEOTERIC_INVALID_OTP_1000.getCode(),
                    ErrorCodes.NEOTERIC_INVALID_OTP_1000.getMessage());
        }

    }
}
