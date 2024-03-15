package retryexceptiondemo;

import java.sql.Statement;

public class ExceptionHandleDemo {

    public static void main(String[] args) {
        BookMyShowProcess process=new BookMyShowProcess();
        process.bookTicket();
    }
}
