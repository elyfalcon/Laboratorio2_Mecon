/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;

/**
 *
 * @author efalcon
 */
public class Venta {
    private Articulo _articuloVendido;
    private int _cantidad;

    public Venta(Articulo _articuloVendido, int _cantidad) {
        this._articuloVendido = _articuloVendido;
        this._cantidad = _cantidad;
    }
    
    public float RetornarGanancia()
    {
        float ganancia;
        ganancia=(float) ((this._cantidad) * (this._articuloVendido.GetPrecioVenta()));
        return ganancia;
    }
    
    
}
