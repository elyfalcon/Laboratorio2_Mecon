/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial2;

import java.util.ArrayList;



/**
 *
 * @author efalcon
 */
public class Comercio {
    
    protected String _dueño;
    protected ArrayList<Articulo> _misArticulos;
    protected ArrayList<Venta> _misVentas;

    public Comercio(String _dueño) {
        this();
        this._dueño = _dueño;
        
    }

    private Comercio()
    {
        _misArticulos=new ArrayList<>();
        _misVentas=new ArrayList<>();
        //this._misVentas=new ArrayList<>();
    }
    
    public static  void MostrarArticulos(Comercio ComercioAMostar)
    {
        for (Articulo art : ComercioAMostar._misArticulos) {
            System.out.println(art.GetNombreYCodigo());  
        }
    }
    
    protected static void MostrarGanancia(Comercio ComercioParaResumen)
    {
        float total=0;
        for (Venta v1 : ComercioParaResumen._misVentas) {
           total+=v1.RetornarGanancia();
        }
        System.out.println("La ganancia obtenida es de: ");
        System.out.println(total);
    }
    protected void ComprarArticulo(Articulo articuloComprado)
    {
        boolean existe=false;
        for (Articulo articulo : this._misArticulos) {
            if(Articulo.SonIguales(articulo, articuloComprado) )
            {
                articulo.SetStock(Articulo.SumarStock(articulo, articuloComprado));
               // articulo.SetStock(articulo._stock + articuloComprado._stock);
                existe=true;
                break;
            }
        }
        if(existe == false)
        {
         this._misArticulos.add(articuloComprado);
        }
    
    }
    protected void VenderArticulo(Articulo articuloSolicitado, int cant)
    {
    boolean existe=false;
    Venta nuevaventa= new Venta(articuloSolicitado, cant);
        for (Articulo item : this._misArticulos) {
            if(Articulo.SonIguales(articuloSolicitado, item))
            {
                if(item.HayStock(cant)){
                    item.SetStock(Articulo.RestarStock(item,cant));
                    this._misVentas.add(nuevaventa);
                    existe=true;
                     break;
                }
            
                else{
                    System.out.println("El siguiente Producto no tiene stock para la venta");
                    System.out.println(articuloSolicitado.GetNombreYCodigo());
                    existe=true;
                    break;
                     }
            }
        }
            if(existe==false)
            {
                System.out.println("El siguiente producto no existe en nuestro Comercio!!!");
                System.out.println(articuloSolicitado.GetNombreYCodigo());
            }
        
    
    }
    
}
