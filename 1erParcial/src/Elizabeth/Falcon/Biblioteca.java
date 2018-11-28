/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elizabeth.Falcon;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author efalcon
 */
public class Biblioteca {
    
    private int _capacidad;
    private ArrayList<Libro> _lista;

    public Biblioteca( ) {
        this._lista = new ArrayList<>();
    }

    

    public Biblioteca(int capacidad) {
        
       this();
        this._capacidad=capacidad;
    }
     
    private boolean estaEnBiblioteca(Libro l1)
    {
     boolean retorno=false;
        for (Libro _lista1 : _lista) {
            if(Libro.compararLibros(_lista1, l1))
            {
             retorno=true;
            }
        }
            return retorno; 
        }
    public boolean agregarLibro(Libro l1)
    {
      boolean retorno=false;
      if(this._capacidad > this._lista.size() && !this.estaEnBiblioteca(l1))
      {
          this._lista.add(l1);
          retorno=true;
      }
      return retorno;
    }
    public float getPrecioDeManuales()
    {
    return ObtenerPrecio(ELibro.Manua);
    }
    public float getPrecioDeNovelas()
    {
      return ObtenerPrecio(ELibro.Novela);
    }
    public float getPrecioToal()
    {
      return ObtenerPrecio(ELibro.Ambos);
    }
    
    private float ObtenerPrecio(ELibro e1)
    {
      float retorno=0;
      
        for (Libro _lista1 : _lista) {
            switch(e1)
            {
                case Novela:       
                    retorno+=((Novela) _lista1).getPrecio();
                    break;
                case Manua:
                    retorno+=((Manual)_lista1).getPrecio();
                    break;
                case Ambos:
                    retorno+=((Novela)_lista1).getPrecio() + ((Manual)_lista1).getPrecio();
                    break;
            }
            
        }
      return retorno;
    }
    public static String MostrarBiblioteca(Biblioteca b)
    {
      StringBuilder show=new StringBuilder();
      
        for (Libro libro : b._lista) {
            show.append(Libro.Mostrar(libro));
            
        }
        show.append("Capacidad: ").append(b._capacidad);
      //  show.append("Toal por Novela: ").append(b.getPrecioDeNovelas());
      //  show.append("Total por Manual: ").append(b.getPrecioDeManuales());
     //   show.append("Precio Total: ").append(b.getPrecioToal());
        return show.toString();
    }
    
    
    }
    
    
    

