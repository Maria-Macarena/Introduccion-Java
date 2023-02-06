/*Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB37 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int n;
        
        System.out.print("Ingresar la altura de la escalera: ");
        n = read.nextInt();
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
    
}
