package interfacelatest;

public enum ErrorCodes {
    NEOTERIC_INVALID_OTP_1000("NEO_ERR_100","Invalid OTP"),
    NEOTERIC_EXPIRY_OTP_1001("neotech_ex_1001","expired otp"),

    BANK_OPERATION_OTP_VALIDATION("hello","hiii"),
    JUst_TEST("","");
    String code;
    String message;

    ErrorCodes(String errorCode, String message){
        this.code=errorCode;
        this.message=message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

  enum Days{};