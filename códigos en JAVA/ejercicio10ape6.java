/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.LinkedList;
import java.util.Scanner;
public class ejercicio10ape6 {

    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- FILA DEL BANCO ---");
            System.out.println("1. Llega cliente\n2. Atender\n3. Salir\nOpcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch(opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String cliente = sc.nextLine();
                    fila.addLast(cliente);
                    System.out.println("-> " + cliente + " se unio a la fila.");
                    break;
                case 2:
                    // Verificación de seguridad para evitar Excepciones
                    if(!fila.isEmpty()) {
                        System.out.println("-> Atendiendo a: " + fila.removeFirst());
                    } else {
                        System.out.println("-> ¡La fila esta vacia!");
                    }
                    break;
            }
        } while(opcion != 3);
        sc.close();
    }
}
