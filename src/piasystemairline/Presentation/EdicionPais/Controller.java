
package piasystemairline.Presentation.EdicionPais;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Pais;
import piasystemairline.PIASystemAirline;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(modelo);
      vista.update(modelo, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }
    void add(Pais pais) {
        try {
            piasystemairline.Logic.Model.instance().AgregarPais(pais);
            PIASystemAirline.Controler_Ciudad.ObtenerlistPaises();
        } catch (Exception ex) {
        }
    }

    void delate(String text) {
     piasystemairline.Logic.Model.instance().EliminarPais(text);
     PIASystemAirline.Controler_Ciudad.ObtenerlistPaises();
     
    }

    Pais Get(String text) {
         return piasystemairline.Logic.Model.instance().ConsultarPais(text);
    }

    void CiudadShow() {
    PIASystemAirline.Controler_Ciudad.Show();
    }
    
}
