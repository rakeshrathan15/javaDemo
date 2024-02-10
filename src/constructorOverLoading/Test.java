package constructorOverLoading;

public class Test {
    public static void main(String[] args) {

        Payment payment= new Payment();
        payment.price="with phonepay";
        Shirt shirt= new Shirt("m","Rare rabbit","white",payment);

        Shirt shirt1= new Shirt("l","LEVIS","Red");

        System.out.println(shirt);
        System.out.println(shirt1);












    }

}
