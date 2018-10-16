/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_3;

/**
 *
 * @author efalcon
 */
public class Computadora {
    
    //<editor-fold desc="Atributos">
    private boolean _estaEncendida;
    private EMarca _marca;
    private float _peso;
    private EProcesador _procesador; 
    //</editor-fold>

    public Computadora() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     //<editor-fold desc="Metodos">
    public boolean getEstaEncendida(){
    return this._estaEncendida;
    }
    public void setEstaEncendida(boolean estado){
     this._estaEncendida=estado;
    }
    public EMarca getMarca(){
    return this._marca;
    }
    public void setMarca(EMarca marca){
    this._marca=marca;
    }
    public float getPeso(){
    return this._peso;
    }
    public void setPeso(float peso){
    this._peso=peso;
    }
    public EProcesador getProcesador(){
    return this._procesador;
    }
    public void setProcesador(EProcesador procesador){
    this._procesador=procesador;
    }
    
    //</editor-fold>
    //<editor-fold desc="Constructor">
    
   /* public Computadora(boolean esta, EMarca marca, float peso, EProcesador procesa){
    this.setEstaEncendida(esta);
    this._marca=_marca.Apple;
    this.setPeso(peso);
    this.setProcesador(_procesador);
    }*/
    public void InformarEstado(){
        System.out.println("Marca: " + this. _marca +  " Procesador: " + this._procesador + " Peso: " + this._peso );//+ "Estado: " + this._estaEncendida);
    }
    public void Encender(){
    this._estaEncendida=true;
    }
    public void Apagar(){
    
    this._estaEncendida=false;
    }
    //</editor-fold>
    
    
}
