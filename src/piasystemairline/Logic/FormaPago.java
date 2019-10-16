
package piasystemairline.Logic;

public class FormaPago {
    private String id;
    private String Data;

    public FormaPago(String id, String Data) {
        this.id = id;
        this.Data = Data;
    }

    public FormaPago() {
        this.Data = "";
        this.id = "0";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }
    
    
    
}
