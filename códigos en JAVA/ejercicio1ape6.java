/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.ArrayList; // Importación de la clase ArrayList
public class ejercicio1ape6 {
    public static void main(String[] args) {
        // 1. Declaración e instanciación del ArrayList tipado con String
        ArrayList<String> nombres = new ArrayList<>();

        // 2. Inserción de datos mediante el método add()
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        nombres.add("Marta");
        nombres.add("Pedro");

        // 3. Recorrido del ArrayList usando un bucle for clásico y el método size()
        System.out.println("--- LISTA DE ESTUDIANTES ---");
        for (int i = 0; i < nombres.size(); i++) {
            // Se utiliza get(i) para acceder al elemento en la posición i
            System.out.println("Estudiante [" + i + "]: " + nombres.get(i));
        }
    }
}
