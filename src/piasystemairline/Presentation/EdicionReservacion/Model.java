
package piasystemairline.Presentation.EdicionReservacion;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Tiquete;

public class Model extends Observable implements Observer {
   private List<Reservacion> reservaciones;
   private Tiquete tiquete;

    public Model(List<Reservacion> reservaciones, Tiquete tiquete) {
        this.reservaciones = reservaciones;
        this.tiquete = tiquete;
    }

    public Model() {
        this.reservaciones = null;
        this.tiquete = new Tiquete();
    }

    public Tiquete getTiquete() {
        return tiquete;
    }

    public void setTiquete(Tiquete tiquete) {
        this.tiquete = tiquete;
        this.setChanged();
        this.notifyObservers();
    }

  
    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
        this.setChanged();
        this.notifyObservers();
    }

   @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }  

    @Override
    public void update(Observable o, Object arg) {
    
    }


}
