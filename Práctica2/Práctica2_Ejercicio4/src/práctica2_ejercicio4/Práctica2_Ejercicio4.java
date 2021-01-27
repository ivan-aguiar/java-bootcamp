/*
Escribir un programa que dado n números que llegan de a pares, 
realice el intercambio y devuelva un mensaje mostrando como estaban originalmente y como se intercambiaron. 
Por ejemplo, se leen los número (32, 65) y devuelve (65, 32). 
El programa finaliza cuando el usuario acepta concluir, ingresando la letra ‘S’.
 */
package práctica2_ejercicio4;

import java.util.Scanner;

public class Práctica2_Ejercicio4 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int firstNumber, secondNumber, midNumber;
        char option;

        do {
            System.out.print("Insert your first number: ");
            firstNumber = userInput.nextInt();
            System.out.print("Insert your second number: ");
            secondNumber = userInput.nextInt();

            System.out.println("Original position: " + firstNumber + " " + secondNumber);

            midNumber = firstNumber;
            firstNumber = secondNumber;
            secondNumber = midNumber;

            System.out.println("Inverted position: " + firstNumber + " " + secondNumber);

            System.out.print("Si desea salir del programa, ingrese la tecla 'S', sino pulse cualquier tecla: ");
            option =  userInput.next().toUpperCase().charAt(0);
        } while (option != 'S');

    }

}
