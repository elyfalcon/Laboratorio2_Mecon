/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elizabeth.Falcon;

/**
 *
 * @author efalcon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Biblioteca miBiblioteca=new Biblioteca(5);
        Autor a= new Autor("Estaban","Quito");
        Autor b= new Autor("Joe","Mayo");
        Manual m1= new Manual(ETipo.Finanzas,a,500,"Economia para tontos");
        Manual m2= new Manual(ETipo.Escolar,new Autor("Moni","Argento"),500,"Como criar a sus hijos");
        Novela n1= new Novela(EGenero.Romantica,a,750,"El amor en tiempos de ...");
        Manual m3= new Manual(ETipo.Tecnico,b,854,"Java, desde el punto de vista de C#");
        Novela n2= new Novela(EGenero.Accion,a,410,"Miseria");
        Novela n3=n2;
        
        miBiblioteca.agregarLibro(m1);
        miBiblioteca.agregarLibro(n1);
        miBiblioteca.agregarLibro(n2);
        miBiblioteca.agregarLibro(m2);
        miBiblioteca.agregarLibro(n3);
        if(miBiblioteca.agregarLibro(m1))
        {
            System.out.println("\nEspacio Insuficiente");
            
        }
        else{
        System.out.println(Biblioteca.MostrarBiblioteca(miBiblioteca));
        }
}
}
