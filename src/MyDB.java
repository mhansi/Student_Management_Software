/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hansi
 */
public class MyDB {
    private static Connection c;
    public static Connection getDBCon() throws ClassNotFoundException , SQLException {
         java.lang.Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3307/adyapana" , "root" ,"123");
        return c;
        
    
    }   
}
