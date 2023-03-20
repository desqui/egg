/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3.estructuras.de.control;

import java.util.Scanner;

/**
 *Crear un programa que dado un número determine si es par o impar
 * @author carol
 */
public class ejercicio1 {
    //Crear un programa que dado un número determine si es par o impar.

    
    public static void main(String[] args) {
    Scanner num=new Scanner(System.in);
    int numero = 0;
    System.out.println("ingrese un numero");
    numero=num.nextInt();
    if ( numero%2==0){
            System.out.println(" El numero ingresado es par");
    }else
      System.out.println (" El numero ingresado es impar");
}
    

            

    
    
    
}
