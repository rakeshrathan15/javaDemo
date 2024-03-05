package interfacelatest;

public class InvalidOTPException extends Exception{

    //Custom checked exception

    private String code;

  //  private String message;

    public InvalidOTPException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }


    public String getCode() {
        return code;
    }
}
