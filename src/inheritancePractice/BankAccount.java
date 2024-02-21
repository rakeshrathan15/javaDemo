package inheritancePractice;

public class BankAccount {



    public  String variable="bank Acount";


    public void display(){
        System.out.println("from bank account");
    }


     private String accountNumber;

     private  int totalbalance;
    private String IFSCCODE;


    public BankAccount(String accountNumber, int totalbalance, String IFSCCODE) {
        this.accountNumber = accountNumber;
        this.totalbalance = totalbalance;
        this.IFSCCODE = IFSCCODE;
    }

public  int getTotalbalance(){
    System.out.println("total balance = "+totalbalance);
        return totalbalance;
}

public BankAccount(){

}
}
