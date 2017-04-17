/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

/**
 *
 * @author heavy_linux_guy
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        //create the object for the main menu here 
//        LogInField menu = new LogInField(); // object for main menu
//        menu.setVisible(true); //this is for the gui to display on the screen
       
      setupDB db = new setupDB(); //initalize the database 

       FirstLogin log = new FirstLogin();
       log.setVisible(true);
        
       

       
       
    }
    
}
