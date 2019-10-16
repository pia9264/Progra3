
package piasystemairline.Logic;
 
public class Tiquete {
    private String id;
    private FormaPago FPago;

    public Tiquete(String id, FormaPago FPago) {
        this.id = id;
        this.FPago = FPago;
    }

    public Tiquete() {
        this.id = "0";
        this.FPago = new FormaPago();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FormaPago getFPago() {
        return FPago;
    }

    public void setFPago(FormaPago FPago) {
        this.FPago = FPago;
    }
    
    
}
