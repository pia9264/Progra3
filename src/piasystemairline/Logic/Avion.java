
package piasystemairline.Logic;


public class Avion {
    private String id;
    private int age;
    private String model;
    private String trademark;
    private int capacity;
    private int numberRows;
    private int seatsPeRrow;
    

    public Avion() {
        this.id = "0";
        this.age = 0;
        this.model = "";
        this.trademark = "";
        this.capacity = 0;
        this.numberRows = 0;
        this.seatsPeRrow =6;
    }

    public Avion(String id, int age, String model, String trademark, int capacity, int numberRows, int seatsPeRrow) {
        this.id = id;
        this.age = age;
        this.model = model;
        this.trademark = trademark;
        this.capacity = capacity;
        this.numberRows = numberRows;
        this.seatsPeRrow = seatsPeRrow;
    }

   
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the trademark
     */
    public String getTrademark() {
        return trademark;
    }

    /**
     * @param trademark the trademark to set
     */
    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    /**
     * @return the numberPassengers
     */
    public int getNumberPassengers() {
        return capacity;
    }

    /**
     * @param numberPassengers the numberPassengers to set
     */
    public void setNumberPassengers(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the numberRows
     */
    public int getNumberRows() {
        return numberRows;
    }

    /**
     * @param numberRows the numberRows to set
     */
    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }

    /**
     * @return the seatsPeRrow
     */
    public int getSeatsPeRrow() {
        return seatsPeRrow;
    }

    /**
     * @param seatsPeRrow the seatsPeRrow to set
     */
    public void setSeatsPeRrow(int seatsPeRrow) {
        this.seatsPeRrow = seatsPeRrow;
    }
}
