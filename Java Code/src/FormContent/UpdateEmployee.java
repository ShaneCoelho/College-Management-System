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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class UpdateEmployee extends javax.swing.JPanel {

    public UpdateEmployee() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DiciplineL = new javax.swing.JLabel();
        AddressT = new javax.swing.JTextField();
        Class10L = new javax.swing.JLabel();
        MotherT = new javax.swing.JTextField();
        PhoneL = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();
        FatherL = new javax.swing.JLabel();
        Class12T = new javax.swing.JTextField();
        DOBL = new javax.swing.JLabel();
        QualificationT = new javax.swing.JTextField();
        DOBT = new javax.swing.JTextField();
        DiciplineT = new javax.swing.JTextField();
        FatherT = new javax.swing.JTextField();
        AgeT = new javax.swing.JTextField();
        PhoneT = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        Class10T = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        CourseL = new javax.swing.JLabel();
        AadharL = new javax.swing.JLabel();
        GradeL = new javax.swing.JLabel();
        GradeT = new javax.swing.JTextField();
        AadharT = new javax.swing.JTextField();
        CourseT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        QualificationL = new javax.swing.JLabel();
        EmployeeL = new javax.swing.JLabel();
        EmailL = new javax.swing.JLabel();
        EmployeeT = new javax.swing.JTextField();
        Class12L = new javax.swing.JLabel();
        Update = new javax.swing.JButton();
        AgeL = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        AddressL = new javax.swing.JLabel();
        Employee2T = new javax.swing.JTextField();
        MotherL = new javax.swing.JLabel();
        Enrollment2L = new javax.swing.JLabel();
        NameT1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        DiciplineL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineL.setText("Dicipline");

        AddressT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Class10L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class10L.setText("Class X(%)");

        MotherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PhoneL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneL.setText("Phone");

        EmailT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        FatherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FatherL.setText("Father's Name");

        Class12T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class12T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Class12TActionPerformed(evt);
            }
        });

        DOBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DOBL.setText("DOB(dd/mm/yyyy)");

        QualificationT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QualificationT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QualificationTActionPerformed(evt);
            }
        });

        DOBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DiciplineT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiciplineTActionPerformed(evt);
            }
        });

        FatherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AgeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTActionPerformed(evt);
            }
        });

        PhoneT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneTActionPerformed(evt);
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

        Class10T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Reset.setBackground(new java.awt.Color(0, 0, 0));
        Reset.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        CourseL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseL.setText("Course");

        AadharL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AadharL.setText("Aadhar No");

        GradeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GradeL.setText("Grade");

        GradeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GradeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeTActionPerformed(evt);
            }
        });

        AadharT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AadharT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AadharTActionPerformed(evt);
            }
        });

        CourseT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseTActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2/College Logo-modified.png"))); // NOI18N

        QualificationL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QualificationL.setText("Qualification");

        EmployeeL.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        EmployeeL.setText("Enter Employee ID:");

        EmailL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailL.setText("Email Id");

        EmployeeT.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        EmployeeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeTActionPerformed(evt);
            }
        });

        Class12L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class12L.setText("Class XII(%)");

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Update.setForeground(new java.awt.Color(255, 255, 255));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        AgeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeL.setText("Age");

        NameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameL.setText("Name");

        AddressL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressL.setText("Address");

        Employee2T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MotherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MotherL.setText("Mother's Name");

        Enrollment2L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Enrollment2L.setText("Employee ID");

        NameT1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(QualificationL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiciplineL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MotherL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MotherT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DiciplineT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(QualificationT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Class12T, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddressT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NameT1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(EmployeeL)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FatherL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Enrollment2L, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Employee2T, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FatherT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DOBL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(PhoneL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Class10L, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(AadharL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(GradeL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CourseL, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DOBT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Class10T, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AadharT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GradeT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EmployeeT, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
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
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeL)
                    .addComponent(EmployeeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Enrollment2L)
                    .addComponent(Employee2T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class10L, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class10T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Class12T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class12L, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QualificationL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(QualificationT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GradeL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GradeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiciplineT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DiciplineL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void QualificationTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QualificationTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QualificationTActionPerformed

    private void AgeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTActionPerformed

    private void PhoneTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhoneTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PhoneTActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String A ="[a-zA-Z]{1,20}";
        String B ="[a-zA-Z]{1,20}";
        String C ="[a-zA-Z]{1,20}";
        String D ="[0-9]{1,2}";
        String E ="[0-9]{10}";
        String F ="[0-9]{12}";
        String G ="[0-9]{1,9}";
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
        Matcher na5= ne.matcher(Employee2T.getText()); 
       if(!regexMatcher.matches()){ //3
            
            JOptionPane.showMessageDialog(null, "Name is incorrect ");
         }//3
        else if(!na5.matches()){
            JOptionPane.showMessageDialog(null, "Employes Id is incorrect ");
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
        else{
            try{
                conn con = new conn();
                String str = "update teacher set name='"+NameT1.getText()+"',employee='"+Employee2T.getText()+"',mothers_name='"+MotherT.getText()+"', fathers_name='"+FatherT.getText()+"',age='"+AgeT.getText()+"',dob='"+DOBT.getText()+"',address='"+AddressT.getText()+"',phone='"+PhoneT.getText()+"',email_id='"+EmailT.getText()+"',class_10='"+Class10T.getText()+"',class12='"+Class12T.getText()+"',aadhar='"+AadharT.getText()+"',qualification='"+QualificationT.getText()+"',grade='"+GradeT.getText()+"',dicipline='"+DiciplineT.getText()+"',course='"+CourseT.getText()+"' where employee='"+EmployeeT.getText()+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
               
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }

    }//GEN-LAST:event_SubmitActionPerformed
   }
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed

        NameT1.setText("");
        Employee2T.setText("");
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
        QualificationT.setText("");
        GradeT.setText("");
        DiciplineT.setText("");
        CourseT.setText("");
        EmployeeT.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void GradeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GradeTActionPerformed

    private void CourseTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CourseTActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed

        String Z ="[0-9]{1,9}";
        Pattern nz = Pattern.compile(Z);
        Matcher nz13= nz.matcher(EmployeeT.getText()); 
        if(!nz13.matches()){
            JOptionPane.showMessageDialog(null, "Employes Id is incorrect ");
        }else{
             try{
                conn con = new conn();
                String str = "select * from teacher where employee = '"+EmployeeT.getText()+"'";
                ResultSet rs = con.s.executeQuery(str);

                if(rs.next()){
                 

                    NameT1.setText(rs.getString(1));
                    Employee2T.setText(rs.getString(2));
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
                    QualificationT.setText(rs.getString(13));
                    GradeT.setText(rs.getString(14));
                    DiciplineT.setText(rs.getString(15));
                    CourseT.setText(rs.getString(16));
                }

            }catch(Exception ex){}


    }//GEN-LAST:event_UpdateActionPerformed
 }
    private void Class12TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Class12TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Class12TActionPerformed

    private void AadharTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AadharTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AadharTActionPerformed

    private void DiciplineTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiciplineTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiciplineTActionPerformed

    private void EmployeeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeTActionPerformed

      protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#c2e59c"), 0, getHeight(), Color.decode("#64b3f4"));
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
    private javax.swing.JLabel CourseL;
    private javax.swing.JTextField CourseT;
    private javax.swing.JLabel DOBL;
    private javax.swing.JTextField DOBT;
    private javax.swing.JLabel DiciplineL;
    private javax.swing.JTextField DiciplineT;
    private javax.swing.JLabel EmailL;
    private javax.swing.JTextField EmailT;
    private javax.swing.JTextField Employee2T;
    private javax.swing.JLabel EmployeeL;
    private javax.swing.JTextField EmployeeT;
    private javax.swing.JLabel Enrollment2L;
    private javax.swing.JLabel FatherL;
    private javax.swing.JTextField FatherT;
    private javax.swing.JLabel GradeL;
    private javax.swing.JTextField GradeT;
    private javax.swing.JLabel MotherL;
    private javax.swing.JTextField MotherT;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField NameT1;
    private javax.swing.JLabel PhoneL;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JLabel QualificationL;
    private javax.swing.JTextField QualificationT;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
