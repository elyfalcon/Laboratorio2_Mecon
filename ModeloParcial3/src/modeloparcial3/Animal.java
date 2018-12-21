/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial3;

import java.util.Random;

/**
 *
 * @author efalcon
 */
abstract class Animal {
    
    protected Integer _cantidadPatas;
    protected static Random _distanciaRecorrida;//estatico, se inicializa en un constructor estatico
    protected Integer _velocidadMaxima;

    protected Animal() {
        Animal._distanciaRecorrida=new Random();
    }

    public Animal(Integer _cantidadPatas, Integer _velocidadMaxima) {
        this._cantidadPatas = _cantidadPatas;
        this._velocidadMaxima = _velocidadMaxima;
    }

    public Integer getCantidadPatas() {
        return _cantidadPatas;
    }

    public Integer getVelocidadMaxima() {
        return _velocidadMaxima;
    }

    public void setCantidadPatas(Integer _cantidadPatas) {
        if(_cantidadPatas <= 4 && _cantidadPatas >0){
        this._cantidadPatas = _cantidadPatas;
        }
        else
        {
        this._cantidadPatas=4;
        }
    }

    public void setVelocidadMaxima(Integer _velocidadMaxima) {
        if(_velocidadMaxima <=60 && 0 <_velocidadMaxima)
        {
        this._velocidadMaxima = _velocidadMaxima;
        }
        else
        {
        this._velocidadMaxima=60;
        }
    }

    private int getDistanciaRecorrida() {
        
        int retorno;
      //  (int)(Math.random()*(HASTA-DESDE+1)+DESDE); 
      retorno=(int)(Math.random()*(this._velocidadMaxima-10+1)+10);
      //  retorno= Animal._distanciaRecorrida.nextInt(10,t);
      //  retorno= Animal._distanciaRecorrida.next(10,_velocidadMaxima);
        return retorno;
    }
 // DistanciaRecorrida de solo lectura entregara un numero aleatorio entre 10 y la velocidad
    //maxima del animal
    
    public String MostrarDatos()
    {
    StringBuilder show=new StringBuilder();
    show.append("Cantidad de patas: ").append(this._cantidadPatas);
    show.append("\nVelocidad maxima: ").append(this._velocidadMaxima);
    show.append("\nDistancia Recorrida: ").append(this.getDistanciaRecorrida());
    return show.toString();
    
    }
    
    
    
}
