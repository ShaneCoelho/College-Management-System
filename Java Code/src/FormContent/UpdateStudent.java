/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormContent;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.regex.*;


public class UpdateStudent extends javax.swing.JPanel {
    public UpdateStudent() {
        initComponents();
        setOpaque(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        EnrollmentL = new javax.swing.JLabel();
        EnrollmentT = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        NameL = new javax.swing.JLabel();
        Enrollment2T = new javax.swing.JTextField();
        Enrollment2L = new javax.swing.JLabel();
        NameT1 = new javax.swing.JTextField();
        Class10L = new javax.swing.JLabel();
        PhoneL = new javax.swing.JLabel();
        FatherL = new javax.swing.JLabel();
        DOBL = new javax.swing.JLabel();
        DOBT = new javax.swing.JTextField();
        FatherT = new javax.swing.JTextField();
        PhoneT = new javax.swing.JTextField();
        Class10T = new javax.swing.JTextField();
        CourseL = new javax.swing.JLabel();
        AadharL = new javax.swing.JLabel();
        ClassL = new javax.swing.JLabel();
        ClassT = new javax.swing.JTextField();
        AadharT = new javax.swing.JTextField();
        CourseT = new javax.swing.JTextField();
        RollNoL = new javax.swing.JLabel();
        EmailL = new javax.swing.JLabel();
        Class12L = new javax.swing.JLabel();
        AgeL = new javax.swing.JLabel();
        AddressL = new javax.swing.JLabel();
        MotherL = new javax.swing.JLabel();
        DiciplineL = new javax.swing.JLabel();
        AddressT = new javax.swing.JTextField();
        MotherT = new javax.swing.JTextField();
        EmailT = new javax.swing.JTextField();
        Class12T = new javax.swing.JTextField();
        RollNoT = new javax.swing.JTextField();
        DiciplineT = new javax.swing.JTextField();
        AgeT = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2/College Logo-modified.png"))); // NOI18N

        EnrollmentL.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        EnrollmentL.setText("Enter The Enrollment No. Of The Student:");

        EnrollmentT.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        NameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameL.setText("Name");

        Enrollment2T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Enrollment2L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Enrollment2L.setText("Enrollment No.");

        NameT1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Class10L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class10L.setText("Class X(%)");

        PhoneL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneL.setText("Phone");

        FatherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FatherL.setText("Father's Name");

        DOBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DOBL.setText("DOB(dd/mm/yyyy)");

        DOBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FatherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PhoneT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTActionPerformed(evt);
            }
        });

        Class10T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CourseL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseL.setText("Course");

        AadharL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AadharL.setText("Aadhar No");

        ClassL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClassL.setText("Class");

        ClassT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClassT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassTActionPerformed(evt);
            }
        });

        AadharT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CourseT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseTActionPerformed(evt);
            }
        });

        RollNoL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RollNoL.setText("Roll No.");

        EmailL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailL.setText("Email Id");

        Class12L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class12L.setText("Class XII(%)");

        AgeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeL.setText("Age");

        AddressL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressL.setText("Address");

        MotherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MotherL.setText("Mother's Name");

        DiciplineL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineL.setText("Dicipline");

        AddressT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MotherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmailT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Class12T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RollNoT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RollNoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollNoTActionPerformed(evt);
            }
        });

        DiciplineT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AgeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTActionPerformed(evt);
            }
        });

        Submit.setBackground(new java.awt.Color(0, 0, 0));
        Submit.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(0, 0, 0));
        Reset.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addComponent(EnrollmentL)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Class12L, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RollNoL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiciplineL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MotherL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MotherT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiciplineT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RollNoT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Class12T, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameT1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EnrollmentT, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FatherL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Enrollment2L, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Enrollment2T, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FatherT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DOBL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PhoneL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Class10L, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AadharL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ClassL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CourseL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOBT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Class10T, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AadharT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClassT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EnrollmentL)
                            .addComponent(EnrollmentT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Enrollment2L)
                            .addComponent(Enrollment2T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MotherL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MotherT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FatherL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FatherT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgeL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DOBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddressL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Class10L, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Class10T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Class12L, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class12T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RollNoL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RollNoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClassT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiciplineL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiciplineT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ClassTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClassTActionPerformed

    private void CourseTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseTActionPerformed

    private void AgeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTActionPerformed

    private void PhoneTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTActionPerformed

    private void RollNoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollNoTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RollNoTActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        
        String Z ="[0-9]{9,10}";
        Pattern nz = Pattern.compile(Z);
        Matcher na13= nz.matcher(EnrollmentT.getText());
        if(!na13.matches()){
            JOptionPane.showMessageDialog(null, "Enrollment No Id is incorrect ");
        }
        else{
            try{
                conn con = new conn();
                String str = "select * from student where enrollment = '"+EnrollmentT.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                    
             

                    NameT1.setText(rs.getString(1));
                    Enrollment2T.setText(rs.getString(2));
                    MotherT.setText(rs.getString(3));
                    FatherT.setText(rs.getString(4));
                    AgeT.setText(rs.getString(5));
                    DOBT.setText(rs.getString(6));
                    AddressT.setText(rs.getString(7));
                    PhoneT.setText(rs.getString(8));
                    EmailT.setText(rs.getString(9));
                    Class10T.setText(rs.getString(10));
                    Class12T.setText(rs.getString(11));
                    AadharT.setText(rs.getString(12));
                    RollNoT.setText(rs.getString(13));
                    ClassT.setText(rs.getString(14));
                    DiciplineT.setText(rs.getString(15));
                    CourseT.setText(rs.getString(16));
                }

                
            }catch(Exception ex){}
        
    }//GEN-LAST:event_UpdateActionPerformed
  }
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
       
                    NameT1.setText("");
                    Enrollment2T.setText("");
                    MotherT.setText("");
                    FatherT.setText("");
                    AgeT.setText("");
                    DOBT.setText("");
                    AddressT.setText("");
                    PhoneT.setText("");
                    EmailT.setText("");
                    Class10T.setText("");
                    Class12T.setText("");
                    AadharT.setText("");
                    RollNoT.setText("");
                    ClassT.setText("");
                    DiciplineT.setText("");
                    CourseT.setText("");
                    EnrollmentT.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String A ="[a-zA-Z]{1,20}";
        String B ="[a-zA-Z]{1,20}";
        String C ="[a-zA-Z]{1,20}";
        String D ="[0-9]{1,2}";
        String E ="[0-9]{10}";
        String F ="[0-9]{12}";
        String G ="[0-9]{9,10}";
        String H ="[0-9]{1,4}" ;   
        Pattern pattern = Pattern.compile(A);
        Matcher regexMatcher=pattern.matcher(NameT1.getText());
        Pattern patt = Pattern.compile(B);
        Matcher regex=patt.matcher(MotherT.getText());
        Pattern na = Pattern.compile(C);
        Matcher na1= na.matcher(FatherT.getText());
        Pattern nb = Pattern.compile(D);
        Matcher na2= nb.matcher(AgeT.getText());
        Pattern nc = Pattern.compile(E);
        Matcher na3= nc.matcher(PhoneT.getText());
        Pattern nd = Pattern.compile(F);
        Matcher na4= nd.matcher(AadharT.getText());
        Pattern ne = Pattern.compile(G);
        Matcher na5= ne.matcher(Enrollment2T.getText());
        Pattern nf = Pattern.compile(H);
        Matcher na6= nf.matcher(RollNoT.getText());
        if(!regexMatcher.matches()){ //3
            
            JOptionPane.showMessageDialog(null, "Name is incorrect ");
         }//3
        else if(!na5.matches()){
            JOptionPane.showMessageDialog(null, "Enrollment No Id is incorrect ");
        }
        else if(!regex.matches()){
            JOptionPane.showMessageDialog(null, "Mother's name is incorrect ");
        }
        else if(!na1.matches()){
            JOptionPane.showMessageDialog(null, "Father's Name is incorrect ");
        }
        else if(!na2.matches()){
            JOptionPane.showMessageDialog(null, "Age is incorrect ");
        }
        else if(!na3.matches()){
            JOptionPane.showMessageDialog(null, "Phone no is incorrect ");
        }
        else if(!na4.matches()){
            JOptionPane.showMessageDialog(null, "Aadhar no is incorrect ");      
        }
        else if(!na6.matches()){
            JOptionPane.showMessageDialog(null, "Roll no is incorrect ");     
        }
        else{
        try{
                conn con = new conn();
                String str = "update student set name='"+NameT1.getText()+"',enrollment='"+Enrollment2T.getText()+"',mothers_name='"+MotherT.getText()+"', fathers_name='"+FatherT.getText()+"',age='"+AgeT.getText()+"',dob='"+DOBT.getText()+"',address='"+AddressT.getText()+"',phone='"+PhoneT.getText()+"',email_id='"+EmailT.getText()+"',class_10='"+Class10T.getText()+"',class12='"+Class12T.getText()+"',aadhar='"+AadharT.getText()+"',roll_no='"+RollNoT.getText()+"',class='"+ClassT.getText()+"',dicipline='"+DiciplineT.getText()+"',course='"+CourseT.getText()+"' where enrollment='"+EnrollmentT.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
               
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        
    }//GEN-LAST:event_SubmitActionPerformed
   }
    
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#BE93C5"), 0, getHeight(), Color.decode("#7BC6CC"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AadharL;
    private javax.swing.JTextField AadharT;
    private javax.swing.JLabel AddressL;
    private javax.swing.JTextField AddressT;
    private javax.swing.JLabel AgeL;
    private javax.swing.JTextField AgeT;
    private javax.swing.JLabel Class10L;
    private javax.swing.JTextField Class10T;
    private javax.swing.JLabel Class12L;
    private javax.swing.JTextField Class12T;
    private javax.swing.JLabel ClassL;
    private javax.swing.JTextField ClassT;
    private javax.swing.JLabel CourseL;
    private javax.swing.JTextField CourseT;
    private javax.swing.JLabel DOBL;
    private javax.swing.JTextField DOBT;
    private javax.swing.JLabel DiciplineL;
    private javax.swing.JTextField DiciplineT;
    private javax.swing.JLabel EmailL;
    private javax.swing.JTextField EmailT;
    private javax.swing.JLabel Enrollment2L;
    private javax.swing.JTextField Enrollment2T;
    private javax.swing.JLabel EnrollmentL;
    private javax.swing.JTextField EnrollmentT;
    private javax.swing.JLabel FatherL;
    private javax.swing.JTextField FatherT;
    private javax.swing.JLabel MotherL;
    private javax.swing.JTextField MotherT;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField NameT1;
    private javax.swing.JLabel PhoneL;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel RollNoL;
    private javax.swing.JTextField RollNoT;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
