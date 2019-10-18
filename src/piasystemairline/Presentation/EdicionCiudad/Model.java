
package piasystemairline.Presentation.EdicionCiudad;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Ciudad;
import piasystemairline.Logic.Pais;


public class Model extends Observable{
     private Ciudad cuidad;
     private List<Pais> Paises;
    public Model(Ciudad cuidad) {
        this.cuidad = cuidad;
    }

    public Model() {
       cuidad = new Ciudad();
    }
    
    
    public Ciudad getModelCuidad() {
         return cuidad;
    }

    public Ciudad getCuidad() {
        return cuidad;
    }

    public void setCuidad(Ciudad cuidad) {
        this.cuidad = cuidad;
    }

    public List<Pais> getPaises() {
        return Paises;
    }

    public void setPaises(List<Pais> Paises) {
        this.Paises = Paises;
        this.setChanged();
        this.notifyObservers();
    }

    public void setModelCuidad(Ciudad cuidad) {
        this.cuidad = cuidad;
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
