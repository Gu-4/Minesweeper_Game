/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper_game;

import java.awt.Color;

/**
 *
 * @author Gursimrat Kaur
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        e = new javax.swing.JButton();
        m = new javax.swing.JButton();
        h = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minesweeper_game/Title-Photoroom.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        e.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        e.setText("Easy");
        e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eActionPerformed(evt);
            }
        });
        getContentPane().add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 70, 30));

        m.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        m.setText("Medium");
        m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mActionPerformed(evt);
            }
        });
        getContentPane().add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 90, 30));

        h.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        h.setText("Hard");
        h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hActionPerformed(evt);
            }
        });
        getContentPane().add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Level:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minesweeper_game/bgd.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-290, -140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eActionPerformed
        new Minesweeper_Game(9, 20).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_eActionPerformed

    private void mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mActionPerformed
        new Minesweeper_Game(16, 80).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_mActionPerformed

    private void hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hActionPerformed
        new Minesweeper_Game(24, 99).setVisible(true);
    this.dispose();
    }//GEN-LAST:event_hActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton e;
    private javax.swing.JButton h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton m;
    // End of variables declaration//GEN-END:variables
}
