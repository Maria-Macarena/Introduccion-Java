/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.*/

package introjava;

/**
 * @author Macarena Cardozo.
 */

import java.util.Scanner;

public class EjercicioA1 {

    
    public static void main(String[] args) {
    
        Scanner read= new Scanner(System.in);
		String frase;
		
		
		System.out.println("Ingrese una frase: ");
		frase = read.nextLine();
		
		System.out.println("Tu frase en minúscula es: "+frase.toLowerCase());
		System.out.println("Tu frase en mayúscula es: "+frase.toUpperCase());

    }
    
}
