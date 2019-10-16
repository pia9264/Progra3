
package piasystemairline.Logic;

import java.util.Objects;

public class Ciudad {
  private String name;
  private Pais pais;

    public Ciudad() {
        this.name = "null";
        this.pais = new Pais();
    }

    public Ciudad(String name, Pais pais, String id) {
        this.name = name;
        this.pais = pais;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
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
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
  
  
}
