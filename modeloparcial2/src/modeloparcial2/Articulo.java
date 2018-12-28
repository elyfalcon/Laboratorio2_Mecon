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
    
    protected int _codigo;
    protected String _nombre;
    protected float _precioCosto;
    protected float _precioVenta;
    protected int _stock;

    public Articulo(int _codigo, String _nombre, float _precioCosto, int _stock) {
        this._codigo = _codigo;
        this._nombre = _nombre;
        SetPrecioCosto(_precioCosto);
      //  this._precioCosto = _precioCosto;
        this._stock = _stock;
    }
    
    public String GetNombreYCodigo()
    {
    
         return this._codigo + "--"+this._nombre;
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

    public int getStock() {
        return _stock;
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
    public static boolean SonIguales(Articulo art1,Articulo art2){
        boolean resp=false;
        if(art1._codigo==art2._codigo && art1._nombre==art2._nombre)
        {
            resp=true;
        }
        return resp;
    }

   
    public static  int SumarStock(Articulo articulo1,Articulo articulo2)
    {
        int sumaStock;
        return sumaStock=articulo1._stock + articulo2._stock;
    }
    
    public static int RestarStock(Articulo articuloUno, int cantidad)
    {
    // return articuloUno._stock=(int)((articuloUno._stock) - (cantidad));
        int hay=0;
        if(articuloUno.HayStock(cantidad)){
            hay=articuloUno._stock=(articuloUno._stock - (cantidad));
        }
        return hay;
    }
    
    
    
}
