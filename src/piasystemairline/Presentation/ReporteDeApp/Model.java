
package piasystemairline.Presentation.ReporteDeApp;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Tiquete;


public class Model extends Observable{
    public Model() {
        
    }
    @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }
    
    private List<Tiquete> Tiquetes;
    private List<Tiquete> Tiquetes2;

    public List<Tiquete> getTiquetes2() {
        return Tiquetes2;
    }

    public void setTiquetes2(List<Tiquete> Tiquetes2) {
        this.Tiquetes2 = Tiquetes2;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Tiquete> getTiquetes() {
        return Tiquetes;
    }

    public void setTiquetes(List<Tiquete> Tiquetes) {
        this.Tiquetes = Tiquetes;
        this.setChanged();
        this.notifyObservers();
    }

    

    
    
    
    
    
    
    
    
    
}




   