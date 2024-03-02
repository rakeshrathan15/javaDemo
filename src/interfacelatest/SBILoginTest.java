package interfacelatest;

public class SBILoginTest {
    public static void main(String[] args) {
        BankLoginService loginService=new SBIBankLoginProcess();

        boolean loginStatus= loginService.login("111","1234");

        if(loginStatus){
            System.out.println("Login sucess");
        }else {
            System.out.println("login Failed");
        }
    }




}
