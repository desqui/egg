/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 

 * @author carol
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingresa tu frase: ");
        frase= leer.next ();
        System.out.println( frase.toUpperCase() );
        System.out.println( frase.toLowerCase() );
                
         
               
              
    }
    
    
}
