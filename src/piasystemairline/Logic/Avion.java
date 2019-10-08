
package piasystemairline.Logic;


public class Avion {
    private String id;
    private int age;
    private String model;
    private String trademark;
    private int numberPassengers;
    private int numberRows;
    private int seatsPeRrow;
    private Ruta ruta;

    public Avion() {
        this.id = "";
        this.age = 0;
        this.model = "";
        this.trademark = "";
        this.numberPassengers = 0;
        this.numberRows = 0;
        this.seatsPeRrow =6;
        this.ruta = new Ruta();
    }

    public Avion(String id, int age, String model, String trademark, int numberPassengers, int numberRows, int seatsPeRrow) {
        this.id = id;
        this.age = age;
        this.model = model;
        this.trademark = trademark;
        this.numberPassengers = numberPassengers;
        this.numberRows = numberRows;
        this.seatsPeRrow = seatsPeRrow;
    }

    
    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
    /**
     * @return the id
     */
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
        return numberPassengers;
    }

    /**
     * @param numberPassengers the numberPassengers to set
     */
    public void setNumberPassengers(int numberPassengers) {
        this.numberPassengers = numberPassengers;
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
