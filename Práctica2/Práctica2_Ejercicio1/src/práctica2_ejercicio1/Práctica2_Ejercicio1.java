/*
Escribir un programa que dados dos valores reales, permita determinar y visualizar el máximo de ellos. 
Definir una función que reciba dos valores como parámetros y retorne el máximo. El resultado debe imprimirse en el programa principal.
 */
package práctica2_ejercicio1;

import java.util.Scanner;

public class Práctica2_Ejercicio1 {
    
    public static void maxNumber(double numX, double numY){
        
        double maxNumber = 0;
        
        if (numX > numY){
            maxNumber = numX;
            System.out.println("El mayor numero de ambos es: " + maxNumber);
        } else if (numX < numY){
            maxNumber = numY;
            System.out.println("El mayor numero de ambos es: " + maxNumber);
        } else {
            System.out.println("Ambos numeros son iguales");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Inserte el primer numero: ");
        double numX = userInput.nextDouble();
        System.out.print("Inserte el segundo numero: ");
        double numY = userInput.nextDouble();
        
        maxNumber(numX, numY);
    }
    
    
    
}
