
package piasystemairline.Logic;


public class Vuelo {
  private String id;
  private String DateTime;
  private Avion avion;
  private Ruta ruta;

    public Vuelo() {
        this.id = "0";
        this.DateTime = "1900-01-01 01:00:00";
        this.avion = new Avion();
        this.ruta = new Ruta();
    }

    public Vuelo(String id, String DateTime,Avion avion, Ruta ruta) {
        this.id = id;
        this.DateTime = DateTime;
        this.avion = avion;
        this.ruta = ruta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDateTime() {
        return DateTime;
    }

    public void setDateTime(String DateTime) {
        this.DateTime = DateTime;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    
    
}
