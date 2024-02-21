package inheritancePractice;

public class SavingAccount extends  BankAccount{



    public  String variable="Saving Bank  Acount";

    public void display(){
        System.out.println("from Saving account");
    }

    private int minimumBalance;
    private int withdrawLimit;



    public SavingAccount(String accountNumber, int totalbalance, String IFSCCODE, int minimumBalance, int withdrawLimit) {
        super(accountNumber, totalbalance, IFSCCODE);
        this.minimumBalance = minimumBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public int getWithdrawLimit() {
        return withdrawLimit;
    }
    public int minimumbalance(){

        System.out.println("minimum balance is = "+minimumBalance);
        super.getTotalbalance();

        return minimumBalance;
    }

//    public int getwithdrawlimit(){
//        System.out.println("withdrawlimit = "+ withdrawLimit);
//        return withdrawLimit;
//
//    }




    @Override
    public String toString() {
        return "SavingAccount{" +
                "minimumBalance=" + minimumBalance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
