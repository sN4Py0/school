package testabitazioni;

/**
 * Classe base per rappresentare un'abitazione.
 */
public class Abitazioni {
    private int nS;         // Numero stanze
    private double mq;      // Metri quadri superficie
    private String id;      // Indirizzo
    private String citta;   // Città
    
    /**
     * Costruttore classe Abitazioni.
     * @param nS Numero stanze
     * @param mq Metri quadri superficie
     * @param id Indirizzo
     * @param citta Città
     */
    public Abitazioni(int nS, double mq, String id, String citta) {
        this.nS = nS;
        this.mq = mq;
        this.id = id;
        this.citta = citta;
    }
    
    // Getter
    public int getNS() {
        return nS;
    }

    public double getMq() {
        return mq;
    }

    public String getId() {
        return id;
    }

    public String getCitta() {
        return citta;
    }
    
    /**
     * Metodo toString per rappresentazione in forma testuale
     */
    @Override
    public String toString() {
        return "Abitazione situata a: " + citta + "\n" +
               "Indirizzo: " + id + "\n" +
               "Superficie: " + mq + " mq\n" +
               "Numero stanze: " + nS + "\n";
    }
}
