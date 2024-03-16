package singletondemo;

public class Static {



        public static void display() {    // method overLoad code
            System.out.println("Display with zero parameter");
        }
        public static void display ( int i){
            System.out.println("Display with int  parameter" + i);
        }
        public static void display (String str){
            System.out.println("Display method with string parameter");
        }
    public static void display (int i,String str){
        System.out.println("Display method with string parameter");
    }

    public static void main(String[] args) {
        // Calling all the versions of the overloaded static method
        display();
        display(5);
        display("Hello, Java!");
        display(10, "Static Overloading");
    }

}
