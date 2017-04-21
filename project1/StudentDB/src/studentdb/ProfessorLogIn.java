/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author jean
 */
public class ProfessorLogIn extends javax.swing.JFrame {
    
    /**
     * Creates new form ProfessorLogIn
     */
    public ProfessorLogIn() {
        initComponents();
       
    }

public static String Profusername()
{
  
    return pls;
}
        //Infobox function
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }
        //Validate Function checking for Faculty_id && Password  
    public boolean validate(String username, String pass)
    {
        String query;
        String dbUsername, dbPassword;
        boolean login = false;
        String a  ;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database", "user", "password");
            Statement stmt = (Statement) con.createStatement();
            query = "SELECT Faculty_id, Password FROM teacher_data;";
            stmt.executeQuery(query);
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                dbUsername = rs.getString("Faculty_id");
                dbPassword = rs.getString("Password");

                if(dbUsername.equals(username) && dbPassword.equals(pass)){
                    //System.out.println("OK");
                    login = true;
                    //prof login verification 
                 //   a = profUsername.getText();
                   
             
                }
              //  System.out.println(username + pass + " " + dbUsername + dbPassword);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return login;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profPassword = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        OKButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backButton3 = new javax.swing.JButton();
        profUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Teacher_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        profPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profPasswordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Password:");

        OKButton1.setText("OK");
        OKButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Quit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        backButton3.setText("Back");
        backButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton3ActionPerformed(evt);
            }
        });

        profUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profUsernameActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("Please Enter Your Username & Password");

        Teacher_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImgResource/s_teacher_icon.png"))); // NOI18N
        Teacher_button.setText("Faculty");
        Teacher_button.setEnabled(false);
        Teacher_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Teacher_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(profPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(profUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(OKButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(backButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Teacher_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Teacher_button, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(profUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(profPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(56, 91, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OKButton1)
                            .addComponent(jButton2)
                            .addComponent(backButton3))
                        .addGap(42, 42, 42))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton3ActionPerformed
dispose();//To close the current window

FirstLogin closeCurrentWindow = new FirstLogin();
 closeCurrentWindow.setVisible(true);//Open the new window      // TODO add your handling code here:
    }//GEN-LAST:event_backButton3ActionPerformed
public static String pls; 

    private void OKButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButton1ActionPerformed
        // TODO add your handling code here:
     
    //saving email inputed to string 
        String getUsername = profUsername.getText();
       // System.out.println(getUsername);
        pls = getUsername;
   //char array stores password
        char[] a = profPassword.getPassword();

  //converts char into string 
         String getPassword = new String(a);
         
         if(validate(getUsername, getPassword))
         {      
         dispose();//To close the current window
      //   Prof_classes closeCurrentWindow = new Prof_classes();
      //   closeCurrentWindow.setVisible(true);//Open the new window 
      System.out.println(getUsername);        
      JFrame frame = new JFrame();
                frame.setContentPane(new Teacher_test(getUsername)); //to initialize the components
               // Teacher_test b = new Teacher_test(getUsername); //pass in the string into the constructor
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
 
         }
         else 
         {
        //If incorrect email or password POPUP BOX
        ProfessorLogIn.infoBox("You Entered a incorrect Email or Password", "ERROR");
         }
        
        
    }//GEN-LAST:event_OKButton1ActionPerformed

    private void profUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profUsernameActionPerformed
        // TODO add your handling code here:
        //get username and save to string
        String getUsername = profUsername.getText();
    }//GEN-LAST:event_profUsernameActionPerformed

    private void profPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profPasswordActionPerformed
        // TODO add your handling code here:
         //get password and save to string
  
       
    }//GEN-LAST:event_profPasswordActionPerformed

    //Copy of teacher buttom/ disabled and rename it Faculty(just the text in buttom); 
   
   
    private void Teacher_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Teacher_buttonActionPerformed
        dispose();//To close the current window

        ProfessorLogIn closeCurrentWindow = new ProfessorLogIn();
        closeCurrentWindow.setVisible(true);//Open the new window        // TODO add your handling code here:
    }//GEN-LAST:event_Teacher_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProfessorLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfessorLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfessorLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfessorLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProfessorLogIn a = new ProfessorLogIn();
                a.setVisible(true);
//                Prof_classes b = new Prof_classes();
//                b.setVisible(false);
             //  System.out.println(pls);
            }
            
            
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton1;
    private javax.swing.JButton Teacher_button;
    private javax.swing.JButton backButton3;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField profPassword;
    private static javax.swing.JTextField profUsername;
    // End of variables declaration//GEN-END:variables
}
