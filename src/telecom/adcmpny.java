/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telecom;

import java.sql.*;
import javax.swing.*;
import com.mysql.jdbc.Driver;
import java.awt.*;
import java.lang.*;

/**
 *
 * @author 123
 */
public class adcmpny extends javax.swing.JFrame {

    int i = 0;
    String arr[], a1, a2;
    String t, s;

    /**
     * Creates new form adcmpny
     */
    public adcmpny() {
        initComponents();
        setSize(600, 600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD COMPANY");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("CompanyName :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 133, 160, 40);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(158, 308, 80, 29);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(276, 307, 90, 31);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(251, 153, 149, 22);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Pending");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(251, 195, 90, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Accepted");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(371, 195, 80, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Allot Number Series :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 241, 190, 40);

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 36)); // NOI18N
        jLabel3.setText("Add Company");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(151, 23, 209, 57);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Status :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 183, 160, 40);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(250, 250, 100, 22);

        jLabel5.setText("To");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(355, 257, 20, 16);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(390, 250, 100, 22);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telecom/logout.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(395, 307, 83, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telecom/shabby-vintage-paper-powerpoint-templates.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(-6, -26, 980, 630);

        jMenu1.setText("ADD");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Company");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Package");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("UPDATE");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Package");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("DELETE");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Company");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Package");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Welcome().setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a1 = jTextField1.getText();
        a2 = jTextField2.getText();

        if (jRadioButton1.isSelected()) {
            s = jRadioButton1.getText();
        } else if (jRadioButton2.isSelected()) {
            s = jRadioButton2.getText();
        }
        if (t == "--Select--") {
            JOptionPane.showMessageDialog(this, "Please Select any Company.", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else if (a1.equals("") || a2.equals("")) {
            JOptionPane.showMessageDialog(this, "Please fill the Empty Spaces. ", "Error Message", JOptionPane.ERROR_MESSAGE);
        } else {
            long b = Long.parseLong(a1);
            long c = Long.parseLong(a2);
            try {
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/trai", "root", "");
                Statement st = con.createStatement();
                String q1 = "update cmpny set status='" + s + "' where cname='" + t + "';";
                String q2 = "create table " + t + "(cname varchar(2000),num bigint,address varchar(2000),city varchar(2000),state varchar(2000),pincode bigint,IDProof varchar(2000),cstyp varchar(2000),status varchar(2000),SMS varchar(2000),Calls varchar(2000),Roaming varchar(2000),Internet varchar(2000),Hello_Tunes varchar(2000))";
                st.execute(q1);
                st.execute(q2);
                JOptionPane.showMessageDialog(this, "Company '" + t + "' Added To the main list.", "Message Information", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Wait Till The Series is Being Alotted To Company " + t + ".", "Message Information", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e + "", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            while (b <= c) {
                try {
                    Connection con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/trai", "root", "");
                    Statement st1 = con1.createStatement();
                    String q3 = "insert " + t + "(num,status) values(" + b + ",'Inactive');";
                    st1.execute(q3);
                    b++;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e + "", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
            }
            new adcmpny().setVisible(true);
            setVisible(false);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jComboBox1.removeAllItems();

        try {
            jComboBox1.addItem("--Select--");

            Connection con1 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/trai", "root", "");
            Statement st1 = con1.createStatement();
            String q = "select cname from cmpny where status='Pending';";
            ResultSet rs = st1.executeQuery(q);
            arr = new String[50];
            while (rs.next()) {

                arr[i] = rs.getString("Cname");

                jComboBox1.addItem(arr[i]);

                i++;

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e + "", "Error Message", JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        t = jComboBox1.getSelectedItem().toString();        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new adcmpny().setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new adpackage().setVisible(true);
        setVisible(false);         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new uppackage().setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new decmpny().setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new depackage().setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new login().setVisible(true);
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(adcmpny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adcmpny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adcmpny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adcmpny.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new adcmpny().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}