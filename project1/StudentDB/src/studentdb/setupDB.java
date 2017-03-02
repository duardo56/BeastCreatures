/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;
import java.sql.*;

/**
 *
 * @author heavy_linux_guy
 */
public class setupDB {
    
    public static void main (String [] args)
    {
        Connection c = null; 
        
        try
        {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:test.db");
            
            //select stuff from database 
            
            
        }
        catch(Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            
        }
        System.out.println("opened database");
        
        
    }
}
