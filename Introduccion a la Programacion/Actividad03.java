package cursointrojava;

import java.util.Scanner;

/**
 *
 * @author HugoLuna
 */
public class Actividad03 {

    public static void main(String[] args) {
        /*
         *Escribe un programa en el que se declaren las variables enteras x, y.
         *Asignales los valores 144 y 999 respectivamente.
         *A continuación, muestra por pantalla el valor de cada variable, la suma, la resta,
         *la división y la multiplicación, solamente si se cumple que x = 144 && y = 999;
         */

        Scanner Teclado = new Scanner(System.in);

        //Declarando variables
        int x = 144, y = 999, res;

        if (x == 144 && y == 999) {

            System.out.println("Puedes continuar");

            /*Suma*/
            res = x + y;

            System.out.println("La suma de " + x + " + " + y + " = " + res);

            /*Resta*/
            res = x - y;
            System.out.println("La resta de " + x + " - " + y + " = " + res);

            /*Multiplicacion*/
            res = x * y;
            System.out.println("La multiplicación de " + x + " * " + y + " = " + res);

            /*Division*/
            res = x / y;
            System.out.println("La división de " + x + " / " + y + " = " + res);
        } else {
            System.out.println("Y tiene un valor distinto a 999 ó X tiene un valor distinti a 144");

        }

    }
}
