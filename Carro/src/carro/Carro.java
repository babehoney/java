/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Claire Fenelon
 */
public class Carro {
    
int kilometraje;
    /**
     * @param args the command line arguments
     */
  
    public Carro (String marca)
    {
        System.out.print("La marca es : " + marca);
    }
    public void setKilometraje(int kilometraje)
    {
        this.kilometraje = kilometraje;
        
    }
    
    public int getkilometraje()
    {
        System.out.print("El kilometraje es " + kilometraje);
        return this.kilometraje;
    }
    
    
      public static void main(String[] args) {
        // TODO code application logic here
          Carro miCarro=new Carro("Ford");
          miCarro.getkilometraje ( );
          miCarro.setKilometraje( 2000 );
          
    }
    
}
