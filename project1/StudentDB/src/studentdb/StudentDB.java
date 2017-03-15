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
public class StudentDB {

    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        //create the object for the main menu here 
        MainMenu menu = new MainMenu(); // object for main menu
        menu.setVisible(true); //this is for the gui to display on the screen
       
      setupDB db = new setupDB(); //initalize the database 
       
       
    }
    
}
