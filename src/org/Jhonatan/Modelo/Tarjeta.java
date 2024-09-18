package org.Jhonatan.Modelo;

public class Tarjeta {

    private String numeroTarjeta;
    private String tipoTarjeta;
    private double saldo;
    private double interes;

    public Tarjeta() {
    }

    public Tarjeta(String numeroTarjeta, String tipoTarjeta, double saldo, double interes) {
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.saldo = saldo;
        this.interes = interes;
    }

    public Object[] registro(int num) {
        Object fila[] = {num, numeroTarjeta, tipoTarjeta, saldo, interes};
        return fila;
    }

    public String getNumeroTarjeta() {return numeroTarjeta; }
    public void setNumeroTarjeta(String numeroTarjeta) {this.numeroTarjeta = numeroTarjeta;}
    public String getTipoTarjeta() {return tipoTarjeta;}
    public void setTipoTarjeta(String tipoTarjeta) {this.tipoTarjeta = tipoTarjeta;}
    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public double getInteres() {return interes;}
    public void setInteres(double interes) {this.interes = interes; }

}
