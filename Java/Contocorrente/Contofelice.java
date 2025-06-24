package testconto;

public class Contofelice {
    private float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void calcolaInteresse() {
        saldo = saldo + (saldo * 0.10f); // aggiunge il 10%
    }

    public float getSaldo() {
        return saldo;
    }
}