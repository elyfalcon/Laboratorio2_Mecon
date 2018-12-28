/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modeloparcial3;

import java.util.ArrayList;

/**
 *
 * @author efalcon
 */
public class Carrera {
    
    protected ArrayList<Animal> _animales;
    protected Integer _corredoresMax;

    private Carrera() {
       _animales=new ArrayList<Animal>(); 
    }
    
    public Carrera(Integer _corredoresMax)
    {
        this._corredoresMax=4;
    }
    public  boolean esIgual(Carrera c,Animal a)
    {
        boolean retorno=false;
        for (Animal item : this._animales) {
            if(item instanceof Perro)
            
            retorno=true;
        }
        
        
        
    }
    
    
    
    
    
}
