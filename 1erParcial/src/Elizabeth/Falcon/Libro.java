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
public class Libro {
    
    protected Autor _autor;
    protected int _cantidadDePaginas;
    protected float _precio;
    protected String _titulo;

    public Libro(Autor autor, float _precio, String _titulo) {
        this._autor = autor;
        this._precio = _precio;
        this._titulo = _titulo;
    }

    public Libro() {
        this._cantidadDePaginas = generadorDePaginas();
    }

    public int getCantidadDePaginas() {
        return generadorDePaginas();
    }
    
    private static int generadorDePaginas()
    {
    int retorno;
    retorno= (int)(Math.random()*(580-10+1)+10);
    return retorno;
    }
    public static String  Mostrar(Libro l1)
    {
     StringBuilder show=new StringBuilder();
     show.append("*******************************************\n");
     show.append("Autor:  ").append(Autor.mostrarAutor(l1._autor));
     show.append("\n");
     show.append("Titulo: ").append(l1._titulo);
     show.append("\n");
     show.append("Cantidad de paginas: ").append(l1.getCantidadDePaginas());
     show.append("\n");
     show.append("Precio: $ ").append(l1._precio);
     show.append("\n");
     return show.toString();
    }
    
    public static boolean compararLibros(Libro l1, Libro l2)
    {
     boolean retorno=false;
     if(l1._titulo == l2._titulo && l1._autor == l2._autor)
     {
     retorno=true;
     }
     return retorno;
    }

    public float getPrecio()
    {
    return this._precio;
    }
    
}
