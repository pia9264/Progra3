
package piasystemairline.Presentation.EdicionPagos;

import java.util.List;
import java.util.Observable;
import java.util.Observer;
import piasystemairline.Logic.FormaPago;
import piasystemairline.Logic.Persona;
import piasystemairline.Logic.Reservacion;

public class Model extends Observable{
    private FormaPago forma ;
     private List<FormaPago> f;
     private List<Reservacion> reservaciones;
     private Persona p ;

    public Model(FormaPago forma, List<FormaPago> f, List<Reservacion> reservaciones, Persona p) {
        this.forma = forma;
        this.f = f;
        this.reservaciones = reservaciones;
        this.p = p;
    }
   

    public Model() {
       forma = new FormaPago();
       p = new Persona();
    }
    
     public Persona getP() {
        return p;
    }

    public void setP(Persona p) {
        this.p = p;
        this.setChanged();
        this.notifyObservers();
    }
    
    public FormaPago getFormaPago() {
         return forma;
    }

    public void setModelFormaPago(FormaPago forma) {
        this.forma = forma;

    }
    
     public List<FormaPago> getF() {
        return f;
    }

    public void setF(List<FormaPago> f) {
        this.f = f;
        this.setChanged();
        this.notifyObservers();
    }

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
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
