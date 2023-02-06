/*Una obra social tiene tres clases de socios:
- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
- Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.

 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena Cardozo.
 */
public class EjercicioB29 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Character letra;
        double monto,total;
        

        
        
        
        do{
            System.out.println("Teclea la opción correcta");
        System.out.println("A - PLAN ORO");
        System.out.println("B - PLAN PLATA");
        System.out.println("C - PLAN BRONCE");
        letra = read.next().charAt(0);

        letra = Character.toUpperCase(letra);
        
        switch(letra){
                case 'A':
                    System.out.println("Haz elegido PLAN ORO");
                    System.out.print("Ingresá el monto del tratamiento: $ ");
                    monto = read.nextDouble();
                    total=(50*monto)/100;
                    System.out.println("Tenes un descuento del 50% en el costo del "
                            + " tratamiento, el total a pagar es $ "+total);
                    break;
                case 'B':
                    System.out.println("Haz elegido PLAN PLATA");
                    System.out.print("Ingresá el monto del tratamiento: $ ");
                    monto = read.nextDouble();
                    total=(35*monto)/100;
                    System.out.println("Tenes un descuento del 35% en el costo del "
                            + " tratamiento, el total a pagar es $ "+total);
                    break;   
                case 'C':
                    System.out.println("Haz elegido PLAN COBRE");
                    System.out.print("Ingresá el monto del tratamiento: $ ");
                    monto = read.nextDouble();
                    
                    System.out.println("No tenes descuento en el costo del "
                            + " tratamiento, el total a pagar es $ "+monto);
                    break;   
                default:
                    System.out.print("La letra ingresada es incorrecta, por favor"
                    + " hazlo nuevamente. ");
                    
            }
            
        }while(!letra.equals('A') && !letra.equals('B') && !letra.equals('C'));
        
        

        

    }

}
