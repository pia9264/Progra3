
package piasystemairline.Presentation.EdicionAvion;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Avion;
import piasystemairline.Logic.ModeloAvion;


public class Model extends Observable {
    private Avion avion;
    private List<ModeloAvion> modelos;
    public Model(Avion avion) {
        this.avion = avion;
    }

    public Model() {
       avion = new Avion();
    }
    
    
    public Avion getAvion() {
         return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
        this.setChanged();
        this.notifyObservers();
    }
    
     @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }

    public List<ModeloAvion> getModelos() {
        return modelos;
    }

    public void setModelos(List<ModeloAvion> modelos) {
        this.modelos = modelos;
    }

}
