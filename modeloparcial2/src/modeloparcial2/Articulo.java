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
public class Articulo {
    
    private int _codigo;
    private String _nombre;
    private float _precioCosto;
    private float _precioVenta;
    private int _stock;

    public Articulo(int _codigo, String _nombre, float _precioCosto, int _stock) {
        this._codigo = _codigo;
        this._nombre = _nombre;
        this._precioCosto = _precioCosto;
        this._stock = _stock;
    }
    
    public String GetNombreYCodigo()
    {
    StringBuilder show=new StringBuilder();
    show.append(this._nombre).append(this._codigo);
    return show.toString();
    }
    
    public void SetPrecioCosto(float costo)
    {
     this._precioCosto=costo;
     this._precioVenta= (float) ((costo) * (1.3));
    
    }
    
    public void SetStock(int stock)
    {
    this._stock=stock;
    }
    
    public float GetPrecioVenta()
    {
    return this._precioVenta;
    }
    public boolean HayStock(int cantidad)
    {
     boolean retorno=false;
     if(this._stock >= cantidad)
     {
     retorno=true;
     }
     return retorno;
    }
    protected static boolean SonIguales(Articulo art1,Articulo art2){
    boolean resp=false;
    if(art1._codigo==art2._codigo && art1._nombre==art2._nombre)
    {
        resp=true;
    }
    return resp;
    }

   
    protected static  int SumarStock(Articulo articulo1,Articulo articulo2)
    {
        int sumaStock;
     return sumaStock=articulo1._stock + articulo2._stock;
    }
    
    public int RestarStock(Articulo articuloUno, int cantidad)
    {
     return articuloUno._stock=(int)((articuloUno._stock) - (cantidad));
    }
    
    
    
}
