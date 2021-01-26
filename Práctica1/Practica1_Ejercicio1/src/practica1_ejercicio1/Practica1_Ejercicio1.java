/*

Se desean realizar cálculos para obtener atributos de una figura geométrica (cuadrado, triángulo, círculo, rectángulo). 
De acuerdo al tipo de figura, leer por teclado los atributos (lado en el caso del cuadrado, 
base y altura en el caso del triángulo y el rectángulo, radio en el caso del círculo), se desea calcular:
El área
El perímetro
	Realizar un menú para que, de acuerdo a la opción ingresada, el programa retorne cada una de los cálculos realizados.

 */
package practica1_ejercicio1;

import java.util.Scanner;


public class Practica1_Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner (System.in);
        char exitProgram = 'N';
       
        while (exitProgram != 'Y'){
          
            System.out.println("[1] Square");
            System.out.println("[2] Triangle");
            System.out.println("[3] Circle");
            System.out.println("[4] Rectangle");
            System.out.print("\nInsert an option: ");
            int menuOption = userInput.nextInt();

                switch (menuOption){

                    case 1:
                        System.out.println("------------------------------------------");
                        System.out.println("You have selected Square");
                        System.out.print("Please insert the value of the sides: ");
                        double sideValue = userInput.nextFloat();

                        double squareArea =  sideValue * sideValue; 
                        double squarePerimeter = sideValue + sideValue + sideValue + sideValue; 

                        System.out.println("Area: " + squareArea); 
                        System.out.println("Perimeter: " + squarePerimeter);
                        System.out.println("------------------------------------------");

                        break;

                    case 2:
                        System.out.println("------------------------------------------");
                        System.out.println("You have selected Triangle");
                         System.out.print("Insert the base: ");
                        double triangleBase = userInput.nextFloat();
                        System.out.print("Insert the value of both sides: ");
                        sideValue = userInput.nextFloat();
                        System.out.print("Insert the height: ");
                        double triangleHeight = userInput.nextFloat();

                        double triangleArea = (triangleBase * triangleHeight) / 2;
                        double trianglePerimeter = sideValue + sideValue + triangleBase;

                        System.out.println("Area: " + triangleArea);
                        System.out.println("Perimeter" + trianglePerimeter);
                        System.out.println("------------------------------------------");

                        break;

                    case 3:
                        System.out.println("------------------------------------------");
                        System.out.println("You have selected Circle");
                        System.out.print("Insert the radius: ");
                        double circleRadius = userInput.nextFloat();

                        double circleDiameter = circleRadius * 2;
                        double circleArea = Math.PI * Math.pow(circleRadius, 2);
                        double circleCircunference = Math.PI * circleDiameter;

                        System.out.println("Diameter: " + circleDiameter);
                        System.out.println("Area: " + circleArea);
                        System.out.println("Perimeter: " + circleCircunference);
                        System.out.println("------------------------------------------");

                        break;

                    case 4:
                        System.out.println("------------------------------------------");
                        System.out.println("You have selected Rectangle");
                        System.out.print("Insert the height: ");
                        double rectangleHeight = userInput.nextFloat();  
                        System.out.print("Insert the width: ");
                        double rectangleWidth = userInput.nextFloat();

                        double rectangleArea = rectangleHeight * rectangleWidth;
                        double rectanglePerimeter = 2 * rectangleHeight + rectangleWidth;

                        System.out.println("Area: " + rectangleArea);
                        System.out.println("Perimeter: " + rectanglePerimeter);
                        System.out.println("------------------------------------------");

                        break;

                    default:
                        System.out.println("Invalid option");
                }
                
                 System.out.print("Exit? [Y/N]: ") ;
                 exitProgram =  userInput.next().toUpperCase().charAt(0);
                 System.out.println("------------------------------------------");
            }    

        }
    
}
