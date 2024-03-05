package exception;

public class CustomExceptionService {

//    public String checkException3(){
//
//
//
//
//    }










    public String checkException(){
        try {
            throw new Exception("throw checkedException");
        }catch (Exception e){
            throw new RuntimeException(e);
        }

    }
    public String unCheckedException(){
        throw new RuntimeException("throw checkedException");
    }



}
