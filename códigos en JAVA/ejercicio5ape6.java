/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio5ape6 {

    public static void main(String[] args) {
        // 1. ArrayLists paralelos para mantener la relación de la información
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cuantos registros desea ingresar?: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // 2. Entrada de datos vinculada en cada iteración
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nombre: ");
            nombres.add(scanner.nextLine());
            
            System.out.print("Ingrese nota de " + nombres.get(i) + ": ");
            notas.add(scanner.nextDouble());
            scanner.nextLine(); // Limpieza del salto de línea residual
        }

        // 3. Impresión sincronizada
        System.out.println("\n--- BOLETÍN DE CALIFICACIONES ---");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Estudiante: " + nombres.get(i) + " -> Calificación: " + notas.get(i));
        }
        
        scanner.close();
    }
}

