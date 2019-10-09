
package piasystemairline.Logic;

public class Ruta {
  private String id;
  private String name;
  private String duration;
  private int price;
  private String arrivalTime;
  private int discount;
  private String schedule;

   
    public Ruta(String id, String name,String duration, int price, String arrivalTime, int discount, String schedule) {
        this.id = id;
        this.name = name;

        this.duration = duration;
        this.price = price;
        this.arrivalTime = arrivalTime;
        this.discount = discount;
        this.schedule = schedule;
    }

    public Ruta() {
      this.id = "";
      this.name = "";
      this.duration ="";
      this.price = 0;
      this.arrivalTime = "";
      this.schedule = "";
    }

    
     public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    
    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int precio) {
        this.price = precio;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

}
