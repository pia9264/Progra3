
package piasystemairline.Logic;


public class Vuelo {
  private String id;
  private String origin;
  private String destiny;
  private String date;
  private String dateBack;
  private int quantity;
  
    public Vuelo(String origin, String destiny, String date, String dateBack, int quantity) {
        this.origin = origin;
        this.destiny = destiny;
        this.date = date;
        this.dateBack = dateBack;
        this.quantity = quantity;
    }

    public Vuelo() {
    }
   
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the destiny
     */
    public String getDestiny() {
        return destiny;
    }

    /**
     * @param destiny the destiny to set
     */
    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the dateBack
     */
    public String getDateBack() {
        return dateBack;
    }

    /**
     * @param dateBack the dateBack to set
     */
    public void setDateBack(String dateBack) {
        this.dateBack = dateBack;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
 
}
