
package piasystemairline.Presentation.EdicionTiquete;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Tiquete;
import piasystemairline.Logic.Vuelo;


public class Model extends Observable {
    private Tiquete viaje;
    private Vuelo vuelo;
    private List<Tiquete> tiquetes;

    public Model(Tiquete viaje, Vuelo vuelo, List<Tiquete> tiquetes) {
        this.viaje = viaje;
        this.vuelo = vuelo;
        this.tiquetes = tiquetes;
    }

    public Model() {
     this.viaje = new Tiquete();
     this.vuelo = new Vuelo();
     this.tiquetes = null;
    }

    public List<Tiquete> getTiquetes() {
        return tiquetes;
    }

    public void setTiquetes(List<Tiquete> tiquetes) {
        this.tiquetes = tiquetes;
        this.setChanged();
        this.notifyObservers();
    }

    public Tiquete getTiquete() {
        return viaje;
    }

    public void setTiquete(Tiquete viaje) {
        this.viaje = viaje;
        this.setChanged();
        this.notifyObservers();
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
        this.setChanged();
        this.notifyObservers();
    }
    
     @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    } 
}
