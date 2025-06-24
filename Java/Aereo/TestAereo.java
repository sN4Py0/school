package testaereo;

import java.util.Scanner;

/**
 * Classe di test per la gestione di oggetti Aereo e Biglietto.
 * Simula l'inserimento di dati per due aerei e la creazione di un biglietto associato.
 */
public class TestAereo {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        // Inserimento dati per il primo aereo
        System.out.println("Inserisci il modello dell'aereo:");
        String modello = tastiera.nextLine();
        System.out.println("Inserisci l'identificativo dell'aereo:");
        String identificativo = tastiera.nextLine();
        System.out.println("Inserisci la compagnia aerea:");
        String compagnia = tastiera.nextLine();

        // Creazione del primo aereo
        Aereo aereo = new Aereo(modello, identificativo);
        System.out.println("Informazioni iniziali del primo aereo:\n" + aereo.toString());

        // Impostazione della compagnia
        aereo.setCompagnia(compagnia);
        System.out.println("Informazioni aggiornate del primo aereo:\n" + aereo.toString());

        // Inserimento dati per il secondo aereo
        System.out.println("Inserisci il modello del secondo aereo:");
        String modello2 = tastiera.nextLine();
        System.out.println("Inserisci l'identificativo del secondo aereo:");
        String identificativo2 = tastiera.nextLine();

        // Creazione del secondo aereo
        Aereo aereo2 = new Aereo(modello2, identificativo2);
        aereo2.setCompagnia(compagnia); // stessa compagnia del primo

        System.out.println("Informazioni aggiornate del secondo aereo:\n" + aereo2.toString());

        // Creazione biglietto
        System.out.println("BIGLIETTO");
        System.out.println("Inserisci la località:");
        String localita = tastiera.nextLine();
        System.out.println("Inserisci la data:");
        String data = tastiera.nextLine();

        Biglietto biglietto = new Biglietto(localita, data);
        biglietto.setAereo(aereo2.toString());

        System.out.println("Biglietto generato:\n" + biglietto.toString());

        tastiera.close(); // Buona pratica
    }
}