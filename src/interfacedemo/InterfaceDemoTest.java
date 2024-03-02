package interfacedemo;

public class InterfaceDemoTest {

    public static void main(String[] args) {
        RBIBankService hdfcBankService= new HDFCBankService();
        RBIBankService sbiBankService= new SBIBankService();


       String hdfcStatus= hdfcBankService.transfer("123","456",100);
       String sbiStatus= sbiBankService.transfer("222","333",100);


        System.out.println(hdfcStatus);
        System.out.println(sbiStatus);
    }




}
