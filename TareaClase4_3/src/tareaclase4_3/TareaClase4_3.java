/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_3;

/**
 *
 * @author efalcon
 */
public class TareaClase4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        Computadora Compu;
        Compu = new Computadora();
        Compu.setMarca(EMarca.Asus);
        Compu.Encender();
        Compu.setProcesador(EProcesador.Intel_Core7);
        
        Compu.setPeso(15);
        Compu.InformarEstado();
    }
    
}
