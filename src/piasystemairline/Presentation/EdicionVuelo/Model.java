
package piasystemairline.Presentation.EdicionVuelo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Ruta;
import piasystemairline.Logic.Vuelo;


public class Model extends Observable{
    private Vuelo vuelo;
    private List<Vuelo> vuelos;
    private List<Ruta> rutas;
    private List<Avion> aviones;
    private List<Ciudad> ciudades;
    public Model(Vuelo fvuelo) {
        this.vuelo = fvuelo;
    }

    public Model() {
     vuelo = new Vuelo();
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
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

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
        this.setChanged();
        this.notifyObservers();
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
