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
public class Gato extends Mascota{

    public Gato(String _nombre, String _raza) {
        super(_nombre, _raza);
    }

    @Override
    protected String Ficha() {
        StringBuilder show=new StringBuilder();
        show.append(DatosCompletos());
        return show.toString();
    }
    
    protected static boolean EsIgual(Gato g1,Gato g2)
        {
         boolean resp=false;
         if(g1.GetNombre().equals(g2.GetNombre()) && g1.GetRaza()==g2.GetRaza())
         {
         resp=true;
         }
             return resp;
        }
    public String ToString()
    {
    StringBuilder show=new StringBuilder();
    show.append(Ficha());
    return show.toString();
    }
    
    
}
