
package piasystemairline.Logic;


public class Tiquete {
  private String id;
  private int price;
  private String departureDate;
  private String returnDate;
  private Reservacion reservacion;
  private Vuelo vuelo;

    public Tiquete() {
        this.id = "0";
        this.price = 0;
        this.departureDate = "1900-01-01 01:00:00";
        this.returnDate = "1900-01-01 01:00:00";
        this.reservacion = new Reservacion();
        this.vuelo = new Vuelo();    
    }

    public Tiquete(String id, int price, String departureDate, String returnDate, Reservacion reservacion, Vuelo vuelo) {
        this.id = id;
        this.price = price;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.reservacion = reservacion;
        this.vuelo = vuelo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Reservacion getReservacion() {
        return reservacion;
    }

    public void setReservacion(Reservacion reservacion) {
        this.reservacion = reservacion;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
  
  
  
  
}
