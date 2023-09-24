package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class ConnectionUtils {
    private static String DB_URL = "jdbc:sqlserver://localhost:1433;"
            + "databaseName=Candidate_Management;encrypt=true;"
            + "trustServerCertificate=true";
    private static String USER_NAME = "sa";
    private static String PASSWORD = "12";
 
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(DB_URL,USER_NAME ,PASSWORD );
            System.out.println("connect successfully!");
        } catch (Exception ex) {
            System.out.println("connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}