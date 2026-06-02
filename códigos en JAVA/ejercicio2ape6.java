/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.ArrayList;
public class ejercicio2ape6 {
    public static void main(String[] args) {
        // 1. Uso de la clase Wrapper 'Double' para colecciones de primitivos
        ArrayList<Double> notas = new ArrayList<>();

        // 2. Agregando los 6 elementos al ArrayList
        notas.add(15.5);
        notas.add(18.0);
        notas.add(12.75);
        notas.add(19.5);
        notas.add(14.0);
        notas.add(16.25);

        // 3. Impresión mediante bucle foreach (otra forma de iterar)
        System.out.println("--- REGISTRO DE NOTAS ---");
        int contador = 1; // Variable auxiliar para enumerar
        for (Double nota : notas) {
            System.out.println("Nota " + contador + ": " + nota);
            contador++;
        }
    }
}

