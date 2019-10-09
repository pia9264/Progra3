
package piasystemairline.Presentation.EdicionPersona;

import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Persona;


public class Model extends Observable{
   private Persona persona;
    
    public Model(Persona persona) {
        this.persona = persona;
    }

    public Model() {
       persona = new Persona();
    }
  
     @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    } 
}
