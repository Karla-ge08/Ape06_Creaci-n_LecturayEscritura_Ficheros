Proceso Ejercicio3
    Definir inventario Como Caracter;
    Definir buscar, productoBuscado Como Caracter;
    Definir encontrado Como Logico;
    Dimension inventario[3];
    
    // Carga de inventario base
    inventario[1] <- "Laptop";
    inventario[2] <- "Mouse";
    inventario[3] <- "Teclado";
    
    // Entrada de búsqueda
    Escribir "Ingrese producto a buscar:";
    Leer productoBuscado;
    
    encontrado <- Falso;
    
    // Algoritmo de búsqueda lineal
    Para i<-1 Hasta 3 Con Paso 1 Hacer
        Si Mayusculas(inventario[i]) = Mayusculas(productoBuscado) Entonces
            encontrado <- Verdadero;
        FinSi
    FinPara
    
    // Salida de resultados
    Si encontrado = Verdadero Entonces
        Escribir "El producto SÍ está en el inventario.";
    SiNo
        Escribir "El producto NO fue encontrado.";
    FinSi
FinProceso

