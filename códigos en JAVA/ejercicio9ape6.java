/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.LinkedList; // 
public class ejercicio9ape6 {

    public static void main(String[] args) {
        // En Java, LinkedList implementa las interfaces List y Deque
        LinkedList<String> turnos = new LinkedList<>();

        // Método para agregar al final
        turnos.addLast("T01 - Juan");
        turnos.addLast("T02 - Maria");
        turnos.addLast("T03 - Carlos");

        System.out.println("--- COLA DE ATENCION ---");
        System.out.println(turnos);

        // Método para obtener y remover el primer nodo
        String atendido = turnos.removeFirst();
        System.out.println("\nAtendiendo a: " + atendido);

        System.out.println("\n--- COLA ACTUALIZADA ---");
        System.out.println(turnos);
    }
}
