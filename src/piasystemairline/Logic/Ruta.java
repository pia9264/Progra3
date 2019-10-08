
package piasystemairline.Logic;

public class Ruta {
  private String id;
  private String route;
  private int duration[];
  private int precio;
  private int horallegada;
    public Ruta(String id, String route, int[] duration, int precio, int horallegada) {
        this.id = id;
        this.route = route;
        this.duration = duration;
        this.precio = precio;
        this.horallegada = horallegada;
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

    public int getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(int horallegada) {
        this.horallegada = horallegada;
    }

}
