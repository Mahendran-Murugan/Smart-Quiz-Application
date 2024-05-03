/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Component.Auth;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class Register extends javax.swing.JPanel {
        
    final private String username = "root";
     final private String password = "";
     final private String database_name = "quiz";
     final private String table_name = "user";
       Connection con;
       PreparedStatement pst , profile;
    /**
     * Creates new form Register
     */
    public Register() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        questvar = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        mobilevar = new javax.swing.JTextField();
        namevar = new javax.swing.JTextField();
        emailvar = new javax.swing.JTextField();
        rollvar = new javax.swing.JTextField();
        ansvar = new javax.swing.JTextField();
        gender1 = new javax.swing.JRadioButton();
        gender2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        deptvar = new javax.swing.JComboBox<>();
        passvar = new javax.swing.JPasswordField();
        confirmvar = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 800));
        setLayout(new java.awt.GridBagLayout());

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel2.setText("Name ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 319, 0, 0);
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel3.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel4.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 319, 0, 0);
        add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel5.setText("Confirm Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel6.setText("Mobile");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 65;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel7.setText("Gender");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 61;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel7, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel8.setText("Roll Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 25;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 319, 0, 0);
        add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel9.setText("Survey Question");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel10.setText("Answer");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 57;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel10, gridBagConstraints);

        questvar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is Your Favorite Food ?", "What is Your Surname ?", "What is Your PetName ?", " " }));
        questvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 86, 0, 320);
        add(questvar, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SUBMIT");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 5, 105, 0);
        add(jButton1, gridBagConstraints);

        mobilevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilevarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 86, 0, 320);
        add(mobilevar, gridBagConstraints);

        namevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namevarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 86, 0, 320);
        add(namevar, gridBagConstraints);

        emailvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 86, 0, 320);
        add(emailvar, gridBagConstraints);

        rollvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 86, 0, 320);
        add(rollvar, gridBagConstraints);

        ansvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansvarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 86, 0, 320);
        add(ansvar, gridBagConstraints);

        gender1.setText("Male");
        gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 86, 0, 0);
        add(gender1, gridBagConstraints);

        gender2.setText("Female");
        gender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 12, 0, 0);
        add(gender2, gridBagConstraints);

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Register Form");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 253;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(169, 319, 0, 320);
        add(jLabel11, gridBagConstraints);

        jLabel12.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 12)); // NOI18N
        jLabel12.setText("Department");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 319, 0, 0);
        add(jLabel12, gridBagConstraints);

        deptvar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "EEE", "BioMed", "Mech" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 109;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 86, 0, 320);
        add(deptvar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 86, 0, 320);
        add(passvar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 120;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 86, 0, 320);
        add(confirmvar, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void questvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questvarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void mobilevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilevarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilevarActionPerformed

    private void namevarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namevarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namevarActionPerformed

    private void emailvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailvarActionPerformed

    private void rollvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rollvarActionPerformed

    private void ansvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansvarActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String mobile = mobilevar.getText() ,  name = namevar.getText() , roll = rollvar.getText() , curr_pass = confirmvar.getText(), email = emailvar.getText() , pass = passvar.getText() , dept = deptvar.getSelectedItem().toString() , quest = questvar.getSelectedItem().toString() , answer = ansvar.getText();
        if(name.isEmpty() || roll.isBlank() || email.isBlank() || pass.isEmpty() || answer.isBlank())
        {
            JOptionPane.showMessageDialog(this, "Please! Check the form whether it is filled" , "Fill the Form Properly" , 2);
           return;
        }
        if(!curr_pass.equals(pass) || pass.isEmpty() || curr_pass.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Your Password is Mismatch" , "Check Password" , 2);
            passvar.requestFocus();
            return;
        }
        int i = 0;
        while(i < mobile.length())
        {
            if(!(mobile.charAt(i) >= '0' && mobile.charAt(i) <='9')){
                JOptionPane.showMessageDialog(this, "Please Enter Valid Mobile Number" , "Enter Valid Mobile Number" , 2); return;
            }
            i++;
        }
        try{
            
            String gender = (gender1.isSelected()) ? "male" : "female";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/"+database_name , username , password);
            pst = con.prepareStatement("insert into "+table_name+"(name ,email , password , dept , gender, question , answer , Mobile) values(? , ? , ? , ? , ? , ? , ? , ? )");
            profile = con.prepareStatement("insert into profile(name , email , branch ) values( ? , ? , ?  )");
            profile.setString(1 , name.trim());
            profile.setString(2 , email.trim());
            profile.setString(3 , dept.trim());
            pst.setString(1 , name.trim());
            pst.setString(2 , email.trim());
            pst.setString(3 , pass.trim());
            pst.setString(4 , dept.trim());
            pst.setString(5 , gender.trim());
            pst.setString(6 , quest);
            pst.setString(7 , answer.trim());
            pst.setString(8, mobile.trim());
            pst.executeUpdate();
            profile.executeUpdate();
            JOptionPane.showMessageDialog(this , "You have Registered Successfully..! " + name);
            
            namevar.setText(""); deptvar.setSelectedIndex(0);
            passvar.setText(""); gender1.setSelected(false); gender2.setSelected(false);
            emailvar.setText(""); ansvar.setText(""); questvar.setSelectedIndex(0);
            rollvar.setText(""); mobilevar.setText(""); confirmvar.setText("");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this , ex.getMessage() , "Exception" , 2 );
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender1ActionPerformed
        gender2.setSelected(false);
        gender1.setSelected(true);
    }//GEN-LAST:event_gender1ActionPerformed

    private void gender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender2ActionPerformed
        gender1.setSelected(false);
       gender2.setSelected(true);
    }//GEN-LAST:event_gender2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ansvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPasswordField confirmvar;
    private javax.swing.JComboBox<String> deptvar;
    private javax.swing.JTextField emailvar;
    private javax.swing.JRadioButton gender1;
    private javax.swing.JRadioButton gender2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mobilevar;
    private javax.swing.JTextField namevar;
    private javax.swing.JPasswordField passvar;
    private javax.swing.JComboBox<String> questvar;
    private javax.swing.JTextField rollvar;
    // End of variables declaration//GEN-END:variables
}
