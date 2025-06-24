#include <iostream>
#include <string>
using namespace std;

int main() {
    char r;
    string prod;

    int bo = 0, f = 0, cf = 0, sc = 0, br = 0;

    const float prza = 0.50;  // acqua
    const float przp = 1.00;  // pane
    const float przps = 3.00; // pasta
    const float przpt = 2.50; // patate
    const float przbr = 2.00; // sugo

    float prztot = 0;

    cout << "Benvenuto nel programma di automazione della spesa!\n\n";
    cout << "Prodotti disponibili e prezzi:\n"
         << " - acqua (0.50 euro)      --> scrivi 'acqua'\n"
         << " - pane (1.00 euro)       --> scrivi 'pane'\n"
         << " - pasta (3.00 euro)      --> scrivi 'pasta'\n"
         << " - patate (2.50 euro)     --> scrivi 'patate'\n"
         << " - sugo (2.00 euro)       --> scrivi 'sugo'\n\n";

    do {
        cout << "Inserisci il prodotto da aggiungere (usa le parole sopra): ";
        cin >> prod;

        if (prod == "acqua") {
            cout << "Quante bottiglie di acqua? ";
            int q; cin >> q;
            bo += q;
            prztot += prza * q;
        }
        else if (prod == "pane") {
            cout << "Quanti filoni di pane? ";
            int q; cin >> q;
            f += q;
            prztot += przp * q;
        }
        else if (prod == "pasta") {
            cout << "Quante confezioni di pasta? ";
            int q; cin >> q;
            cf += q;
            prztot += przps * q;
        }
        else if (prod == "patate") {
            cout << "Quanti sacchi di patate? ";
            int q; cin >> q;
            sc += q;
            prztot += przpt * q;
        }
        else if (prod == "sugo") {
            cout << "Quanti barattoli di sugo? ";
            int q; cin >> q;
            br += q;
            prztot += przbr * q;
        }
        else {
            cout << "Prodotto non riconosciuto, riprova.\n";
            continue;
        }

        cout << "Spesa attuale: " << prztot << " euro.\n";
        if (prztot >= 100) {
            cout << "Hai raggiunto o superato il limite di 100 euro.\n";
            break;
        }

        cout << "Vuoi aggiungere un altro prodotto? (si/no): ";
        cin >> r;
    } while (r == 's' || r == 'S');

    cout << "\nNel carrello hai:\n"
         << bo << " bottiglie di acqua\n"
         << f << " filoni di pane\n"
         << cf << " confezioni di pasta\n"
         << sc << " sacchi di patate\n"
         << br << " barattoli di sugo\n"
         << "La spesa totale è: " << prztot << " euro.\n";

    return 0;
}
