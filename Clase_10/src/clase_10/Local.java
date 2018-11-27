/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_10;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 *
 * @author efalcon
 */
public class Local extends Llamada{
    
    protected float _costo;
    
    
    public Local(Llamada unaLlamada,float costo)
    {
      super(unaLlamada._duracion,unaLlamada._nroDestino,unaLlamada._nroOrigen);
      this._costo=costo;
       
    }
    

    public Local(float _duracion, String _nroDestino, String _nroOrigen, float costo) {
        super(_duracion, _nroDestino, _nroOrigen);
        this._costo=costo;
    }

    public float getCostoLlamada() {
       // return CalcularCosto(_duracion, _costo);
        return this.CalcularCosto(_duracion, _costo);
    }
    
    private float CalcularCosto(float duracion, float costo)
    {
        float retorno=0;
        retorno= this._duracion * this._costo;
        return retorno;
    }
    
    public void Mostrar()
    {
     super.Mostrar();
     StringBuilder show=new StringBuilder();
     show.append("Costo de Llamada: ").append(this._costo);
    }
    
}
