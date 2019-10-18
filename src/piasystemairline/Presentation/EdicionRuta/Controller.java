
package piasystemairline.Presentation.EdicionRuta;

import java.util.logging.Level;
import java.util.logging.Logger;
import piasystemairline.Logic.Ruta;
import piasystemairline.PIASystemAirline;


public class Controller {

    

    View vista;
    Model modelo;
    public Controller(Model model, View Vista) {
      modelo = model;
      vista = Vista;
      vista.setControlador(this);
      vista.setModelEdit(model);
      ObtenerlistCiudades();
      vista.update(model,vista);
    }
    public void Show() {
    vista.setVisible(true);
    }

    void AppShow() {
     PIASystemAirline.ControllerAPP.OnButtons();
    }

    void Add(Ruta ToRuta) throws Exception {
        piasystemairline.Logic.Model.instance().AgregarRuta(ToRuta);   
    }

    void Edit(Ruta ToRuta) throws Exception {
        piasystemairline.Logic.Model.instance().ModificarRuta(ToRuta);
    }

    void Delate(String id) throws Exception {
            piasystemairline.Logic.Model.instance().EliminarRuta(id);
    }
    static Ruta Get(String id) throws Exception {
           return piasystemairline.Logic.Model.instance().ConsultaRuta(id);
    }
    public void ObtenerlistCiudades(){
        try {
            modelo.setCiudades(piasystemairline.Logic.Model.instance().ObtenerListCiudades());
                vista.update(modelo, this);
        } catch (Exception ex) {
          
        }
   
    }
    
    
    
}
