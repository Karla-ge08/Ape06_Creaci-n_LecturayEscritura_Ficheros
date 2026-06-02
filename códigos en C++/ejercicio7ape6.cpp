#include <iostream>
#include <vector>

using namespace std;

int main() {
    // 1. Arreglo Primitivo (Estático)
    int arreglo[3] = {10, 20, 30}; // Tamaño fijo definido aquí

    // 2. Arreglo Dinámico (Vector)
    vector<int> listaDinamica; // Empieza vacío (tamaño 0)
    listaDinamica.push_back(10);
    listaDinamica.push_back(20);

    cout << "--- COMPARACION ---" << endl;
    // El arreglo no tiene método .size() propiamente, se calcula con sizeof
    cout << "Tamanio Arreglo Estatico: " << sizeof(arreglo)/sizeof(arreglo[0]) << endl;

    // El vector sabe su tamaño exactamente
    cout << "Tamanio Vector Dinamico: " << listaDinamica.size() << endl;

    return 0;
}
