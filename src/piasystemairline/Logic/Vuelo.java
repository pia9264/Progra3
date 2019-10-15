
package piasystemairline.Logic;


public class Vuelo {
  private String id;
  private String repartureDate;
  private String returnDate;
  private int price;
  private String VdetalleID;
  private Avion avion;
  private Ruta ruta;

    public Vuelo() {
        this.id = "0";
        this.repartureDate = "";
        this.returnDate = "";
        this.price = 0;
        this.VdetalleID = "";
        this.avion = new Avion();
        this.ruta = new Ruta();
    }

    public Vuelo(String id, String repartureDate, String returnDate, int price, String VdetalleID, Avion avion, Ruta ruta) {
        this.id = id;
        this.repartureDate = repartureDate;
        this.returnDate = returnDate;
        this.price = price;
        this.VdetalleID = VdetalleID;
        this.avion = avion;
        this.ruta = ruta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRepartureDate() {
        return repartureDate;
    }

    public void setRepartureDate(String repartureDate) {
        this.repartureDate = repartureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getVdetalleID() {
        return VdetalleID;
    }

    public void setVdetalleID(String VdetalleID) {
        this.VdetalleID = VdetalleID;
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
