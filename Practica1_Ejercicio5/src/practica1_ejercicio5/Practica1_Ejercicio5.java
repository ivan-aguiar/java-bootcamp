/*
Leer una serie de números enteros positivos de 3 cifras. 
Obtener el producto de todos los números primos de este conjunto. 
El fin de datos se produce cuando se ingresa el número 99. 
Nota: para determinar si un número es primo, aplicar la siguiente definición: un número entero positivo es primo, 
cuando ni es divisible por ningún número menor que él, excepto el 1.
 */
package practica1_ejercicio5;

import java.util.Arrays;

public class Practica1_Ejercicio5 {

    public static void main(String[] args) {

        int arrayNumbers[] = {929, 937, 941, 947, 950, 951, 991, 994, 997}; //Los primeros 4 números son primmos, el último no.

        int product = 0;

        System.out.println("---------------------------------------------");
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(arrayNumbers));
        System.out.println("---------------------------------------------");
        System.out.println("Prime numbers: ");

        for (int i : arrayNumbers) { //Recorre el array con for-each   
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n---------------------------------------------");
        System.out.println("Product: ");
        System.out.println(product);
    }

}
