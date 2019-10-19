
package piasystemairline.Presentation.EdicionAvion;

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

    void Add(Avion a) throws Exception {
            piasystemairline.Logic.Model.instance().AgregarAvion(a);
            PIASystemAirline.Controler_Vuelo.update();
    }

    void modificar(Avion ToAvion) throws Exception {
            piasystemairline.Logic.Model.instance().ModificarAvion(ToAvion);
            modelo.addObserver(Vista);
            PIASystemAirline.Controler_Vuelo.update();
    }

    void Delate(String text) throws Exception {
            piasystemairline.Logic.Model.instance().EliminarAvion(text);
            PIASystemAirline.Controler_Vuelo.update();
    }
    
    public void update(){
    Vista.update(modelo,Vista);
    }
}
