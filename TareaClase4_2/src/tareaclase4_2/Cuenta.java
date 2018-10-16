/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_2;

/**
 *
 * @author efalcon
 */
public class Cuenta {
    
    //<editor-fold desc="Atributos">
    private String _nombre;
    private long _nroCuenta;
    private double _saldo;
    private ETipoInteres _tipoInteres;
    //</editor-fold>
    
    //<editor-fold desc="Constructores">
   
    public String getNombre(){
    
    return this._nombre;
    }
    public void setNombre(String nombre){
    this._nombre=nombre;
    }
    public long getCuenta(){
    return this._nroCuenta;
    }
    public void setCuenta(long cuenta){
    this._nroCuenta=cuenta;
    }
    public double getSaldo(){
    return this._saldo;
    }
    public void segSaldo(double saldo){
    this._saldo=saldo;
    }
    public ETipoInteres getTipo(){
    return this._tipoInteres;
    }
    public void setTipo(ETipoInteres tipo){
    this._tipoInteres=tipo;
    }
            
    //</editor-fold>
    
    
    
}
