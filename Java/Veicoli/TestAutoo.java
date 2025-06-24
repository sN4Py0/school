package testautoo;

import java.util.Scanner;

public class TestAutoo {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.println("Quanti veicoli vuoi inserire? ");
        int N = tastiera.nextInt();
        tastiera.nextLine(); // pulizia buffer

        Veicoli[] veicoli = new Veicoli[N];

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci la targa:");
            String targa = tastiera.nextLine();

            System.out.println("Inserisci la marca:");
            String marca = tastiera.nextLine();

            System.out.println("Inserisci il modello:");
            String modello = tastiera.nextLine();

            System.out.println("Inserisci l’anno di immatricolazione:");
            int anno = tastiera.nextInt();

            System.out.println("Inserisci il numero di passeggeri (oltre il conducente):");
            int passeggeri = tastiera.nextInt();

            System.out.println("Inserisci la potenza in HP:");
            int hp = tastiera.nextInt();

            System.out.println("1. Autoveicolo (benzina o gasolio) | 2. Motoveicolo");
            int scelta = tastiera.nextInt();
            tastiera.nextLine(); // pulizia buffer

            if (scelta == 1) {
                System.out.println("Tipo di alimentazione: 1 = benzina, 2 = gasolio");
                int tipo = tastiera.nextInt();
                tastiera.nextLine(); // pulizia buffer
                veicoli[i] = new Autoveicoli(targa, marca, modello, anno, passeggeri, hp, tipo);
            } else {
                veicoli[i] = new Motoveicoli(targa, marca, modello, anno, passeggeri, hp);
            }
        }

        int annoCorrente = 2025;
        System.out.println("\n--- VEICOLI REGISTRATI ---");
        for (Veicoli v : veicoli) {
            System.out.println(v);
            System.out.println("Tassa da pagare: " + v.calcolaTassa(annoCorrente) + " Euro");
            System.out.println("--------------------------");
        }
    }
}
