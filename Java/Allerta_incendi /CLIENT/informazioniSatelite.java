package satellite;

/**
 * Rappresenta le informazioni inviate dal satellite
 */
public class InformazioniSatellite {
    
    private float lat;
    private float lon;
    private String orario;
    private int temp;
    
    public InformazioniSatellite(float lat, float lon, String orario, int temp){
        this.lat = lat;
        this.lon = lon;
        this.orario = orario;
        this.temp = temp;
    }
    
    /**
     * Serializza i dati in una stringa da inviare tramite socket
     */
    public String serealizzaInfo(){
        return lat + "/" + lon + "/" + orario + "/" + temp;
    }
}