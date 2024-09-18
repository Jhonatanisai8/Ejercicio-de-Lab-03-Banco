
package org.Jhonatan.Vista;

import javax.swing.JOptionPane;
import org.Jhonatan.Modelo.Cliente;
import org.Jhonatan.Principal.Main;
public class frmRegistroCliente extends javax.swing.JInternalFrame {
    public frmRegistroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtIdCliente = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        btnGrabarDatosCliente = new javax.swing.JButton();
        txtIdBanco = new javax.swing.JTextField();
        txtNombreBanco = new javax.swing.JTextField();
        txtDireccionBanco = new javax.swing.JTextField();
        txtRucBanco = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS DEL CLIENTE:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtIdCliente.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtIdCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID CLIENTE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtNombres.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtDireccion.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtDni.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtDni.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DNI:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        btnGrabarDatosCliente.setBackground(new java.awt.Color(153, 153, 255));
        btnGrabarDatosCliente.setText("REGISTRAR");
        btnGrabarDatosCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarDatosClienteActionPerformed(evt);
            }
        });

        txtIdBanco.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtIdBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID BANCO:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        txtIdBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBancoActionPerformed(evt);
            }
        });

        txtNombreBanco.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtNombreBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "NOMBRE:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        txtNombreBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreBancoActionPerformed(evt);
            }
        });

        txtDireccionBanco.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtDireccionBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DIRECCION:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtRucBanco.setFont(new java.awt.Font("Shruti", 0, 13)); // NOI18N
        txtRucBanco.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RUC:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGrabarDatosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdBanco))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDireccionBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRucBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccionBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGrabarDatosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtRucBanco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 53, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtIdBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBancoActionPerformed

    private void btnGrabarDatosClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarDatosClienteActionPerformed
        // TODO add your handling code here:
        Main.cliente = new Cliente();
        Main.cliente.setIdCliente(Integer.parseInt(txtIdCliente.getText()));
        Main.cliente.setNombres(txtNombres.getText());
        Main.cliente.setDireccion(txtDireccion.getText());
        Main.cliente.setDni(txtDni.getText());
        Main.cliente.getBanco().setIdBanco(Integer.parseInt(txtIdBanco.getText()));
        Main.cliente.getBanco().setNombre(txtNombreBanco.getText());
        Main.cliente.getBanco().setDireccion(txtDireccionBanco.getText());
        Main.cliente.getBanco().setRuc(txtRucBanco.getText());
        JOptionPane.showMessageDialog(null, "CLIENTE REGISTRADO", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGrabarDatosClienteActionPerformed

    private void txtNombreBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreBancoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreBancoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabarDatosCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionBanco;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIdBanco;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNombreBanco;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtRucBanco;
    // End of variables declaration//GEN-END:variables
}
