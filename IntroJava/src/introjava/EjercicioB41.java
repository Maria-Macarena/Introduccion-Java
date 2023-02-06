/*Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB41 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int num;
        
        System.out.print("Ingresa un número para saber "
                + " si es primo: ");
        num = read.nextInt();
        
        System.out.print("¿Es número primo?: "+EsNumeroPrimo(num));
        System.out.println("");
       
        
    }
    
    public static boolean EsNumeroPrimo(int num) {
        
    boolean check = true;
    
    for(int i = 2; i < num; i++) {
        if (num % i == 0) {
            check = false;
            return check;
        }
       
    }
     return check;
    
}
    
}
