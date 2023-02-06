/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
package introjava;
/*Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
*/
import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo
 */
public class EjercicioA4 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int num1,num2;
		
		System.out.println("Ingresá dos números: ");
		num1= read.nextInt();
		num2= read.nextInt();

		
		System.out.println("El maximo de " + num1 + " y " + num2 + " es: " + Math.max(num1, num2));

    }

}
