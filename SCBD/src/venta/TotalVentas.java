/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package venta;

/**
 *
 * @author Rodrigo Ortiz
 */
public class TotalVentas extends javax.swing.JFrame {

    /**
     * Creates new form TotalVentas
     */
    public TotalVentas() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRepasajes = new javax.swing.JButton();
        btnReChofer = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnViajes = new javax.swing.JButton();
        jlfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, -1, -1));

        jButton2.setText("Descargar");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pasajes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 20));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Chofer");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buses");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Viajes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        btnRepasajes.setText("Reporte");
        btnRepasajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRepasajesActionPerformed(evt);
            }
        });
        getContentPane().add(btnRepasajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        btnReChofer.setText("Reporte");
        getContentPane().add(btnReChofer, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jButton5.setText("Reporte");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        btnViajes.setText("Reporte");
        getContentPane().add(btnViajes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jlfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reporte.png"))); // NOI18N
        getContentPane().add(jlfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Menu ventana2 = new Menu();
        this.setVisible(false);
        ventana2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRepasajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRepasajesActionPerformed
      
    }//GEN-LAST:event_btnRepasajesActionPerformed

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
            java.util.logging.Logger.getLogger(TotalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TotalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TotalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TotalVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TotalVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReChofer;
    private javax.swing.JButton btnRepasajes;
    private javax.swing.JButton btnViajes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlfondo;
    // End of variables declaration//GEN-END:variables
}
