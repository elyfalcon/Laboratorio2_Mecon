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
public class Llamada {
    protected float _duracion;
    protected String _nroDestino;
    protected String _nroOrigen;

    public float getDuracion() {
        return _duracion;
    }

    public String getNroDestino() {
        return _nroDestino;
    }

    public String getNroOrigen() {
        return _nroOrigen;
    }

    public Llamada(float _duracion, String _nroDestino, String _nroOrigen) {
        this._duracion = _duracion;
        this._nroDestino = _nroDestino;
        this._nroOrigen = _nroOrigen;
    }
    
    public void Mostrar()
    {
    StringBuilder retorno=new StringBuilder();
    retorno.append("Duracion: ").append(this._duracion);
    retorno.append("Nro Origen: ").append(this._nroOrigen);
    retorno.append("Nro Destino: ").append(this._nroDestino);
    }
    public static int OrdenarPorDuracion(Llamada uno,Llamada dos)
    {
      int retorno=0;
      if(uno._duracion > dos._duracion)
      {
      retorno=1;
      }
      else if(uno._duracion < dos._duracion)
      {
      retorno=-1;
      }
      return retorno;
    }
    
}
