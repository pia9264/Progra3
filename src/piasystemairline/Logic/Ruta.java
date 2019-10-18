
package piasystemairline.Logic;

import java.util.Objects;

public class Ruta {
  private String id;
  private String name;
  private String duration;
  private Ciudad origin;
  private Ciudad destiny;
  private Ciudad scale;

    public Ruta(String id, String name, String duration, Ciudad origin, Ciudad destiny, Ciudad scale) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.origin = origin;
        this.destiny = destiny;
        this.scale = scale;
    }
   
   

    public Ruta() {
      this.id = "0";
      this.name = "";
      this.duration ="";
      this.scale = new Ciudad();
      this.destiny = new Ciudad();
      this.origin = new Ciudad();
    }

    public Ciudad getOrigin() {
        return origin;
    }

    public void setOrigin(Ciudad origin) {
        this.origin = origin;
    }

    public Ciudad getDestiny() {
        return destiny;
    }

    public void setDestiny(Ciudad destiny) {
        this.destiny = destiny;
    }

    public Ciudad getScale() {
        return scale;
    }

    public void setScale(Ciudad scale) {
        this.scale = scale;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Ruta{" + "name=" + name + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        final Ruta other = (Ruta) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
  
    
}
