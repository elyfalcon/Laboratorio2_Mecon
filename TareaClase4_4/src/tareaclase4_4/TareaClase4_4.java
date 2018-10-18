/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_4;

import java.awt.Color;

/**
 *
 * @author Eli
 */
public class TareaClase4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Boligrafo lapiz=new Boligrafo();
        lapiz.setColor(Color.BLUE);
        lapiz.setTinta(100);
        Boligrafo lapicera=new Boligrafo();
        lapicera.setColor(Color.RED);
        lapicera.setTinta(50);
        
        if(lapiz.Pintar(70)){
            System.out.println("Se puede pintar");
        }
        else
        {
            System.out.println("No alcanza la tinta");
        }
        
    }
    
}
