package retryexceptiondemo;

public class SBIService {
    int i=0;
    public String transfer(){
        i=i+1;


        if (i%2==0){
            throw new InsufficientFundsException(ErrorCodes.INSUFFICIENT_FUNDS_ERROR_CODE.getCode(),ErrorCodes.TIMEOUT_ERROR_CODE.getMessage() );

        }else {
            throw new TimeoutException(ErrorCodes.TIMEOUT_ERROR_CODE.getCode(), ErrorCodes.TIMEOUT_ERROR_CODE.getMessage());
        }
    }
}
