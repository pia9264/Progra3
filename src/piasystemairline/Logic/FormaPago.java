
package piasystemairline.Logic;

import java.util.Objects;

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

    @Override
    public String toString() {
        if(!"0".equals(id))return id;
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FormaPago other = (FormaPago) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
