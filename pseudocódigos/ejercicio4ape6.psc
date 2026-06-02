Proceso MenuCRUD
    Definir opcion Como Entero;
    // PSeInt no soporta arreglos dinámicos reales, se asume un máximo y un contador
    Definir contador Como Entero;
    contador <- 0;
    
    Repetir
        Escribir "--- MENÚ CRUD ---";
        Escribir "1. Agregar elemento";
        Escribir "2. Mostrar elementos";
        Escribir "3. Salir"; // Simplificado para pseudocódigo
        Leer opcion;
        
        Segun opcion Hacer
            1:
                Escribir "Lógica de Inserción aquí...";
                contador <- contador + 1;
            2:
                Escribir "Lógica de Lectura aquí...";
            3:
                Escribir "Saliendo...";
            De Otro Modo:
                Escribir "Opción inválida.";
        FinSegun
    Hasta Que opcion = 3
FinProceso

