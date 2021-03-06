
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hansi
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public Student() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        t_sn = new javax.swing.JTextField();
        t_n = new javax.swing.JTextField();
        t_a = new javax.swing.JTextField();
        t_dob = new javax.swing.JTextField();
        b_s = new javax.swing.JButton();
        b_u = new javax.swing.JButton();
        b_sr = new javax.swing.JButton();
        b_d = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Number");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Date Of Birth");

        t_sn.setBackground(new java.awt.Color(204, 255, 255));
        t_sn.setText("Type Here");
        t_sn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_snMouseClicked(evt);
            }
        });
        t_sn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_snActionPerformed(evt);
            }
        });

        t_n.setBackground(new java.awt.Color(204, 255, 255));
        t_n.setText("Type Here");
        t_n.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_nMouseClicked(evt);
            }
        });

        t_a.setBackground(new java.awt.Color(204, 255, 255));
        t_a.setText("Type Here");
        t_a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_aMouseClicked(evt);
            }
        });
        t_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_aActionPerformed(evt);
            }
        });

        t_dob.setBackground(new java.awt.Color(204, 255, 255));
        t_dob.setText("Type Here");
        t_dob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_dobMouseClicked(evt);
            }
        });
        t_dob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dobActionPerformed(evt);
            }
        });

        b_s.setBackground(new java.awt.Color(153, 153, 153));
        b_s.setText("Save");
        b_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_sActionPerformed(evt);
            }
        });

        b_u.setBackground(new java.awt.Color(153, 153, 153));
        b_u.setText("Update");
        b_u.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_uActionPerformed(evt);
            }
        });

        b_sr.setBackground(new java.awt.Color(153, 153, 153));
        b_sr.setText("Search");
        b_sr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_srActionPerformed(evt);
            }
        });

        b_d.setBackground(new java.awt.Color(153, 153, 153));
        b_d.setText("Delete");
        b_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_dActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Register for subject");

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Click Here");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Register for Class");

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("Click Here");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Help");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_sn)
                            .addComponent(t_n)
                            .addComponent(t_a)
                            .addComponent(t_dob)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(b_s, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(b_u)
                .addGap(18, 18, 18)
                .addComponent(b_sr)
                .addGap(18, 18, 18)
                .addComponent(b_d, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(t_sn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(t_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(t_dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_s)
                    .addComponent(b_u)
                    .addComponent(b_sr)
                    .addComponent(b_d))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_nMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_nMouseClicked
        // TODO add your handling code here:
        t_n.setText(null);
        
    }//GEN-LAST:event_t_nMouseClicked

    private void t_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_aActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_t_aActionPerformed

    private void t_dobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dobActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_t_dobActionPerformed

    private void t_aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_aMouseClicked
        // TODO add your handling code here:
          t_a.setText(null);
    }//GEN-LAST:event_t_aMouseClicked

    private void t_dobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_dobMouseClicked
        // TODO add your handling code here:
          t_dob.setText(null);
    }//GEN-LAST:event_t_dobMouseClicked

    private void b_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_sActionPerformed
        try {
            // TODO add your handling code here:
            DB.iud("insert into student values ('"+t_sn.getText()+"','"+t_n.getText()+"','"+t_a.getText()+"','"+t_dob.getText()+"')" );
        } catch (Exception ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "Saved");
        t_sn.setText(null);
            t_n.setText(null);
            t_a.setText(null);
            t_dob.setText(null);
    }//GEN-LAST:event_b_sActionPerformed

    private void b_uActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_uActionPerformed
        // TODO add your handling code here:
        try {
            String sn = t_sn.getText();
            String n = t_n.getText();
            String a = t_a.getText();
            String dob = t_dob.getText();
           
            Connection c = MyDB.getDBCon();
            Statement s = c.createStatement();
            s.executeUpdate("Update student set name ='"+n+"', address ='"+a+"', dob ='"+dob+"'where sno ='"+sn+"'");
            t_sn.setText(null);
            t_n.setText(null);
            t_a.setText(null);
            t_dob.setText(null);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog(this, "Updated");
    }//GEN-LAST:event_b_uActionPerformed

    private void t_snMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_snMouseClicked
        // TODO add your handling code here:
       t_sn.setText(null);
         try {
            ResultSet rs = DB.search("select count(sno) as x from student");
            if(rs.next()){
                int rowcount = rs.getInt("x");
                rowcount++;
                t_sn.setText("ST-"+rowcount);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_t_snMouseClicked

    private void b_srActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_srActionPerformed
        // TODO add your handling code here:
            String sn = t_sn.getText();
        try {
            Connection c = MyDB.getDBCon();
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select * from student where sno = '"+sn+"'");
            if(rs.next()){
                t_n.setText(rs.getString("name"));
                t_a.setText(rs.getString("address"));
                t_dob.setText(rs.getString("dob"));
           } else{
                JOptionPane.showConfirmDialog(this, "Unknown ID");
                t_sn.setText(null);
            }
        }catch (Exception e) {
            e.printStackTrace();
        
        }
        
    
    }//GEN-LAST:event_b_srActionPerformed

    private void b_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_dActionPerformed
        // TODO add your handling code here:
         String sn = t_sn.getText();
        try {
            Connection c = MyDB.getDBCon();
            Statement s = c.createStatement();
            s.executeUpdate("delete from student where sno ='"+sn+"'");
            JOptionPane.showMessageDialog(this, "Deleted");
        } catch (Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_b_dActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Subject s = new Subject();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_snActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_snActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_t_snActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Class c = new Class();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Help h = new Help();
        h.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.hide();
        JPanel j = new JPanel();
        j.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_d;
    private javax.swing.JButton b_s;
    private javax.swing.JButton b_sr;
    private javax.swing.JButton b_u;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField t_a;
    private javax.swing.JTextField t_dob;
    private javax.swing.JTextField t_n;
    private javax.swing.JTextField t_sn;
    // End of variables declaration//GEN-END:variables

 
}
       

