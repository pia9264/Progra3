
package piasystemairline.Presentation.EdicionAsientos;

import java.util.List;
import java.util.Observable;
import piasystemairline.Logic.ModeloAvion;
import piasystemairline.Logic.Seat;
import piasystemairline.Logic.Vuelo;

public class Model extends Observable{
    private List<Seat> seat;   
    private ModeloAvion A_Model;
    private Vuelo vuelo;
    private int cantidad = 1;
   

    public Model() {
        this.seat = null;
        this.A_Model = new ModeloAvion();
        this.vuelo = new Vuelo();
    }

    public Model(List<Seat> seat, ModeloAvion A_Model, Vuelo vuelo, int n) {
        this.seat = seat;
        this.A_Model = A_Model;
        this.vuelo = vuelo;
        this.cantidad = n;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    public List<Seat> getSeat() {
        return seat;
    }

    public void setSeat(List<Seat> seat) {
        this.seat = seat;
    }

    public ModeloAvion getA_Model() {
        return A_Model;
    }

    public void setA_Model(ModeloAvion A_Model) {
        this.A_Model = A_Model;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    
    
}
