/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_10;

/**
 *
 * @author efalcon
 */
public class Provincial extends Llamada{
    
    protected Franja  _franjahoraria;
    protected float _costo;

    public Provincial(float _duracion, String _nroDestino, String _nroOrigen,Franja franja) {
        super(_duracion, _nroDestino, _nroOrigen);
        this._franjahoraria=franja;
        this.RangoFranja(franja);
    }
    
     public Provincial(Franja miFranja,Llamada unallamada)
    {
      super(unallamada._duracion,unallamada._nroDestino,unallamada._nroOrigen);
      this._franjahoraria=miFranja;
       
    }
     
     private void RangoFranja(Franja mifranja)
     {
     switch(mifranja){
     
         case Franja_1:
             this._costo= (float) 0.99;
             break;
         case Franja_2:
             this._costo= (float) 1.25;
             break;
         case Franja_3:
             this._costo= (float) 0.66;
             break;
     }
     
     }
    
    public float getCostoLlamada() {
       // return CalcularCosto(_duracion, _costo);
       return this.CalcularCosto();
    }
    
    private float CalcularCosto()
    {
        float retorno;
    retorno=this._costo * this._duracion;
    return retorno;
    }
    public void Mostrar()
    {
     super.Mostrar();
     StringBuilder show=new StringBuilder();
     show.append("Costo de Llamada: ").append(this._costo);
     show.append("Franja horaria: ").append(this._franjahoraria);
    }
    
}
