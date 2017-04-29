/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdb;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Boss
 */
public class Tests_Data extends JPanel {
    
    //global variable
    public String Thequery; //global variable
    
    //constructor to pass into the class
    public Tests_Data(String Course) {
        inputQuery(Course); //pass in the course name
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @param where
     */
    
    public void inputQuery(String where) //pass in course name 
    {
       where = "'" + where + "'"; //add quotation marks on where clause
       String queryString = "SELECT * FROM tests_data WHERE course_id = " + where + ";" ;
       Thequery = queryString; //assign
       initComponents(Thequery);
    }
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents(String TheQuery) {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("student_database?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createNativeQuery(this.Thequery, studentdb.TestsData.class);
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        test1Label = new javax.swing.JLabel();
        test2Label = new javax.swing.JLabel();
        test3Label = new javax.swing.JLabel();
        averageLabel = new javax.swing.JLabel();
        test1Field = new javax.swing.JTextField();
        test2Field = new javax.swing.JTextField();
        test3Field = new javax.swing.JTextField();
        averageField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studentId}"));
        columnBinding.setColumnName("Student Id");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${test1}"));
        columnBinding.setColumnName("Test1");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${test2}"));
        columnBinding.setColumnName("Test2");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${test3}"));
        columnBinding.setColumnName("Test3");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${average}"));
        columnBinding.setColumnName("Average");
        columnBinding.setColumnClass(Double.class);
        bindingGroup.addBinding(jTableBinding);

        masterScrollPane.setViewportView(masterTable);

        test1Label.setText("Test1:");

        test2Label.setText("Test2:");

        test3Label.setText("Test3:");

        averageLabel.setText("Average:");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.test1}"), test1Field, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), test1Field, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.test2}"), test2Field, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), test2Field, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.test3}"), test3Field, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), test3Field, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        averageField.setEditable(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.average}"), averageField, org.jdesktop.beansbinding.BeanProperty.create("text"));
        binding.setSourceUnreadableValue("null");
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), averageField, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        saveButton.setText("Save grade");
        saveButton.addActionListener(formListener);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(formListener);

        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(formListener);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(refreshButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LogoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(test1Label)
                                    .addComponent(test2Label)
                                    .addComponent(test3Label)
                                    .addComponent(averageLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(test1Field, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                    .addComponent(test2Field, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                    .addComponent(test3Field, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                                    .addComponent(averageField, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)))
                            .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {refreshButton, saveButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test1Label)
                    .addComponent(test1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test2Label)
                    .addComponent(test2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(test3Label)
                    .addComponent(test3Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averageLabel)
                    .addComponent(averageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(refreshButton)
                    .addComponent(LogoutButton))
                .addContainerGap())
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == saveButton) {
                Tests_Data.this.saveButtonActionPerformed(evt);
            }
            else if (evt.getSource() == refreshButton) {
                Tests_Data.this.refreshButtonActionPerformed(evt);
            }
            else if (evt.getSource() == LogoutButton) {
                Tests_Data.this.LogoutButtonActionPerformed(evt);
            }
        }
    }// </editor-fold>                        

    
    @SuppressWarnings("unchecked")
    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        entityManager.getTransaction().rollback();
        entityManager.getTransaction().begin();
        java.util.Collection data = query.getResultList();
        for (Object entity : data) {
            entityManager.refresh(entity);
        }
        list.clear();
        list.addAll(data);
    }                                             
    
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
        } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<studentdb.TestsData> merged = new ArrayList<studentdb.TestsData>(list.size());
            for (studentdb.TestsData t : list) {
                merged.add(entityManager.merge(t));
            }
            list.clear();
            list.addAll(merged);
        }
        ///average goes here 
        
    }                                          

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
       System.exit(0); //exit entire program
    }                                            


    // Variables declaration - do not modify                     
    private javax.swing.JButton LogoutButton;
    private javax.swing.JTextField averageField;
    private javax.swing.JLabel averageLabel;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<studentdb.TestsData> list;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField test1Field;
    private javax.swing.JLabel test1Label;
    private javax.swing.JTextField test2Field;
    private javax.swing.JLabel test2Label;
    private javax.swing.JTextField test3Field;
    private javax.swing.JLabel test3Label;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration                   
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Tests_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tests_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tests_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tests_Data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      String bs = "pass this in";  
        
        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                JFrame frame = new JFrame();
                frame.setContentPane(new Tests_Data(bs));
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
}
