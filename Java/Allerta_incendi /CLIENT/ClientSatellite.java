package satellite;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * Classe che rappresenta il client satellite.
 * Si connette al server e invia i dati serializzati.
 */
public class ClientSatellite {
    private String host;
    private int porta;

    public ClientSatellite(String host, int porta) {
        this.host = host;
        this.porta = porta;
    }

    public void inviaDati(InformazioniSatellite dati) {
        try (Socket socket = new Socket(host, porta);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {
            
            // Invia la stringa serializzata al server
            out.println(dati.serealizzaInfo());
            System.out.println("Dati inviati al server: " + dati.serealizzaInfo());
            
        } catch (Exception e) {
            System.err.println("Errore nel client satellite: " + e.getMessage());
        }
    }
    
    // main di test client
    public static void main(String[] args) {
        ClientSatellite client = new ClientSatellite("localhost", 4000);
        InformazioniSatellite info = new InformazioniSatellite(44.5f, 7.6f, "2025-06-24 14:00", 38);
        client.inviaDati(info);
    }
}
