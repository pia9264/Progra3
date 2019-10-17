
package piasystemairline.Presentation.EdicionAvion;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Avion;
import piasystemairline.PIASystemAirline;

public class Controller {

    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(model);
      vista.update(model,vista);
    }

    public void Obtenerlist(){
    modelo.setModelos(piasystemairline.Logic.Model.instance().ObtenerListModeloAvion());
    }
    public void Show() {
     Vista.setVisible(true);
    }

    void addModelo() {
     PIASystemAirline.Controler_AvionModelo.Show();
    } 

    void appON() {
     piasystemairline.PIASystemAirline.ControllerAPP.OnButtons();
    }

    void Add(Avion a) {
        try {
            piasystemairline.Logic.Model.instance().agregarAvion(a);
          
        } catch (Exception ex) {
        }
    }

    void modificar(Avion ToAvion) {
        try {
            piasystemairline.Logic.Model.instance().ModificarAvion(ToAvion);
        } catch (Exception ex) {
        }
    }

    void Delate(String text) {
        try {
            piasystemairline.Logic.Model.instance().EliminarAvion(text);
        } catch (Exception ex) {
        }
    }
}
