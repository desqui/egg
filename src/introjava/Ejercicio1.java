/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author carol
 */
//Escribir un programa que pida dos números enteros por teclado y 
//calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma


public class Ejercicio1 {
    public static void main(String[] args){ 
        System.out.print("Ingrese dos numero enteros");
        Scanner leer= new Scanner(System.in);
        int num1= leer.nextInt ();
        int num2= leer.nextInt ();
        int suma = num1 + num2;
      
       System.out.println("El Resultado es : " + suma);         
    }
            
            
            
            
    
}
