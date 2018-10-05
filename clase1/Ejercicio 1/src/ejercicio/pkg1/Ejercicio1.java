/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 *
 * @author efalcon
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        
        
    }
 public static Boolean esPrimo(int numero)  
 {
     boolean primo = false;
    int contador = 0;
    for(int i = numero; i > 0; i--){
    if(numero % i == 0 ){
        contador++;
    }
    }
    if(contador == 2){
    primo = true;
    }
   // JOptionPane.showMessageDialog(null, primo);
    return primo;
 }  
 
}
