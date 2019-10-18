
package piasystemairline.Logic;

public class Reservacion {
  private String id;
  private String date;
  private Tiquete tiquet;
  private FormaPago Fpago;

    public Reservacion() {
        this.id = "0";
        this.date = "1900-01-01 01:00:00";
        this.tiquet = new Tiquete();
        this.Fpago = new FormaPago();
    }

    public Reservacion(String id, String date, Tiquete tiquet, FormaPago Fpago) {
        this.id = id;
        this.date = date;
        this.tiquet = tiquet;
        this.Fpago = Fpago;
    }

    public FormaPago getFpago() {
        return Fpago;
    }

    public void setFpago(FormaPago Fpago) {
        this.Fpago = Fpago;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Tiquete getTiquet() {
        return tiquet;
    }

    public void setTiquet(Tiquete tiquet) {
        this.tiquet = tiquet;
    }
   
    
  
}
