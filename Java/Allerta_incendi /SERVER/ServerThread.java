package serverincendi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Thread per gestire la comunicazione con un singolo client
 */
public class ServerThread extends Thread {
    
    private Socket socket;
    
    public ServerThread(Socket socket) {
        this.socket = socket;
    }
    
    @Override
    public void run() {
        try (BufferedReader in = new BufferedReader(
                 new InputStreamReader(socket.getInputStream()))) {
            
            String dati = in.readLine();
            if (dati != null) {
                // Parsing dei dati ricevuti (lat/lon/time/temp)
                String[] parts = dati.split("/");
                float lat = Float.parseFloat(parts[0]);
                float lon = Float.parseFloat(parts[1]);
                String time = parts[2];
                float temp = Float.parseFloat(parts[3]);
                
                InformazioniST info = new InformazioniST(lat, lon, time, temp);
                
                System.out.println("Ricevuti dati dal satellite: " + info.toString());
                
                // Logica per allerta incendi (esempio: temp sopra soglia)
                if (temp > 40) {
                    System.out.println("!!! ALLERTA INCENDIO: temperatura elevata rilevata !!!");
                } else {
                    System.out.println("Temperatura nella norma.");
                }
            }
            
        } catch (Exception e) {
            System.err.println("Errore in ServerThread: " + e.getMessage());
        } finally {
            try { socket.close(); } catch (Exception e) {}
        }
    }
}