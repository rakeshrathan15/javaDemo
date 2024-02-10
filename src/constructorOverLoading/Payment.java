package constructorOverLoading;

public class Payment {

    public String price;





    public Payment() {
        this.price = "with cash";
    }

    @Override
    public String toString() {
        return "Payment{" +
                "price='" + price + '\'' +
                '}';

    }







}
