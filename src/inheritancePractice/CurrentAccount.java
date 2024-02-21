package inheritancePractice;

public class CurrentAccount extends BankAccount {


    public int minimumBalance;

    public  int withdrawLimit;

    public CurrentAccount(String accountNumber, int totalbalance, String IFSCCODE, int minimumBalance, int withdrawLimit) {
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
    public  String  getmoney(BankAccount bankAccount ){
        return "bankAccount";
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "minimumBalance=" + minimumBalance +
                ", withdrawLimit=" + withdrawLimit +
                '}';
    }
}
