/*
Lo scopo del programma è riadattare il programma presente conto corrente,
introducendo:
- il metodo boolean controlloPassword, che restituisce true se la password inserita
  corrisponde a quella del conto corrente cercato;
- il metodo boolean controlloPrelievo, che restituisce true se la somma inserita è
  disponibile nel conto corrente.
*/

package testconto;

import java.util.Scanner;

public class TestConto {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        System.out.print("Inserisci la password: ");
        int passwordInserita = tastiera.nextInt();

        Controllo controllo = new Controllo(passwordInserita);

        if (controllo.controlloPassword()) {
            System.out.println("Password corretta");

            System.out.print("Quanto vuoi prelevare? ");
            float importo = tastiera.nextFloat();

            Mioconto conto = new Mioconto(1000); // saldo iniziale 1000

            if (conto.controlloPrelievo(importo)) {
                conto.prelievo(importo);
                System.out.println("Prelievo eseguito. Saldo rimanente: " + conto.getSaldo() + " Euro");

                Contofelice contoInteressi = new Contofelice();
                contoInteressi.setSaldo(conto.getSaldo());
                contoInteressi.calcolaInteresse();

                System.out.println("Saldo con interesse del 10%: " + contoInteressi.getSaldo() + " Euro");
            } else {
                System.out.println("Prelievo non possibile: fondi insufficienti.");
            }

        } else {
            System.out.println("Password errata...");
        }
    }
}