
package piasystemairline.Presentation.App;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Ruta;

public class ModelApp extends Observable {
    private List<Ruta> rutas;
    public ModelApp() {
    }

    public ModelApp(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
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
