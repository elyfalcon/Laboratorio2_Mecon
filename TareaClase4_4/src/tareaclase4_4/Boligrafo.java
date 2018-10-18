/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_4;
import java.awt.Color;

/**
 *
 * @author Eli
 */
public class Boligrafo {
    
    //Color color;
    private Color _color;
    private int _tinta;
    
    //<editor-fold desc="Getters y Setters">
    public Color getColor(){
    return this._color;
    }
    public void setColor(Color color){
    this._color=color;
    }
    public int getTinta(){
    return this._tinta;
    }
    public void setTinta(int tinta){
    this._tinta=tinta;
    }
    //</editor-fold>
    //<editor-fold desc="Metodos">
    
  //  public boolean Pintar(int gasto){
  
 //   }
    public void Recargar(){
    this._tinta=100;
    }
    //</editor-fold>
    public boolean Pintar(int gasto){
    boolean retorno=false;
    
    if(this._tinta >=gasto)
    {
    retorno=true;
    this._tinta-=gasto;
        System.out.println("La cantidad de tinta es: " + this._tinta +" "+ "del color: "+ " "+ this._color);
    }
    else
            System.out.println("No puede pintar, Ud debe ");
        
    return retorno;
    }
    
}
    
    
    
    
    
    
