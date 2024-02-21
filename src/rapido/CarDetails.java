package rapido;

public class CarDetails {

    private   String cartype;
    private   String raidPrice;

    public CarDetails(){
        cartype = "shift";
        raidPrice = "2000";
    }

    public CarDetails(String cartype, String raidPrice) {
        this.cartype = cartype;
        this.raidPrice = raidPrice;
    }


    public String getCarPrice()
    {
        return raidPrice;
    }

    public String getCartype() {
        return cartype;
    }

    @Override
    public String toString() {
        return "CarDeatails{" +
                "cartype='" + cartype + '\'' +
                ", raidPrice='" + raidPrice + '\'' +
            '}';
     }









}
