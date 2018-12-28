/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;

/**
 *
 * @author efalcon
 */
public class Modeloparcial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Comercio ElBolicheDeToni= new Comercio("TONI");
        
        Articulo articuloUno= new Articulo(100,"Sprite", (float)2.5,10);
        Articulo articuloDos= new Articulo(101,"Fanta", (float)2.5,10);
        Articulo articuloTres= new Articulo(100,"Sprite", (float)2.5,25);
        Articulo articuloCuatro= new Articulo(103,"Quatro", (float)2.5,10);
        Articulo articuloCinco= new Articulo(103,"Pepsi", (float)2.5,10);
         
        ElBolicheDeToni.ComprarArticulo(articuloUno);
        ElBolicheDeToni.ComprarArticulo(articuloDos);
        ElBolicheDeToni.ComprarArticulo(articuloTres);
        ElBolicheDeToni.ComprarArticulo(articuloCuatro); 
        System.out.println("El Boliche de Tony");
        System.out.println("Vender: ");
        ElBolicheDeToni.VenderArticulo(articuloUno, 1);
        ElBolicheDeToni.VenderArticulo(articuloDos, 1);
        ElBolicheDeToni.VenderArticulo(articuloTres, 1);
        ElBolicheDeToni.VenderArticulo(articuloDos, 1);
        ElBolicheDeToni.VenderArticulo(articuloTres, 20);
        ElBolicheDeToni.VenderArticulo(articuloTres, 50);
        ElBolicheDeToni.VenderArticulo(articuloCuatro, 1);
        ElBolicheDeToni.VenderArticulo(articuloCinco, 1);
        System.out.println(" ");
        System.out.println("Los productos existentes son: ");
        Comercio.MostrarArticulos(ElBolicheDeToni);
        System.out.println("\n");
        Comercio.MostrarGanancia(ElBolicheDeToni);
        
        
    }
    
}
