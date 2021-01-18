Algoritmo Segundo_Ejercicio
	
	Escribir "Inserte cuánto pan cargará en la canasta entre 1 y 300: "
	Leer cantidadPanes 
	
	Si cantidadPanes < 1 Entonces 	
		Escribir "No puedes cargar un número negativo de panes."
		
		Sino si cantidadPanes > 300 Entonces
			Escribir "Eso es mucho pan!"
				
			SiNo si cantidadPanes > 200 y cantidadPanes <= 300  Entonces
				valorOriginal = cantidadPanes
				cantidadPanes = cantidadPanes * 0.7
				panPerdido = valorOriginal - cantidadPanes
				Escribir "Perdiste un 30% de los panes"
				Escribir "Eso equivale a " panPerdido " panes"
				
			Sino 
				valorOriginal = cantidadPanes
				cantidadPanes = cantidadPanes * 0.9
				panPerdido = valorOriginal - cantidadPanes
				Escribir "Perdiste un 10% de los panes"
				Escribir "Eso equivale a " panPerdido " panes"
			FinSi
			
		FinSi
		
	FinSi
	
	
FinAlgoritmo
