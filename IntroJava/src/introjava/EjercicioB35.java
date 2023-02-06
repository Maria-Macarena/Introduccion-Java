/*Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 1 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.

*/
package introjava;

import java.util.Scanner;

/**
 *
 * @author w10
 */
public class EjercicioB35 {

    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        int n1,n2,resultado,number;
        
        n1 = (int) (Math.random() * 10+1);
        n2 = (int) (Math.random() * 10+1);
        
        resultado = n1 * n2;
        
        
        
        System.out.print("Adivina el resultado de la multiplicación: ");
        number = read.nextInt();
        
       
        if(resultado == number){
            System.out.println("ADIVINASTEEEE.!! EL RESULTADO, LA OPERACIÓN"
                    + " ERA: "+n1+" x "+" "+n2+" = "+resultado);
        }else{
            System.out.println("UPSS .!! NO ADIVINASTE EL RESULTADO LA OPERACIÓN"
                    + " ERA: "+n1+" x "+" "+n2+" = "+resultado);
        }
        
        
        
        
    }
    
}
