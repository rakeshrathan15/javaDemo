package retryexceptiondemo;

public class BookMyShowService {
    public void bookTicket(){
        SBIService sbiService= new SBIService();
        for (int i=1;i<=3;i++){
            try {

                sbiService.transfer();
            }catch (TimeoutException timeoutException){
                System.out.println("error occured "+timeoutException);
            }

        }

    }
}
