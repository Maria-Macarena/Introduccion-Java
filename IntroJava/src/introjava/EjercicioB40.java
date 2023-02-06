/*Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB40 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        
        int edad;
        String nombre,op;
        
        do{
            System.out.print("Ingresa el nombre de la persona: ");
            nombre = read.next().toUpperCase();
            
            System.out.println("");
            
            System.out.print("Ingresa la edad de la persona: ");
            edad = read.nextInt();
            
            System.out.println("********************************************");
            System.out.println("Datos de la persona ingresada");
            System.out.print("Nombre: "+nombre+" - Edad: "+edad);
            System.out.println("");
            
            System.out.println("********************************************");
            
            System.out.print("¿Quieres seguir cargando más personas? ");
            op = read.next().toUpperCase();
            
            System.out.println("");
            
        }while(!op.equals("NO"));
        
    }
    
}
