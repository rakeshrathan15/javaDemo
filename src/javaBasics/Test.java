package javaBasics;

import java.util.concurrent.Callable;

public class Test {

//    public static void main(String[] args) {
//       CalculatePercentage calculatePercentage = new CalculatePercentage();
//        System.out.println(calculatePercentage.a );
//        System.out.println(calculatePercentage.b);
//        System.out.println(calculatePercentage.percentage);
//        System.out.println("Percentage: " + calculatePercentage.percentage + "%");
//        System.out.println("Addition: " +calculatePercentage.addition);
//
//
//    }


    public static void main(String[] args) {
        CalculateRateofInterest s1= new CalculateRateofInterest();
        Service service = new Service();
        s1.rateOfInterest=3;
        s1.price=20000;
        s1.totalTime=2;
       double output= service.interest(s1);
        System.out.println(output);
    }

}
