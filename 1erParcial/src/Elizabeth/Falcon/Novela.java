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
public class Novela extends Libro{
    
    private EGenero _genero;

    public Novela(EGenero _genero, Autor _autor, float _precio, String _titulo) {
        super(_autor, _precio, _titulo);
        this._genero = _genero;
    }
    
    public String Mostrar()
    {
    StringBuilder show=new StringBuilder();
    
    show.append(Libro.Mostrar(this));
    show.append("Genero: ").append(this._genero);
    return show.toString();
    
    }
    
    public static boolean compararNovela(Novela n1, Novela n2)
    {
        boolean retorno=false;
        if(Libro.compararLibros(n1, n2) && n1._genero == n2._genero)
        {
            retorno=true;
        }
        return retorno;
    }
    
    
}
