/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarticolii;

/**
 *
 * @author PcPro
 */
import java.util.Scanner;
public class TestArticolii {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
    String cod;
    String nm;
    double prz;
    int x;
        Catalogo c = new Catalogo();
    do{
        System.out.println("||Articolo||");
        System.out.println("inserisci il codice : ");
        cod = tastiera.next();
        System.out.println("inserisci  il nome : ");
        nm = tastiera.next();
        System.out.println("inserisci il prezzo : ");
        prz = tastiera.nextDouble();
        System.out.println("se vuoi continuare a iserire premi 1 : ");
        x = tastiera.nextInt();
        Articoli a = new Articoli(cod,nm,prz);
        c.addArt(a);
       }while(x==1);
        
        c.visualizzaArt();
    int i;
    int y;
    do{
        System.out.println("Indica l' indice dell' articolo da rimuovere : ");
        i=tastiera.nextInt();
        c.removeArt(i);
        c.visualizzaArt();
        System.out.println("se vuoi continuare a rimuovere premi 1 : ");
        y=tastiera.nextInt();
    }while(y==1);
        c.mediaPrz();
    }
    
}
