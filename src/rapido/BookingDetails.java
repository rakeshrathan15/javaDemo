package rapido;

public class BookingDetails extends  CarDetails {
    private int otp;
    private   String auto;
    private   String bike;
    private   int noOfPersons;
    private   CarDetails CarDetails;
    public BookingDetails(String auto, String bike, int noOfPersons,int otp,CarDetails carDeatails) {
        super(carDeatails.getCartype(), carDeatails.getCarPrice());
        this.auto = auto;
        this.bike = bike;
        this.CarDetails = carDeatails;
        this.noOfPersons = noOfPersons;
        this.otp=otp;
    }
    public BookingDetails(String auto, String bike, int noOfPersons,int otp) {
        this(auto,bike,noOfPersons,otp,new CarDetails());
    }


    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public CarDetails getCarDeatails() {
        return CarDetails;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }
    public int getOtp() {
        return otp;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", carDeatails=" + CarDetails +
                ", noOfPersons=" + noOfPersons +
                '}';
    }
}
