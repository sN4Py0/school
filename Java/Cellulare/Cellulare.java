package testcellulare;

/**
 * Classe che rappresenta un telefono cellulare con contratto a ricarica.
 * Contiene credito disponibile e numero di chiamate effettuate.
 */
public class Cellulare {
    private float credito;
    private int numeroChiamate;

    // Costo fisso per minuto di chiamata
    private static final float COSTO_PER_MINUTO = 0.10f;

    // Costruttore
    public Cellulare(float creditoIniziale, int chiamateEffettuate) {
        this.credito = creditoIniziale;
        this.numeroChiamate = chiamateEffettuate;
    }

    // Metodo per ricaricare il credito
    public void ricarica(float importo) {
        if (importo > 0)
            credito += importo;
    }

    // Metodo per effettuare una chiamata (dato il numero di minuti)
    public void chiamata(int minuti) {
        float costoChiamata = minuti * COSTO_PER_MINUTO;
        if (minuti > 0 && credito >= costoChiamata) {
            credito -= costoChiamata;
            numeroChiamate++;
        }
    }

    // Restituisce il credito attuale
    public float numero() {
        return credito;
    }

    // Restituisce il numero di chiamate effettuate
    public int getNumeroChiamate() {
        return numeroChiamate;
    }

    // Azzera il contatore delle chiamate
    public void azzeraChiamate() {
        numeroChiamate = 0;
    }
}
