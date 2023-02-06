/*Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB36 {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int n;
        
        System.out.print("Ingresa una serie de números "
                + " para saber la longitud: ");
        n = read.nextInt();
        
       String cadena = n+"";
       
        System.out.print("Ingresaste: "+cadena.length()+" dígitos.!");
        System.out.println("");
        
        
    }
    
}
