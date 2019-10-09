
package piasystemairline.Logic;

public class Ruta {
  private String id;
  private String route;
  private int duration[];
  private int precio;
  private String horallegada;
    public Ruta(String id, String route, int[] duration, int precio, String horallegada) {
        this.id = id;
        this.route = route;
        this.duration = duration;
        this.precio = precio;
        this.horallegada = horallegada;
    }

    public Ruta() {
      this.id = "";
      this.route = "";
      this.duration = new int[2];
      this.precio = 0;
      this.horallegada = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int[] getDuration() {
        return duration;
    }

    public void setDuration(int[] duration) {
        this.duration = duration;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(String horallegada) {
        this.horallegada = horallegada;
    }

}
