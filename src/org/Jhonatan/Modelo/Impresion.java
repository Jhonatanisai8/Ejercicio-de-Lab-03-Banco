package org.Jhonatan.Modelo;

import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class Impresion {
    
    public static void mostrarInformacion(JTextArea jTextArea, Cliente cliente) {
        jTextArea.setText(
                "Id Cliente         : " + cliente.getIdCliente()
                + "\nNombre Cliente : " + cliente.getNombres()
                + "\nCliente        : " + cliente.getNombres()
                + "\nDireccion      : " + cliente.getDireccion()
                + "\nDni            : " + cliente.getDni()
                + "\nId Banco       : " + cliente.getBanco().getIdBanco()
                + "\nNombre Banco   : " + cliente.getBanco().getDireccion()
                + "\nRuc            : " + cliente.getBanco().getRuc()
                + "\nRuc Banco      : " + cliente.getBanco().getRuc());
    }
    
    public static void mostrarInformacio(JTable table, Cliente cliente) {
        String titulos[] = {"Num", "Numero Tarjeta", "Tipo Tarjeta", "Saldo", "Interes"};
        DefaultTableModel tableModel = new DefaultTableModel(null, titulos);
        table.setModel(tableModel);
        for (int i = 0; i < cliente.getListaTarjetas().size(); i++) {
            tableModel.addRow(cliente.getListaTarjetas().get(i).registro(i + 1));
        }
    }
}
