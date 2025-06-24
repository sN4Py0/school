package testconto;

public class Mioconto {
    private float saldo;

    public Mioconto(float saldoIniziale) {
        this.saldo = saldoIniziale;
    }

    public boolean controlloPrelievo(float importo) {
        return saldo >= importo;
    }

    public void prelievo(float importo) {
        if (controlloPrelievo(importo)) {
            saldo -= importo;
        }
    }

    public float getSaldo() {
        return saldo;
    }
}