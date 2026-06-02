	Proceso Ejercicio1
		// Definición de variables y simulación de estructura dinámica
		Definir nombres Como Caracter;
		Dimension nombres[5]; // Se dimensiona a 5 para este caso específico
		
		// Asignación de datos (Simulando el add/push_back)
		nombres[1] <- "Ana";
		nombres[2] <- "Luis";
		nombres[3] <- "Carlos";
		nombres[4] <- "Marta";
		nombres[5] <- "Pedro";
		
		// Recorrido de la estructura para mostrar los datos
		Para i<-1 Hasta 5 Con Paso 1 Hacer
			Escribir "Estudiante [", i, "]: ", nombres[i];
		FinPara
FinProceso
