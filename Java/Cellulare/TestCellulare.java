/*
Progettare e implementare una classe di nome Cellulare, per rappresentare un telefono cellulare
con contratto a ricarica.

Tale classe prevede due variabili d'istanza:
- credito: rappresenta il quantitativo di euro disponibile per le chiamate.
- numeroChiamate: rappresenta il numero di chiamate effettuate con il cellulare.

La classe deve implementare:
- un costruttore
- ricarica(): ricarica il cellulare.
- chiamata(): effettua una chiamata di durata in minuti. Aggiorna credito e incrementa le chiamate.
  (Si assuma un costo di 0.10 euro per ogni minuto di chiamata)
- numero(): restituisce il valore della carica disponibile.
- getNumeroChiamate()
- azzeraChiamate(): azzera il numero di chiamate effettuate.

Scrivere un programma di prova ProvaCellulare che testi tutti i metodi della classe Cellulare.
*/

package testcellulare;

import java.util.Scanner;

public class TestCellulare {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        // Inserimento valori iniziali
        System.out.print("Inserisci il tuo credito iniziale (Euro): ");
        float credito = tastiera.nextFloat();

        System.out.print("Inserisci il numero di chiamate già effettuate: ");
        int numeroChiamate = tastiera.nextInt();

        // Creazione oggetto Cellulare
        Cellulare mioCell = new Cellulare(credito, numeroChiamate);

        // Test ricarica
        System.out.print("Inserisci l'importo da ricaricare (Euro): ");
        float importoRicarica = tastiera.nextFloat();
        mioCell.ricarica(importoRicarica);
        System.out.println("Credito dopo ricarica: " + mioCell.numero() + " Euro");

        // Effettua chiamate
        System.out.print("Quante chiamate vuoi effettuare? ");
        int quanteChiamate = tastiera.nextInt();

        for (int i = 1; i <= quanteChiamate; i++) {
            System.out.print("Inserisci durata (in minuti) della chiamata " + i + ": ");
            int minuti = tastiera.nextInt();
            mioCell.chiamata(minuti);
        }

        // Visualizza credito residuo e chiamate
        System.out.println("\nCredito residuo: " + mioCell.numero() + " Euro");
        System.out.println("Numero totale di chiamate effettuate: " + mioCell.getNumeroChiamate());

        // Test azzeramento chiamate
        System.out.println("\nAzzero il contatore delle chiamate...");
        mioCell.azzeraChiamate();
        System.out.println("Chiamate dopo azzeramento: " + mioCell.getNumeroChiamate());
    }
}