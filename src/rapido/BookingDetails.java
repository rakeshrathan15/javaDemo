package rapido;

public class BookingDetails {


    private String  auto;
    private String bike;

    private CarDetails carDetails;

    private  int noOfPassengers;

    public BookingDetails(String auto, String bike, CarDetails carDetails, int noOfPassengers) {
        this.auto = auto;
        this.bike = bike;
        this.carDetails = carDetails;
        this.noOfPassengers = noOfPassengers;
    }

    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    public int getNoOfPassengers() {



        return noOfPassengers;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", carDetails=" + carDetails +
                ", noOfPassengers=" + noOfPassengers +
                '}';
    }
}
