package School;

public class Address {

    String studentHouseNo;
    String studentCity;
    String pinCode;


    @Override
    public String toString() {
        return "Address{" +
                "studentHouseNo='" + studentHouseNo + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
