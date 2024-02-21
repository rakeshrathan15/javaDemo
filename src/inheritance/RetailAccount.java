package inheritance;

public class RetailAccount extends Account{

    private int minimumBalance=1000;

    private int limit;
    public String name(){
        return  "rakesh";

    }




    public RetailAccount(String accountNumber, int balance, boolean status,int limit){

    super(accountNumber, balance,status);

    this.limit=limit;
    }

    @Override
    public String toString() {
        return "RetailAccount{" +"accountNumber="+ getAccountNumber() + ","+
                "minimumBalance=" + minimumBalance +
                ", limit=" + limit +
                '}';
    }

    public  int getMinimumBalance(){

        return minimumBalance;
    }

    public int getLimit(){

        return limit;
    }



}
