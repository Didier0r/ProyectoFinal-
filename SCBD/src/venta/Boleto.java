/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package venta;
import venta.ComboBox;
import venta.ComboBoxT;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Didier Recalde 
 */
public class Boleto extends javax.swing.JFrame {
    
    ResultSet resultado;
    Controlador controlador;
    String objeto = "pasajes";
    String id = "id";
    String cadenaSQL = null;
    boolean editar = false;
    int estado = 0;
    int gencod = 0;
    java.util.Date fechaActual;
    private Statement sentencia;
    
    
    public Boleto() {
        initComponents();
        setTitle("Formulario de pasajes");
        setLocationRelativeTo(null);
        controlador = new Controlador();
        
        fechaActual = new java.util.Date();
        inicializar();
        recuperarBoletos();
        limpiar();
        bloquear();
    
    }
    
    
    void limpiar(){
        txtNombre.setText("");
        txtcosto.setText("");
        txtasien.setText("");
        txtfech.setText("");
    }
    
       public void inicializar() {
        gencod = controlador.generarCodigo(objeto, id);
        txtid.setText(String.valueOf(gencod));
        
        cadenaSQL = "SELECT id,salida FROM viajes ORDER BY id";
        controlador.CargarJComboBox(boxorigen, cadenaSQL);
        cadenaSQL = "SELECT id,horario FROM viajes ORDER BY id";
        controlador.CargarJComboBox(boxhora, cadenaSQL);
        cadenaSQL = "SELECT id,destino FROM viajes ORDER BY id";
        controlador.CargarJComboBox(boxdesti, cadenaSQL);
        txtcosto.setText("0");
        txtNombre.setText("1");
        txtasien.setText("0");
        txtfech.setText("0");
        recuperarBoletos();
    }
    
