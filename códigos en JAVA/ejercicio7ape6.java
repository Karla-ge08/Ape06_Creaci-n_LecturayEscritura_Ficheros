/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.ArrayList;
public class ejercicio7ape6 {

    public static void main(String[] args) {
        // 1. Arreglo nativo (Estático)
        int[] arreglo = new int[3]; 
        arreglo[0] = 10;
        
        // 2. ArrayList (Dinámico)
        ArrayList<Integer> listaDinamica = new ArrayList<>();
        listaDinamica.add(10); // Crece automáticamente
        
        System.out.println("--- COMPARACION ---");
        // En arreglos usamos la propiedad 'length'
        System.out.println("Capacidad maxima del arreglo: " + arreglo.length);
        
        // En ArrayList usamos el método 'size()'
        System.out.println("Tamanio actual del ArrayList: " + listaDinamica.size());
    }
}
