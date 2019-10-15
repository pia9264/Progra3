
package piasystemairline.Logic;

import java.util.Objects;

public class Escalas {
 private String id;
 private String detail;
 private Ciudad city;

    public Escalas() {
        this.id = "";
        this.detail = "";
        this.city = new Ciudad();
    }

    public Escalas(String id, String detail, Ciudad city) {
        this.id = id;
        this.detail = detail;
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Ciudad getCity() {
        return city;
    }

    public void setCity(Ciudad city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Escalas{" + "id=" + id + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Escalas other = (Escalas) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
 
 
}
