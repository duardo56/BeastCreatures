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
    
    public setupDB(){
        
        Connection c = null; 
        Statement stmt = null; 
        
        initialize_db(c,stmt);
        
        
    }
    
    public void initialize_db(Connection c , Statement stmt)
    {
    
        try
        {   
           String user = "root";
           String pass = "password";
           String db_url = "jdbc:mysql://localhost/TEST";
            
            Class.forName("com.org.mysql.jdbc.Driver");
 
            System.out.println("connnecting to database");
            c = DriverManager.getConnection(db_url,user,pass);
           
            
            
            //select stuff from database 
            stmt = c.createStatement();
            
            //make a query 
            String sql; //pass in a hardcoded string here
            sql = "SELECT * FROM Employees";
            
            ResultSet rs = stmt.executeQuery(sql);
            
            //get all of the data from the set 
            while(rs.next())
            {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");
                
                //display the values of the table
                System.out.print("id: " + id);
                System.out.print(", Age: " + age);
                System.out.print(" , first: " + first);
                System.out.println(", Last: " + last);
            }
            //clean up
            rs.close();
            stmt.close();
            c.close(); 
            
        }
        catch(Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
            
        }
      
        
        
    }
}
