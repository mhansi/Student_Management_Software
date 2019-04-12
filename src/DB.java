
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hansi
 */
public class DB {
    static Connection c;
    
   private static void setNewConnection() throws Exception{
         java.lang.Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3307/adyapana", "root", "123");
    }
    public static void iud (String sql)throws Exception { 
        if (c==null){
            setNewConnection();
        }
        c.createStatement().executeUpdate(sql);
        
    }
    public static ResultSet search (String sql) throws Exception{
        if (c==null){
            setNewConnection();
        }
        return c.createStatement().executeQuery(sql);
    }
    public static synchronized Connection getCon() throws Exception{
        if(c ==null){
            setNewConnection();
        }
        return c;
    }}
