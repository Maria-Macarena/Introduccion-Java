/*Considera que estás desarrollando una web para una empresa que fabrica motores
(suponemos que se trata del tipo de motor de una bomba para mover fluidos).
Definir una variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4.
El programa debe mostrar lo siguiente:
* Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una
bomba de agua”.
* Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una
bomba de gasolina”.
* Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una
bomba de hormigón”.
* Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una
bomba de pasta alimenticia”.
* Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No
existe un valor válido para tipo de bomba”
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Macarena CArdozo.
 */
public class EjercicioA7 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int opcion;

        System.out.println("Tecleá un número del 1 al 4 y te mostramos a que tipo de bomba pertenece ");
        opcion = read.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("La bomba es de agua");
                break;
            case 2:
                System.out.println("La bomba es de gasolina");
                break;
            case 3:
                System.out.println("La bomba es de hormigón");
                break;
            case 4:
                System.out.println("La bomba es de alimenticia");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta!");
                break;
        }

    }

}
