package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;

public class WhileLoop {
    public static void main(String[] args) {
        LocalDateTime currentTime= LocalDateTime.now();
        LocalDateTime expireTime = LocalDateTime.of(2024,3,6,15,19);
        while (currentTime.isBefore(expireTime)){

                try {
                    FileInputStream fileInputStream=new FileInputStream("C:\\My projects");
                    currentTime=LocalDateTime.now();
                    System.out.println("file found");
                    break;
                } catch (FileNotFoundException e) {
                    System.out.println(e.getMessage());
                    break;
                }


        }
    }

}
