package testanagrafica;

/**
 * Rappresenta un contatto anagrafico con nome, cognome, email e stato registrazione.
 */
public class Anagrafica {
    private String nome;
    private String cognome;
    private String email;
    private boolean registrato;

    /**
     * Costruttore completo
     * @param nome Nome della persona
     * @param cognome Cognome della persona
     * @param email Indirizzo email
     * @param registrato Stato di registrazione
     */
    public Anagrafica(String nome, String cognome, String email, boolean registrato) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.registrato = registrato;
    }

    /**
     * Metodo che consente di registrare (o aggiornare) l'email.
     * @param nuovaEmail nuova email da associare
     */
    public void registraEmail(String nuovaEmail) {
        this.email = nuovaEmail;
        this.registrato = true;
    }

    /**
     * Restituisce una descrizione del contatto.
     */
    @Override
    public String toString() {
        if (registrato) {
            return "Contatto registrato con successo:\n" +
                   "Nome: " + nome + "\n" +
                   "Cognome: " + cognome + "\n" +
                   "Email: " + email;
        } else {
            return "Contatto non registrato.";
        }
    }
}
