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
public class otherInfo extends javax.swing.JFrame {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    
    public otherInfo() {
        super("Miscellaneous Information");
        initComponents();        
    }
    
    public void getInfo(int month){
        String conflict1,conflict2;
        if(month == 12){
            conflict1 = "";
            conflict2 = "";
        }
        else{
            conflict1 = " and month = "+month;
            conflict2 = " where month = "+month;            
        }
        int engStd, medStd,engCash, medCash,engNotes,medNotes,engAd,medAd,strtSlip,endSlip,totalSlips;
        
        con = DBConnection.connect();
        try{
            sql = "SELECT count(*) as 'engStd', sum(fees) as 'engCash'  from studentfees where field = 0" + conflict1;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            engStd = rs.getInt("engStd");
            engCash = rs.getInt("engCash");
            
            sql = "SELECT count(*) as 'medStd', sum(fees) as 'medCash' from studentfees where field = 1" + conflict1;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            medStd = rs.getInt("medStd");
            medCash = rs.getInt("medCash");
            
            sql = "SELECT sum(notes_fees.fees) as 'engNotes' from studentfees inner join notes_fees on studentfees.slip_no = notes_fees.slip_no where field = 0" + conflict1;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            engNotes = rs.getInt("engNotes");
            

            sql = "SELECT sum(notes_fees.fees) as 'medNotes' from studentfees inner join notes_fees on studentfees.slip_no = notes_fees.slip_no where field = 1 " + conflict1;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            medNotes = rs.getInt("medNotes");

            sql = "SELECT sum(admission_fees.fees) as 'engAd' from studentfees inner join admission_fees on studentfees.slip_no = admission_fees.slip_no where field = 0" + conflict1;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            engAd = rs.getInt("engAd");
            

            sql = "SELECT sum(admission_fees.fees) as 'medAd' from studentfees inner join admission_fees on studentfees.slip_no = admission_fees.slip_no where field = 1 " + conflict1;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            medAd = rs.getInt("medAd");


            sql = "SELECT slip_no from studentfees " + conflict2 + " order by id limit 1";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            strtSlip = rs.getInt("slip_no");
            
            sql = "SELECT slip_no from studentfees " + conflict2 + " order by id desc limit 1";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            endSlip = rs.getInt("slip_no");
            
            sql = "SELECT count(*) as 'total_slips' from studentfees " + conflict2;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            totalSlips = rs.getInt("total_slips");
  
            textField13.setText(Integer.toString(strtSlip));
            textField14.setText(Integer.toString(endSlip));
            textField17.setText(Integer.toString(totalSlips));
     
            textField4.setText(Integer.toString(engStd));
            textField5.setText(Integer.toString(medStd));
            textField6.setText(Integer.toString(medStd + engStd));
            
            textField19.setText(Integer.toString(engNotes));
            textField12.setText(Integer.toString(medNotes));
            textField18.setText(Integer.toString(engAd));
            textField15.setText(Integer.toString(medAd));       
            textField16.setText(Integer.toString(engCash));
            textField11.setText(Integer.toString(medCash));
            textField10.setText(Integer.toString(medCash + engCash + engNotes + medNotes + engAd + medAd));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No Records Availible");
        }
        finally{
            try{
                con.close();
                ps.close();
                ps.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
        }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textField2 = new java.awt.TextField();
        textField3 = new java.awt.TextField();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textField4 = new java.awt.TextField();
        textField5 = new java.awt.TextField();
        textField6 = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textField10 = new java.awt.TextField();
        textField11 = new java.awt.TextField();
        textField12 = new java.awt.TextField();
        jLabel11 = new javax.swing.JLabel();
        textField13 = new java.awt.TextField();
        textField14 = new java.awt.TextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        textField15 = new java.awt.TextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        textField16 = new java.awt.TextField();
        jLabel16 = new javax.swing.JLabel();
        textField17 = new java.awt.TextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textField18 = new java.awt.TextField();
        textField19 = new java.awt.TextField();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Slip Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Fees");

        textField2.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        textField3.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 44)); // NOI18N
        jLabel3.setText("Miscellaneous Information");
        jLabel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Engineering Students");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Medical Students");

        textField4.setEditable(false);
        textField4.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField4ActionPerformed(evt);
            }
        });

        textField5.setEditable(false);
        textField5.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        textField6.setEditable(false);
        textField6.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField6ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Total Students");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Notes Fees (Medical)");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Monthly Fees (Medical)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Total Cash");

        textField10.setEditable(false);
        textField10.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField10ActionPerformed(evt);
            }
        });

        textField11.setEditable(false);
        textField11.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField11ActionPerformed(evt);
            }
        });

        textField12.setEditable(false);
        textField12.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField12ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Starting Slip no");

        textField13.setEditable(false);
        textField13.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField13ActionPerformed(evt);
            }
        });

        textField14.setEditable(false);
        textField14.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField14ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Ending Slip no");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Month");

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December", "All" }));
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        textField15.setEditable(false);
        textField15.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField15ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Admission Fees (Medical)");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Monthly Fees (Engineering)");

        textField16.setEditable(false);
        textField16.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField16ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Total Slips");

        textField17.setEditable(false);
        textField17.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField17ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Notes Fees (Engineering)");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Admission Fees (Engineering)");

        textField18.setEditable(false);
        textField18.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField18ActionPerformed(evt);
            }
        });

        textField19.setEditable(false);
        textField19.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        textField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel3)
                .addGap(0, 101, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(textField12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textField10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(textField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(textField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        setSize(new java.awt.Dimension(918, 647));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        setVisible(false);
        menu m = new menu();
        m.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField2ActionPerformed

    private void textField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField4ActionPerformed

    private void textField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField6ActionPerformed

    private void textField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField10ActionPerformed

    private void textField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField12ActionPerformed

    private void textField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField11ActionPerformed

    private void textField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField13ActionPerformed

    private void textField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField14ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int month = jComboBox5.getSelectedIndex();
        getInfo(month);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void textField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField15ActionPerformed

    private void textField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField16ActionPerformed

    private void textField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField17ActionPerformed

    private void textField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField18ActionPerformed

    private void textField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField19ActionPerformed

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
            java.util.logging.Logger.getLogger(otherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(otherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(otherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(otherInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new otherInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.TextField textField10;
    private java.awt.TextField textField11;
    private java.awt.TextField textField12;
    private java.awt.TextField textField13;
    private java.awt.TextField textField14;
    private java.awt.TextField textField15;
    private java.awt.TextField textField16;
    private java.awt.TextField textField17;
    private java.awt.TextField textField18;
    private java.awt.TextField textField19;
    private java.awt.TextField textField2;
    private java.awt.TextField textField3;
    private java.awt.TextField textField4;
    private java.awt.TextField textField5;
    private java.awt.TextField textField6;
    // End of variables declaration//GEN-END:variables
}
