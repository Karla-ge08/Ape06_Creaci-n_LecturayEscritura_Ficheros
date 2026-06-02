#include <iostream>
#include <list> //  Librería específica para listas doblemente enlazadas
#include <string>

using namespace std;

int main() {
    list<string> turnos;

    // Agregar turnos al final de la cola
    turnos.push_back("T01 - Juan"); //
    turnos.push_back("T02 - Maria");
    turnos.push_back("T03 - Carlos");

    cout << "--- COLA DE ATENCION ---" << endl;
    for(string turno : turnos) cout << turno << endl;

    // Atender (Eliminar el primer elemento)
    cout << "\nAtendiendo a: " << turnos.front() << endl;
    turnos.pop_front(); // Remueve de manera eficiente el nodo inicial

    cout << "\n--- COLA ACTUALIZADA ---" << endl;
    for(string turno : turnos) cout << turno << endl;

    return 0;
}
