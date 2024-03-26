package SynchronizedBlock;

public class PetrolStation {

    Object petrol=new Object();
    Object diesel=new Object();


    public  void petrolSynchorizedBlock(String vehicalNumber,int numberOfLiters) {

        System.out.println("From PetrolSynchroinzed Block vehical NUmber == " );
        synchronized (petrol) {
            for (int i = 0; i <= numberOfLiters; i++) {
                System.out.println("vehical number ==  " + vehicalNumber + " filled petrol in liters == " + i);
            }


        }
    }

    public  void dieselSynchroinzedBlock(String vehicalNumber,int numberOfLiters) {
        System.out.println("From DiselSynchroinzedBlock vehical NUmber == " );
        synchronized (diesel) {
            for (int i = 0; i <= numberOfLiters; i++) {
                System.out.println("vehical number ==  " + vehicalNumber + " filled diesel in liters == " + i);
            }

        }
    }
















}

