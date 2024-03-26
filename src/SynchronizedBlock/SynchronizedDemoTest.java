package SynchronizedBlock;

public class SynchronizedDemoTest {

    public static void main(String[] args) {


        PetrolStation petrolStation=new PetrolStation();


        Thread ts29ax2011 = new Vehicle(10,"EMPTY","petrol",petrolStation);
        ts29ax2011.setName("ts29ax20");
        Thread ap24ax2022 = new Vehicle(5,"EMPTY","petrol",petrolStation);
        ap24ax2022.setName("ap24ax2022");

        Thread ts291549 = new Vehicle(10,"EMPTY","diesel",petrolStation);
        ts291549.setName("ts291549");
        Thread ts057918 = new Vehicle(20,"EMPTY","diesel",petrolStation);
        ts057918.setName("ts207918");

        ts29ax2011.start();
      //  ap24ax2022.start();
        ts291549.start();
      //  ts057918.start();





    }

}
