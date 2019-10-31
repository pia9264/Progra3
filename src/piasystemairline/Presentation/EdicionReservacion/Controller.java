
package piasystemairline.Presentation.EdicionReservacion;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Reservacion;
import piasystemairline.Logic.Tiquete;
import piasystemairline.PIASystemAirline;


public class Controller {
    
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo,this);
    }

    public void Show() {
     Vista.setVisible(true);
     Vista.update(modelo, this);
    }

    public void ListaReservaCargar(){
    modelo.setReservaciones(piasystemairline.Logic.Model.instance().
    ObtenerListaReservaPersona(PIASystemAirline.Controler_Persona.Get()));
    }
    public void cargarTiquete(String id){
        try {
            modelo.setTiquete(piasystemairline.Logic.Model.instance().ConsultarTiquete(id));
        } catch (Exception ex) {
            modelo.setTiquete(new Tiquete());
        }
    }
    
    public void Add(Reservacion R) {
        try {
            piasystemairline.Logic.Model.instance().AgregarReservacion(R);
        } catch (Exception ex) {
        }
    }  

    void appShow() {
    PIASystemAirline.ControllerAPP.bandera = true;
    PIASystemAirline.ControllerAPP.OnButtons();
    }
}
