/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado
 * y muestre por pantalla el doble, el triple 
 * y la raíz cuadrada de ese número. 

 * @author carol
 */
public class ejercicio5 {
    public static void main(String[] args){
        
        //declarar variables
        int num1;
        Scanner leernum1 = new Scanner(System.in);
        
        //leer primer numero
        System.out.println("introduce el número:  ");
        num1 = leernum1.nextInt();
        
        //mostrar resultado
        System.out.println("el numero ingresado es "+ num1);
        System.out.println("el doble del numero ingresado  "+ num1 + " es = " + 2*num1 );
        System.out.println("el triple del numero ingresado  "+ num1 + " es = " + 3*num1 );
    }
    
}
