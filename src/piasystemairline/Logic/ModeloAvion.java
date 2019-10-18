
package piasystemairline.Logic;

import java.util.Objects;


public class ModeloAvion {
    private String id;
    private int age;
    private String trademark;
    private int capacity;
    private int numberRows;
    private int seatsPeRrow;

    public ModeloAvion() {
        this.id = "0";
        this.age= 0;
        this.capacity = 0;
        this.numberRows = 0;
        this.trademark = "";
        this.seatsPeRrow = 0;  
    }

    public ModeloAvion(String id, int age, String trademark, int capacity, int numberRows, int seatsPeRrow) {
        this.id = id;
        this.age = age;
        this.trademark = trademark;
        this.capacity = capacity;
        this.numberRows = numberRows;
        this.seatsPeRrow = seatsPeRrow;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumberRows() {
        return numberRows;
    }

    public void setNumberRows(int numberRows) {
        this.numberRows = numberRows;
    }

    public int getSeatsPeRrow() {
        return seatsPeRrow;
    }

    public void setSeatsPeRrow(int seatsPeRrow) {
        this.seatsPeRrow = seatsPeRrow;
    }

    @Override
    public String toString() {
       if(!id.equalsIgnoreCase("0")){
         return ""+trademark+" "+ id + " Capacity: "+capacity+" Age:"+age;
       }else{
           return "";
       }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final ModeloAvion other = (ModeloAvion) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}
