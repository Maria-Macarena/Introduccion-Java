/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB28 {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int n;
        
        System.out.print("Ingresar un número del 1 al 10"
                + " y te mostramos su equivalente en número romano: ");
        n=read.nextInt();
        
        if(n<1 && n>10){
            System.out.println("Por favor, ingresa un número que"
                    + " se encuentre entre el 1 y el 10: ");
            n=read.nextInt();
        }
        
        
        switch(n){
            case 1:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: I");
                break;
            case 2:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: II");
                break;  
            case 3:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: III");
                break;  
            case 4:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: IV");
                break;  
            case 5:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: V");
                break;    
            case 6:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: VI");
                break;    
            case 7:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: VII");
                break;    
            case 8:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: VIII");
                break;    
            case 9:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: IX");
                break; 
            case 10:
                System.out.println("El número "+n+" en número romano equivale"
                        + " a: X");
                break;  
            default:
                System.out.println("El número "+n+" es incorrecto!");
                break;    
        }
        
        
        
    }
    
}
