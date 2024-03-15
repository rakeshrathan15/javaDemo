package singletondemo;

public class Test {
    public static void main(String[] args) {
        DBConnection  dbConnection=DBConnection.getInstance();
        System.out.println(DBConnection.getInstance());
        System.out.println(dbConnection.count);
        dbConnection.count=20;
        System.out.println(dbConnection.count);
        DBConnection dbConnection1=DBConnection.getInstance();
        System.out.println(dbConnection1.count);
        dbConnection.count=50;
        System.out.println(dbConnection1.count);


    }
}
