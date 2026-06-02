Proceso Ejercicio6_Inventario
    Definir nombres Como Caracter;
    Definir cantidades Como Entero;
    Definir precios, totalInventario, subtotal Como Real;
    Dimension nombres[2], cantidades[2], precios[2]; // Simulación de listas
    
    totalInventario <- 0;
    
    // Inserción de datos
    Para i<-1 Hasta 2 Hacer
        Escribir "Ingrese nombre del producto: "; Leer nombres[i];
        Escribir "Ingrese cantidad: "; Leer cantidades[i];
        Escribir "Ingrese precio: "; Leer precios[i];
    FinPara
    
    // Reporte y cálculo matemático
    Escribir "--- INVENTARIO ---";
    Para i<-1 Hasta 2 Hacer
        subtotal <- cantidades[i] * precios[i];
        Escribir nombres[i], " | Cant: ", cantidades[i], " | Precio: $", precios[i], " | Subtotal: $", subtotal;
        totalInventario <- totalInventario + subtotal; // Acumulador
    FinPara
    Escribir "TOTAL VALORIZADO DEL INVENTARIO: $", totalInventario;
FinProceso