    void bloquear(){
        txtNombre.setEnabled(false);
        txtcosto.setEnabled(false);
        txtasien.setEnabled(false);
        boxorigen.setEnabled(false);
        boxdesti.setEnabled(false);
        boxhora.setEnabled(false);
        txtfech.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);        
    }
    
    void habilitar(){
        txtNombre.setEnabled(true);
        txtcosto.setEnabled(true);
        txtasien.setEnabled(true);
        boxorigen.setEnabled(true);
        boxdesti.setEnabled(true);
        boxhora.setEnabled(true);
        txtfech.setEnabled(true);
        btnnuevo.setEnabled(false);
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);        
    }
    
    void actualizar(){
        txtNombre.setEnabled(true);
        txtcosto.setEnabled(true);
        txtasien.setEnabled(true);
        boxorigen.setEnabled(true);
        boxdesti.setEnabled(true);
        boxhora.setEnabled(true);
        txtfech.setEnabled(true);
        btnactualizar.setEnabled(true);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Label1 = new javax.swing.JLabel();
        Label3 = new javax.swing.JLabel();
        Label4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        txtasien = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtfech = new javax.swing.JTextField();
        btnmenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        boxorigen = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        boxdesti = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        boxhora = new javax.swing.JComboBox();
        btnactualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tboleto = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Boleto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label1.setForeground(new java.awt.Color(0, 0, 0));
        Label1.setText("Nombre del Pasajero: ");
        getContentPane().add(Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        Label3.setForeground(new java.awt.Color(0, 0, 0));
        Label3.setText("Costo:");
        getContentPane().add(Label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        Label4.setForeground(new java.awt.Color(0, 0, 0));
        Label4.setText("N° Asiento: ");
        getContentPane().add(Label4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 113, -1));

        txtcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 124, -1));

        txtasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtasienActionPerformed(evt);
            }
        });
        getContentPane().add(txtasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 115, -1));

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 83, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 83, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 83, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Fecha: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        txtfech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechActionPerformed(evt);
            }
        });
        getContentPane().add(txtfech, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 125, -1));

        btnmenu.setText("RMenu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 83, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Origen: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, -1));

        boxorigen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciona.." }));
        boxorigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxorigenActionPerformed(evt);
            }
        });
        getContentPane().add(boxorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 125, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Destino: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, -1, 10));

        boxdesti.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona.." }));
        boxdesti.setToolTipText("");
        boxdesti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxdestiActionPerformed(evt);
            }
        });
        getContentPane().add(boxdesti, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 115, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Horario: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        boxhora.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona.." }));
        boxhora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxhoraActionPerformed(evt);
            }
        });
        getContentPane().add(boxhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 125, 25));

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ID: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        txtid.setEnabled(false);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 124, -1));

        tboleto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Costo", "Numasien", "Origen", "Destino", "Hora", "Linea", "Fecha "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tboleto);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 734, 121));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clientes.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
 
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        limpiar();
        bloquear();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        txtNombre.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoActionPerformed
        // TODO add your handling code here:
        txtcosto.requestFocus();
    }//GEN-LAST:event_txtcostoActionPerformed

    private void txtasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtasienActionPerformed
        // TODO add your handling code here:
        txtasien.requestFocus();
    }//GEN-LAST:event_txtasienActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
            // TODO add your handling code here:
            
        String id = txtid.getText();
        String costo = txtcosto.getText();
        String nombre  = txtNombre.getText();
        String numasiento = txtasien.getText();
        String fecha  = txtfech.getText();
        
        String destino = ((ComboBox) boxdesti.getSelectedItem()).getNombre();
        String origen = ((ComboBox) boxorigen.getSelectedItem()).getNombre();
        String horario = ((ComboBox) boxhora.getSelectedItem()).getId();


        


        if (nombre.isEmpty() || costo.isEmpty() || numasiento.isEmpty()) {
            String mensaje = "Todos los datos son obligatorios!";
            JOptionPane.showMessageDialog(this, mensaje);
            return;
        }

    if (!editar) {
        cadenaSQL = "INSERT INTO pasajes VALUES (";
        cadenaSQL += id + ",'";
        cadenaSQL += nombre + "',";
        cadenaSQL += costo + ",";
        cadenaSQL += numasiento + ",'";
        cadenaSQL += horario + "','";
        cadenaSQL += fecha + "','";
        cadenaSQL += origen + "','";
        
        cadenaSQL += destino + "')";
    } else {

        cadenaSQL = "UPDATE pasajes SET ";
        cadenaSQL += "nombre='" + nombre + "',";
        cadenaSQL += "costo=" + costo + ",";
        cadenaSQL += "numasiento=" + numasiento + ",";
        cadenaSQL += "origen='" + origen + "',";
        cadenaSQL += "destino='" + destino + "',";
        cadenaSQL += "horario='" + horario + "',";
        
        cadenaSQL += "fecha='" + fecha + "'";
        cadenaSQL += " WHERE id=" + id;
    }
        boolean operacion = controlador.actualizar(cadenaSQL);
        System.err.println("Operacion: " + operacion);
        inicializar();
        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
 
       
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void boxorigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxorigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxorigenActionPerformed

    private void boxhoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxhoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxhoraActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
       new Menu().setVisible(true);  this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void boxdestiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxdestiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxdestiActionPerformed

    private void txtfechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechActionPerformed

    public void recuperarBoletos() {
        String cadenaSQL = "SELECT * FROM pasajes";
        controlador.cargarJTable((DefaultTableModel) tboleto.getModel(), cadenaSQL);
        tboleto.getColumnModel().getColumn(0).setPreferredWidth(50);
        tboleto.getColumnModel().getColumn(1).setPreferredWidth(350);
        tboleto.getColumnModel().getColumn(2).setPreferredWidth(100);
        tboleto.getColumnModel().getColumn(3).setPreferredWidth(100);
        tboleto.getColumnModel().getColumn(4).setPreferredWidth(100);
        tboleto.getColumnModel().getColumn(5).setPreferredWidth(100);
        tboleto.getColumnModel().getColumn(6).setPreferredWidth(100);
        tboleto.getColumnModel().getColumn(7).setPreferredWidth(100);
        
    }
    

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
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boleto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label1;
    private javax.swing.JLabel Label3;
    private javax.swing.JLabel Label4;
    private javax.swing.JComboBox boxdesti;
    private javax.swing.JComboBox boxhora;
    private javax.swing.JComboBox boxorigen;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable tboleto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtasien;
    private javax.swing.JTextField txtcosto;
    private javax.swing.JTextField txtfech;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    
    

    
}
