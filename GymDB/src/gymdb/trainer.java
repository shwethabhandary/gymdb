/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;

/**
 *
 * @author preet
 */
public class trainer extends javax.swing.JFrame {

    /**
     * Creates new form trainer
     */
    public trainer() {
        initComponents();
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField8.setEditable(false);
        jTextField9.setEditable(false);
        jTextField10.setEditable(false);
        jTextField1.setEditable(false);
                
    }
    public trainer(String instrid)
    {
        initComponents();
        jTextField1.setText(instrid);
        
      
        try
        {
            
            Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/gymdb","root","");
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("SELECT * FROM INSTRUCTOR WHERE INSTRID="+instrid+"");
            
            while(r.next())
            {
                String name =r.getString("NAME");
                jTextField2.setText(name);
                
                String gen =r.getString("GENDER");
                jTextField3.setText(gen);
                
                String age =r.getString("AGE");
                jTextField4.setText(age);
                
                String phno =r.getString("PHNO");
                jTextField6.setText(phno);
                
                String addr =r.getString("ADDR");
                jTextField7.setText(addr);
                
                String brnloc =r.getString("BRNLOC");
                jTextField8.setText(brnloc);
                
                String classid =r.getString("CLASSID");
                jTextField9.setText(classid);
                
                String rating =r.getString("RATING");
                jTextField10.setText(rating);
                
                String email =r.getString("EMAIL");
                jTextField5.setText(email);
                
               
            
            
                
                
                
                
                
                
                
                
                
                
                
                
                
            }
        
        }
        catch(Exception e)
        {
            
        }
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("RATING :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(540, 150, 270, 31);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(540, 200, 270, 27);

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(540, 250, 270, 27);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(540, 290, 270, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(540, 333, 270, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(540, 380, 270, 28);

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField8);
        jTextField8.setBounds(540, 430, 270, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(540, 480, 270, 29);

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField10);
        jTextField10.setBounds(540, 530, 270, 32);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("TRAINER ID :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(420, 150, 113, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("NAME :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(410, 210, 113, 27);

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("GENDER :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 250, 98, 27);

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("AGE :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 290, 98, 27);

        jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("ADDRESS :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 380, 106, 28);

        jLabel6.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("PHONE NO :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(410, 330, 106, 31);

        jLabel7.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("BRANCH LOCATION :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(340, 430, 181, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("CLASS ID :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(350, 530, 171, 29);

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("RATING :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(350, 480, 171, 32);

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        getContentPane().add(jTextField5);
        jTextField5.setBounds(540, 580, 270, 31);

        jLabel11.setFont(new java.awt.Font("Lucida Handwriting", 0, 80)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TRAINER DETAILS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(220, 0, 820, 100);

        jButton1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 640, 136, 32);

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("EMAIL :");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(370, 580, 147, 31);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gymdb/pics/Capture7.PNG"))); // NOI18N
        jLabel13.setText("jLabel13");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(0, -6, 1420, 790);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        first f=new first();
        f.setVisible(true);
        f.setExtendedState(f.getExtendedState()|JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(trainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                trainer trai=new trainer();
                trai.setVisible(true);
                trai.setExtendedState(trai.getExtendedState()|JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
