/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;
import java.io.*;
/**
 *
 * @author Claire Fenelon
 */
public class Persona {

    /**
     * @param args the command line arguments
     */
    public String nombre;
    
    private double peso;
    
    public Persona (String nombre){
        this.nombre = nombre;
    }
    public void setpeso(double peso)
    {
        this.peso =peso;
    }
    public void imprimirPersona ()
    {
      System.out.print("Nombre : "+ this.nombre);
      System.out.print("Peso : "+ this.peso);
      
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Persona alguien =new Persona("Carlos");
        alguien.setpeso(80);
        alguien.imprimirPersona();
    }
    
}
