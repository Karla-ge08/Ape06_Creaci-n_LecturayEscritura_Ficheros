#include <iostream>
#include <vector>

using namespace std;

int main() {
    int arr[2] = {1, 2};
    // arr[2] = 3; // PELIGRO: Comportamiento indefinido, desbordamiento de memoria.

    vector<int> vec;
    vec.push_back(1); //
    vec.push_back(2);

    cout << "Insertando en vector dinamico..." << endl;
    // Podemos seguir agregando sin romper la memoria
    vec.push_back(3);
    vec.push_back(4);

    for(int val : vec) {
        cout << "Valor: " << val << endl;
    }

    return 0;
}
