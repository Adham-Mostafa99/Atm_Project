
package newatm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author el FaYroOoz
 */
public class menu extends javax.swing.JFrame {

    
    public menu() {
        initComponents();
        name.setText(pass.app.Name[pass.app.Number_User]);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        but100 = new javax.swing.JButton();
        but1000 = new javax.swing.JButton();
        but200 = new javax.swing.JButton();
        but2000 = new javax.swing.JButton();
        but400 = new javax.swing.JButton();
        butinq = new javax.swing.JButton();
        butexit = new javax.swing.JButton();
        butcust = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(240, 240, 241));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        name.setText("name");
        name.setAlignmentX(0.5F);
        name.setAlignmentY(0.0F);
        name.setMaximumSize(new java.awt.Dimension(0, 0));
        name.setMinimumSize(new java.awt.Dimension(0, 0));
        name.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, 50));

        but100.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        but100.setForeground(new java.awt.Color(0, 102, 102));
        but100.setText("100");
        but100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but100ActionPerformed(evt);
            }
        });
        getContentPane().add(but100, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, 40));

        but1000.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        but1000.setForeground(new java.awt.Color(0, 102, 102));
        but1000.setText("1000");
        but1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1000ActionPerformed(evt);
            }
        });
        getContentPane().add(but1000, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, 40));

        but200.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        but200.setForeground(new java.awt.Color(0, 102, 102));
        but200.setText("200");
        but200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but200ActionPerformed(evt);
            }
        });
        getContentPane().add(but200, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 40));

        but2000.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        but2000.setForeground(new java.awt.Color(0, 102, 102));
        but2000.setText("2000");
        but2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2000ActionPerformed(evt);
            }
        });
        getContentPane().add(but2000, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 140, 40));

        but400.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        but400.setForeground(new java.awt.Color(0, 102, 102));
        but400.setText("400");
        but400.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but400ActionPerformed(evt);
            }
        });
        getContentPane().add(but400, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, 40));

        butinq.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        butinq.setForeground(new java.awt.Color(0, 102, 102));
        butinq.setText("inqure");
        butinq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butinqActionPerformed(evt);
            }
        });
        getContentPane().add(butinq, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, 40));

        butexit.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        butexit.setForeground(new java.awt.Color(0, 102, 102));
        butexit.setText("exit");
        butexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butexitActionPerformed(evt);
            }
        });
        getContentPane().add(butexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 40));

        butcust.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
        butcust.setForeground(new java.awt.Color(0, 102, 102));
        butcust.setText("customise");
        butcust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butcustActionPerformed(evt);
            }
        });
        getContentPane().add(butcust, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/atm-machine-500x500.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void check_money() {
        pass.app.Check_money();
        if (pass.app.Check == false) {
            new nomony().setVisible(true);
            dispose();
        }
    }

    public void get_money() throws FileNotFoundException, IOException {
        pass.app.Take_money(pass.app.Re_value);
        if (pass.app.ok == true) {
            new passmony().setVisible(true);
            pass.app.Write_Money_File();
            pass.app.Machine_New_Money(pass.app.Machine_Money());
            dispose();
        } else {
            new nomachine().setVisible(true);
        }
        dispose();
    }

    private void but100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but100ActionPerformed
        // TODO add your handling code here:
        pass.app.Re_value = 100;
        check_money();
        if (pass.app.Check == true) {
            try {
                get_money();
            } catch (IOException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_but100ActionPerformed

    private void but200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but200ActionPerformed
        // TODO add your handling code here:
        pass.app.Re_value = 200;
        check_money();
        if (pass.app.Check == true) {
            try {
                get_money();
            } catch (IOException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_but200ActionPerformed

    private void but400ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but400ActionPerformed
        // TODO add your handling code here:
        pass.app.Re_value = 400;
        check_money();
        if (pass.app.Check == true) {
            try {
                get_money();
            } catch (IOException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_but400ActionPerformed

    private void butexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_butexitActionPerformed

    private void but1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1000ActionPerformed
        // TODO add your handling code here:
        pass.app.Re_value = 1000;
        check_money();
        if (pass.app.Check == true) {
            try {
                get_money();
            } catch (IOException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_but1000ActionPerformed

    private void but2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2000ActionPerformed
        // TODO add your handling code here:
        pass.app.Re_value = 2000;
        check_money();
        if (pass.app.Check == true) {
            try {
                get_money();
            } catch (IOException ex) {
                Logger.getLogger(menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_but2000ActionPerformed

    private void butinqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butinqActionPerformed
        // TODO add your handling code here:
        dispose();
        new inqure().setVisible(true);
    }//GEN-LAST:event_butinqActionPerformed

    private void butcustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butcustActionPerformed
        // TODO add your handling code here:
        dispose();
        new custmoze().setVisible(true);
    }//GEN-LAST:event_butcustActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but100;
    private javax.swing.JButton but1000;
    private javax.swing.JButton but200;
    private javax.swing.JButton but2000;
    private javax.swing.JButton but400;
    private javax.swing.JButton butcust;
    private javax.swing.JButton butexit;
    private javax.swing.JButton butinq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
