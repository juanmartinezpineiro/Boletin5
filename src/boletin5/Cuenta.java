/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5;

/**
 *
 * @author Juan Martínez
 */
public class Cuenta {
    //primero declaramos datos de la cuenta, las variables
    
    private String nombreCliente;
    private String numeroCuenta;
    private double saldo;
    
    //ccnstructor por defecto
    
    public Cuenta () {
        
    }
    
    //constructor con los parametros
    
    public Cuenta (String nombreCliente,String numeroCuenta,double saldo){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    //declarar setters y getters

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    //Metodo ingreso
    
    public double Ingresar (double cantidad){
        double ingreso = cantidad + saldo;
        return ingreso;
        
    }
}
