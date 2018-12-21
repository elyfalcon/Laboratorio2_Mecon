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
public class Humano extends Animal{
    private String _apellido;
    private String _nombre;
    private static Integer _piernas;

    public Humano()
    {
     Humano._piernas=2;
    }
    public Integer Humano(int velocidadMaxima)
    {
        return this._velocidadMaxima=velocidadMaxima;
    }

    public Humano(String _apellido, String _nombre,  Integer _velocidadMaxima) {
        super(__velocidadMaxima);
        this._apellido = _apellido;
        this._nombre = _nombre;
    }
    
    
    
}
