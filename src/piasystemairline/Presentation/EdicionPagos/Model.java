
package piasystemairline.Presentation.EdicionPagos;

import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.FormaPago;

public class Model extends Observable{
    private FormaPago forma ;
    
    public Model(FormaPago forma) {
        this.forma = forma;
    }

    public Model() {
       forma = new FormaPago();
    }
    
    
    public FormaPago getFormaPago() {
         return forma;
    }

    public void setModelFormaPago(FormaPago forma) {
        this.forma = forma;

    }

    @Override
    public void addObserver(Observer o){
     super.addObserver(o);
     this.setChanged();
     this.notifyObservers();
    }  
}
