/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teachers.salary.calculator;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Microsoft
 */
public class searchSlip extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    public searchSlip() {
        super("Search Slip");
        initComponents();
    }
    
    public void clearFields(){
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField6.setText("");
        textField7.setText("");
        textField8.setText("");
        textField9.setText("");
        textField10.setText("");         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        textField3 = new java.awt.TextField();
        textField4 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textField5 = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        textField6 = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        textField7 = new java.awt.TextField();
        jLabel9 = new javax.swing.JLabel();
        textField8 = new java.awt.TextField();
        jLabel10 = new javax.swing.JLabel();
        textField9 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        textField10 = new java.awt.TextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 44)); // NOI18N
        jLabel3.setText("Search Slip");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("ID");

        textField2.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Slip Number");

        textField3.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });

        textField4.setEditable(false);
        textField4.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Student Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Section");

        textField5.setEditable(false);
        textField5.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField5ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Month");

        textField6.setEditable(false);
        textField6.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Monthly Fees");

        textField7.setEditable(false);
        textField7.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField7ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Admission Fees");

        textField8.setEditable(false);
        textField8.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField8ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Notes Fees");

        textField9.setEditable(false);
        textField9.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField9ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Field");

        textField10.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField10ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel3)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6))
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7))
                    .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        setSize(new java.awt.Dimension(918, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField5ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void textField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField7ActionPerformed

    private void textField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField8ActionPerformed

    private void textField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField9ActionPerformed

    private void textField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setVisible(false);
        menu m = new menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String id = textField2.getText().trim();
        String slipNo = textField3.getText().trim();
        if(id.equals("") && slipNo.equals("")){
            clearFields();
            JOptionPane.showMessageDialog(null, "Enter either ID or Slip no");            
        }
        else{
            con = DBConnection.connect();
            int flag = 0;
            if(!id.equals("")){   
                sql = "Select * from studentfees where id = ?";
                try{
                    ps = con.prepareStatement(sql); 
                    ps.setString(1, id);
                    rs = ps.executeQuery();
                    while(rs.next()){
                        flag = 1;
                        break;
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            else{                 
                sql = "Select * from studentfees where slip_no  = ?";
                try{
                    ps = con.prepareStatement(sql);
                    ps.setString(1, slipNo);
                    rs = ps.executeQuery();
                    while(rs.next()){     
                        flag = 2;
                        break;
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            try{      
                if(flag == 1){
                    slipNo = rs.getString("slip_no");
                }
                else if(flag == 2){
                    id = rs.getString("id");
                }
                else{
                    clearFields();
                    con.close();
                    throw new resultNotFoundException("Invalid ID or Slip no, Record not found");
                }
                
                int secId = rs.getInt("sectionId");
                int monthId = rs.getInt("month");
                int fieldId = rs.getInt("field");
                String fees = rs.getString("fees");
                String name = rs.getString("std_name");
                
                String adFee = "0";
                String noteFee = "0";
                sql = "Select * from admission_fees where slip_no  = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, slipNo);
                rs = ps.executeQuery();
                while(rs.next()){     
                    adFee = rs.getString("fees");
                }

                sql = "Select * from notes_fees where slip_no  = ?";
                ps = con.prepareStatement(sql);
                ps.setString(1, slipNo);
                rs = ps.executeQuery();
                while(rs.next()){     
                    noteFee = rs.getString("fees");
                }                
                Section s = new Section();
                String secName = s.getSectionName(secId);
                
                Month m = new Month();
                String month = m.getMonthName(monthId);
                
                String field = fieldId == 0 ? "Engineering" : "Medical";
                
                textField2.setText(id);
                textField3.setText(slipNo);
                textField4.setText(name);
                textField5.setText(secName);
                textField6.setText(month);
                textField7.setText(fees);
                textField8.setText(adFee);
                textField9.setText(noteFee);
                textField10.setText(field);                
            }
            catch(resultNotFoundException e){
                JOptionPane.showMessageDialog(null, e);                
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
            }
            finally{
                try {
                    rs.close();
                    ps.close();
                    con.close();
                }
                catch (Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            
        }    

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(searchSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchSlip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchSlip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField textField10;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    private java.awt.TextField textField7;
    private java.awt.TextField textField8;
    private java.awt.TextField textField9;
    // End of variables declaration//GEN-END:variables
}
