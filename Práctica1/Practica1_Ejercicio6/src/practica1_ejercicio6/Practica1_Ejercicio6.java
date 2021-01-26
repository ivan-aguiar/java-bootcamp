/*
Un contenedor se ocupa con cajas cuyos volúmenes pueden ser 1/4., 1/12, 1/24 ó 1/36 de su volumen. 
Una cinta transportadora que censa el volúmen de cada caja, debe recibir una orden para que entregue la caja a la grúa que la deposita en el contenedor,
o bien para que desvíe su trayectoria al depósito nuevamente (de no cumplir con el volumen restante en el contenedor).
Realizar un algoritmo que permita hacer la operación de llenado exacto de contenedores o detenga el proceso por haber censado 500 cajas, 
o bien no haya más cajas para cargar. Al finalizar el proceso se deberá imprimir la siguiente información:

a- Cantidad de contenedores llenados.
b- Cantidad de cajas de cada tipo usadas.
c- Mensaje que indique la razón por la cual se detuvo el proceso.
d- Cantidad de cajas de cada tipo que han sido desviadas hacia el depósito.

 */
package practica1_ejercicio6;

import java.util.concurrent.ThreadLocalRandom;

public class Practica1_Ejercicio6 {

    public static void main(String[] args) {

        double containerSize = 1, quarterBox = 0.25, twelfthBox = 0.083, twentyfourthBox = 0.0416, thirtysixthBox = 0.027;
        int boxQuantity = 10;
        int containerQuantity = 0;

        for (int i = 0; i <= boxQuantity; i++) {

            if (containerSize > 0) {
                containerSize -= quarterBox;
                System.out.println(containerSize);
            } 
            
            if (containerSize == 0) {
                containerQuantity += 1;
            }
 

        }
        
        System.out.println("La cantidad de containers usados es de: " + containerQuantity);
    }
}
