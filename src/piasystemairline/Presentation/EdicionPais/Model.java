
package piasystemairline.Presentation.EdicionPais;

import java.util.Observable;
import piasystemairline.Logic.Pais;

public class Model extends Observable{
    private Pais model;
    
    public Model(Pais model) {
        this.model = model;
    }

    public Model() {
       model = new Pais();
    }
    
    
    public Pais getModelAvion() {
         return model;
    }

    public void setModelAvion(Pais model) {
        this.model = model;
        this.setChanged();
        this.notifyObservers();
    }
   
}
