package javaBasics;

public class Service {
    double totalInterest;

   double interest(CalculateRateofInterest calculateRateofInterest){

        totalInterest = (calculateRateofInterest.price * calculateRateofInterest.totalTime *calculateRateofInterest.rateOfInterest)/ 100;
 return totalInterest;
   }


}
