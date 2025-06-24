#include <iostream>

int main() {
    double n;
    double conta = 1;
    double somma = 0;

    std::cout << "Inserisci un numero: ";
    std::cin >> n;

    // Calcolo della somma armonica da 1 a n
    while (conta <= n) {
        somma += 1.0 / conta;
        conta += 1;
    }

    std::cout << "La somma armonica del numero " << n << " e': " << somma << std::endl;

    return 0;
}
