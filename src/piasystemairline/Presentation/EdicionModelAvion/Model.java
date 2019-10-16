
package piasystemairline.Presentation.EdicionModelAvion;

import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.ModeloAvion;


public class Model extends Observable {
    private ModeloAvion model;
    
    public Model(ModeloAvion model) {
        this.model = model;
    }

    public Model() {
       model = new ModeloAvion();
    }
    
    
    public ModeloAvion getModelAvion() {
         return model;
    }

    public void setModelAvion(ModeloAvion model) {
        this.model = model;
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
