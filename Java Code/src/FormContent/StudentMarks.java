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
import FormContent.conn;
import static java.lang.Integer.parseInt;
import java.util.regex.*;


public class StudentMarks extends javax.swing.JPanel {


    public StudentMarks() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        EnrollmentT3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        NameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EnrollmentT1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Subject3 = new javax.swing.JTextField();
        Subject2 = new javax.swing.JTextField();
        Subject4 = new javax.swing.JTextField();
        Subject5 = new javax.swing.JTextField();
        Subject6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Marks2 = new javax.swing.JTextField();
        Marks3 = new javax.swing.JTextField();
        Marks4 = new javax.swing.JTextField();
        Marks5 = new javax.swing.JTextField();
        Marks6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        RollNoT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SemesterT = new javax.swing.JTextField();

        EnrollmentT3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon2/College Logo-modified.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel2.setText("Enter Marks Of Student");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel3.setText("Enter Name :");

        NameT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel4.setText("Enter Enrollment Number:");

        EnrollmentT1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel5.setText("Enter Subject:");

        Subject3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Subject2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Subject4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Subject5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Subject6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel6.setText("Enter Marks:");

        Marks2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Marks3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Marks4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Marks5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Marks6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel7.setText("Enter Roll No.:");

        RollNoT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel8.setText("Enter Semester:");

        SemesterT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(435, 435, 435))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addGap(226, 226, 226))))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(167, 167, 167)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RollNoT, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnrollmentT1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameT, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(150, 150, 150)
                                .addComponent(SemesterT, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                                        .addComponent(Marks6, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Marks5, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Marks4, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Marks3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Subject2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Marks2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButton1)
                                        .addGap(64, 64, 64)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(233, 233, 233)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(jLabel4)
                    .addContainerGap(672, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(EnrollmentT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(RollNoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(SemesterT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Subject6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Marks6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(jLabel4)
                    .addContainerGap(707, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        NameT.setText("");
        RollNoT.setText("");
        SemesterT.setText("");
        EnrollmentT1.setText("");
        Marks2.setText("");
        Marks3.setText("");
        Marks4.setText("");
        Marks5.setText("");
        Marks6.setText("");
        Subject2.setText("");
        Subject3.setText("");
        Subject4.setText("");
        Subject5.setText("");
        Subject6.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String G ="[0-9]{1,10}";
        String A ="[a-zA-Z]{1,20}";
        String H ="[0-9]{1,4}";
        String B ="[0-9]{1,4}";
        
        Pattern pattern = Pattern.compile(A);
        Matcher regexMatcher=pattern.matcher(NameT.getText());
        Pattern ne = Pattern.compile(G);
        Matcher na5= ne.matcher(EnrollmentT1.getText());
        Pattern nf = Pattern.compile(H);
        Matcher na6= nf.matcher(RollNoT.getText());
        Pattern ng = Pattern.compile(B);
        Matcher na7= ng.matcher(Marks2.getText());
        //Pattern ni = Pattern.compile(C);
        Matcher na8= ng.matcher(Marks3.getText());
        Matcher na9= ng.matcher(Marks4.getText());
        Matcher na10= ng.matcher(Marks5.getText());
        Matcher na11= ng.matcher(Marks6.getText());
        if(!na5.matches()){
            JOptionPane.showMessageDialog(null, "Enrollment No Id is incorrect ");
        }
        else if(!regexMatcher.matches()){ //3
            
            JOptionPane.showMessageDialog(null, "Name is incorrect ");
         }
        else if(!na6.matches()){
            JOptionPane.showMessageDialog(null, "Roll no is incorrect ");
        }
        else if(!na7.matches()){
            JOptionPane.showMessageDialog(null, "Enter Marks Correctly");
        }
        else if(!na8.matches()){
            JOptionPane.showMessageDialog(null, "Enter Marks Correctly");
        }
        else if(!na9.matches()){
            JOptionPane.showMessageDialog(null, "Enter Marks Correctly");
        }
        else if(!na10.matches()){
            JOptionPane.showMessageDialog(null, "Enter Marks Correctly");
        }
        else if(!na11.matches()){
            JOptionPane.showMessageDialog(null, "Enter Marks Correctly");
        }
        else{    
        float m1= Float.parseFloat(Marks2.getText());
        float m2= Float.parseFloat(Marks3.getText());
        float m3= Float.parseFloat(Marks4.getText());
        float m4= Float.parseFloat(Marks5.getText());
        float m5= Float.parseFloat(Marks6.getText());
        float per=m1+m2+m3+m4+m5;
        String remark;
        String email="";
        float total=((per/500)*100);
        
        if(total>=90)
        {
           remark="Excellent"; 
        }
        else if(total>=80)
                {
                   remark="Verry Good"; 
                }
        else if(total>=70)
        {
            remark="Good";
          
        }
        else if(total>=60)
        {
            remark="Satisfactory";
        }
        else if(total>=50)
        {
            remark="Distinction";
        }
        else if(total>=40)
        {
            remark="Pass";
        }
        else
        {
            remark="Fail";
        }
        
        String total1=Float.toString(per);
        String per1=Float.toString(total);
        
        try{
            
                conn c1 = new conn();

                String s1 = "insert into subjects values('"+EnrollmentT1.getText()+"','"+Subject2.getText()+"','"+Subject3.getText()+"','"+Subject4.getText()+"','"+Subject5.getText()+"','"+Subject6.getText()+"','"+RollNoT.getText()+"')";
                String s2 = "insert into marks values('"+EnrollmentT1.getText()+"','"+RollNoT.getText()+"','"+SemesterT.getText()+"','"+Marks2.getText()+"','"+Marks3.getText()+"','"+Marks4.getText()+"','"+Marks5.getText()+"','"+Marks6.getText()+"','"+per1+"','"+total1+"','"+remark+"')";
                String s3 = "insert into students values('"+EnrollmentT1.getText()+"','"+NameT.getText()+"','"+RollNoT.getText()+"','"+SemesterT.getText()+"','"+email+"')";
                c1.s.executeUpdate(s1);
                c1.s.executeUpdate(s2);
                c1.s.executeUpdate(s3);
                
                JOptionPane.showMessageDialog(null,"Marks Inserted Successfully");
                this.setVisible(false);

            
        }catch(Exception e){}
    }//GEN-LAST:event_jButton1ActionPerformed
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
    private javax.swing.JTextField EnrollmentT1;
    private javax.swing.JTextField EnrollmentT3;
    private javax.swing.JTextField Marks2;
    private javax.swing.JTextField Marks3;
    private javax.swing.JTextField Marks4;
    private javax.swing.JTextField Marks5;
    private javax.swing.JTextField Marks6;
    private javax.swing.JTextField NameT;
    private javax.swing.JTextField RollNoT;
    private javax.swing.JTextField SemesterT;
    private javax.swing.JTextField Subject2;
    private javax.swing.JTextField Subject3;
    private javax.swing.JTextField Subject4;
    private javax.swing.JTextField Subject5;
    private javax.swing.JTextField Subject6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
