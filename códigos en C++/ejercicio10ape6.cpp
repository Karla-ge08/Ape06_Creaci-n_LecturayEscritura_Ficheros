#include <iostream>
#include <list>
#include <string>

using namespace std;

int main() {
    list<string> fila;
    int opcion;
    string cliente;

    do {
        cout << "\n--- FILA DEL BANCO ---" << endl;
        cout << "1. Llega cliente\n2. Atender\n3. Salir\nOpcion: ";
        cin >> opcion;

        switch(opcion) {
            case 1:
                cout << "Nombre del cliente: ";
                cin >> cliente;
                fila.push_back(cliente);
                cout << "-> " << cliente << " se unio a la fila." << endl;
                break;
            case 2:
                if(!fila.empty()) {
                    cout << "-> Atendiendo a: " << fila.front() << endl;
                    fila.pop_front();
                } else {
                    cout << "-> La fila esta vacia!" << endl;
                }
                break;
        }
    } while(opcion != 3);

    return 0;
}
