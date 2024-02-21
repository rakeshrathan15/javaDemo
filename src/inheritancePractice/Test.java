package inheritancePractice;

public class Test {



    public static void main(String[] args) {
      //  BankAccount bankAccount=new BankAccount();

        BankAccount savingAccount=new SavingAccount("50135023",20000,"HDFC50821",5000,200);

        System.out.println(savingAccount.variable);

        savingAccount.display();

        SavingAccount savingAccount1=new SavingAccount("50123456",3000,"hdfc23",2000,500);

        //  int result=savingAccount.getTotalbalance();






      //  System.out.println(result);

       // System.out.println(savingAccount1);


    }





}
