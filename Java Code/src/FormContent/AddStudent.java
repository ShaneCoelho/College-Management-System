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


public class AddStudent extends javax.swing.JPanel {

    public AddStudent() {
        initComponents();
        setOpaque(false);    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Icon = new javax.swing.JLabel();
        NameL = new javax.swing.JLabel();
        NameT = new javax.swing.JTextField();
        MotherL = new javax.swing.JLabel();
        MotherT = new javax.swing.JTextField();
        EnrollmentL = new javax.swing.JLabel();
        EnrollmentT = new javax.swing.JTextField();
        FatherL = new javax.swing.JLabel();
        FatherT = new javax.swing.JTextField();
        AgeL = new javax.swing.JLabel();
        AgeT = new javax.swing.JTextField();
        DOBL = new javax.swing.JLabel();
        DOBT = new javax.swing.JTextField();
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
        AadharL = new javax.swing.JLabel();
        AadharT = new javax.swing.JTextField();
        RollNoL = new javax.swing.JLabel();
        RollNoT = new javax.swing.JTextField();
        CourseL = new javax.swing.JLabel();
        CourseT = new javax.swing.JComboBox<>();
        DiciplineL = new javax.swing.JLabel();
        DiciplineT = new javax.swing.JComboBox<>();
        Submit = new javax.swing.JButton();
        ClassL = new javax.swing.JLabel();
        ClassT = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 255, 255));

        Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2/College Logo-modified.png"))); // NOI18N

        NameL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        NameL.setText("Name");

        NameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        MotherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MotherL.setText("Mother's Name");

        MotherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MotherT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotherTActionPerformed(evt);
            }
        });

        EnrollmentL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EnrollmentL.setText("Enrollment No.");

        EnrollmentT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EnrollmentT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnrollmentTActionPerformed(evt);
            }
        });

        FatherL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        FatherL.setText("Father's Name");

        FatherT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        AgeL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeL.setText("Age");

        AgeT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AgeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTActionPerformed(evt);
            }
        });

        DOBL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DOBL.setText("DOB(dd/mm/yyyy)");

        DOBT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        AadharL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AadharL.setText("Aadhar No");

        AadharT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        RollNoL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RollNoL.setText("Roll No");

        RollNoT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        CourseL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseL.setText("Course");

        CourseT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CourseT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B.Tech", "Diploma", "BE", "BSCIT" }));

        DiciplineL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineL.setText("Dicipline");

        DiciplineT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DiciplineT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Computer Science", "Mechanical", "Civil", "Big Data" }));

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

        ClassL.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClassL.setText("Class");

        ClassT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NameL)
                    .addComponent(AgeL)
                    .addComponent(AddressL)
                    .addComponent(EmailL)
                    .addComponent(Class12L)
                    .addComponent(RollNoL)
                    .addComponent(DiciplineL)
                    .addComponent(MotherL))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MotherT)
                    .addComponent(AgeT)
                    .addComponent(AddressT)
                    .addComponent(EmailT)
                    .addComponent(Class12T, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                    .addComponent(RollNoT)
                    .addComponent(DiciplineT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NameT))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnrollmentL)
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
                                    .addComponent(EnrollmentT, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(FatherT)
                                    .addComponent(DOBT)
                                    .addComponent(PhoneT)
                                    .addComponent(Class10T)
                                    .addComponent(AadharT)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ClassL, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ClassT, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
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
                    .addComponent(EnrollmentL)
                    .addComponent(EnrollmentT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(RollNoL)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RollNoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ClassL)
                        .addComponent(ClassT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DiciplineL)
                    .addComponent(DiciplineT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CourseL)
                    .addComponent(CourseT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#BE93C5"), 0, getHeight(), Color.decode("#7BC6CC"));
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(grphcs);
    }
    
    
    
    private void MotherTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotherTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotherTActionPerformed

    private void EnrollmentTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnrollmentTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnrollmentTActionPerformed

    private void AgeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTActionPerformed

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
        Matcher na5= ne.matcher(EnrollmentT.getText());
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
        
        String a = NameT.getText();
        String bb = MotherT.getText();
        String c = EnrollmentT.getText();
        String d = FatherT.getText();
        String e = AgeT.getText();
        String ff = DOBT.getText();
        String g = AddressT.getText();
        String h = PhoneT.getText();
        String i = EmailT.getText();
        String j = Class10T.getText();
        String k = Class12T.getText();
        String l = AadharT.getText();
        String n = RollNoT.getText();
        String o = ClassT.getText();
        String y = (String)CourseT.getSelectedItem();
        String m = (String)DiciplineT.getSelectedItem();
        String r = "Not Paid";
        
            try{
                conn cc = new conn();
                String q = "insert into student values('"+a+"','"+c+"','"+bb+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+n+"','"+o+"','"+m+"','"+y+"','"+r+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully");
                
            }catch(Exception ee){
                System.out.println("The error is:"+ee);
            }        
    }//GEN-LAST:event_SubmitActionPerformed
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
    private javax.swing.JComboBox<String> CourseT;
    private javax.swing.JLabel DOBL;
    private javax.swing.JTextField DOBT;
    private javax.swing.JLabel DiciplineL;
    private javax.swing.JComboBox<String> DiciplineT;
    private javax.swing.JLabel EmailL;
    private javax.swing.JTextField EmailT;
    private javax.swing.JLabel EnrollmentL;
    private javax.swing.JTextField EnrollmentT;
    private javax.swing.JLabel FatherL;
    private javax.swing.JTextField FatherT;
    private javax.swing.JLabel Icon;
    private javax.swing.JLabel MotherL;
    private javax.swing.JTextField MotherT;
    private javax.swing.JLabel NameL;
    private javax.swing.JTextField NameT;
    private javax.swing.JLabel PhoneL;
    private javax.swing.JTextField PhoneT;
    private javax.swing.JLabel RollNoL;
    private javax.swing.JTextField RollNoT;
    private javax.swing.JButton Submit;
    // End of variables declaration//GEN-END:variables
}
