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
public class Manual extends Libro {
    
    private ETipo _tipo;

    public Manual(ETipo _tipo, Autor _autor, float _precio, String _titulo) {
        super(_autor, _precio, _titulo);
        this._tipo = _tipo;
    }

    public String Mostrar()
    {
     StringBuilder show=new StringBuilder();
     
     show.append(Libro.Mostrar(this));
     show.append("Tipo; ").append(this._tipo);
     return show.toString();
     
    }
    
     public static boolean compararManuales(Manual m1, Manual m2)
    {
     boolean retorno=false;
     if(Libro.compararLibros(m1,m2 ) && m1._tipo == m2._tipo)
     {
     retorno=true;
     }
     return retorno;
    }
    
    
    
    
}
