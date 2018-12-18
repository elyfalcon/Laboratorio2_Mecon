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
    private TipoManada _tipo;
    
    public void SeTipo(TipoManada tipo){
    
    this._tipo=_tipo;
    }

    public Grupo() {
    }
    public Grupo(String nombre)
    {
     this();
    this._nombre=nombre;
    }
    
    
    public Grupo(String _nombre, TipoManada _tipo) {
        
        this._nombre = _nombre;
        this._tipo = _tipo;
    }

   
    
}
