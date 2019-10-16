
package piasystemairline.Logic;

public class Registro {
   private String id;
   private Vuelo vuelo;

    public Registro(String id, Vuelo vuelo) {
        this.id = id;
        this.vuelo = vuelo;
    }

    public Registro() {
        this.id = "0";
        this.vuelo = new Vuelo();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
   
}
