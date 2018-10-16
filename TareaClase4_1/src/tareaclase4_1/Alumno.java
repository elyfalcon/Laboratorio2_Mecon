/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase4_1;

/**
 *
 * @author efalcon
 */
public class Alumno {
  //<editor-fold desc="Atributos">   
    private byte _nota1;
    private byte _nota2;
    private float _notaFinal;
    public String apellido;
    public int legajo;
    public String nombre;
 //</editor-fold>
    
    //<editor-folder desc="Getters y Setters">
    public byte getNota1(){
    return this._nota1;
    }
    public void setNota1(byte nota){
    this._nota1=nota;
    }
    public byte getNota2(){
    return this._nota2;
    }
    public void setNota2(byte nota){
    this._nota2=nota;
    }
    public float getNotaFinal(){
    return this._notaFinal;
    }
    public void setNotaFinal(float notaFinal){
    this._notaFinal=notaFinal;
    }
    public String getApellido(){
    return this.apellido;
    }
    public void setApellido(String ape){
    this.apellido=ape;
    }
    public int getLegajo(){
    return this.legajo;
    }
    public void setLegajo(int legajo){
    this.legajo=legajo;
    }
    public String getNombre(){
    return this.nombre;
    }
    public void setNombre(String nombre){
    this.nombre=nombre;
    }
   
 //</editor-fold>
 //<editor-fold desc="Metodos">
    public void CalcularFinal(){
    
        if(this._nota1 >=4 && this._nota2>=4)
        {
        this._notaFinal= (float) (Math.random() * 10) + 1;;
        }
        else
        {
        this._notaFinal=-1;
        }
    
    }
    public void Estudiar(byte notaUno,byte notaDos){
    this._nota1=notaUno;
    this._nota2=notaDos;
    }
    public void Mostrar(){
    
        System.out.println("Apellido " + this.apellido );
        System.out.println("Nombre" + this.nombre);
        System.out.println("Legajo" + this.legajo);
        System.out.println("Nota 1: "+ this._nota1);
        System.out.println("Nota 2: " + this._nota2);
        if(this._notaFinal !=-1)
        {
            System.out.println("Nota Final: " + this._notaFinal);
        }
    }
    
    
//</editor-fold>      
    
    
}
