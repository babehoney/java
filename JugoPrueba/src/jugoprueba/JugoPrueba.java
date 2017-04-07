/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugoprueba;

/**
 *
 * @author Claire Fenelon
 */
class Jugo{
    enum JugoTamano{
       PEQUENO,MEDIANO,GRANDE 
}
    JugoTamano tamano;
}
public class JugoPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jugo jugo = new Jugo();
        jugo.tamano =Jugo.JugoTamano.MEDIANO ;
        Jugo jus = new Jugo();
        jus.tamano =Jugo.JugoTamano.PEQUENO;
        Jugo juice = new Jugo();
        juice.tamano = Jugo.JugoTamano.GRANDE;
        System.out.print("Tamano del jugo : " + jugo.tamano);
        System.out.print("Tamano du jus 1 : "+ jus.tamano);
        System.out.print("Tamano du jus " + juice.tamano);
        
        
    }
    
}
