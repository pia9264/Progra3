
package piasystemairline.Presentation.EdicionPais;



import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Pais;

public class Model extends Observable{
    private Pais model ;
    
    public Model(Pais model) {
        this.model = model;
    }

    public Model() {
       model = new Pais();
    }
    
    
    public Pais getModelPais() {
         return model;
    }

    public void setModelPais(Pais model) {
        this.model = model;

    }

    @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }  
}
