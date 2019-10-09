
package piasystemairline.Presentation.EdicionHorario;

import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.Horario;

public class Model extends Observable {
    private Horario horario;
     public Model(Horario avion) {
        this.horario = avion;
    }

    public Model() {
       horario = new Horario();
    }
    
    
    public Horario getAvion() {
         return horario;
    }

    public void setAvion(Horario horario) {
        this.horario = horario;
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
