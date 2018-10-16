/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_1;

/**
 *
 * @author efalcon
 */
public class TareaClase4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //FORMA TRADICIONAL  
        Alumno alumno1=new Alumno();
        Alumno alumno2=new Alumno();
        Alumno alumno3=new Alumno();
        
        alumno1.apellido="Perez";
        alumno1.nombre="Ariel";
        alumno1.legajo=123;
        alumno1.Estudiar((byte)5, (byte)7);
        alumno1.CalcularFinal();
        alumno2.apellido="Garcia";
        alumno2.nombre="Marcela";
        alumno2.legajo=456;
        alumno2.Estudiar((byte)2, (byte)3);
        alumno2.CalcularFinal();
        alumno3.apellido="Perez";
        alumno3.nombre="Hector";
        alumno3.legajo=789;
        alumno3.Estudiar((byte)8, (byte)9);
        alumno3.CalcularFinal();
        
        alumno1.Mostrar();
        alumno2.Mostrar();
        alumno3.Mostrar();
        
        //FIN FORMA TRADICIONAL
        
    }
    
}
