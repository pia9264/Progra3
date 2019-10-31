
package piasystemairline.Logic;

public class Reservacion {
  private String id;
  private String date;
  private FormaPago Fpago;
  private Persona persona;
  private String TiqueteID;

    public Reservacion() {
        this.id = "0";
        this.date = "1900-01-01 01:00:00";
        this.Fpago = new FormaPago();
        this.persona = new Persona();
        this.TiqueteID ="0";
    }

    public Reservacion(String id, String date, FormaPago Fpago, Persona persona, String TiqueteID) {
        this.id = id;
        this.date = date;
        this.Fpago = Fpago;
        this.persona = persona;
        this.TiqueteID = TiqueteID;
    }

    public String getTiqueteID() {
        return TiqueteID;
    }

    public void setTiqueteID(String TiqueteID) {
        this.TiqueteID = TiqueteID;
    }

   

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
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
}
