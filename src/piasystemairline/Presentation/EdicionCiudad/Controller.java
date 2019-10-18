
package piasystemairline.Presentation.EdicionCiudad;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Ciudad;
import piasystemairline.PIASystemAirline;

public class Controller {
    View Vista;
    Model modelo;
    public Controller(Model model, View vista) {
      modelo = model;
      Vista = vista;
      vista.setControlador(this);
      vista.setModelEdit(modelo);
      ObtenerlistPaises();
      vista.update(modelo, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }

    void PaisesShow() {
     Vista.setVisible(false);
     PIASystemAirline.Controler_Pais.Show();
    }

    void Delate(String text) throws Exception {
        piasystemairline.Logic.Model.instance().EliminarCiudad(text);
    }

    void Edit(Ciudad c) throws Exception {
        piasystemairline.Logic.Model.instance().ModificarCiudad(c);
    }

    Ciudad Shared(String text) throws Exception {
        return piasystemairline.Logic.Model.instance().ConsultarCiudad(text);
    }

    void AppShow() {
     PIASystemAirline.ControllerAPP.OnButtons();
    }
    
    public void ObtenerlistPaises(){
    modelo.setPaises(piasystemairline.Logic.Model.instance().ObtenerListPaises());
    Vista.update(modelo, this);
    }

    void Add(Ciudad c) throws Exception {
            piasystemairline.Logic.Model.instance().AgregarCuidad(c);
    }
}
