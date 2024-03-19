package threaddemopetrolsation;

public class SynchronizedDemoTest {
    public static void main(String[] args) {
        PetrolStation petrolStation=new PetrolStation();




        Thread bike=new Vehicle(3,"Empty","petrol",petrolStation);
              bike.setName("Ap24AV1899");


    }
}
