package testabitazioni;

import java.util.Scanner;

public class TestAbitazioni {

    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        
        System.out.println("Patrimonio immobiliare");

        // Input numero di stanze
        System.out.print("Inserisci il numero di stanze: ");
        int nS = tastiera.nextInt();

        // Input metri quadri superficie
        System.out.print("Inserisci i metri quadri della superficie: ");
        double mq = tastiera.nextDouble();

        tastiera.nextLine(); // Pulizia buffer

        // Input indirizzo
        System.out.print("Inserisci l'indirizzo dell'abitazione: ");
        String id = tastiera.nextLine();

        // Input città
        System.out.print("Inserisci la città dove è situata: ");
        String citta = tastiera.nextLine();

        // Creazione oggetto Abitazioni con dati base
        Abitazioni abitazione = new Abitazioni(nS, mq, id, citta);

        // Stampa informazioni base abitazione
        System.out.println("\n--- Dettagli abitazione ---");
        System.out.println(abitazione);

        // Scelta tipo abitazione
        System.out.print("\nLa tua abitazione è una villa (1) o un appartamento (2)? ");
        int scelta = tastiera.nextInt();

        if (scelta == 1) {
            // Input dati villa
            System.out.print("Inserisci il numero di piani della villa: ");
            int nPiani = tastiera.nextInt();

            System.out.print("Inserisci la superficie del giardino (mq): ");
            double superficieGiardino = tastiera.nextDouble();

            Villa villa = new Villa(nPiani, superficieGiardino, nS, mq, id, citta);

            System.out.print("Hai una piscina? (1 = sì / 0 = no): ");
            int piscina = tastiera.nextInt();
            villa.setPiscina(piscina == 1);

            // Stampa dettagli villa
            System.out.println("\n--- Dettagli villa ---");
            System.out.println(villa);

        } else if (scelta == 2) {
            // Input dati appartamento
            System.out.print("Inserisci il numero di piano dell'appartamento: ");
            int piano = tastiera.nextInt();

            System.out.print("Inserisci il numero di terrazzi dell'appartamento: ");
            int terrazzi = tastiera.nextInt();

            Appartamento appartamento = new Appartamento(piano, terrazzi, nS, mq, id, citta);

            System.out.print("È raggiungibile tramite ascensore? (1 = sì / 0 = no): ");
            int ascensore = tastiera.nextInt();
            appartamento.setAscensore(ascensore == 1);

            // Stampa dettagli appartamento
            System.out.println("\n--- Dettagli appartamento ---");
            System.out.println(appartamento);

        } else {
            System.out.println("Errore: devi inserire 1 per villa o 2 per appartamento.");
        }

        tastiera.close();
    }
}