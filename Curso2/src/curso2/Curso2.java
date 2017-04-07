/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso2;

/**
 *
 * @author Claire Fenelon
 */
public class Curso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a = 10;
        int b = 20;
        int c = 0;
        c = a + b;
        System.out.println("c =a+b = " + c);
        c +=a;
        System.out.println("c += a = " + c);
        c-=a;
        System.out.println("c -=a = " + c );
        c*=a;
        System.out.println("c*=a = " + c);
        a=10;
        c=15;
        c%=a;
        System.out.println("c%=a =" + c);
        a=10;
        c=15;
        c/=a;
        System.out.println("c/=a = " + c);
        
         
    }
    
}
