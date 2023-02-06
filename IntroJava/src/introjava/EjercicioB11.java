/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB11 {

   
    public static void main(String[] args) {
        
    Scanner read = new Scanner(System.in);
		
		int limite,total=0,num;
		
		System.out.println("Ingresá un número positivo para usarlo de límite: ");
		limite= read.nextInt();
		
		if(limite<2) {
			System.out.println("Por favor ingresa un número positivo: ");
			limite= read.nextInt();
		}
		
		
		do {
			System.out.println("Ingresa un número: ");
			num= read.nextInt();
			total=total+num;
		}while(total<=limite);
		
		System.out.println("El resultado de los números ingresado es: "+total);    
        
        
        
        
    }
    
}
