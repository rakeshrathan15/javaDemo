package singletondemo;

public class StaticBasics {


   int employeeID;
     String employeeName;
      public static String ceo="rahul";

      public void show(){
          System.out.println(employeeID +" : "+employeeName +" : "+ceo);
      }

    public static void main(String[] args) {
        StaticBasics rahul=new StaticBasics();
        rahul.employeeName="rahul";
        rahul.employeeID=122;
        StaticBasics.ceo="rakesh";




        StaticBasics varun=new StaticBasics();
        varun.employeeID=333;
        varun.employeeName="varun";
        StaticBasics.ceo="mahesh4444444";

        rahul.show();
        varun.show();








    }





}
