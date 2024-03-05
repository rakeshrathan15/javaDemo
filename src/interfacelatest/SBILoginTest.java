package interfacelatest;

import javax.jws.soap.SOAPBinding;

public class SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService=new SBIBankLoginProcess();

        try {
            boolean loginStatus= loginService.login("111","1234");

            if(loginStatus){
                System.out.println("Login sucess");
            }else {
                System.out.println("login Failed");
            }

        }catch (InvalidRuntimeOTPException e){
            System.out.println(e.getCode()+"  "+e.getMessage());

        }


    }




}
