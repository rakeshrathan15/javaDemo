package retryexceptiondemo;

public class BookMyShowProcess {
    public void bookTicket(){
      //  BookMyShowProcess bookMyShowProcess=new BookMyShowProcess();
        try {
            BookMyShowService service=new BookMyShowService();
            service.bookTicket();
        }catch (Exception e){
            System.out.println("Error occured "+e);
        }

    }
}
