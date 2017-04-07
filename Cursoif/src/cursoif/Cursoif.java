/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoif;

/**
 *
 * @author Claire Fenelon
 */
public class Cursoif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // primer ejemplo
//        int x = 15;
//        
//        if (x<30)
//        {
//            System.out.print("Esto es una sentencia de if");
//        }
//          
        
//        segundo ejemplo
//      int x =40;
//      if (x<10)
//      {
//          System.out.print("Esto es una sentencia if");
//          
//      }else{
//          System.out.print("Esto es una sentencia else");
//      }
//           
        
//        tercer ejemplo
//        int x = 45;
//        if ( x==15 )
//        {
//            System.out.println("el valor de x es 15 ");
//            
//        }else if (x==30)
//        { 
//            System.out.print("El valor de x es 30");
//        }else if (x==45)
//        {
//        System.out.println("El valos de x es 45");
//        }else 
//        {
//            System.out.print("X no cumple ninguna de las condiciones anteriores");
//        }
        
//        cuarto ejemplo
        
//        int x =40;
//        int y =5;
//        if (x==40)
//        {if (y==5){
//            System.out.print("x =40 y y =5");
//        }
//            
//        }
           
        char departamento = 'B';
        switch(departamento){
            case 'A' :
                    System.out.println("Desarrollo");
                break;
            case 'B' :
                System.out.println("Recursos Humanos");
                break;
            case 'C':
                System.out.print("Finanzas");
                break;
            case 'D':
                System.out.println("Mercadeo");
                break;
            default:
                System.out.println("Departamento invalido");
                        
        }
        System.out.println("Codigo para el departamento es "+ departamento);
    }
    
}
