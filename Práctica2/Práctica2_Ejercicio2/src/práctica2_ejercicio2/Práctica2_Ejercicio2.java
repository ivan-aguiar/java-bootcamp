/*
Escribir un programa que lea las temperaturas farenheit y las convierta a celsius correspondiente. 
El proceso finaliza cuando se ingresa como temperatura 999999. 
 */
package práctica2_ejercicio2;

import java.util.Scanner;

public class Práctica2_Ejercicio2 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double celsiusTemp = 0, fahrenheitTemp = 0;

        System.out.println("Bienvenido a la calculadora de grados Fahrenheit a Celsius.");
        System.out.print("Ingrese la temperatura en Fahrenheit o ingrese 999999 para salir: ");

        fahrenheitTemp = userInput.nextDouble();

        if (fahrenheitTemp == 999999) { //Si el input del user es 999999 finaliza el programa
            System.out.println("---------------------------------------");
            System.out.println("Gracias por utilizar nuestro programa.");
            System.out.println("---------------------------------------");
            System.exit(0);

        } else {

            celsiusTemp = fahrenheitTemp - 32;
            celsiusTemp = celsiusTemp * 5 / 9;
            System.out.println("------------------------------------------------------");
            System.out.println("La temperatura es de " + celsiusTemp + " grados Cesius");
            System.out.println("------------------------------------------------------");

        }

    }

}
