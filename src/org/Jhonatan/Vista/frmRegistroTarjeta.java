package org.Jhonatan.Vista;

import javax.swing.JOptionPane;
import org.Jhonatan.Modelo.Impresion;
import org.Jhonatan.Modelo.Tarjeta;
import org.Jhonatan.Principal.Main;

public class frmRegistroTarjeta extends javax.swing.JInternalFrame {

    public frmRegistroTarjeta() {
        initComponents();
        Impresion.mostrarInformacion(txaDatos, Main.cliente);
        Impresion.mostrarInformacio(tblDatosTarjeta, Main.cliente);
    }

    private void limpiarEntradas() {
        txtInteres.setText("");
        txtNumeroTarjeta.setText("");
        txtSaldo.setText("");
        cbxTipoTarjeta.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        cbxTipoTarjeta = new javax.swing.JComboBox();
        txtSaldo = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        btnGrabarTarjeta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDatos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosTarjeta = new javax.swing.JTable();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Tarjeta:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtNumeroTarjeta.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtNumeroTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número Tarjeta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 14))); // NOI18N

        cbxTipoTarjeta.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        cbxTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "=Seleccionar=", "Credito", "Debito" }));
        cbxTipoTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Tarjeta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        txtSaldo.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtSaldo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saldo:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 14))); // NOI18N
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        txtInteres.setFont(new java.awt.Font("Courier New", 0, 13)); // NOI18N
        txtInteres.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Interes:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI Semilight", 1, 14))); // NOI18N
        txtInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInteresActionPerformed(evt);
            }
        });

        btnGrabarTarjeta.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGrabarTarjeta.setText("REGISTRAR");
        btnGrabarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxTipoTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNumeroTarjeta)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(txtInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnGrabarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(txtNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnGrabarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        txaDatos.setEditable(false);
        txaDatos.setColumns(20);
        txaDatos.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        txaDatos.setRows(5);
        txaDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane1.setViewportView(txaDatos);

        tblDatosTarjeta.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        tblDatosTarjeta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblDatosTarjeta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void txtInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInteresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInteresActionPerformed

    private void btnGrabarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarTarjetaActionPerformed
        Tarjeta tarjeta;
        tarjeta = new Tarjeta(
                txtNumeroTarjeta.getText(),
                cbxTipoTarjeta.getSelectedItem().toString(),
                Double.parseDouble(txtSaldo.getText()),
                Double.parseDouble(txtInteres.getText()));

        Main.cliente.addTarjeta(tarjeta);
        limpiarEntradas();
        Impresion.mostrarInformacio(tblDatosTarjeta, Main.cliente);
        JOptionPane.showMessageDialog(null, "TARJETA GRABADA", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGrabarTarjetaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGrabarTarjeta;
    private javax.swing.JComboBox cbxTipoTarjeta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDatosTarjeta;
    private javax.swing.JTextArea txaDatos;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtNumeroTarjeta;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
