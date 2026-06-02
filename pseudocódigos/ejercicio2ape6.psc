Proceso Ejercicio2
    // Declaración para almacenar datos numéricos con decimales
    Definir notas Como Real;
    Dimension notas[6];
    
    // Asignación de 6 calificaciones
    notas[1] <- 15.5;
    notas[2] <- 18.0;
    notas[3] <- 12.75;
    notas[4] <- 19.5;
    notas[5] <- 14.0;
    notas[6] <- 16.25;
    
    // Bucle para mostrar el contenido de la estructura
    Escribir "--- REGISTRO DE NOTAS ---";
    Para i<-1 Hasta 6 Con Paso 1 Hacer
        Escribir "Nota ", i, ": ", notas[i];
    FinPara
FinProceso
