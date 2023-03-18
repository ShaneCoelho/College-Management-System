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
import javax.swing.JOptionPane;
import java.util.regex.*;

public class AddEmployee extends javax.swing.JPanel {

  
    public AddEmployee() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddressL = new javax.swing.JLabel();
        AddressT = new javax.swing.JTextField();
        PhoneL = new javax.swing.JLabel();
        PhoneT = new javax.swing.JTextField();
        EmailL = new javax.swing.JLabel();
        EmailT = new javax.swing.JTextField();
        Class10L = new javax.swing.JLabel();
        Class10T = new javax.swing.JTextField();
        Class12L = new javax.swing.JLabel();
        Class12T = new javax.swing.JTextField();
        NameL = new javax.swing.JLabel();
        AadharL = new javax.swing.JLabel();
        NameT = new javax.swing.JTextField();
        AadharT = new javax.swing.JTextField();
        MotherL = new javax.swing.JLabel();
        QualificationL = new javax.swing.JLabel();
        MotherT = new javax.swing.JTextField();
        QualificationT = new javax.swing.JTextField();
        EmployeeL = new javax.swing.JLabel();
        CourseL = new javax.swing.JLabel();
        EmployeeT = new javax.swing.JTextField();
        CourseT = new javax.swing.JComboBox<>();
        FatherL = new javax.swing.JLabel();
        DiciplineL = new javax.swing.JLabel();
        FatherT = new javax.swing.JTextField();
        DiciplineT = new javax.swing.JComboBox<>();
        AgeL = new javax.swing.JLabel();
        AgeT = new javax.swing.JTextField();
        Icon = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        DOBL = new javax.swing.JLabel();
        GradeL = new javax.swing.JLabel();
        DOBT = new javax.swing.JTextField();
        GradeT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        AddressL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddressL.setText("Address");

        AddressT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        PhoneL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PhoneL.setText("Phone");

        PhoneT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmailL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmailL.setText("Email Id");

        EmailT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Class10L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class10L.setText("Class X(%)");

        Class10T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Class12L.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Class12L.setText("Class XII(%)");

        Class12T.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        NameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameL.setText("Name");

        AadharL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AadharL.setText("Aadhar No");

        NameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AadharT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MotherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MotherL.setText("Mother's Name");

        QualificationL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        QualificationL.setText("Qualification");

        MotherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MotherT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherTActionPerformed(evt);
            }
        });

        QualificationT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        EmployeeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmployeeL.setText("Employee ID");

        CourseL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseL.setText("Course");

        EmployeeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EmployeeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeTActionPerformed(evt);
            }
        });

        CourseT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "Diploma", "BE", "BSCIT" }));

        FatherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FatherL.setText("Father's Name");

        DiciplineL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineL.setText("Dicipline");

        FatherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        DiciplineT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Mechanical", "Civil", "Big Data" }));

        AgeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeL.setText("Age");

        AgeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTActionPerformed(evt);
            }
        });

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2/College Logo-modified.png"))); // NOI18N

        Submit.setBackground(new java.awt.Color(0, 0, 0));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit");
        Submit.setBorder(null);
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        Reset.setBackground(new java.awt.Color(0, 0, 0));
        Reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Reset.setForeground(new java.awt.Color(255, 255, 255));
        Reset.setText("Reset");
        Reset.setBorder(null);
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        DOBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DOBL.setText("DOB(dd/mm/yyyy)");

        GradeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        GradeL.setText("Grade");

        DOBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        GradeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameL)
                            .addComponent(AgeL)
                            .addComponent(AddressL)
                            .addComponent(EmailL)
                            .addComponent(Class12L)
                            .addComponent(QualificationL)
                            .addComponent(DiciplineL)
                            .addComponent(MotherL))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MotherT)
                            .addComponent(AgeT)
                            .addComponent(AddressT)
                            .addComponent(EmailT)
                            .addComponent(Class12T, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(QualificationT)
                            .addComponent(DiciplineT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(NameT)))
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmployeeL)
                            .addComponent(FatherL)
                            .addComponent(DOBL)
                            .addComponent(PhoneL)
                            .addComponent(Class10L)
                            .addComponent(AadharL)
                            .addComponent(CourseL))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(EmployeeT, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(FatherT)
                                    .addComponent(DOBT)
                                    .addComponent(PhoneT)
                                    .addComponent(Class10T)
                                    .addComponent(AadharT)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GradeL, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GradeT, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(Icon)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameL)
                    .addComponent(NameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmployeeL)
                    .addComponent(EmployeeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MotherL)
                    .addComponent(MotherT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FatherL)
                    .addComponent(FatherT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeL)
                    .addComponent(AgeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOBL)
                    .addComponent(DOBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressL)
                    .addComponent(AddressT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneL)
                    .addComponent(PhoneT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailL)
                    .addComponent(EmailT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class10L)
                    .addComponent(Class10T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Class12L)
                    .addComponent(Class12T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AadharL)
                    .addComponent(AadharT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QualificationL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(QualificationT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(GradeL)
                        .addComponent(GradeT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiciplineL)
                    .addComponent(DiciplineT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseL)
                    .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void MotherTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotherTActionPerformed
     
    }//GEN-LAST:event_MotherTActionPerformed

    private void EmployeeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeTActionPerformed
        
    }//GEN-LAST:event_EmployeeTActionPerformed

    private void AgeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTActionPerformed
      
    }//GEN-LAST:event_AgeTActionPerformed

      protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#c2e59c"), 0, getHeight(), Color.decode("#64b3f4"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String A ="[a-zA-Z]{1,20}";
        String B ="[a-zA-Z]{1,20}";
        String C ="[a-zA-Z]{1,20}";
        String D ="[0-9]{1,2}";
        String E ="[0-9]{10}";
        String F ="[0-9]{12}";
        String G ="[0-9]{1,9}";
        Pattern pattern = Pattern.compile(A);
        Matcher regexMatcher=pattern.matcher(NameT.getText());
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
        Matcher na5= ne.matcher(EmployeeT.getText()); 
       if(!regexMatcher.matches()){ //3
            
            JOptionPane.showMessageDialog(null, "Name is incorrect ");
         }//3
        else if(!na5.matches()){
            JOptionPane.showMessageDialog(null, "EmployesT Id is incorrect ");
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
        String a = NameT.getText();
        String bb = MotherT.getText();
        String c = EmployeeT.getText();
        String d = FatherT.getText();
        String e = AgeT.getText();
        String ff = DOBT.getText();
        String g = AddressT.getText();
        String h = PhoneT.getText();
        String i = EmailT.getText();
        String j = Class10T.getText();
        String k = Class12T.getText();
        String l = AadharT.getText();
        String n = QualificationT.getText();
        String o = GradeT.getText();
        String y = (String)CourseT.getSelectedItem();
        String m = (String)DiciplineT.getSelectedItem();

        try{
            conn cc = new conn();
            String q = "insert into teacher values('"+a+"','"+c+"','"+bb+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+n+"','"+o+"','"+m+"','"+y+"')";
            cc.s.executeUpdate(q);
            JOptionPane.showMessageDialog(null,"Employee Details Inserted Successfully");

        }catch(Exception ee){
            System.out.println("The error is:"+ee);
        }        
       }  
    }//GEN-LAST:event_SubmitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        NameT.setText("");
        EmployeeT.setText("");
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
        
        
    }//GEN-LAST:event_ResetActionPerformed

       
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
    private javax.swing.JComboBox<String> CourseT;
    private javax.swing.JLabel DOBL;
    private javax.swing.JTextField DOBT;
    private javax.swing.JLabel DiciplineL;
    private javax.swing.JComboBox<String> DiciplineT;
    private javax.swing.JLabel EmailL;
    private javax.swing.JTextField EmailT;
    private javax.swing.JLabel EmployeeL;
    private javax.swing.JTextField EmployeeT;
    private javax.swing.JLabel FatherL;
    private javax.swing.JTextField FatherT;
    private javax.swing.JLabel GradeL;
    private javax.swing.JTextField GradeT;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel MotherL;
    private javax.swing.JTextField MotherT;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField NameT;
    private javax.swing.JLabel PhoneL;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JLabel QualificationL;
    private javax.swing.JTextField QualificationT;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Submit;
    // End of variables declaration//GEN-END:variables
}
