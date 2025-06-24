/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testautoo;

/**
 *
 * @author PcPro
 */
public class Veicoli {
    String targa;
    String marca;
    String mod;
    int anno;
    int nP;
    int HP;

    public Veicoli(String targa, String marca, String mod, int anno,int HP) {
        this.targa = targa;
        this.marca = marca;
        this.mod = mod;
        this.anno = anno;
        this.HP=HP;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setnP(int nP) {
        this.nP = nP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getMod() {
        return mod;
    }

    public int getAnno() {
        return anno;
    }

    public int getnP() {
        return nP;
    }

    public int getHP() {
        return HP;
    }
    
    
    @Override
    public String toString(){
        return ("caratteristiche del veicolo : "+
                "\ntarga : "+getTarga()+
                "\nmarca : "+getMarca()+
                "\nmodello : "+getMod()+
                "\nanno di immatricolazione : "+getAnno()+
                "\nnumero passeggeri : "+getnP()+
                "\npotenza veicolo : "+getHP()+" HP");
                
    }
}
