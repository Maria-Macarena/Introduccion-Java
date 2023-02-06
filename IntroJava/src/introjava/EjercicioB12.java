/*Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo
 */
public class EjercicioB12 {

   
    public static void main(String[] args) {

    Scanner read = new Scanner(System.in);
		
		int num1=1,num2=0,opcion;
		Character letra=' ';
		
		System.out.println("Tecleá dos números para realizar"
				+ "la operación: ");
		num1=read.nextInt();
		num2=read.nextInt();
		
		
		do {
			System.out.println("Elegí una opción del menú");
			System.out.println("OPCIÓN NÚMERO 1 - SUMAR");
			System.out.println("OPCIÓN NÚMERO 2 - RESTAR");
			System.out.println("OPCIÓN NÚMERO 3 - MULTIPLICAR");
			System.out.println("OPCIÓN NÚMERO 4 - DIVIDIR");
			System.out.println("OPCIÓN NÚMERO 5 - SALIR");
			opcion=read.nextInt();
			
			if(opcion<1 || opcion>5) {
				System.out.println("La opción ingresada es incorrecta, por favor elige nuevamente: ");
				opcion=read.nextInt();
			}
			
			switch(opcion) {
			case 1:
				int suma=num1+num2;
				System.out.println("La suma de "+num1+" + "+num2+" =  "+suma);
				break;
			case 2:
				int resta=num1-num2;
				System.out.println("La resta de "+num1+" - "+num2+" = "+resta);
				break;
			case 3:
				System.out.println("La multiplicación de "+num1+" * "+num2+" = "+num1*num2);
				break;
			case 4:
				System.out.println("La división de "+num1+" / "+num2+" = "+num1/num2);
				break;
			case 5:
				System.out.println("Si desea salir por favor ingrese la letra 'S', sino 'N' ");
				letra= read.next().charAt(0);
				
				while(!letra.equals('s') && !letra.equals('S') && !letra.equals('N')
						&& !letra.equals('n')) {
					System.out.println("La letra ingresa es incorrecta, intenta nuevamente");
					letra= read.next().charAt(0);
					break;
				}
				
				
			
			}
		}while(!letra.equals('S') && !letra.equals('s'));    
        
        
        
        
    }
    
}
