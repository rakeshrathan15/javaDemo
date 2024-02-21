package inheritance;

public class Account {

    private  String accountNumber;
    private int balance;

    private boolean status;
    int num = 100;


    public Account(String accountNumber, int balance, boolean status) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.status = status;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public boolean isStatus() {
        return status;
    }


}
