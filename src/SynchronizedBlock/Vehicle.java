package SynchronizedBlock;



public class Vehicle extends Thread {

    int liters;
    String status;

    String type;
     PetrolStation petrolStation;

    public Vehicle(int liters, String status, String type, PetrolStation petrolStation) {
        this.liters = liters;
        this.status = status;
        this.type = type;
        this.petrolStation = petrolStation;
    }

//    public Vehicle(PetrolStation petrolStation){
//        this.petrolStation=petrolStation;
//
//
//    }

    public void run(){

        if(type.equals("petrol")){
            System.out.println("Vehical number "+Thread.currentThread().getName());


            petrolStation.petrolSynchorizedBlock(Thread.currentThread().getName(),this.liters);

        }else {
            petrolStation.dieselSynchroinzedBlock(Thread.currentThread().getName() ,this.liters);
        }

    }




}
