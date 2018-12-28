/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial3;

/**
 *
 * @author efalcon
 */
public class Caballo extends Animal{
    
    protected String _nombre;
    protected Integer _patas;

    public Caballo() {
    this._patas=4;
    }

    public Caballo(String _nombre, Integer _velocidadMaxima) {
        super();
        this._nombre = _nombre;
    }
    
   public String MostrarCaballo()
   {
       StringBuilder show=new StringBuilder();
       show.append("Nombre: ").append(_nombre);
       show.append("Cantidad de patas: ").append(_patas);
       return show.toString();
   }
    
   protected static boolean SonIguales(Caballo c1,Caballo c2)
   {
       boolean retorno=false;
       if(c1._nombre==c2._nombre)
       {
           retorno=true;
       }
       return retorno;
   }
    
    
}
