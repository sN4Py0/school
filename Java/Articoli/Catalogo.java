package testarticolii;

import java.util.Vector;

/**
 * Classe che rappresenta un catalogo di articoli.
 * Permette di aggiungere, rimuovere, visualizzare e calcolare la media dei prezzi.
 */
public class Catalogo {
    private Vector<Articoli> elenco;

    // Costruttore: inizializza il Vector
    public Catalogo() {
        elenco = new Vector<Articoli>();
    }

    /**
     * Aggiunge un articolo al catalogo.
     * @param a L'articolo da aggiungere
     */
    public void addArt(Articoli a) {
        elenco.addElement(a);
        System.out.println("Articolo aggiunto.");
    }

    /**
     * Rimuove un articolo dato il suo indice.
     * @param indice Posizione dell'articolo nel catalogo
     */
    public void removeArt(int indice) {
        if (indice >= 0 && indice < elenco.size()) {
            elenco.removeElementAt(indice);
            System.out.println("Articolo eliminato.");
        } else {
            System.out.println("Indice non valido. Nessun articolo eliminato.");
        }
    }

    /**
     * Visualizza tutti gli articoli presenti nel catalogo.
     */
    public void visualizzaArt() {
        System.out.println("\n=== CATALOGO ARTICOLI ===");

        if (elenco.isEmpty()) {
            System.out.println("Il catalogo è vuoto.");
        } else {
            for (int i = 0; i < elenco.size(); i++) {
                System.out.println("Posizione articolo: [" + i + "]");
                Articoli a = elenco.elementAt(i);
                System.out.println(a.toString());
                System.out.println("----------------------------");
            }
        }
    }

    /**
     * Calcola e stampa la media dei prezzi degli articoli.
     */
    public void mediaPrz() {
        if (elenco.isEmpty()) {
            System.out.println("Nessun articolo presente. Impossibile calcolare la media.");
            return;
        }

        double somma = 0;
        for (int i = 0; i < elenco.size(); i++) {
            Articoli a = elenco.elementAt(i);
            somma += a.getPrz();
        }

        double media = somma / elenco.size();
        System.out.printf("Prezzo medio di tutti gli articoli: %.2f €\n", media);
    }
}