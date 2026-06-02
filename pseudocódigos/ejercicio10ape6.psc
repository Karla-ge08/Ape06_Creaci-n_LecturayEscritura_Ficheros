Proceso Ejercicio10_Fila
    Definir opcion Como Entero;
    Repetir
        Escribir "1. Llega Cliente | 2. Atender | 3. Salir";
        Leer opcion;
        Segun opcion Hacer
            1: Escribir "Cliente encolado.";
            2: Escribir "Cliente despachado (sale del frente).";
        FinSegun
    Hasta Que opcion = 3
FinProceso
