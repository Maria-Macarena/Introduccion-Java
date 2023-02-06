/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB27 {

   
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        Character letra;
        
        System.out.print("Ingresar una letra: ");
        letra = read.next().charAt(0);
        
        
        if(letra.equals('a') || letra.equals('A') || letra.equals('e') || letra.equals('E')
                || letra.equals('i') || letra.equals('I')
                || letra.equals('o') || letra.equals('O')
                || letra.equals('u') || letra.equals('U')){
            
            System.out.println("La letra ingresada es una vocal.!!!!");
        }else{
            System.out.println("La letra ingresada NO es una vocal.!!!!");
        }
        
        
    }
    
}
