/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HOTEL;

/**
 *
 * @author Dino Keylas
 */
public class MAIN extends javax.swing.JFrame {

    /**
     * Creates new form MAIN
     */
    public MAIN() {
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

        layer1 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        layer2 = new javax.swing.JLayeredPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        j5 = new javax.swing.JLabel();
        j4 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        j2 = new javax.swing.JLabel();
        j1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layer1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("LAMA MENGINAP");
        layer1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel4.setText("NAMA BELAKANG");
        layer1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel3.setText("NAMA DEPAN");
        layer1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 1, 24)); // NOI18N
        jLabel2.setText("CHECK IN HOTEL MANTAP");
        layer1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 310, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOTEL/hijau.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        layer1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        getContentPane().add(layer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 640, -1));

        layer2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("jLabel9");
        layer2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel8.setText("jLabel8");
        layer2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOTEL/merah.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        layer2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 430));

        getContentPane().add(layer2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 640, 430));

        j5.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        j5.setForeground(new java.awt.Color(240, 240, 240));
        j5.setText("HOME");
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
        });
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        j4.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        j4.setForeground(new java.awt.Color(240, 240, 240));
        j4.setText("GENERATE");
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        j3.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 12)); // NOI18N
        j3.setText("LIHAT KAMAR");
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
        });
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        j2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        j2.setForeground(new java.awt.Color(240, 240, 240));
        j2.setText("CHECK OUT");
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        j1.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        j1.setForeground(new java.awt.Color(240, 240, 240));
        j1.setText("CHECK IN");
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HOTEL/rizky fixx.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        layer1.setVisible(true);
        layer2.setVisible(false);
    }//GEN-LAST:event_j1MouseClicked

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        layer1.setVisible(false);
        layer2.setVisible(true);
    }//GEN-LAST:event_j2MouseClicked

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j3MouseClicked

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j4MouseClicked

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j5MouseClicked

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel j1;
    private javax.swing.JLabel j2;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel j4;
    private javax.swing.JLabel j5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane layer1;
    private javax.swing.JLayeredPane layer2;
    // End of variables declaration//GEN-END:variables
}
