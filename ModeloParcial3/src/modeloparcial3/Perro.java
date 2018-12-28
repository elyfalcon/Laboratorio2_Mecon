/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial3;

/**
 *
 * @author efalcon
 */
public class Perro extends Animal{
    
    private int _patas;
    private Razas _raza;

    public Perro(int _patas) {
        this._patas = 4;
    }

  //  public Perro(int _patas, Razas _raza, Integer _cantidadPatas, Integer _velocidadMaxima) {
  //      super(_cantidadPatas, _velocidadMaxima);
  //      this._patas = _patas;
 //       this._raza = _raza;
 //   }

    public Integer Perro(int velocidadMaxima)
    {
        return this._velocidadMaxima=velocidadMaxima;
    }

    public Perro(Razas _raza) {
        this._raza = _raza;
    }

    public Perro(Razas _raza, Integer _velocidadMaxima) {
        super();
    }
    protected static boolean SonIguales(Perro p1,Perro p2)
    {
        boolean retorno=false;
        if(p1._raza==p2._raza && p1._velocidadMaxima==p2._velocidadMaxima)
        {
            retorno=true;
        }
        return retorno;
    }
    
    /**
     *
     * @return
     */
    public String MostrarPerro()
    {
        StringBuilder show=new StringBuilder();
        show.append("Cantidad de patas: ").append(_patas);
        show.append("Raza: ").append(_raza);
        return show.toString();
    }
    
    
    
}
