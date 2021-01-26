/*
Se ingresan por teclados los 15 últimos sueldos de un repartidor de pizza. 
Los sueldos pueden variar de un mes a otro, en función de la comisión recibida y los premios. 
Determinar el sueldo promedio del empleado, cuál fue el sueldo máximo percibido, e imprimir dichos resultados. 
 */
package practica1_ejercicio4;

import java.util.Scanner;

public class Practica1_Ejercicio4 {

    public static void main(String[] args) {
        
        float salary[] = {200, 300, 500, 240, 352, 546, 423, 123, 342, 530, 234, 142, 353, 645, 345, 534};
        float higherSalary = salary[0];
        float totalSalary = 0;
         
        for (int i = 0; i < salary.length; i++){
            
            if (salary[i] > higherSalary){
                higherSalary = salary[i];
            }
        totalSalary += salary[i];
        }
        
        float averageSalary = totalSalary / salary.length; 

        
        System.out.println("El mayor salario es: " + higherSalary);
        System.out.println("El promedio es: " + averageSalary);
        
    }
    
}
 