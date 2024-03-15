package exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WhileLoopTest {

//    public static void main(String[] args) {
//        try {
//            FileInputStream fileInputStream=new FileInputStream("C:\\New folder");
//        } catch (FileNotFoundException e) {
//          //  throw new RuntimeException(e);
//        }
//
//
//        System.out.println("hello");
//    }
public static void main(String[] args) {

    boolean fileFound = false;
    while (!fileFound) {
        try {
            new FileInputStream("D:\\WhileTest\\sasi");
            processFile();
            fileFound = true;
        } catch (FileNotFoundException e) {
            System.out.println("File not found, retrying in 5 minute...");
            System.out.println(e.getMessage());
            try {
                Thread.sleep(5 * 60 * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
    private static void processFile() throws FileNotFoundException {
        File file = new File("D:\\WhileTest\\sasi");
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        System.out.println("File found! Processing...");
    }

}
