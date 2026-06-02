#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    // 1. Declaración de vectores paralelos
    vector<string> nombres;
    vector<double> notas;
    string tempNombre;
    double tempNota;
    int cantidad;

    // 2. Solicitar dimensionamiento lógico
    cout << "Cuantos estudiantes registrara?: ";
    cin >> cantidad;

    // 3. Captura y vinculación de datos
    for(int i = 0; i < cantidad; i++) {
        cout << "Nombre [" << i+1 << "]: ";
        cin >> tempNombre;
        nombres.push_back(tempNombre);

        cout << "Nota [" << i+1 << "]: ";
        cin >> tempNota;
        notas.push_back(tempNota);
    }

    // 4. Reporte final sincronizando el índice 'i'
    cout << "\n--- REPORTE FINAL ---" << endl;
    for(size_t i = 0; i < nombres.size(); i++) {
        cout << nombres[i] << "\t | \t" << notas[i] << endl;
    }

    return 0;
}
