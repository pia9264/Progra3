
package piasystemairline.Presentation.ReporteDeApp;

import java.util.Observable;
import java.util.Observer;


public class Model extends Observable{
    public Model() {
   
    }
    @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }
}
