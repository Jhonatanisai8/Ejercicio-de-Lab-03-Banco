package org.Jhonatan.Modelo;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cliente {
    private int idCliente;
    private String nombres;
    private String direccion;
    private String dni;
    private Banco banco;
    private List<Tarjeta> listaTarjetas;
    
    public Cliente() {
        banco = new Banco();
        listaTarjetas = new ArrayList<>();
    }
    
    public int getIdCliente() {return idCliente;}
    public void setIdCliente(int idCliente) {this.idCliente = idCliente; }
    public String getNombres() {return nombres; }
    public void setNombres(String nombres) {this.nombres = nombres; }
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public String getDni() {return dni;}
    public void setDni(String dni) {this.dni = dni;}
    public List<Tarjeta> getListaTarjetas() {return listaTarjetas; }
    public void setListaTarjetas(List<Tarjeta> listaTarjetas) {this.listaTarjetas = listaTarjetas;}
    public void addTarjeta(Tarjeta tarjeta) {
        if (listaTarjetas.size() <= 10) {
            listaTarjetas.add(tarjeta);
        } else {
            JOptionPane.showMessageDialog(null, "Se tiene 10 Tarjetas Registradas. Llego al limite", "ATENCION", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void setBanco(Banco banco) {this.banco = banco;}
    public Banco getBanco() {return banco;}

}
