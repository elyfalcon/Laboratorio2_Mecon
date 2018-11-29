/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg17_ejercicio;

/**
 *
 * @author capacita_mecon
 */
public abstract class Animal {
    protected String _Nombre;
    protected int _Edad;

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public Animal(String _Nombre, int _Edad) {
        this._Nombre = _Nombre;
        this._Edad = _Edad;
    }
    
    
    
    
    
}
