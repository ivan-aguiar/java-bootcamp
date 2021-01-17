/*
Se carga una canasta de pan en una camioneta de reparto. 
Se lee la cantidad de panes a cargar en la canasta, valor entre 1 y 300. 
Se sabe que siempre que se cargan más de 200 panes, se cae de la canasta el 30%, de lo contrario el 10%. 
Se desea saber que porcentaje de la carga se perdió y la cantidad de panes caídos. 
Acompañar el resultado con un mensaje aclaratorio.
 */

package practica1_ejercicio2;

import java.util.Scanner;


public class Practica1_Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Insert how much bread you want to carry in the basket between 1 and 300: ");
        int amountOfBread = userInput.nextInt();
        
        if (amountOfBread < 1){
            System.out.println("You can't carry negative numbers of breads!");
        } else if (amountOfBread > 300){
            System.out.println("That's too much bread, don't you think?");
        } else if (amountOfBread > 200 && amountOfBread <= 300){
            int originalAmount = amountOfBread;
            amountOfBread *= 0.7;
            int lostBread = originalAmount - amountOfBread;
            System.out.println("You've lost 30% of your bread!");
            System.out.println("That's " + lostBread + " breads");
        } else {
            int originalAmount = amountOfBread;
            amountOfBread *= 0.9;
            int lostBread = originalAmount - amountOfBread;
            System.out.println("You've lost 10% of your bread!");
            System.out.println("That's " + lostBread + " breads");
        }    
       
    }
    
}
