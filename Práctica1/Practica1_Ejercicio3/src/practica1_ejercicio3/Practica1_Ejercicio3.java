/*
En una playa de estacionamiento de un supermercado se cobra $1 por cada minuto de estadía por la hora completa,
y $1.5 por cada minuto adicional que supere la hora. 
Durante la mañana ingresan dos coches. De cada uno de ellos se conoce:

a- La hora de ingreso expresada en hs. y minutos por separado
b- La hora de egreso, expresada en hs. y minutos por separado.

Determinar e imprimir cuánto tiempo estuvo estacionado cada auto, 
cuánto debió abonar cada uno y acompañar con un mensaje que indique si uno pagó más que el otro.

 */
package practica1_ejercicio3;

import java.text.DecimalFormat;

public class Practica1_Ejercicio3 {

    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("0.00"); //Limita la cantidad de decimales a dos
        
        double pricePerMinute = 1, pricePerHour = pricePerMinute * 60, additionalPrice = 1.5;
        
        double firstCarEntry = 7.35, firstCarExit = 9.25; 
        double secondCarEntry = 7.23, secondCarExit = 12.17;
        
        double firstCarHours = firstCarExit - firstCarEntry; 
        double secondCarHours = secondCarExit - secondCarEntry;
        
        System.out.println("The first car was " + df.format(firstCarHours) + " hours in the parking lot");
        System.out.println("The second car was " + df.format(secondCarHours) + " hours in the parking lot");
        
        double firstCarAddTime = (firstCarHours * pricePerHour) / 2;
        double secondCarAddTime = secondCarHours * pricePerHour;
        
        
        if (firstCarAddTime != 0){
            System.out.println("First car additional time: " + df.format(firstCarAddTime / 60));
        }
        
        if (secondCarAddTime != 0){
            System.out.println("Second car additional time: " + df.format(secondCarAddTime / 60));
        }
        
//        double firstCarAdditionalTime = 
//        System.out.println(firstCarAdditionalTime);
    }

}
