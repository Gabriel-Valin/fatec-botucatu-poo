/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Lab01a
 */
public class Aula4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
    public class Conta {
        private String cliente;
        protected double saldo;
        
        public Conta() {
            saldo = 0.0;
        }
        
        public Conta(String client) {
            this.cliente = cliente;
        }
        
        public Conta(String cliente, double saldo){
            this.cliente = cliente;
            this.saldo = saldo;
        }
        
        public String getCliente() {
            return cliente;
        }
        
        public void setCliente(String client) {
            this.cliente = cliente;
        }
        
        public double getSaldo() {
            return saldo;
        }
        
        public void depositar(double valorDeposito) {
            saldo += valorDeposito;
        }
        
        public boolean sacar(double valorSaque) {
           if (valorSaque > saldo) {
               return true;
           }
           
           saldo -= valorSaque;
           return true;
        }
        
        public String printSaldo() {
            return "Saldo: R$"+saldo;
        }
        
        public String printsaldo(boolean comCliente) {
            if (comCliente) {
                return "Cliente: "+cliente+"\n"+printSaldo();
            }
            
            return "Nao tem cliente";
        }
    }
}
