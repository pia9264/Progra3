
package piasystemairline.Presentation.EdicionPais;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
      Vista.setControlador(this);
      Vista.setModelEdit(modelo);
      Vista.update(modelo, this);
    }

    public void Show() {
     Vista.setVisible(true);
    }
    public void ObtenerlistPaises(){
    modelo.setPaises(piasystemairline.Logic.Model.instance().ObtenerListPaises());
    Vista.update(modelo, this);
    }
    void add(Pais pais) throws Exception {
      piasystemairline.Logic.Model.instance().AgregarPais(pais);
      PIASystemAirline.Controler_Ciudad.ObtenerlistPaises();
    }

    void delate(String text) throws Exception {
     piasystemairline.Logic.Model.instance().EliminarPais(text);
     PIASystemAirline.Controler_Ciudad.ObtenerlistPaises();
    }

    public Pais Get(String text) throws Exception {
         return piasystemairline.Logic.Model.instance().ConsultarPais(text);
    }

    void CiudadShow() {
    PIASystemAirline.Controler_Ciudad.Show();
    }
}
