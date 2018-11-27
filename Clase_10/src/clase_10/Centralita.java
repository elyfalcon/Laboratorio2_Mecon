/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efalcon
 */
public class Centralita {
    
    private List<Llamada> _listaDeLlamadas;
    protected String _razonSocial;

    public Centralita() {
        this._listaDeLlamadas=new ArrayList();
    }

    public Centralita(String nomempresa){
        this();
        this._razonSocial=nomempresa;
    }
    private float CalcularGanancia(TipoLlamada tipo)
    {
    float retorno=0;
    switch(tipo){
    
        case Local:
            for(Llamada llamada: this._listaDeLlamadas)
            {
            if(llamada instanceof Local)
            {
            retorno +=((Local)llamada).getCostoLlamada();
            }
            }
        break;
        case Provincial:
            for(Llamada llamada: this._listaDeLlamadas)
            {
            if(llamada instanceof Provincial)
            {
                retorno +=((Provincial)llamada).getCostoLlamada();
            }
            }
        break;
        case Todas:
            for(Llamada llamada: this._listaDeLlamadas)
            {
            if(llamada instanceof Local)
            {
            retorno +=((Local)llamada).getCostoLlamada();
            }
            else if(llamada instanceof Provincial)
            {
            retorno +=((Provincial)llamada).getCostoLlamada();
            }
            }
        break;
    }   
    return retorno;
    }
    public float getGananciaPorTotal()
    {
    return this.CalcularGanancia(TipoLlamada.Todas);
    }
    public float getGananciaPorLocal()
    {
    return this.CalcularGanancia(TipoLlamada.Local);
    }
    public float getGananciaPorProvincial()
    {
    return this.CalcularGanancia(TipoLlamada.Provincial);
    }
    
    public void Mostrar()
    {
     StringBuilder show=new StringBuilder();
     show.append("Razon Social: ").append(this._razonSocial);
     show.append("Ganancia Total: ").append(this.getGananciaPorTotal());
     show.append("Ganancia por Local ").append(this.getGananciaPorLocal());
     show.append("Ganancia Provincial ").append(this.getGananciaPorProvincial());
        System.out.println(show);
    }

  
}
