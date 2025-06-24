package testanagrafica;

import java.util.Scanner;

/**
 * Classe di test per creare un oggetto Anagrafica.
 * L'utente inserisce nome, cognome ed email che vengono registrati.
 */
public class TestAnagrafica {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        // Dati anagrafici
        System.out.print("Inserisci il nome: ");
        String nome = tastiera.nextLine();

        System.out.print("Inserisci il cognome: ");
        String cognome = tastiera.nextLine();

        System.out.print("Inserisci l'email: ");
        String email = tastiera.nextLine();

        // Creazione oggetto con registrazione attiva
        Anagrafica contatto = new Anagrafica(nome, cognome, email, true);

        // Visualizzazione dati
        System.out.println("\n" + contatto.toString());

        tastiera.close(); // Buona norma
    }
}