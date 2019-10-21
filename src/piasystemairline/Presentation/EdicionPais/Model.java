
package piasystemairline.Presentation.EdicionPais;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Pais;

public class Model extends Observable{
    private Pais model ;
    private List<Pais> Paises;
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

    public Pais getModel() {
        return model;
    }

    public void setModel(Pais model) {
        this.model = model;
    }

    public List<Pais> getPaises() {
        return Paises;
    }

    public void setPaises(List<Pais> Paises) {
        this.Paises = Paises;
    }

    @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }  
}
