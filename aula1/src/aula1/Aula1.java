/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Scanner;

/**
 *
 * @author Lab01a
 */
public class Aula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        Scanner scanner = new Scanner(System.in);
        valor = scanner.nextInt();
        
         if (valor < 0) {
            System.out.println("Value negative!");
        } else if (valor > 0) {     
            System.out.println("Value positive");
        } else {
            System.out.println("Value is neutral");
        }    
        
        switch(valor) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case -1:
                System.out.println("Negative One");
                break;
            default: 
                System.out.println("Default value");
        }
           
        for (int i = 1; i <= 10; i++) {
            System.out.println(valor + " x " + i + " = " + (valor*i));
        }
    }
    
}
