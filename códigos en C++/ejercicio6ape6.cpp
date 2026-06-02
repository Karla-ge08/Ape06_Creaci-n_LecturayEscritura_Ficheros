#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    // 1. Declaración de vectores paralelos para el inventario
    vector<string> nombres = {"Disco Duro", "Memoria RAM"};
    vector<int> cantidades = {10, 25};
    vector<double> precios = {55.50, 32.00};
    double totalInventario = 0;

    cout << "--- SISTEMA DE INVENTARIO ---" << endl;

    // 2. Procesamiento de los datos almacenados
    for(size_t i = 0; i < nombres.size(); i++) {
        double subtotal = cantidades[i] * precios[i]; // Cálculo por ítem
        totalInventario += subtotal;

        cout << nombres[i] << "\t| Cant: " << cantidades[i]
             << " | Precio: $" << precios[i] << " | Subtotal: $" << subtotal << endl;
    }

    // 3. Salida del gran total
    cout << "-----------------------------" << endl;
    cout << "Valor Total en Inventario: $" << totalInventario << endl;

    return 0;
}
