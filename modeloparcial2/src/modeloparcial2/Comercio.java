/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author efalcon
 */
public class Comercio {
    
    private String _dueño;
    private ArrayList<Articulo> _misArticulos;
    private ArrayList<Venta> _misVentas;

    public Comercio(String _dueño) {
        this._dueño = _dueño;
        
    }

    private Comercio()
    {
        _misArticulos=new ArrayList<>();
        _misVentas=new ArrayList<>();
    }
    
    public  void MostrarArticulos(Comercio ComercioAMostar)
    {
        StringBuilder show= new StringBuilder();
       
        for (Articulo art : _misArticulos) {
            show.append(art.GetNombreYCodigo());
            
        }
    }
    
    public  void MostrarGanancia(Comercio ComercioParaResumen)
    {
    StringBuilder show=new StringBuilder();
        for (Venta v1 : _misVentas) {
            show.append(v1.RetornarGanancia());
        }
    
    }
    
    
}
