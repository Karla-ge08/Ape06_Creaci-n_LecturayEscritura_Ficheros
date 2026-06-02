#include <iostream>
#include <vector>

using namespace std;

int main() {
    // 1. Declaración del vector para valores con punto flotante
    vector<double> notas;

    // 2. Inserción de 6 notas
    notas.push_back(15.5);
    notas.push_back(18.0);
    notas.push_back(12.75);
    notas.push_back(19.5);
    notas.push_back(14.0);
    notas.push_back(16.25);

    // 3. Iteración e impresión de resultados
    cout << "--- REGISTRO DE NOTAS ---" << endl;
    for (size_t i = 0; i < notas.size(); i++) {
        cout << "Nota " << i + 1 << ": " << notas[i] << endl;
    }

    return 0;
}
