/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfase;

import Common.Enums;
import Common.cJugador;
import Common.Utilidades;
import Common.cDatosException;
import Common.cUsuario;
import Dominio.dEmpresa;
import Patrones.FabricaUsuarios;
import Persistencia.pDatosException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maxi
 */
public class vRegistro extends javax.swing.JFrame {
    private dEmpresa laEmpresa;
    /**
     * Creates new form vRegistro
     */
    public vRegistro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableAltaCliente = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblCant2 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        dFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Alta de Clientes"));

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Id: ");

        jLabel2.setText("Nombre:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnAgregar.setText("Registrarme");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Password:");

        jLabel4.setText("Repeat Pass:");

        txtPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword1ActionPerformed(evt);
            }
        });

        tableAltaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Born"
            }
        ));
        tableAltaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAltaClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableAltaCliente);

        jLabel5.setText("Fecha Nacimiento:");

        btnModificar.setText("Modificar");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel6.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel7.setText("Apellido");

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnReset)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnModificar)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAgregar)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCant2)
                                        .addComponent(dFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(25, 25, 25)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblCant2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReset)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnAgregar)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("ABM Cliente", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(this.btnAgregar.getText().equals("Agregar")) {
            try {
                AgregarNuevoUsuario();
            } catch (Exception ex) {
                Logger.getLogger(vRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                EliminarUsuario();
            } catch (Exception ex) {
                Logger.getLogger(vRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1ActionPerformed

    private void tableAltaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAltaClienteMouseClicked
        // TODO add your handling code here:
        int fila = this.tableAltaCliente.getSelectedRow();

        if (fila >= 0) {
            DefaultTableModel tm = (DefaultTableModel) this.tableAltaCliente.getModel();
            int numFilas = tm.getRowCount();
            if ((fila < numFilas) && (fila >= 0)) {

                // tomo los datos de los tipos existentes
                String id = String.valueOf(tm.getValueAt(fila, 0));
                String Nombre = (String) tm.getValueAt(fila, 1);
                FabricaUsuarios fu = null;
                cUsuario user = fu.getFactoryInstance(Enums.Gerarquia.USUARIO);
                int Id = Integer.parseInt(id);
                user.setId(Id);
                try {
                    user = (cUsuario) laEmpresa.buscarUsuario(user);
                } catch (cDatosException ex) {
                    Logger.getLogger(vRegistro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(vRegistro.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception ex) {
                    Logger.getLogger(vRegistro.class.getName()).log(Level.SEVERE, null, ex);
                }
                CargarUsuario(user);
            }
        }
        ChangeBoton(true);
    }//GEN-LAST:event_tableAltaClienteMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        LimpiarCampos();
        this.ChangeBoton(false);
    }//GEN-LAST:event_btnResetActionPerformed
    private void ChangeBoton(boolean bool)
    {
        if(bool == false){
            this.btnAgregar.setText("Agregar");
            this.btnModificar.setVisible(bool);
        }else{
            this.btnAgregar.setText("Eliminar");
            this.btnModificar.setVisible(bool);
        }
        
    }
    private void AgregarNuevoUsuario() throws Exception{
        cUsuario unUsuario;
         //**************************/
        FabricaUsuarios fu = null;
         //**************************/
        int num;
        try{
            //Verifica el Ingreso de los Datos Requeridos
            if(Utilidades.passLengthTrust(this.txtPassword.getText(), this.txtPassword1.getText())){
                if(Utilidades.pass1pass2Trust(this.txtPassword.getText(), this.txtPassword1.getText())){
                    if(Utilidades.camposCompletos(this.txtNombre.getText(), this.txtApellido.getText(), this.txtEmail.getText(), this.txtPassword.getText(), this.txtPassword1.getText())){
                        if(Utilidades.validarFecha(Utilidades.FormatearFechaToString(this.dFecha.getDate()))){
                        String ID = this.txtId.getText();
                        Date Fecha = Utilidades.FormatearFechaToDate(Utilidades.FormatearFechaToString(this.dFecha.getDate()));
                        //**************************/
                        cUsuario user = fu.getFactoryInstance(Enums.Gerarquia.USUARIO);
                         //**************************/
                        num = Integer.parseInt(this.txtId.getText());
                        user.setId(num);
                        user.setNombre(this.txtNombre.getText());
                        user.setApellido(this.txtApellido.getText());
                        user.setEmail(this.txtEmail.getText());
                        user.setPassword(this.txtPassword.getText());
                        user.setFechanacido(Fecha);
                        laEmpresa.agregarUsuario(user);
                        this.cargarClientes();
                        this.LimpiarCampos();
                        //this.miObservador.setChang("Se Agrego Nuevo Cliente.");
                        JOptionPane.showMessageDialog(this, "Se dado de alta correctamente", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                    }

                    }else{
                        JOptionPane.showMessageDialog(this, "Debes Completar todos los Campos /n antes de proseguir.", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Las Contraseñas no Coinciden. \n Por Favor Verifica", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "El Largo de tu contraeña " + "/n debe ser de 6 o mas.", "Tipo", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            Logger.getLogger(pDatosException.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void EliminarUsuario() throws Exception{
        cUsuario unUsuario;
        int num;
        try{
            //Verifica el Ingreso de los Datos Requeridos
            if(this.txtId.getText().length()>0 && this.txtNombre.getText().length() > 0 ){
                    String ID = this.txtId.getText();
                    unUsuario = new cUsuario();
                    num = Integer.parseInt(this.txtId.getText());
                    unUsuario = new cUsuario();
                    unUsuario.setId(num);
                    laEmpresa.eliminarUsuario(unUsuario);
                    this.cargarClientes();
                    this.LimpiarCampos();
                    ChangeBoton(false);
                    JOptionPane.showMessageDialog(this, "Se ha Eliminado Correctamente!", "Tipo", JOptionPane.INFORMATION_MESSAGE);
                }

        }catch(Common.cDatosException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(vRegistro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void cargarClientes() throws cDatosException, ParseException, Exception{
        ArrayList <cUsuario> losUsuarios = new ArrayList();
        losUsuarios = laEmpresa.buscarTodosUsuarios();
        try {
            //Iterator<cProducto> it = losProductos.iterator();
            //Capturo el Modelo
            DefaultTableModel tm = (DefaultTableModel) tableAltaCliente.getModel();
            //Vacio las Rows
            tm.setRowCount(0);
            //Recorro la Lista
            for(cUsuario user:losUsuarios){
                //Agrego una Nueva Row
                tm.addRow(new Object[]{new Integer(user.getId()), new String(user.getNombre()), new String(Utilidades.FormatearFechaToString(user.getFechanacido()))});
                tableAltaCliente.setModel(tm);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Tipo", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void CargarUsuario(cUsuario pUser){
        this.txtId.setText(String.valueOf(pUser.getId()));
        this.txtNombre.setText(pUser.getNombre());
        this.txtApellido.setText(pUser.getApellido());
        this.txtPassword.setText(pUser.getPassword());
        this.txtEmail.setText(pUser.getEmail());
        this.dFecha.setDate(pUser.getFechanacido());
    }
    private void LimpiarCampos(){
        this.txtId.setText("");
        this.txtNombre.setText("");
        this.txtApellido.setText("");
        this.txtPassword.setText("");
        this.txtPassword1.setText("");
        this.txtEmail.setText("");
        this.dFecha.cleanup();
        this.txtNombre.setFocusable(true);
    }
    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

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
            java.util.logging.Logger.getLogger(vRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JDateChooser dFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel lblCant2;
    javax.swing.JTable tableAltaCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPassword1;
    // End of variables declaration//GEN-END:variables
}