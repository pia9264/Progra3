
package piasystemairline.Logic;

import java.util.Objects;

public class Pais {

  private String name;

    public Pais(String name) {
 
        this.name = name;
    }

  
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pais() {
        this.name = "null";
    }

    @Override
    public String toString() {
        return "Pais{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.name);
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
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

   
    
    
}
