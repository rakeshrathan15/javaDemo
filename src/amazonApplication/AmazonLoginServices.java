package amazonApplication;

public class AmazonLoginServices {


     boolean loginDetails(AmazonLogin amazonLogin){
         String localemail="rakesh@gmail.com";
         String localpassword ="1234";

         if (localemail.equals(amazonLogin.email) && localpassword.equals(amazonLogin.password)){
             return true;
         }else {
             return false;
         }



     }


}
