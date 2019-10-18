
package piasystemairline.Logic;

import java.util.Objects;


public class Avion {
    private String id;
    private ModeloAvion M_Avion;
    

    public Avion() {
        this.id = "0";
        M_Avion = new ModeloAvion();
    }

    public Avion(String id, ModeloAvion M_Avion) {
        this.id = id;
        this.M_Avion = M_Avion;
    }

    @Override
    public String toString() {
        if(!id.equalsIgnoreCase("0")){
          return "Avion{" + "id=" + id + '}';
       }else{
           return "";
       }
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModeloAvion getM_Avion() {
        return M_Avion;
    }

    public void setM_Avion(ModeloAvion M_Avion) {
        this.M_Avion = M_Avion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Avion other = (Avion) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
