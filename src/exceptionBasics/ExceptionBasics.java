package exceptionBasics;

public class ExceptionBasics {
    public static void main(String[] args) {
        String name=null;
        String company="tcs";
        System.out.println(name);
        System.out.println(company);
        try {
            System.out.println(name.toUpperCase());  // this is will  give nullpoint

        }catch (Exception e){
          //  e.printStackTrace();
            System.out.println("Exception ocuured is "+e.getMessage()+ "please verify");
          //  throw e;
         //   throw new RuntimeException(e);

        }finally {
            System.out.println("From finally block ");
        }
        System.out.println(company.toUpperCase());
    }
}
