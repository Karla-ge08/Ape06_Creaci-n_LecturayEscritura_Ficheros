/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.ArrayList;
public class ejercicio8ape6 {

    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 1; arr[1] = 2;
        // arr[2] = 3; // Lanza ArrayIndexOutOfBoundsException
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        
        System.out.println("Insertando en ArrayList de forma segura...");
        // Crece de forma transparente para el programador
        lista.add(3);
        lista.add(4);
        
        System.out.println("Contenido: " + lista);
    }
}
