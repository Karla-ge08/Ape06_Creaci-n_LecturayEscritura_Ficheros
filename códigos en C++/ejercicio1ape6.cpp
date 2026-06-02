#include <iostream>
#include <vector> // Librería necesaria para usar arreglos dinámicos en C++
#include <string>

using namespace std;

int main() {
    // 1. Declaración de la estructura dinámica (vector de strings)
    vector<string> nombres;

    // 2. Inserción de datos usando el método push_back()
    nombres.push_back("Ana");
    nombres.push_back("Luis");
    nombres.push_back("Carlos");
    nombres.push_back("Marta");
    nombres.push_back("Pedro");

    // 3. Recorrido del vector utilizando su tamaño dinámico (size)
    cout << "--- LISTA DE ESTUDIANTES ---" << endl;
    for (size_t i = 0; i < nombres.size(); i++) {
        cout << "Estudiante [" << i << "]: " << nombres[i] << endl;
    }

    return 0;
}
