
package piasystemairline.Presentation.App;

import java.util.Observable;
import java.util.Observer;

public class ModelApp extends Observable {

    public ModelApp() {
    }
    
      @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }
    
}
