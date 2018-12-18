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
abstract public class Mascota {
    private String _nombre;
    private String _raza;

    public Mascota(String _nombre, String _raza) {
        this._nombre = _nombre;
        this._raza = _raza;
    }
    
    public String GetNombre()
    {
     return this._nombre;
    }
    public String GetRaza()
    {
     return this._raza;
    }
    
     protected String DatosCompletos()
    {
       String patron="%s %d";
        return String.format(patron,_nombre,_raza);
    }
     
     protected abstract String Ficha();
     
}
