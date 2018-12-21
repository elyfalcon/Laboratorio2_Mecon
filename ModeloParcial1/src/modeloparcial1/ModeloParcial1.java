/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial1;

/**
 *
 * @author efalcon
 */
public class ModeloParcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Grupo grupo1=new Grupo("Rio Unica");
        
        Mascota Moro=new Perro("Moro","Pitbull",0,false);
        Mascota Julio=new Perro("Julio","Cruza",13,false);
        Mascota Ramon=new Perro("Ramon","Salchicha",2,true);
        Mascota Jose=new Gato("Jose","Angora");
        Mascota Hernan=new Gato("Hernan","cruza");
        Mascota Fer=new Gato("Fer","Siames");
        
        
        if (Grupo.Igual(grupo1, Fer))
        {        } else {
            Grupo.AgregarMascota(grupo1, Fer);
        } 
        Grupo.AgregarMascota(grupo1, Julio);
        Grupo.AgregarMascota(grupo1, Hernan);
        Grupo.AgregarMascota(grupo1, Ramon);
         Grupo.AgregarMascota(grupo1, Julio);
         Grupo.AgregarMascota(grupo1, Julio);
         
        System.out.println(grupo1.toString());
        
        
        
        
    }
    
}
