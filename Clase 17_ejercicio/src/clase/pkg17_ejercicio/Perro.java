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
public class Perro extends Animal{
    
    protected boolean TieneVacunas;

    public Perro(boolean TieneVacunas, String _Nombre, int _Edad) {
        super(_Nombre, _Edad);
        this.TieneVacunas = TieneVacunas;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    
}
