
package piasystemairline.Presentation.EdicionPais;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Pais;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(model);
      vista.update(model, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }
    void add(Pais pais) {
        try {
            piasystemairline.Logic.Model.instance().AgregarPais(pais);
        } catch (Exception ex) {
        }
    }

    void delate(String text) {
     piasystemairline.Logic.Model.instance().EliminarPais(text);
    }

    Pais Get(String text) {
         return piasystemairline.Logic.Model.instance().ConsultarPais(text);
    }
    
}
