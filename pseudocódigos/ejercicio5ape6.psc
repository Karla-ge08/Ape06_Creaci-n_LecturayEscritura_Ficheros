Proceso Ejercicio5
    Definir nombres Como Caracter;
    Definir notas Como Real;
    Dimension nombres[2]; // Ajustable según necesidad
    Dimension notas[2];
    
    // Inserción paralela
    Para i<-1 Hasta 2 Con Paso 1 Hacer
        Escribir "Nombre del estudiante ", i, ":";
        Leer nombres[i];
        Escribir "Nota del estudiante ", i, ":";
        Leer notas[i];
    FinPara
    
    // Lectura paralela (sincronizada por el índice i)
    Escribir "--- REGISTRO DE NOTAS ---";
    Para i<-1 Hasta 2 Con Paso 1 Hacer
        Escribir nombres[i], " - Nota: ", notas[i];
    FinPara
FinProceso
