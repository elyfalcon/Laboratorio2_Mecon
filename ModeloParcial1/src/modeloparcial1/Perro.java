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
public class Perro extends Mascota{
    
    private int _edad;
    private boolean  _esAlfa;

    public Perro(String _nombre, String _raza, int edad, boolean esAlfa) {
        super(_nombre, _raza);
        this._edad=edad;
        this._esAlfa=esAlfa;
    }
    
    public int GetEdad()
    {
    return  this._edad;
    }
    public void SetEdad(int edad)
    {
    this._edad=edad;
    }
    public boolean GetesAlfa()
    {
        return this._esAlfa;
    }
    public void SetesAlfa(boolean esAlfa)
    {
        this._esAlfa=esAlfa;
    }

    @Override
    protected String Ficha() {
        StringBuilder retorno=new StringBuilder();
        if(this._esAlfa)
        {
        retorno.append(DatosCompletos()).append(this._edad);
           
        }
        else
        retorno.append(DatosCompletos()).append("Edad: ").append(this._edad);
        return retorno.toString();
        
    }
    protected static boolean EsIgual(Perro p1,Perro p2)
        {
         boolean resp=false;
         if(p1.GetNombre()==p2.GetNombre() && p1.GetRaza()==p2.GetRaza() && p1._edad==p2._edad)
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
    
    
    
    
    
    

