package interfacelatest;

public class InvalidRuntimeOTPException extends RuntimeException {
    private String code;

    public InvalidRuntimeOTPException(String errorCode,String message){
        super(message);
        this.code=errorCode;
    }

    public String getCode() {
        return code;
    }
}
