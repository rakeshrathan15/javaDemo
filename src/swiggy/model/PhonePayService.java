package swiggy.model;

import swiggy.SwiggyPaymentService;

import java.util.UUID;

public class PhonePayService implements SwiggyPaymentService {



    public PaymentResponse payment(PaymentRequest request){

          SBIBankService sbiBankService=new SBIBankService();
          return sbiBankService.transfer(request);
    }





}
