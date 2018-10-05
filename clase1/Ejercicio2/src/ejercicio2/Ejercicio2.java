/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author efalcon
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in); 
        int numero1,numero2;
        
        System.out.println("Ingrese un numero ");
        numero1=read.nextInt();
        System.out.println("Ingrese un numero ");
        numero2=read.nextInt();
        
        System.out.println("El mayor es: " + Mayor(numero1,numero2));
    }
    public static int Mayor(int n1,int n2)
    {
        int mayor;
        if(n1>n2)
        {
        mayor=n1;
        }
        else
        {
        mayor=n2;
        }
    return mayor;
    }
    
}
