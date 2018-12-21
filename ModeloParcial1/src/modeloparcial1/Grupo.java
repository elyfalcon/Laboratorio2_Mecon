/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial1;

import java.util.ArrayList;

/**
 *
 * @author efalcon
 */
public class Grupo {
    
    private ArrayList <Mascota> _manada;
    private String _nombre;
    private static TipoManada _tipo;

    public Grupo()
    {
        this._manada=new ArrayList<Mascota>();
        Grupo._tipo=TipoManada.unica;
    }

    public static void setTipo(TipoManada _tipo) {
        Grupo._tipo = _tipo;
    }
    

    public Grupo(String nombre)
    {
     this();
    this._nombre=nombre;
    }
    
    
    public Grupo(String _nombre, TipoManada _tipo) {
        
        this._nombre = _nombre;
        Grupo._tipo = _tipo;
    }

    @Override
    public String toString() {
        StringBuilder show=new StringBuilder();
        show.append("**").append(_nombre).append("**");
        show.append("\nIntegrantes:");
      //  show.append("Integrantes:");
        for (Mascota item : _manada) {
            show.append(item.DatosCompletos());
            
        }
        return show.toString();
        //return "Grupo{" + "_manada=" + _manada + ", _nombre=" + _nombre + '}';
    }

   public static boolean Igual(Grupo e,Mascota j){
       boolean retorno=false;
       for (Mascota item : e._manada) {
           if(item==j)
                   {
                   retorno=true;
                   }
       }
       return retorno;
   }
   public static Grupo AgregarMascota(Grupo e,Mascota j){
       if(!Igual(e, j))
       {
       e._manada.add(j);}
       return e;
   }
   public static Grupo QuitaMascota(Grupo e,Mascota j)
   {
   if(Igual(e, j)){
   e._manada.remove(j);
   }
   return e;
   
   }
   
   
}
