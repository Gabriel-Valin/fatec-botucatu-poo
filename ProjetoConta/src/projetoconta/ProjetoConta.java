/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoconta;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01a
 */
public class ProjetoConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta;
        double valor;
        conta = new Conta("Ana Maria");
        String opcao=null;
        String[] opcoes = new String[]{"Sacar", "Depositar", 
            "Imprime Saldo", "Imprime Saldo - Cliente", "Sair"};
        do{
            opcao = (String) JOptionPane.showInputDialog(null, 
                    "Escolha uma opção:", "Menu", 
                    JOptionPane.QUESTION_MESSAGE, null, 
                    opcoes, "Sacar");
            switch(opcao){
                case "Sacar":
                     valor = 
                            Double.parseDouble(
                                    JOptionPane.showInputDialog("Entre com o valor:"));
                    if(!conta.sacar(valor)){
                        JOptionPane.showMessageDialog(null, 
                                "Saldo é insuficiente!!!");
                    }
                    break;
                case "Depositar":
                    valor = 
                            Double.parseDouble(
                                    JOptionPane.showInputDialog("Entre com o valor:"));
                    conta.depositar(valor);
                    break;
                case "Imprime Saldo":
                    JOptionPane.showMessageDialog(null, 
                            conta.imprimeSaldo());
                    break;
                case "Imprime Saldo - Cliente":
                    JOptionPane.showMessageDialog(null, 
                            conta.imprimeSaldo(true));
                    break;
                case "Sair":
                    JOptionPane.showMessageDialog(null, 
                            "Bye!!!");
                    break;
            }
            
        }while(!opcao.equals("Sair"));
    }
    
}
