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
public class Autor {
    
    private String _apellido;
    private String _nombre;

    public Autor(String _apellido, String _nombre) {
        this._apellido = _apellido;
        this._nombre = _nombre;
    }
    
    public static boolean compararAutores(Autor a1,Autor a2)
    {
     boolean retorno=false;
     if(a1._apellido == a2._apellido && a1._nombre == a2._nombre)
     {
         retorno=true;
     }
     return retorno;
    }
    
    public static String mostrarAutor(Autor a1)
    {
     StringBuilder show=new StringBuilder();
     
     show.append("Apellido: ").append(a1._apellido);
     show.append("  ");
     show.append("Nombre: ").append(a1._nombre);
     return show.toString();
    }
}
