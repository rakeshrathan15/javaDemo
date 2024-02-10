package rapido;

import java.util.concurrent.Callable;

public class BokkingTest {

    public BookingDetails rapidoBooking(BookingDetails bookingDetails){
        if(bookingDetails.getNoOfPassengers()<=1){
            bookingDetails.getBike();
            System.out.println("you sucessfully booked Bike" + bookingDetails.getBike());
        }
        if(bookingDetails.getNoOfPassengers()<=3){
            bookingDetails.getAuto();
            System.out.println("you sucessfully booked Auto" + bookingDetails.getAuto() );


        }
        if(bookingDetails.getNoOfPassengers()>3){
            bookingDetails.getCarDetails();
            System.out.println("you sucessfully booked " + bookingDetails.getCarDetails());
        }
        return  bookingDetails;
    }

    public static void main(String[] args) {

        BookingDetails bookingDetails = new BookingDetails("Share Auto", "Bullet", new CarDetails(), 2);
       CarDetails carDetails=new CarDetails("shift","3000");

        System.out.println(carDetails);
        System.out.println(bookingDetails);



    }


}



