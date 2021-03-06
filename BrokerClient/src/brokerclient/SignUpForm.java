/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brokerclient;

import brokerclient.LoginForm;
import javax.swing.JOptionPane;

/**
 *
 * @author samue
 */
public class SignUpForm extends javax.swing.JFrame {

    /**
     * Creates new form SignUpForm
     */
    public SignUpForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordField2 = new javax.swing.JTextField();
        passwordField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("User name :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jLabel2.setText("Password :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 140, -1, -1));

        jLabel3.setText("Confirm Password: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 196, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sign Up");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 230, -1));
        getContentPane().add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 180, -1));
        getContentPane().add(passwordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 180, -1));
        getContentPane().add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 180, -1));

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String usernames, password, confirmPassword;
        boolean creationStatus = false;

       usernames = userField.getText();
       password = passwordField1.getText();
       confirmPassword = passwordField2.getText();

       creationStatus = controller.passwordValidation(password, confirmPassword);
        
        if(creationStatus){
       creationStatus = controller.signUp(usernames, password);
       
       if(creationStatus == false){
            JOptionPane.showMessageDialog(this,"New useraccount Denied please choose another name");
       }else{
            JOptionPane.showMessageDialog(this,"account creation successful !!");
            NavigateToLoginPage();
       }
       
        }else{
             JOptionPane.showMessageDialog(this, "Error detected in the entry fields\n password has to be 5 or more characters");
        }
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NavigateToLoginPage();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NavigateToLoginPage(){
                // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                dispose();
                new LoginForm().setVisible(true);

            }
        });
    }
    

    
    
    
    private user_Interface controller = new user_Interface();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField passwordField1;
    private javax.swing.JTextField passwordField2;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
