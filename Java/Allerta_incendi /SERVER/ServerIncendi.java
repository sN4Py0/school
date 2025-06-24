package serverincendi;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server principale che accetta connessioni dai client satellite
 */
public class ServerIncendi {
    
    public static void main(String[] args) {
        int porta = 4000;
        
        try (ServerSocket serverSocket = new ServerSocket(porta)) {
            System.out.println("Server in ascolto sulla porta " + porta);
            
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Connesso un nuovo satellite: " + socket.getInetAddress());
                
                // Crea un thread per gestire questa connessione
                ServerThread st = new ServerThread(socket);
                st.start();
            }
            
        } catch (Exception e) {
            System.err.println("Errore nel server: " + e.getMessage());
        }
    }
}