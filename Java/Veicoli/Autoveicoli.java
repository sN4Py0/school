package testautoo;

public class Autoveicoli extends Veicoli {
    private int tipoAlimentazione; // 1 = benzina, 2 = gasolio

    public Autoveicoli(String targa, String marca, String modello, int anno, int passeggeri, int hp, int tipoAlimentazione) {
        super(targa, marca, modello, anno, passeggeri, hp);
        this.tipoAlimentazione = tipoAlimentazione;
    }

    @Override
    public double calcolaTassa(int annoCorrente) {
        return potenzaHP * 2.5;
    }

    @Override
    public String toString() {
        String tipo = (tipoAlimentazione == 1) ? "benzina" : "gasolio";
        return super.toString() + "\nTipo veicolo: Autoveicolo (" + tipo + ")";
    }
}