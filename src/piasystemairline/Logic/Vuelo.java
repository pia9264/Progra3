
package piasystemairline.Logic;


public class Vuelo {
  private String id;
  private String Time;
  private String Day;
  private Avion avion;
  private Ruta ruta;

    public Vuelo() {
        this.id = "0";
        this.Time = "01:00:00";
        this.Day = "";
        this.avion = new Avion();
        this.ruta = new Ruta();
    }

    public Vuelo(String id, String Time, String Day, Avion avion, Ruta ruta) {
        this.id = id;
        this.Time = Time;
        this.Day = Day;
        this.avion = avion;
        this.ruta = ruta;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String Day) {
        this.Day = Day;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String DateTime) {
        this.Time = DateTime;
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
