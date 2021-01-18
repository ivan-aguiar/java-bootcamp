Algoritmo Práctica1_Ejercicio4
	
	Definir salario, salarioMasAlto, salarioTotal, salarioPromedio Como Real
	Definir tamañoArreglo Como Entero 
	tamañoArreglo = 15
	Dimension salario[tamañoArreglo]
	salario[1] = 200
	salario[2] = 300
	salario[3] = 500
	salario[4] = 240
	salario[5] = 352
	salario[6] = 546
	salario[7] = 423
	salario[8] = 123
	salario[9] = 342
	salario[10] = 530
	salario[11] = 234
	salario[12] = 142
	salario[13] = 353
	salario[14] = 645
	salario[15] = 345
	
	
	salarioMasAlto = salario[1]
	salarioTotal = 0
	
	Para i = 1 Hasta tamañoArreglo Con Paso 1 Hacer
		
		Si salario[i] > salarioMasAlto Entonces
			salarioMasAlto = salario[i]
		FinSi
		
		salarioTotal = salarioTotal + salario[i]
		
	Fin Para
	
	salarioPromedio = salarioTotal / tamañoArreglo
	
	Escribir "El mayor salario es: " salarioMasAlto
	Escribir "El promedio es: " salarioPromedio
	
	
	
	
FinAlgoritmo
