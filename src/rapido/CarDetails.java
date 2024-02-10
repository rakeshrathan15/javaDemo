package rapido;

public class CarDetails {


    public String carType;

    public  String ridePrice;





    public CarDetails(){
        this.carType="BMW";
        this.ridePrice="2000";
    }



    public CarDetails(String carType, String ridePrice) {
        this.carType = carType;
        this.ridePrice = ridePrice;
    }

    public String getCarType() {
        return carType;
    }

    public String getRidePrice() {
        return ridePrice;
    }

    @Override
    public String toString() {
        return "CarDetails{" +
                "carType='" + carType + '\'' +
                ", ridePrice='" + ridePrice + '\'' +
                '}';
    }
}
