/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivoes;
  import java.io.BufferedReader;
  import java.io.BufferedWriter;
  import java.io.FileNotFoundException;
  import java.io.FileReader;
  import java.io.FileWriter;
  import java.io.IOException;
/**
 *
 * @author Claire Fenelon
 */
public class Archivoes {
  
public void escribirTextoArchivo(String nombreArchivo, String texto) {
    FileWriter salida = null;
    try {
      salida = new FileWriter(nombreArchivo);
      BufferedWriter escritor = new BufferedWriter(salida);
      escritor.write(texto);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (salida != null) {
        try {
          salida.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        
    }
    
}
