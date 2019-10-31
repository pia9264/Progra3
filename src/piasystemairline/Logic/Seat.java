
package piasystemairline.Logic;

public class Seat {
  private String id_vuelo;
  private int numero;

    public Seat() {
    }

    public Seat(String id_vuelo, int numero) {
        this.id_vuelo = id_vuelo;
        this.numero = numero;
    }

    public String getId_vuelo() {
        return id_vuelo;
    }

    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
  
}
