/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package librarymanagement;
import javax.swing.JOptionPane; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;

import java.util.logging.Logger;
/**
 *
 * @author babus
 */
public class ReturnBook extends javax.swing.JFrame {
 Connection con=Connect.Connection();
        PreparedStatement pst=null;
        java.sql.ResultSet rs=null;
    /**
     * Creates new form ReturnBook
     */
    public ReturnBook() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtsave = new javax.swing.JButton();
        txtbookid = new javax.swing.JTextField();
        txtstdid = new javax.swing.JTextField();
        txtbname = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtstuname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(53, 79, 82));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Return Book");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Id");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 160, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Id");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 150, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Name");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 160, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Issue Date");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 150, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Due Date");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 170, 40));

        txtsave.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        txtsave.setForeground(new java.awt.Color(53, 79, 82));
        txtsave.setText("Return");
        txtsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsaveActionPerformed(evt);
            }
        });
        jPanel2.add(txtsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, 100, 40));
        jPanel2.add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 210, 40));
        jPanel2.add(txtstdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 210, 40));
        jPanel2.add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 210, 40));

        txtissuedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtissuedateActionPerformed(evt);
            }
        });
        jPanel2.add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 410, 210, 40));

        txtduedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtduedateActionPerformed(evt);
            }
        });
        jPanel2.add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 210, 40));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(53, 79, 82));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 100, 40));
        jPanel2.add(txtstuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, 210, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Student Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 140, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 996, 660));

        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaveActionPerformed
        // TODO add your handling code here:
        if(txtstdid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"please enter student id and search it");
            txtstdid.requestFocus();
        }else{
            try {
                pst=con.prepareStatement("Update book set Status=?,issuedate=?,duedate=?,studentid=? where book.id=?");
                pst.setString(1, "Issued");
                pst.setString(2,"");
                pst.setString(3, "");
                pst.setString(4, txtstdid.getText());
                 pst.setString(5, txtbookid.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"book return");
                txtbookid.setText(" ");
                txtissuedate.setText("");
                txtstuname.setText("");
                txtduedate.setText("");
                txtstdid.setText("");
                txtbname.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_txtsaveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(txtstdid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"please enter book id and search it");
            txtstdid.requestFocus();
        }else{
            try {
                pst=con.prepareStatement(" select student.name,book.id,book.name,book.issuedate,book.duedate from book inner join student using(id) where book.id=?");
                pst.setString(1,txtstdid .getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    txtbookid.setText(rs.getString(2));
                    txtstuname.setText(rs.getString(1));
                    txtduedate.setText(rs.getString(5));
                    txtissuedate.setText(rs.getString(4));
                    txtbname.setText(rs.getString(3));
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"please enter valid book id");
                }
            } catch (SQLException ex) {
                Logger.getLogger(IssueBook.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtduedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtduedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduedateActionPerformed

    private void txtissuedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtissuedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtissuedateActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JButton txtsave;
    private javax.swing.JTextField txtstdid;
    private javax.swing.JTextField txtstuname;
    // End of variables declaration//GEN-END:variables
}
