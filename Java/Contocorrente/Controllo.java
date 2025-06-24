package testconto;

public class Controllo {
    private int passwordUtente;
    private final int passwordCorretta = 1234; // password fissa per esempio

    public Controllo(int passwordUtente) {
        this.passwordUtente = passwordUtente;
    }

    public boolean controlloPassword() {
        return passwordUtente == passwordCorretta;
    }
}