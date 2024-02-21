package constructorOverLoading;

public class Shirt {


    public String size;
    public String brand;
    public String color;
    public Payment payment;

    public Shirt(String size, String brand, String color, Payment payment) {
        this.size = size;
        this.brand = brand;
        this.color = color;
        this.payment = payment;
    }





    public Shirt(String size, String brand, String color) {
        this(size, brand,color,new Payment() );
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", payment=" + payment +
                '}';
    }
}
