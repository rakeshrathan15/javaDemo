package singletondemo;

public class DBConnection {
    private static final DBConnection dbConnection = new DBConnection();
     int count=0;
    private DBConnection(){
        System.out.println("from private constructor");
    }
    public static DBConnection getInstance(){
        return dbConnection;
    }



}
