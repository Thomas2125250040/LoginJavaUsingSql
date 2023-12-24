package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    
    public static Connection getMyConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginkuy", "root", "");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        return con;
    }
}
