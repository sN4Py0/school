#include <iostream>
#define NMAX 100
using namespace std;

// Funzione per caricare la matrice A da input utente
void caricamat(int A[][NMAX], int righe, int colonne);

// Funzione per stampare la matrice A
void stampamat(int A[][NMAX], int righe, int colonne);

// Funzione che calcola la somma degli elementi della riga i della matrice A
int sommariga(int A[][NMAX], int riga, int colonne);

// Funzione per stampare il vettore V
void stampavet(int V[], int dimensione);

int main() {
    int N1, N2;

    cout << "Inserisci numero righe: ";
    cin >> N1;
    cout << "Inserisci numero colonne: ";
    cin >> N2;

    int A[NMAX][NMAX];  // matrice
    caricamat(A, N1, N2);

    // Pulizia console - meglio evitarla per portabilità
    // system("cls");

    cout << "\nMatrice inserita:\n";
    stampamat(A, N1, N2);

    int V[N1];  // vettore somma righe

    for (int i = 0; i < N1; i++) {
        V[i] = sommariga(A, i, N2);
        cout << "La somma della riga " << i + 1 << " è: " << V[i] << endl;
    }

    cout << "\nVettore delle somme per riga:\n";
    stampavet(V, N1);
    cout << endl;

    // system("pause"); // Evitabile

    return 0;
}

void caricamat(int A[][NMAX], int righe, int colonne) {
    int contatore = 1;
    for (int i = 0; i < righe; i++) {
        for (int j = 0; j < colonne; j++) {
            cout << "Inserisci il " << contatore << "° elemento: ";
            cin >> A[i][j];
            contatore++;
        }
    }
}

void stampamat(int A[][NMAX], int righe, int colonne) {
    for (int i = 0; i < righe; i++) {
        for (int j = 0; j < colonne; j++) {
            cout << A[i][j] << "\t";
        }
        cout << endl << endl;
    }
}

int sommariga(int A[][NMAX], int riga, int colonne) {
    int somma = 0;
    for (int j = 0; j < colonne; j++) {
        somma += A[riga][j];
    }
    return somma;
}

void stampavet(int V[], int dimensione) {
    for (int i = 0; i < dimensione; i++) {
        cout << V[i] << " ";
    }
}
