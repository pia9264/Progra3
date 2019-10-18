
package piasystemairline.Presentation.EdicionVuelo;

import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Ruta;


public class Model extends Observable{
  private Ruta ruta;
    
    public Model(Ruta ruta) {
        this.ruta = ruta;
    }

    public Model() {
     ruta = new Ruta();
    }
    
    
    public Ruta Get() {
         return ruta;
    }

    public void Set(Ruta ruta) {
        this.ruta = ruta;
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
