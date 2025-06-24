#include <iostream>
using namespace std;

// Funzione per caricare i numeri nel vettore
void carica(int x[], int dimensione);

// Funzione per stampare gli elementi del vettore
void stampa(int x[], int dimensione);

// Funzione per calcolare la somma degli elementi del vettore
int somma(int x[], int dimensione);

int main() {
    int N;

    cout << "Quanti numeri interi vuoi inserire? ";
    cin >> N;

    int array[N];  // vettore di dimensione N

    carica(array, N);
    cout << "\nElementi inseriti:\n";
    stampa(array, N);

    cout << "\nLa somma degli elementi è: " << somma(array, N) << endl;

    // system("pause"); // da evitare per portabilità

    return 0;
}

// Funzione per caricare gli elementi nel vettore
void carica(int x[], int dimensione) {
    for (int i = 0; i < dimensione; i++) {
        cout << "Inserisci l'elemento " << i + 1 << ": ";
        cin >> x[i];
    }
}

// Funzione per stampare gli elementi del vettore
void stampa(int x[], int dimensione) {
    for (int i = 0; i < dimensione; i++) {
        cout << "Elemento " << i + 1 << ": " << x[i] << endl;
    }
}

// Funzione per calcolare la somma degli elementi del vettore
int somma(int x[], int dimensione) {
    int totale = 0;
    for (int i = 0; i < dimensione; i++) {
        totale += x[i];
    }
    return totale;
}