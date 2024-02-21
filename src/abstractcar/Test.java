package abstractcar;

public class Test {

    public static void main(String[] args) {

        Car car = new Shift();
        car.music();
        System.out.println(car.drive());
        System.out.println(car.wheels());
        car.break1();


       // Car car1 = new Shift();

    }
}