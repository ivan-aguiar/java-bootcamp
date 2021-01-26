/*
 Realizar un algoritmo que permita, de acuerdo a la edad de un individuo, determinar si es:
Bebé (0-2), niño/a (2-13), adolescente (13-19), adulto/a jóven (19-35), adulto/a (35-65), tercera edad (+65)
 */
package javabootcamp_caseswitch;

import java.util.Scanner;


public class JavaBootCamp_CaseSwitch {

    public static void main(String[] args) {
        
        
        int userAge, option;
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Insert your age: ");
        userAge = userInput.nextInt();
        
        if (userAge >= 0 && userAge <= 2){
            option = 1;
        }
        else if (userAge > 2 && userAge <= 13){
            option = 2;
        }
        else if (userAge > 13 && userAge <= 19){
            option = 3;
        }
        else if (userAge > 19 && userAge <= 35){
            option = 4;
        } else if (userAge > 35 && userAge <= 65){
            option = 5;
        }
        else{
            option = 6;
            
    }
                
        switch (option){
            case 1:
                System.out.println("Bebe");
                break;
            case 2:
                System.out.println("Niño");
                break;
            case 3:
                System.out.println("Adolescente");
                break;
            case 4:
                System.out.println("Adulto joven");
                break;
            case 5: 
                System.out.println("Adulto");
                break;
            case 6: 
                System.out.println("Tercera edad");
                break;
            default: 
                System.out.println("Edad invalida");
        }
    }
    
}
