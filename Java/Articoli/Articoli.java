/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmagazino;

/**
 *
 * @author PcPro
 */
class Articoli {
    String cd;
    String dsc;
    double prz;
    String giacenza;

    public Articoli(String cd, String dsc, double prz, String giacenza) {
        this.cd = cd;
        this.dsc = dsc;
        this.prz = prz;
        this.giacenza = giacenza;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    public void setPrz(double prz) {
        this.prz = prz;
    }

    public void setGiacenza(String giacenza) {
        this.giacenza = giacenza;
    }

    public String getCd() {
        return cd;
    }

    public String getDsc() {
        return dsc;
    }

    public double getPrz() {
        return prz;
    }

    public String getGiacenza() {
        return giacenza;
    }
    
    @Override
    public String toString(){
        return "codice della Articolo : "+cd+
               "\ndescrizione : "+dsc+
               "\nprezzo : "+prz+
               "\ngiacenza : "+giacenza;
    }
}
