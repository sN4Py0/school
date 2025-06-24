package testaereo;

/**
 * Classe che rappresenta un Aereo con modello, identificativo e compagnia.
 */
public class Aereo {
    private String md; // modello
    private String id; // identificativo
    private String cm; // compagnia

    /**
     * Costruttore completo.
     */
    public Aereo(String md, String id, String cm) {
        this.md = md;
        this.id = id;
        this.cm = cm;
    }

    /**
     * Costruttore con solo modello e identificativo.
     */
    public Aereo(String md, String id) {
        this.md = md;
        this.id = id;
        this.cm = null;
    }

    /**
     * Ritorna una stringa descrittiva dell'aereo.
     */
    @Override
    public String toString() {
        return "Modello: " + md + "\nIdentificativo: " + id + "\nCompagnia: " + (cm != null ? cm : "non specificata");
    }

    // Metodi getter e setter
    public String getModello() {
        return md;
    }

    public String getIdentificativo() {
        return id;
    }

    public String getCompagnia() {
        return cm;
    }

    public void setCompagnia(String cm) {
        this.cm = cm;
    }
}
