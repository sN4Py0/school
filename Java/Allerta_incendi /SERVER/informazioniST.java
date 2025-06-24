package serverincendi;

/**
 * Rappresenta i dati ricevuti dal satellite lato server
 */
public class InformazioniST {
    
    private float lat;
    private float lon;
    private String time;
    private float temp;
    
    public InformazioniST(float lat, float lon, String time, float temp){
        this.lat = lat;
        this.lon = lon;
        this.time = time;
        this.temp = temp;
    }
    
    public float getLat() { return lat; }
    public float getLon() { return lon; }
    public String getTime() { return time; }
    public float getTemp() { return temp; }
    
    @Override
    public String toString() {
        return "Informazioni Satellite{" +
               "Lat=" + lat +
               ", Lon=" + lon +
               ", Time=" + time +
               ", Temp=" + temp +
               '}';
    }
}