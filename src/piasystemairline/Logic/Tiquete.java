
package piasystemairline.Logic;
 
public class Tiquete {
    private String id;
    private String Detalle;

    public Tiquete(String id,String Detalle) {
        this.id = id;
        this.Detalle = Detalle;
    }

    public Tiquete() {
        this.id = "0";
        this.Detalle = "";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String Detalle) {
        this.Detalle = Detalle;
    }


    
    
}
