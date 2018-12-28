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

    public Humano(String _apellido, String _nombre, Integer _cantidadPatas, Integer _velocidadMaxima) {
        super(_cantidadPatas, _velocidadMaxima);
        this._apellido = _apellido;
        this._nombre = _nombre;
    }
    
    protected static boolean SonIguales(Humano h1,Humano h2)
    {
        boolean retorno=false;
        if(h1._nombre==h2._nombre && h1._apellido==h2._apellido)
        {
            retorno=true;
        }
    return retorno;
    }
    public  String MostrarHumano()
    {
        StringBuilder show= new StringBuilder();
        show.append("Apellido: ").append(_apellido);
        show.append("Nombre: ").append(_nombre);
        show.append("Cantidad de piernas: ").append(_piernas);
        return show.toString();
    }
    
    
    
}
