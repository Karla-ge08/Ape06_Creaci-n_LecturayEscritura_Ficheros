/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
    import java.util.ArrayList;
public class ejercicio6ape6 {

    public static void main(String[] args) {
        // 1. Instanciación de colecciones tipadas
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();
        
        // 2. Población del inventario (hardcodeado para demostración)
        nombres.add("Teclado Mecanico"); cantidades.add(15); precios.add(45.0);
        nombres.add("Monitor 24''"); cantidades.add(5); precios.add(120.5);
        
        double totalGlobal = 0;
        
        System.out.println("--- SISTEMA DE INVENTARIO ---");
        
        // 3. Iteración y cálculos
        for(int i = 0; i < nombres.size(); i++) {
            double subtotal = cantidades.get(i) * precios.get(i);
            totalGlobal += subtotal; // Sumatoria
            
            System.out.println(nombres.get(i) + " | Cant: " + cantidades.get(i) + 
                               " | Precio: $" + precios.get(i) + " | Subtotal: $" + subtotal);
        }
        System.out.println("-----------------------------");
        System.out.println("Valor Total en Inventario: $" + totalGlobal);
    }
}