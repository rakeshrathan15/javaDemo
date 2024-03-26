package threaddemopetrolsation;

public class PetrolStation {



    public synchronized void petrol(String vehicalNumber,int numberOfLiters){
        for(int i=0;i<=numberOfLiters;i++){
            System.out.println("vehical number== "+vehicalNumber+  "filled petrol in liters == "+i);
        }


    }

    public synchronized void diesel(String vehicalNumber,int numberOfLiters){
        for(int i=0;i<=numberOfLiters;i++){
            System.out.println("vehical number == "+vehicalNumber+ "filled diesel in liters == "+i);
        }

    }

//    public  void petrol(String vehicalNumber,int numberOfLiters){
//        for(int i=0;i<=numberOfLiters;i++){
//            System.out.println("vehical number== "+vehicalNumber+  "filled petrol in liters == "+i);
//        }
//
//
//    }


}
