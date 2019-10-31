
package piasystemairline.Logic;

import java.util.Objects;

public class Ruta {
  private String id;
  private String name;
  private String duration;
  private Ciudad origin;
  private Ciudad destiny;
  private Ciudad scale;
  private int price;
  private int discount;

    public Ruta(String id, String name, String duration, Ciudad origin, Ciudad destiny, Ciudad scale, int price, int discount) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.origin = origin;
        this.destiny = destiny;
        this.scale = scale;
        this.price = price;
        this.discount = discount;
    }

 

    public Ruta() {
      this.id = "00";
      this.name = "";
      this.duration ="";
      this.price = 0;
      this.discount =0;
      this.scale = new Ciudad();
      this.destiny = new Ciudad();
      this.origin = new Ciudad();
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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
        return name +" "+duration;
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
