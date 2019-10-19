
package piasystemairline.Presentation.EdicionVuelo;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Vuelo;


public class Model extends Observable{
    private Vuelo vuelo;
    private List<Ruta> rutas;
    private List<Avion> aviones;
    public Model(Vuelo fvuelo) {
        this.vuelo = fvuelo;
    }

    public Model() {
     vuelo = new Vuelo();
    }
    
    public Vuelo Get() {
         return vuelo;
    }

    public void Set(Vuelo ruta) {
        this.vuelo = ruta;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Avion> getAviones() {
        return aviones;
    }

    public void setAviones(List<Avion> aviones) {
        this.aviones = aviones;
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
