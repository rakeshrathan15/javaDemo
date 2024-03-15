package retryexceptiondemo;

public enum ErrorCodes {

    TIMEOUT_ERROR_CODE("1000","Time out Exception"),
    INSUFFICIENT_FUNDS_ERROR_CODE("1001","Insufficent fund Exception");

    private String code;
    private String message;

    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
