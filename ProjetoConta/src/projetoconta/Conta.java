package projetoconta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab01a
 */
public class Conta {
    private String cliente;
    protected double saldo;

    public Conta() {
    }

    public Conta(String cliente){
        this.cliente = cliente;
    }
    
    public Conta(String cliente, double saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public boolean sacar(double valor){
        if(valor>saldo){
            return false;
        }
        saldo = saldo - valor;
        return true;
    }
    
    public String imprimeSaldo(){
        return "Saldo = " + saldo;
    }
    
    public String imprimeSaldo(boolean comCliente){
        if(comCliente){
            return "Cliente = " + cliente + 
                    "\n" + imprimeSaldo();
        }
        return imprimeSaldo();
    }
    
    
    
    
}
