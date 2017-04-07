/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package empleado;
import java.io.*;
/**
 *
 * @author Claire Fenelon
 */
public class Empleado {
public static double salario;
public static final String DEPARTAMENTO ="Desarrollo";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        salario =2000;
        System.out.println(DEPARTAMENTO + "posee un salario promedio de : " + salario);
    }
    
}
