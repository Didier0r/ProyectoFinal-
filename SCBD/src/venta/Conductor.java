/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package venta;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Didier Recalde 
 */
public class Conductor extends javax.swing.JFrame {
    
    ResultSet resultado;
    Controlador controlador;
    String objeto = "chofer";
    String id = "id";
    String cadenaSQL = null;
    boolean editar = false;
    int estado = 0;
    int gencod = 0;
    /**
     * Creates new form Conductor
     */

    public Conductor() {
        initComponents();
        setTitle("Formulario del conductor ");
        setLocationRelativeTo(null);
        controlador = new Controlador();
        recuperarConductor();
        limpiar();
        bloquear();
        combo();
        btnactualizar.setEnabled(false);
        inicializar();
    }
 
    
    
     void combo(){
        //this.AC.removeAllItems();

        
    }
    
    
  
    void limpiar(){
        txtCI.setText("");
        txtNombre.setText("");
        
        txtTele.setText("");
        txtFechaNa.setText("");
    }
    
     public void inicializar() {
        gencod = controlador.generarCodigo(objeto, id);
        txtid.setText(String.valueOf(gencod));
        cadenaSQL = "SELECT id,marca FROM buses ORDER BY id";
        controlador.CargarJComboBox(boxAB, cadenaSQL);
        txtCI.setText("0");
        txtNombre.setText("1");
        txtFechaNa.setText("0");
        txtTele.setText("0");
        txtCI.setText("0");
  
        
        recuperarConductor();
    }
    
    void bloquear(){
         txtCI.setEnabled(false);
        txtNombre.setEnabled(false);
        
        txtTele.setEnabled(false);
        txtFechaNa.setEnabled(false);
        boxAB.setEnabled(false);
        btnnuevo.setEnabled(true);
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);        
    }
    
    void habilitar(){
        txtCI.setEnabled(true);
        txtNombre.setEnabled(true);
        
        txtTele.setEnabled(true);
        txtFechaNa.setEnabled(true);
        boxAB.setEnabled(true);
        btnnuevo.setEnabled(false);
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);        
    }
    
    void actualizar(){
        txtCI.setEnabled(true);
        txtNombre.setEnabled(true);
        
        txtTele.setEnabled(true);
        txtFechaNa.setEnabled(true);
        boxAB.setEnabled(true);
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        txtCI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTele = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaNa = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tconductor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btnmostar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        boxAB = new javax.swing.JComboBox();
        btnactualizar = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("Modificar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conductor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CI");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        txtCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCIActionPerformed(evt);
            }
        });
        getContentPane().add(txtCI, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 144, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 177, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefono: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        txtTele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleActionPerformed(evt);
            }
        });
        getContentPane().add(txtTele, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 108, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha de Nacimiento: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, -1, -1));

        txtFechaNa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNaActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaNa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 103, -1));

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 83, -1));

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 83, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 83, -1));

        btnmenu.setText("RMenu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 83, -1));

        tconductor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "CI", "FechaNaci", "Tel", "AsigBus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tconductor.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(tconductor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 742, 104));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Buscar: ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyReleased(evt);
            }
        });
        getContentPane().add(txtbusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 175, -1));

        btnmostar.setText("Mostrar Todos");
        btnmostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostarActionPerformed(evt);
            }
        });
        getContentPane().add(btnmostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Asignar Bus: ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        boxAB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar..." }));
        boxAB.setToolTipText("");
        boxAB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxABActionPerformed(evt);
            }
        });
        getContentPane().add(boxAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 119, -1));

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        txtid.setEnabled(false);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 112, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("ID: ");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pagina.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 800, 500));

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

    private void txtCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCIActionPerformed
        // TODO add your handling code here:
        txtCI.requestFocus();
    }//GEN-LAST:event_txtCIActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
        txtNombre.requestFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtTeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleActionPerformed
        // TODO add your handling code here:
        txtTele.requestFocus();
    }//GEN-LAST:event_txtTeleActionPerformed

    private void txtFechaNaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNaActionPerformed
        // TODO add your handling code here:
        txtFechaNa.requestFocus();
    }//GEN-LAST:event_txtFechaNaActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        String id = txtid.getText();
String nombre = txtNombre.getText();
String Fechanaci = txtFechaNa.getText();
String telefono = txtTele.getText();
String CI = txtCI.getText();
String bus = ((ComboBox) boxAB.getSelectedItem()).getNombre();

if (nombre.isEmpty() || Fechanaci.isEmpty() || telefono.isEmpty()) {
    String mensaje = "Todos los datos son obligatorios!";
    JOptionPane.showMessageDialog(this, mensaje);
    return;
}

if (!editar) {
    cadenaSQL = "INSERT INTO chofer VALUES (";
    cadenaSQL += id + ",'";
    cadenaSQL += nombre + "','";
    cadenaSQL += Fechanaci + "',";
    cadenaSQL += CI + ",'";
    cadenaSQL += telefono + "','";
    cadenaSQL += bus + "')";
} else {
    cadenaSQL = "UPDATE chofer SET ";
    cadenaSQL += "nombre='" + nombre + "',";
    cadenaSQL += "FechaNacimiento='" + Fechanaci + "',";
    cadenaSQL += "Telefono='" + telefono + "',";
    cadenaSQL += "CI='" + CI + "',";
    cadenaSQL += "BusAsig='" + bus + "'";
    cadenaSQL += " WHERE id=" + id;
}

boolean operacion = controlador.actualizar(cadenaSQL);
System.err.println("Operacion: " + operacion);
inicializar();

        
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        // TODO add your handling code here:
        new Menu().setVisible(true);  this.dispose();
    }//GEN-LAST:event_btnmenuActionPerformed

    private void txtbusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyReleased
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtbusquedaKeyReleased

    private void btnmostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostarActionPerformed
        // TODO add your handling code here:
        txtbusqueda.setText("");
       
    }//GEN-LAST:event_btnmostarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
       
        
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int fil=tconductor.getSelectedRow();
        if(fil>=0){
            txtid.setText(tconductor.getValueAt(fil, 0).toString());
            txtCI.setText(tconductor.getValueAt(fil, 1).toString());
            txtNombre.setText(tconductor.getValueAt(fil, 2).toString());
            
            txtTele.setText(tconductor.getValueAt(fil, 3).toString());
            txtFechaNa.setText(tconductor.getValueAt(fil, 4).toString());
            boxAB.setSelectedItem(tconductor.getValueAt(fil, 5));
            actualizar();
        }
        else{
            JOptionPane.showMessageDialog(null,"No Se A Seleccionado Una Fila");
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void boxABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxABActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxABActionPerformed
       
     public void recuperarConductor() {
        String cadenaSQL = "SELECT * FROM chofer";
        controlador.cargarJTable((DefaultTableModel) tconductor.getModel(), cadenaSQL);
        tconductor.getColumnModel().getColumn(0).setPreferredWidth(50);
        tconductor.getColumnModel().getColumn(1).setPreferredWidth(350);
        tconductor.getColumnModel().getColumn(2).setPreferredWidth(100);
        tconductor.getColumnModel().getColumn(3).setPreferredWidth(100);
        tconductor.getColumnModel().getColumn(4).setPreferredWidth(100);
        tconductor.getColumnModel().getColumn(5).setPreferredWidth(100);
     
    }
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conductor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxAB;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnmostar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tconductor;
    private javax.swing.JTextField txtCI;
    private javax.swing.JTextField txtFechaNa;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTele;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

    
}
