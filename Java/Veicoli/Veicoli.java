package testautoo;

public abstract class Veicoli {
    protected String targa;
    protected String marca;
    protected String modello;
    protected int annoImmatricolazione;
    protected int numPasseggeri;
    protected int potenzaHP;

    public Veicoli(String targa, String marca, String modello, int anno, int passeggeri, int hp) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.annoImmatricolazione = anno;
        this.numPasseggeri = passeggeri;
        this.potenzaHP = hp;
    }

    public abstract double calcolaTassa(int annoCorrente);

    @Override
    public String toString() {
        return "Targa: " + targa +
               "\nMarca: " + marca +
               "\nModello: " + modello +
               "\nAnno immatricolazione: " + annoImmatricolazione +
               "\nPasseggeri (oltre conducente): " + numPasseggeri +
               "\nPotenza: " + potenzaHP + " HP";
    }
}